package br.edu.ifba.inf011.produtos.cloud;

import br.edu.ifba.inf011.abstractFactory.SistemaArquivoFactory;
import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.Formatador;
import br.edu.ifba.inf011.produtos.Pasta;

public class SistemaCloudFactory implements SistemaArquivoFactory {

	@Override
	public Pasta criarPasta(String nome) {
		return new PastaCloud(nome);
	}

	@Override
	public Arquivo criarArquivo(String nome) {
		return new ArquivoCloud(nome);
	}

	@Override
	public Formatador criarFormatador() {
		return new FormatadorCloud();
	}

}
