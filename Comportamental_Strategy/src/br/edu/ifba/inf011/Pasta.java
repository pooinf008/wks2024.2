package br.edu.ifba.inf011;

import java.util.ArrayList;
import java.util.List;

public class Pasta{
	
	private List<Arquivo> entradas;
	private String nome;
	
	public Pasta(String nome) {
		this.entradas = new ArrayList<Arquivo>();
		this.nome = nome;
	}
	
	public List<Arquivo> getEntradas() {
		return this.entradas;
	}
	
	public void addEntrada(Arquivo entrada) {
		this.entradas.add(entrada);
	}
	
	public String getNome() {
		return this.nome;
	}

	public Integer getTamanho() {
		Integer tamanho = 0;
		for(Entrada entrada : this.entradas)
			tamanho += entrada.getTamanho();
		return tamanho;
	}
	
	
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append(this.nome + "("+ this.getTamanho() + ")Kb\n");
		for(Entrada entrada : this.entradas)
			str.append("\t" + entrada.toString() + "\n");
		return str.toString();
	}
	
	
	public Boolean existe(Arquivo arquivo) {
		return this.entradas.contains(arquivo);
	}
	
	

}
