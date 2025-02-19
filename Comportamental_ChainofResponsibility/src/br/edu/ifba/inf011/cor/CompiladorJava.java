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

	public void compilar(ArquivoFonte arquivo) throws Exception{
		try {
			this.analiseSintatica(arquivo);
			System.out.println("Compilador Java:\\> Compilando " + arquivo.getNome() + "...");
			this.salvarExecutavel();
		}catch(Exception ex) {
			super.compilar(arquivo);
		}		
	}
	
	public void analiseSintatica(ArquivoFonte arquivo) throws Exception {
		List<String> conteudo = arquivo.read();
		for(String linha : conteudo)
			if(linha.contains("class"))
				return;
		throw new Exception("NÃO É ARQUIVO JAVA!!!");
	}
	
	public void salvarExecutavel(){
		System.out.println("Compilador Java:\\> salvando ...");
	}
	
	
}
