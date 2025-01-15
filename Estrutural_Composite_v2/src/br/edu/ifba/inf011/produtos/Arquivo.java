package br.edu.ifba.inf011.produtos;

public class Arquivo implements ElementoSO {
	
	private String nome;
	private Double tamanho;
	
	public Arquivo(String nome, Double tamanho) {
		super();
		this.nome = nome;
		this.tamanho = tamanho;
	}

	public String getNome() {
		return this.nome;
	}

	@Override
	public Double getTamanho() {
		return this.tamanho;
	}

	public String toString() {
		return "[Arquivo]: " + this.nome; 
	}
	
	

}
