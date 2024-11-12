package br.edu.ifba.inf011.produtos.local;

import br.edu.ifba.inf011.Formatador;
import br.edu.ifba.inf011.abstractFactory.SistemaArquivoFactory;
import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.ElementoSistemaArquivo;
import br.edu.ifba.inf011.produtos.Pasta;

public class SistemaLocalFactory implements SistemaArquivoFactory {

	private Pasta criarPasta(String nome) {
		return new PastaLocal(nome);
	}

	private Arquivo criarArquivo(String nome) {
		return new ArquivoLocal(nome);
	}

	private Formatador criarFormatador() {
		return new FormatadorLocal();
	}

	@Override
	public ElementoSistemaArquivo criarElementoSistemaArquivo(Integer tipo, String nome) {
		if(tipo == 0)
			return this.criarArquivo(nome);
		if(tipo == 1)
			return this.criarPasta(nome);
		if(tipo == 2)
			return this.criarFormatador();
		
		return null;
	}	
	
}
