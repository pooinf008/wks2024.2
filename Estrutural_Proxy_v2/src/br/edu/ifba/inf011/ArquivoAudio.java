package br.edu.ifba.inf011;

public class ArquivoAudio implements Arquivo{

	
	
	public ArquivoAudio(String str) {
		
	}
	
	@Override
	public Arquivo abrir() {
		return this;
	}

	@Override
	public byte[] converter() {
		return new byte[3];
	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void descarregar(byte[] conteudoAssinado) {
		// TODO Auto-generated method stub
		
	}
	
	public void tocar() {
		
	}

}
