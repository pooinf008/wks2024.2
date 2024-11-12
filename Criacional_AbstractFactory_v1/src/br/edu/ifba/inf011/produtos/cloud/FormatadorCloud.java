package br.edu.ifba.inf011.produtos.cloud;

import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.Formatador;

public class FormatadorCloud implements Formatador{

	@Override
	public void formatar(Arquivo arquivo) {
		System.out.println("Usando formatador cloud para formatar " + arquivo);
	}

}
