package br.edu.ifba.inf011;

public interface Arquivo {

	public Arquivo abrir();
	public byte[] converter();
	public void fechar();
	public void descarregar(byte[] conteudoAssinado);

}
