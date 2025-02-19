package br.edu.ifba.inf011.cor;

import java.util.List;

import br.edu.ifba.inf011.compiladores.Compilador;
import br.edu.ifba.inf011.produtos.ArquivoFonte;

public class CompiladorC extends AbstractCompileHandler implements Compilador{

	public CompiladorC(CompileHandler proximo) {
		super(proximo);
	}
	
	public CompiladorC() {
		super();
	}

	public boolean possoCompilar(ArquivoFonte arquivo) throws Exception {
		List<String> conteudo = arquivo.read();
		for(String linha : conteudo)
			if(linha.contains("#include"))
				return true;
		return false;
	};
	
	public void doPreProcessar(ArquivoFonte arquivo) {
		System.out.println("Compilador C:\\> Realizando Pré-Processamento...");
	}
	
	public void doCompilar(ArquivoFonte arquivo) {
		System.out.println("Compilador C:\\> Compilando " + arquivo.getNome() + "...");		
	}

	
	
}
