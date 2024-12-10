package br.edu.ifba.inf011.adapter;

public class BagWallet {
	
	public byte[] wallet;
	
	public BagWallet(String wallet) {
		this.wallet = wallet.getBytes();
	}
	
	public byte[] getWallet() {
		return this.wallet;
	}
	

	public void setWallet(byte[] wallet) {
		this.wallet = wallet;
	}
	
	
}
