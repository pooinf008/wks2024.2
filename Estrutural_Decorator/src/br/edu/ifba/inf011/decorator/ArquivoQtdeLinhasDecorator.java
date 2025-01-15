package br.edu.ifba.inf011.decorator;

public class ArquivoQtdeLinhasDecorator extends
	AbstractArquivoDecorator implements Arquivo{
	
	private int contador;
	private Boolean printTotal;

	public ArquivoQtdeLinhasDecorator(Arquivo arquivo) {
		super(arquivo);
	}
	
	@Override
	public void reset() {
		this.contador = 0;
		this.printTotal = Boolean.FALSE;
		super.reset();
	}
	
	@Override
	public Boolean hasNext() {
		if(super.hasNext()) {
			this.contador++;
			return Boolean.TRUE;
		}	
		return !this.printTotal;
	}
	
	@Override
	public String next() {
		if(super.hasNext())
			return super.next();
		this.printTotal = Boolean.TRUE;
		return "Quantidade de Linhas: " + this.contador;
	}
	

}
