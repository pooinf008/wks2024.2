package br.edu.ifba.inf011.principles.calculadora;

import java.math.BigDecimal;

import br.edu.ifba.inf011.principles.DomainException;
import br.edu.ifba.inf011.principles.Funcionario;

public class CalculadoraSalarialComRegra {
	
	Regra aumentoBasico;
	
	public CalculadoraSalarialComRegra(Regra aumentoBasico) {
		this.aumentoBasico = aumentoBasico;
	}
	
	
	
	public void aumentarSalario(Funcionario funcionario, BigDecimal pctAumento) throws DomainException{
		BigDecimal incremento = new BigDecimal(0);
		incremento = incremento.add(aumentoBasico.calcularIncremento(funcionario, pctAumento, incremento));
		funcionario.setSalario(funcionario.getSalario().add(incremento));
	}
	

}
