package br.edu.ifba.inf011.produtos;

import br.edu.ifba.inf011.protype.Prototype;

public interface Arquivo extends Prototype {
	
	public String getNome();
	public void renomear(String nome);
	public Arquivo abrir();
	public byte[] converter();
	public void fechar();
	public void descarregar(byte[] conteudoAssinado);

}
