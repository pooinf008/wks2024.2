package br.edu.ifba.inf011.produtos.cloud;

import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.Formatador;
import br.edu.ifba.inf011.protype.Prototype;

public class FormatadorCloud implements Formatador{

	@Override
	public void formatar(Arquivo arquivo) {
		System.out.println("Usando formatador cloud para formatar " + arquivo);
	}

	@Override
	public Prototype prototipar() {
		return this;
	}

}
