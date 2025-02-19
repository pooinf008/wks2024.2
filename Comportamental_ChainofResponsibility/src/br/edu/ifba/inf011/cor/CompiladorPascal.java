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

	public void compilar(ArquivoFonte arquivo) throws Exception{
		try {
			this.analiseSintatica(arquivo);
			System.out.println("Compilador Pascal:\\> Compilando " + arquivo.getNome() + "...");
			this.salvarExecutavel();
		}catch(Exception ex) {
			super.compilar(arquivo);
		}
	}
	
	public void analiseSintatica(ArquivoFonte arquivo) throws Exception {
		List<String> conteudo = arquivo.read();
		for(String linha : conteudo)
			if(linha.contains("program"))
				return;
		throw new Exception("NÃO É ARQUIVO PASCAL!!!");
	}
	
	public void salvarExecutavel(){
		System.out.println("Compilador Pascal:\\> salvando ...");
	}
	
	
}
