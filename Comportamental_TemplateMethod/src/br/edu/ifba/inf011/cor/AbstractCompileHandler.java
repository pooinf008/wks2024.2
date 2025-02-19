package br.edu.ifba.inf011.cor;

import br.edu.ifba.inf011.produtos.ArquivoFonte;

public abstract class AbstractCompileHandler implements CompileHandler{
	
	protected CompileHandler proximo;
	
	public AbstractCompileHandler(CompileHandler proximo) {
		this.proximo = proximo;
	}
	
	public AbstractCompileHandler() {
		this(null);
	}

	@Override
	public void setNext(CompileHandler handler) {
		this.proximo = handler;
	}

	@Override
	public void compilar(String nome) throws Exception {
		ArquivoFonte arquivo = new ArquivoFonte(nome);
		if(!this.possoCompilar(arquivo) && this.proximo!= null) {
			this.proximo.compilar(nome);
			return;
		}	
		if(!this.possoCompilar(arquivo) && this.proximo == null)
			throw new Exception("Linguagem indisponível");
		this.doPreProcessar(arquivo);
		this.doCompilar(arquivo);
		this.salvarExecutavel();	
	}
	
	public abstract boolean possoCompilar(ArquivoFonte arquivo) throws Exception;
	public abstract void doCompilar(ArquivoFonte arquivo) throws Exception;

	
	public void doPreProcessar(ArquivoFonte arquivo) throws Exception{
		
	};

	
	public void salvarExecutavel(){
		System.out.println("Compilador :\\> salvando ...");
	}	

}
