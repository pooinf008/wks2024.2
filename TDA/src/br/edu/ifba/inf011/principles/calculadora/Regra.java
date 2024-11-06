package br.edu.ifba.inf011.principles.calculadora;

import java.math.BigDecimal;

import br.edu.ifba.inf011.principles.Funcionario;

public interface Regra {

	public BigDecimal calcularIncremento(Funcionario funcionario, BigDecimal pctAumento, BigDecimal incremento);

}
