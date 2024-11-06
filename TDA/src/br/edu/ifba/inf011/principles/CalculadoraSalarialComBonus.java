package br.edu.ifba.inf011.principles;

import java.math.BigDecimal;

public class CalculadoraSalarialComBonus extends CalculadoraSalarial{

	protected BigDecimal calcularNovoSalario(Efetivo funcionario, BigDecimal pctAumento) {
		BigDecimal novoSalario = super.calcularNovoSalario(funcionario, pctAumento);
		novoSalario = novoSalario.add(new BigDecimal(10));
		return novoSalario;
	}	
	
}
