package br.edu.ifba.inf011.principles;

import java.math.BigDecimal;

public class Funcionario implements Promovivel, Aumentavel{
	
	private FichaCadastral data;

	public Funcionario(String matricula, String nome, String ramal, String endereco, BigDecimal salario, Cargo cargo) {
		super();
		this.data = new FichaCadastral(matricula, nome, ramal,  endereco,  salario,  cargo);
	}
	
	public BigDecimal getSalario() {
		return this.data.getSalario();
	}
	
	public void setSalario(BigDecimal salario) {
		this.data.setSalario(salario);
	}	
	

	public BigDecimal getLimiteSalarial() {
		return this.data.getLimiteSalarial();
	}


	public String toString() {
		return this.data.toString();
 	}

	@Override
	public void promover() {
		this.data.promover();
	}
	

}
