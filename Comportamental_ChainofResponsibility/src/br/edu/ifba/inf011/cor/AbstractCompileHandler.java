package br.edu.ifba.inf011.cor;

import br.edu.ifba.inf011.produtos.ArquivoFonte;

public class AbstractCompileHandler implements CompileHandler{
	
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
	public void compilar(ArquivoFonte arquivo) throws Exception {
		if(this.proximo == null)
			throw new Exception("Linguagem indisponível");
		this.proximo.compilar(arquivo);
	}

}
