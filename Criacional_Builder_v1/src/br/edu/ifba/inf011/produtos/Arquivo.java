package br.edu.ifba.inf011.produtos;


public interface Arquivo {
	
	public String getNome();
	public void renomear(String nome);
	public Arquivo abrir();
	public byte[] converter();
	public void fechar();
	public void descarregar(byte[] conteudoAssinado);

}
