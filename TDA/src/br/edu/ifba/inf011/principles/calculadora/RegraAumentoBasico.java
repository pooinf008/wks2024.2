package br.edu.ifba.inf011.principles.calculadora;

import java.math.BigDecimal;

import br.edu.ifba.inf011.principles.Funcionario;

public class RegraAumentoBasico implements Regra{

	@Override
	public BigDecimal calcularIncremento(Funcionario funcionario, BigDecimal pctAumento, BigDecimal incremento) {
		BigDecimal salarioAtual = funcionario.getSalario();
		BigDecimal aumento = salarioAtual.multiply(pctAumento);
		return aumento;
	}

}
