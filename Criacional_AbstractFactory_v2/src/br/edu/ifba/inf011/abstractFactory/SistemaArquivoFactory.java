package br.edu.ifba.inf011.abstractFactory;

import br.edu.ifba.inf011.produtos.ElementoSistemaArquivo;

public interface SistemaArquivoFactory {
	
	public ElementoSistemaArquivo criarElementoSistemaArquivo(Integer tipo, String nome);

}

