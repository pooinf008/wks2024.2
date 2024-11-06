package br.edu.ifba.inf011.principles.calculadora;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

import br.edu.ifba.inf011.principles.Funcionario;

public class RegraAumentoHalloween implements Regra{

	@Override
	public BigDecimal calcularIncremento(Funcionario funcionario, BigDecimal pctAumento, BigDecimal incremento) {
		
		LocalDate data = LocalDate.now();
		BigDecimal pctAumentoOut = new BigDecimal (pctAumento.floatValue());  
		
		if (data.getMonth() == Month.OCTOBER)
			pctAumentoOut = pctAumentoOut.add(new BigDecimal(0.1));	
		
		BigDecimal salarioAtual = funcionario.getSalario();
		BigDecimal aumento = salarioAtual.multiply(pctAumentoOut);
		return aumento;
	}

}
