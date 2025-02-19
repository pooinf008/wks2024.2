package br.edu.ifba.inf011.model;

public class Equipe {
	
	private String nome;

	public Equipe(String nome) {
		super();
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}
	
	public String toString() {
		return this.getNome();
	}	
	
	
	

}
