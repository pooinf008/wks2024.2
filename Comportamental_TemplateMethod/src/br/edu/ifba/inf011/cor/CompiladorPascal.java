package br.edu.ifba.inf011.cor;

import java.util.List;

import br.edu.ifba.inf011.compiladores.Compilador;
import br.edu.ifba.inf011.produtos.ArquivoFonte;

public class CompiladorPascal extends AbstractCompileHandler implements Compilador{

	public CompiladorPascal(CompileHandler proximo) {
		super(proximo);
	}
	
	public CompiladorPascal() {
		super();
	}
	
	public boolean possoCompilar(ArquivoFonte arquivo) throws Exception {
		List<String> conteudo = arquivo.read();
		for(String linha : conteudo)
			if(linha.contains("program"))
				return true;
		return false;
	};
	
	public void doCompilar(ArquivoFonte arquivo) {
		System.out.println("Compilador Pascal:\\> Compilando " + arquivo.getNome() + "...");		
	}		
	
}
