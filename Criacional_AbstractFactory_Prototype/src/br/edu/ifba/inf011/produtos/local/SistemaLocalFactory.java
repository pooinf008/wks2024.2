package br.edu.ifba.inf011.produtos.local;

import br.edu.ifba.inf011.abstractFactory.SistemaArquivoFactory;
import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.Formatador;
import br.edu.ifba.inf011.produtos.Pasta;

public class SistemaLocalFactory implements SistemaArquivoFactory {

	@Override
	public Pasta criarPasta(String nome) {
		return new PastaLocal(nome);
	}

	@Override
	public Arquivo criarArquivo(String nome) {
		return new ArquivoLocal(nome);
	}

	@Override
	public Formatador criarFormatador() {
		return new FormatadorLocal();
	}

}
