package br.edu.ifba.inf011.implementor;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FonteDadosDisco implements FonteDados {

	private String path;
	
	public FonteDadosDisco(String path) {
		this.path = path;
	}
	
	@Override
	public String ler(String nome) {
		StringBuffer str = new StringBuffer();
		List<String> linhas;
		try{
			linhas = Files.readAllLines(Paths.get(this.path + nome));
		}catch(IOException ex) {
			linhas = new ArrayList<String>();	
		}
		for(String linha : linhas)
			str.append(linha + "\n");
		return str.toString();
	}

	@Override
	public Boolean existe(String nome) {
		return Files.isRegularFile(Paths.get(this.path + nome));
	}

	@Override
	public void criar(String nome) {
		try {
			Files.createFile(Paths.get(this.path + nome));
		} catch (IOException e) {
		}
	}

	@Override
	public void anexar(String nome, String conteudo) {
		try {
			Files.write(Paths.get(this.path + nome), 
						conteudo.getBytes(StandardCharsets.UTF_8),
						StandardOpenOption.APPEND);
		} catch (IOException e) {
		}
	}

}
