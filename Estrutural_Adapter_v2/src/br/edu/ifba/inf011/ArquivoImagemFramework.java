package br.edu.ifba.inf011;

public class ArquivoImagemFramework extends ArquivoFramework {

	@Override
	protected Arquivo createArquivo(String origem) {
		return new ArquivoImagem(origem);
	}

}
