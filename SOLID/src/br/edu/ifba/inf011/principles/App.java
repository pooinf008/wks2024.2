package br.edu.ifba.inf011.principles;

import java.math.BigDecimal;

public class App {
	
	
	public void run() throws DomainException {
		Funcionario funcionario = new Funcionario("001", "ZÉ DAS COUVES", new BigDecimal(1000), Cargo.TRAINEE);
		funcionario.aumentarSalario(new BigDecimal("0.1"));
		System.out.println(funcionario);
	}
	
	
	public static void main(String[] args) throws DomainException {
		(new App()).run();
	}
	
	

}
