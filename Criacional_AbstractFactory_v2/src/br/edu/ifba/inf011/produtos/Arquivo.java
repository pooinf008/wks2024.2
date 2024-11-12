package br.edu.ifba.inf011.produtos;

public interface Arquivo extends ElementoSistemaArquivo{
	
	public String getNome();
	public Arquivo abrir();
	public byte[] converter();
	public void fechar();
	public void descarregar(byte[] conteudoAssinado);

}
