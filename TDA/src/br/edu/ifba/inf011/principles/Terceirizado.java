 package br.edu.ifba.inf011.principles;

import java.math.BigDecimal;

public class Terceirizado implements Promovivel{
	
	private FichaCadastral data;
	private String empresa;
	
	public Terceirizado(String matricula, String nome, String ramal, String endereco, BigDecimal salario, Cargo cargo, String empresa) {
		this.data = new FichaCadastral(matricula, nome, ramal,  endereco,  salario,  cargo);
		this.empresa = empresa;
	}
	
	private String getEmpresa() {
		return this.empresa;
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
		String rep = this.data.toString() + "\n" +
				"EMPRESA: " + this.getEmpresa();
		return rep;
 	}
	
	@Override
	public void promover() {
		this.data.promover();
	}
}
