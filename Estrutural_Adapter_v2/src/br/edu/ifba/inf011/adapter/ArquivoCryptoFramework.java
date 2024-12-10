package br.edu.ifba.inf011.adapter;

import br.edu.ifba.inf011.Arquivo;
import br.edu.ifba.inf011.ArquivoFramework;

public class ArquivoCryptoFramework extends ArquivoFramework {

	@Override
	protected Arquivo createArquivo(String origem) {
		return new ArquivoCryptoAdapterV2(origem, origem.toUpperCase());
	}

}
