package br.edu.ifba.inf011;

import br.edu.ifba.inf011.proxy.ArquivoLogProxy;

public class ArquivoTextoFramework extends ArquivoFramework {

	@Override
	protected Arquivo createArquivo(String origem) {
		return new ArquivoLogProxy(new ArquivoTexto(origem));
	}

}
