package br.edu.ifba.inf011.decorator;

public abstract class AbstractArquivoDecorator implements Arquivo{

	private Arquivo arquivo;
	
	public AbstractArquivoDecorator(Arquivo arquivo) {
		this.arquivo = arquivo; 
	}
	
	
	@Override
	public void reset() {
		this.arquivo.reset();
	}

	@Override
	public Boolean hasNext() {
		return this.arquivo.hasNext();
	}

	@Override
	public String next() {
		return this.arquivo.next();
	}

}
