package br.edu.ifba.inf011.principles;

import java.math.BigDecimal;

public class CalculadoraSalarial {
	
	public void aumentarSalario(Aumentavel funcionario, BigDecimal pctAumento) throws DomainException {
		if(pctAumento.floatValue() <= 0)
			throw new DomainException("Percentual de Aumento Inválido");
		BigDecimal novoSalario = this.calcularNovoSalario(funcionario, pctAumento);
		if (novoSalario.compareTo(funcionario.getLimiteSalarial()) > 0)
			throw new DomainException("Aumento Excede Teto do Cargo");
		funcionario.setSalario(novoSalario);
	}

	protected BigDecimal calcularNovoSalario(Aumentavel funcionario, BigDecimal pctAumento) {
		BigDecimal salarioAtual = funcionario.getSalario();
		BigDecimal aumento = salarioAtual.multiply(pctAumento);
		BigDecimal novoSalario = salarioAtual.add(aumento);
		return novoSalario;
	}	

}
