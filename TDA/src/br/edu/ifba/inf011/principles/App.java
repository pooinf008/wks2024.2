package br.edu.ifba.inf011.principles;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.principles.calculadora.Calculadora;
import br.edu.ifba.inf011.principles.calculadora.CalculadoraSalarialComRegra;
import br.edu.ifba.inf011.principles.calculadora.Regra;
import br.edu.ifba.inf011.principles.calculadora.RegraAumentoBasico;
import br.edu.ifba.inf011.principles.calculadora.RegraAumentoHalloween;
import br.edu.ifba.inf011.principles.calculadora.RegraBonus10;

public class App {

	public void run3() throws DomainException {
		
		CalculadoraSalarialComRegra calculadora = new CalculadoraSalarialComRegra(new RegraAumentoHalloween());
		
		Funcionario funcionario = new Funcionario("001", 
												  "ZÉ DAS COUVES",
												  "1301",
												  "Rua dos 1301s",
												  new BigDecimal(1000),
												  Cargo.TRAINEE);
		calculadora.aumentarSalario(funcionario, new BigDecimal("0.1"));
		System.out.println(funcionario);
	}
	
	
	public void run2() throws DomainException {
		
		CalculadoraSalarialComRegra calc ;
		
		
		List<Regra> regras = new ArrayList<Regra>();
		
		Regra aumentoBasico = new RegraAumentoBasico();
		Regra bonus10 = new RegraBonus10();
		
		regras.add(aumentoBasico);
		regras.add(bonus10);
		
		Calculadora calculadora = new Calculadora(regras);
		
		Funcionario funcionario = new Funcionario("001", 
												  "ZÉ DAS COUVES",
												  "1301",
												  "Rua dos 1301s",
												  new BigDecimal(1000),
												  Cargo.TRAINEE);
		calculadora.aumentarSalario(funcionario, new BigDecimal("0.1"));
		System.out.println(funcionario);
		
		calculadora.removeRegra(bonus10);
		
		Terceirizado terceiro = new Terceirizado("002", 
				  "ZÉZINHO DAS COUVES",
				  "1301",
				  "Rua dos 1301s",
				  new BigDecimal(1000),
				  Cargo.TRAINEE, "GATA S/A");
		
		System.out.println(terceiro);	
		
//		calculadora.aumentarSalario(terceiro, new BigDecimal("0.1"));
		System.out.println(terceiro);
		
	}	
	
	
	public void run() throws DomainException {
		
		
		
		CalculadoraSalarial calculadora = new CalculadoraSalarialComBonus();
		Promotor promotor = new Promotor();
		
		
		Terceirizado terceiro = new Terceirizado("002", 
				  "ZÉZINHO DAS COUVES",
				  "1301",
				  "Rua dos 1301s",
				  new BigDecimal(1000),
				  Cargo.TRAINEE, "GATA S/A");
		
		System.out.println(terceiro);
		promotor.promover(terceiro);
		
		
		Funcionario funcionario = new Funcionario("001", 
												  "ZÉ DAS COUVES",
												  "1301",
												  "Rua dos 1301s",
												  new BigDecimal(1000),
												  Cargo.TRAINEE);
		calculadora.aumentarSalario(funcionario, new BigDecimal("1.49"));
		System.out.println(funcionario);
		
		promotor.promover(funcionario);
		System.out.println(funcionario);
		
		Estagiario estagiario = new Estagiario("001", 
				  "ZÉ DAS COUVES",
				  "1301",
				  "Rua dos 1301s",
				  new BigDecimal(1000),
				  Cargo.TRAINEE, "IFBA");
		calculadora.aumentarSalario(estagiario, new BigDecimal("0.3"));
		System.out.println(estagiario);
		
		
//		promotor.promover(estagiario);
//		calculadora.aumentarSalario(terceiro, new BigDecimal("1.49"));
		
		
		
	}
	
	public void run4() throws DomainException {
		
		CalculadoraSalarial calculadora = new CalculadoraSalarialComBonus();
		
		Estagiario funcionario = new Estagiario("001", 
												  "ZÉ DAS COUVES",
												  "1301",
												  "Rua dos 1301s",
												  new BigDecimal(1000),
												  Cargo.TRAINEE, "IFBA");
		calculadora.aumentarSalario(funcionario, new BigDecimal("0.3"));
		System.out.println(funcionario);
	}
	
	
	
	public static void main(String[] args) throws DomainException {
		(new App()).run();
	}
	
	

}
