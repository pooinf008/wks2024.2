package br.edu.ifba.inf011.adapter;

import com.externo.fornecedor.FileDescriptorCryptoV2;

import br.edu.ifba.inf011.Arquivo;
import br.edu.ifba.inf011.ArquivoFramework;

public class ArquivoCryptoFramework extends ArquivoFramework {

	@Override
	protected Arquivo createArquivo(String origem) {
		return new ArquivoCryptoAdapter(new FileDescriptorCryptoV2(origem, origem.toUpperCase()));
	}

}
