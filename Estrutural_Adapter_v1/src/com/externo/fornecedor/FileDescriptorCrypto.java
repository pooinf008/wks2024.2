package com.externo.fornecedor;

public class FileDescriptorCrypto {
	
	private String signature;
	private String wallet;
	private Boolean status;
	
	public FileDescriptorCrypto(String signature, String wallet) {
		super();
		this.signature = signature;
		this.wallet = wallet;
		this.status = Boolean.FALSE;
	}
	
	public void open() {
		this.status = Boolean.TRUE;
	}

	public void close() {
		this.status = Boolean.FALSE;
	}
	
	public void put(String wallet, String signature) {
		if(!this.status)
			return;
		this.wallet = wallet;
		this.signature = signature;
	}

	public String getSignature() {
		return signature;
	}

	public String getWallet() {
		return wallet;
	}
	
	
	

}
