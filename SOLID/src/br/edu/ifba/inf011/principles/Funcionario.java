package br.edu.ifba.inf011.principles;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Funcionario {
	
	private String matricula;
	private String nome;
	private BigDecimal salario;
	private Cargo cargo;
	
	public Funcionario(String matricula, String nome, BigDecimal salario, Cargo cargo) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}

	private String getMatricula() {
		return matricula;
	}
	
	private String getNome() {
		return nome;
	}
	
	private BigDecimal getSalario() {
		return salario;
	}
	
	private void setSalario(BigDecimal salario) {
		this.salario = salario;
	}	
	
	private Cargo getCargo() {
		return cargo;
	}
	
	public void aumentarSalario(BigDecimal pctAumento) throws DomainException {
		if(pctAumento.floatValue() <= 0)
			throw new DomainException("Percentual de Aumento Inválido");
		BigDecimal novoSalario = this.calcularNovoSalario(pctAumento);
		if (novoSalario.compareTo(this.getCargo().getTeto()) > 0)
			throw new DomainException("Aumento Excede Teto do Cargo");
		this.setSalario(novoSalario);
	}

	private BigDecimal calcularNovoSalario(BigDecimal pctAumento) {
		BigDecimal salarioAtual = this.getSalario();
		BigDecimal aumento = salarioAtual.multiply(pctAumento);
		BigDecimal novoSalario = salarioAtual.add(aumento);  
		return novoSalario;
	}

	public String toString() {
		String rep = "MATRICULA: " + this.getMatricula() + "\n" + 
					 "NOME: " + this.getNome() + "\n" +
					 "CARGO: " + this.getCargo() + "\n" +
					 "SALÁRIO: " +  NumberFormat.getCurrencyInstance(java.util.Locale.of("PT", "BR")).format(this.getSalario());
		return rep;
			   
 	}
	

}
