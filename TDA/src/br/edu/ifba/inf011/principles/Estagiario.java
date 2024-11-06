package br.edu.ifba.inf011.principles;

import java.math.BigDecimal;

public class Estagiario implements Aumentavel {

	private FichaCadastral data;
	private String instituicao;

	public Estagiario(String matricula, String nome, String ramal, String endereco, BigDecimal salario, Cargo cargo, String instituicao) {
		super();
		this.data = new FichaCadastral(matricula, nome, ramal,  endereco,  salario,  cargo);
		this.instituicao = instituicao;;
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



}
