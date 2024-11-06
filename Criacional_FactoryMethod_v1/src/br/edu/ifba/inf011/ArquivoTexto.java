package br.edu.ifba.inf011;

public class ArquivoTexto implements Arquivo{
	
	
	public ArquivoTexto(String str) {
		
	}
	

	@Override
	public Arquivo abrir() {
		return this;
	}

	@Override
	public byte[] converter() {
		
		byte[] conteudo = new byte[5];
		for(byte b = 0; b < conteudo.length; b++)
			conteudo[b] = b;
		
		
		return conteudo;
	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void descarregar(byte[] conteudoAssinado) {
		for(byte b = 0; b < conteudoAssinado.length; b++)
			System.out.print(conteudoAssinado[b] + " ");		
	}

}
