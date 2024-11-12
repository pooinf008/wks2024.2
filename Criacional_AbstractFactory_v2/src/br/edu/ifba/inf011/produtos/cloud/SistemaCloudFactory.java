package br.edu.ifba.inf011.produtos.cloud;

import br.edu.ifba.inf011.abstractFactory.SistemaArquivoFactory;
import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.ElementoSistemaArquivo;
import br.edu.ifba.inf011.produtos.Pasta;

public class SistemaCloudFactory implements SistemaArquivoFactory {

	private Pasta criarPasta(String nome) {
		return new PastaCloud(nome);
	}

	private Arquivo criarArquivo(String nome) {
		return new ArquivoCloud(nome);
	}

	@Override
	public ElementoSistemaArquivo criarElementoSistemaArquivo(Integer tipo, String nome) {
		if(tipo == 0)
			return this.criarArquivo(nome);
		if(tipo == 1)
			return this.criarPasta(nome);
		return null;
	}

//	private  Formatador criarFormatador() {
		//return new FormatadorCloud();
//	}

}
