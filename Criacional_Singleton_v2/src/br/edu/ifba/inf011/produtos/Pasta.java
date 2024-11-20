package br.edu.ifba.inf011.produtos;

import br.edu.ifba.inf011.protype.Prototype;

public interface Pasta extends Prototype{
	public void adicionar(Arquivo arquivo);
	public void renomear(String nome);
}
