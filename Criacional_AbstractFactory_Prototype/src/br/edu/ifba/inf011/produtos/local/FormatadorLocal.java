package br.edu.ifba.inf011.produtos.local;

import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.Formatador;
import br.edu.ifba.inf011.protype.Prototype;

public class FormatadorLocal implements Formatador{

	@Override
	public void formatar(Arquivo arquivo) {
		System.out.println("Usando formatador local para formatar " + arquivo);
	}

	@Override
	public Prototype prototipar() {
		return this;
	}

}
