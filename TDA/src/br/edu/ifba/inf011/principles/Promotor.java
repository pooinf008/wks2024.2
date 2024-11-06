package br.edu.ifba.inf011.principles;

import java.math.BigDecimal;

public class Promotor {
	
	protected int podePromover(Promovivel pessoal) {
		BigDecimal diferenca = pessoal.getSalario().subtract(pessoal.getLimiteSalarial());
		BigDecimal vintePorCento = pessoal.getSalario().multiply(new BigDecimal(0.2));
		return diferenca.compareTo(vintePorCento); 
	}
	
	public void promover(Promovivel pessoal) {
		if(podePromover(pessoal) <= 0)
			pessoal.promover();
	}

}
