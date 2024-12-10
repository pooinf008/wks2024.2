package br.edu.ifba.inf011.adapter;


import com.externo.fornecedor.FileDescriptorCryptoV2;

import br.edu.ifba.inf011.Arquivo;

public class ArquivoCryptoAdapterV2 extends FileDescriptorCryptoV2 implements Arquivo{

	public byte[] wallet;
	
	public ArquivoCryptoAdapterV2(String signature, String wallet) {
		super(signature, wallet);
		this.wallet = wallet.getBytes();
		
	}
	
	@Override
	public Arquivo abrir() {
		super.open();
		return this;
	}

	@Override
	public byte[] converter() {
		return this.wallet;
	}

	@Override
	public void fechar() {
		super.close();
	}

	@Override
	public void descarregar(byte[] conteudoAssinado) {
		this.wallet = conteudoAssinado;
	}

}
