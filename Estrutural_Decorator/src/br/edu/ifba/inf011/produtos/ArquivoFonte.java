package br.edu.ifba.inf011.produtos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.decorator.Arquivo;

public class ArquivoFonte implements Arquivo{

	private final Path arquivoPath;
	private List<String> conteudo;
	private int indice;
	
	public ArquivoFonte(String nomeArquivo) {
        this.arquivoPath = Paths.get(nomeArquivo);
        
    }
	
	public void reset() {
		try {
			this.conteudo = this.lerLinhas();
			this.indice = 0;
		}catch(IOException ex) {
			this.conteudo = new ArrayList<String>(); 
		}
	}

	public Boolean hasNext() {
		return this.indice < this.conteudo.size(); 
	}
	
	
	public String next() {
		return this.conteudo.get(this.indice++);
	}
	
    public List<String> lerLinhas() throws IOException {
       return Files.readAllLines(arquivoPath);
    }


}
