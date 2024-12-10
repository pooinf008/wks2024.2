package br.edu.ifba.inf011.adapter;


import com.externo.fornecedor.FileDescriptorCrypto;

import br.edu.ifba.inf011.Arquivo;

public class ArquivoCryptoAdapter extends FileDescriptorCrypto implements Arquivo{

	public byte[] wallet;
	
	public ArquivoCryptoAdapter(String signature, String wallet) {
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
