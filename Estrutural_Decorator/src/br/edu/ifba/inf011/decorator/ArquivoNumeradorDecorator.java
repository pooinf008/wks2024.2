package br.edu.ifba.inf011.decorator;

public class ArquivoNumeradorDecorator extends
	AbstractArquivoDecorator implements Arquivo{
	
	private int contador;

	public ArquivoNumeradorDecorator(Arquivo arquivo) {
		super(arquivo);
	}
	
	@Override
	public void reset() {
		this.contador = 1;
		super.reset();
	}
	
	@Override
	public String next() {
		return this.contador++ + " " + super.next();
	}
	

	
	

}
