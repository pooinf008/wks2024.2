package br.edu.ifba.inf011.principles;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class FichaCadastral {
	public String matricula;
	public String nome;
	public String ramal;
	public String endereco;
	public BigDecimal salario;
	public Cargo cargo;
	
	public FichaCadastral(String matricula, String nome, String ramal, String endereco, BigDecimal salario,
			Cargo cargo) {
		this.matricula = matricula;
		this.nome = nome;
		this.ramal = ramal;
		this.endereco = endereco;
		this.salario = salario;
		this.cargo = cargo;
	}

	private String getMatricula() {
		return this.matricula;
	}

	private String getNome() {
		return this.nome;
	}
	
	private Cargo getCargo() {
		return this.cargo;
	}
		
	public BigDecimal getSalario() {
		return this.salario;
	}	
	
	public String toString() {
		String rep = "MATRICULA: " + this.getMatricula() + "\n" + 
					 "NOME: " + this.getNome() + "\n" +
					 "CARGO: " + this.getCargo() + "\n" +
					 "SALÁRIO: " +  NumberFormat.getCurrencyInstance(java.util.Locale.of("PT", "BR")).format(this.getSalario());
		return rep;
			   
 	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}	
	
	public BigDecimal getLimiteSalarial() {
		return this.cargo.getTeto();
	}	
	
	public void promover() {
		this.cargo = this.cargo.proximo();
	}

	
	
}