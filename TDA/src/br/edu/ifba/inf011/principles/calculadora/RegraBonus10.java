package br.edu.ifba.inf011.principles.calculadora;

import java.math.BigDecimal;

import br.edu.ifba.inf011.principles.Funcionario;

public class RegraBonus10 implements Regra{

	@Override
	public BigDecimal calcularIncremento(Funcionario funcionario, BigDecimal pctAumento, BigDecimal incremento) {
		return new BigDecimal(10);
	}

}
