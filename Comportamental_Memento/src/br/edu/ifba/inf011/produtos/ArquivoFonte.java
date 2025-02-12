package br.edu.ifba.inf011.produtos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.Arquivo;

public class ArquivoFonte implements Arquivo{
	
	public class Memento{
		private List<String> conteudo;
		
		private Memento() {
			this.conteudo = new ArrayList<String>();
		}
		
		private void setConteudo(List<String> conteudo) {
			this.conteudo.addAll(conteudo); 
		}
		
		private List<String> getConteudo(){
			return this.conteudo;
		}
	}

	private final Path arquivoPath;
	private List<String> conteudo;
	
	public ArquivoFonte(String nomeArquivo) {
        this.arquivoPath = Paths.get(nomeArquivo);
    }
	
	@Override
    public List<String> read() throws IOException {
	   this.conteudo = Files.readAllLines(arquivoPath);
       return this.conteudo;
    }

	@Override
	public void write(List<String> content) throws Exception {
		this.conteudo = content;
	}

	@Override
	public void append(String content) throws Exception {
		this.conteudo.add(content);
	}

	@Override
	public void dump() throws Exception {
		Files.write(arquivoPath,this.conteudo);
	}
	
	public ArquivoFonte.Memento checkpoint(){
		ArquivoFonte.Memento memento = new ArquivoFonte.Memento();
		memento.setConteudo(this.conteudo);
		return memento;
	}
	
	public void restore(ArquivoFonte.Memento memento) throws Exception{
		this.write(memento.getConteudo());
	}	


}
