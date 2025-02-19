package br.edu.ifba.inf011.produtos;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import br.edu.ifba.inf011.Arquivo;

public class ArquivoFonte implements Arquivo{

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
	public List<String> content() throws Exception {
		return this.conteudo;
	}	
	
	private void setConteudo(List<String> conteudo) throws Exception {
		this.conteudo = conteudo;
	}		

	@Override
	public void dump() throws Exception {
		Files.write(arquivoPath,this.conteudo);
	}

	public void print(PrintStream out) {
		if(this.conteudo == null)
			return;
		for(String str : this.conteudo)
			out.println(str);
	}

	@Override
	public String getNome() {
		return this.arquivoPath.getFileName().toString();
	}
	


}
