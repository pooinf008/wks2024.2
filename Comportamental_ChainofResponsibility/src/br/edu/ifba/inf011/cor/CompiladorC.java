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

	public void compilar(ArquivoFonte arquivo) throws Exception{
		try {
			this.analiseSintatica(arquivo);
			System.out.println("Compilador C:\\> Compilando " + arquivo.getNome() + "...");
			this.salvarExecutavel();
		}catch(Exception ex) {
			super.compilar(arquivo);
		}
		
	}
	
	private void analiseSintatica(ArquivoFonte arquivo) throws Exception {
		List<String> conteudo = arquivo.read();
		for(String linha : conteudo)
			if(linha.contains("#include"))
				return;
		throw new Exception("NÃO É ARQUIVO C!!!");
	}
	
	private void salvarExecutavel(){
		System.out.println("Compilador C:\\> salvando ...");
	}
	
	
}
