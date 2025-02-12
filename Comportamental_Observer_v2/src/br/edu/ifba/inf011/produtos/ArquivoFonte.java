package br.edu.ifba.inf011.produtos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.Arquivo;
import br.edu.ifba.inf011.observer.ArquivoVaiModificarFonteEvento;
import br.edu.ifba.inf011.observer.ArquivoModificadoOuvinte;

public class ArquivoFonte implements Arquivo, ArquivoVaiModificarFonteEvento{
	
	public List<ArquivoModificadoOuvinte> ouvintes;
	
	
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
        this.ouvintes = new ArrayList<ArquivoModificadoOuvinte>();
    }
	
	@Override
    public List<String> read() throws IOException {
	   this.conteudo = Files.readAllLines(arquivoPath);
       return this.conteudo;
    }

	@Override
	public void write(List<String> content) throws Exception {
		this.updateArquivoVaiModificar(this.conteudo, content);
		this.setConteudo(content);
	}

	@Override
	public void append(String content) throws Exception {
		List<String> futuro = new ArrayList<String>(this.conteudo);
		futuro.add(content);
		this.updateArquivoVaiModificar(this.conteudo, futuro);
		this.setConteudo(futuro);
	}
	
	@Override
	public List<String> content() throws Exception {
		return this.conteudo ;
	}	
	
	private void setConteudo(List<String> conteudo) throws Exception {
		this.conteudo = conteudo;
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
		this.setConteudo(memento.getConteudo());
	}

	@Override
	public void addArquivoModificadoListener(ArquivoModificadoOuvinte listener) {
		this.ouvintes.add(listener);
	}

	@Override
	public void removeArquivoModificadoListener(ArquivoModificadoOuvinte listener) {
		this.ouvintes.remove(listener);
	}

	@Override
	public void updateArquivoVaiModificar(List<String> antigo, List<String> futuro) {
		for(ArquivoModificadoOuvinte ouvinte : this.ouvintes)
			ouvinte.notifyArquivoVaiModificar(antigo, futuro);
	}



}
