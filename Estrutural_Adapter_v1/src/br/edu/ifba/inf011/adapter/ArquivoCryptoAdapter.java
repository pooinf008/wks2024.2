package br.edu.ifba.inf011.adapter;


import com.externo.fornecedor.FileDescriptorCrypto;

import br.edu.ifba.inf011.Arquivo;

public class ArquivoCryptoAdapter implements Arquivo{

	
	private FileDescriptorCrypto descriptor;
	private BagWallet bag;
	
	
	public ArquivoCryptoAdapter(FileDescriptorCrypto descriptor) {
		this.descriptor = descriptor;
		this.bag = new BagWallet(descriptor.getWallet());
		
	}
	
	
	@Override
	public Arquivo abrir() {
		this.descriptor.open();
		return this;
	}

	@Override
	public byte[] converter() {
		return this.bag.getWallet();
	}

	@Override
	public void fechar() {
		this.descriptor.close();
	}

	@Override
	public void descarregar(byte[] conteudoAssinado) {
		this.bag.setWallet(conteudoAssinado);
	}

}
