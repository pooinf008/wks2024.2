package br.edu.ifba.inf011.principles;

import java.math.BigDecimal;

public enum Cargo {
	
	TRAINEE(new BigDecimal(1000), new BigDecimal(2500)),
	JUNIOR(new BigDecimal(2500), new BigDecimal(7500)),
	PLENO(new BigDecimal(7500), new BigDecimal(10000)),
	SENIOR(new BigDecimal(10000), new BigDecimal(20000)),
	MENTOR(new BigDecimal(20000), new BigDecimal(50000));
	
	Cargo(BigDecimal piso, BigDecimal teto) {
		this.piso = piso;
		this.teto = teto;
	}
	
	public BigDecimal getPiso() {
		return this.piso;
	};
	
	public BigDecimal getTeto() {
		return this.teto;
	};
	
	private BigDecimal piso;
	private BigDecimal teto;

}
