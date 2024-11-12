package br.edu.ifba.inf011.produtos.local;

import br.edu.ifba.inf011.Formatador;
import br.edu.ifba.inf011.produtos.Arquivo;

public class FormatadorLocal implements Formatador{

	@Override
	public void formatar(Arquivo arquivo) {
		System.out.println("Usando formatador local para formatar " + arquivo);
	}

}
