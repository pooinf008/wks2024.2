package br.edu.ifba.inf011.cor;

import java.util.List;

import br.edu.ifba.inf011.compiladores.Compilador;
import br.edu.ifba.inf011.produtos.ArquivoFonte;

public class CompiladorJava extends AbstractCompileHandler implements Compilador{

	public CompiladorJava(CompileHandler proximo) {
		super(proximo);
	}
	
	public CompiladorJava() {
		super();
	}
	
	public boolean possoCompilar(ArquivoFonte arquivo) throws Exception {
		List<String> conteudo = arquivo.read();
		for(String linha : conteudo)
			if(linha.contains("class"))
				return true;
		return false;
	};
	
	public void doCompilar(ArquivoFonte arquivo) {
		System.out.println("Compilador Java:\\> Compilando " + arquivo.getNome() + "...");		
	}	
	
}
