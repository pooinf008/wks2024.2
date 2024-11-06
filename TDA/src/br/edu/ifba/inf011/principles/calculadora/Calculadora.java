package br.edu.ifba.inf011.principles.calculadora;

import java.math.BigDecimal;
import java.util.List;

import br.edu.ifba.inf011.principles.DomainException;
import br.edu.ifba.inf011.principles.Funcionario;

public class Calculadora {

	private List<Regra> regras;
	
	public Calculadora(List<Regra> regras) {
		this.regras = regras;
	}
	
	public void addRegra(Regra regra) {
		this.regras.add(regra);
	}
	
	public void removeRegra(Regra regra) {
		this.regras.remove(regra);
	}
	
	
	public void aumentarSalario(Funcionario funcionario, BigDecimal pctAumento) throws DomainException{
		BigDecimal incremento = new BigDecimal(0);
		for(Regra regra : this.regras)
			incremento = incremento.add(regra.calcularIncremento(funcionario, pctAumento, incremento));
		
		funcionario.setSalario(funcionario.getSalario().add(incremento));
			
	}
	
}
