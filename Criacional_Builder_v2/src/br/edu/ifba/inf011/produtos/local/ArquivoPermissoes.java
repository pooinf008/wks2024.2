package br.edu.ifba.inf011.produtos.local;

public enum ArquivoPermissoes {
	
	OWNER(0), GROUP(3), ALL(6);
	
	private final int valor;
	
	ArquivoPermissoes(int valor){
		this.valor = valor;
	}
	
	public int getValor(){
		return this.valor;
	}

}
