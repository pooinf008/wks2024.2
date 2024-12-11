package br.edu.ifba.inf011.proxy;

import br.edu.ifba.inf011.Arquivo;
import br.edu.ifba.inf011.ArquivoTexto;

public class ArquivoLogProxy implements Arquivo{
	
	private Arquivo arquivo;
	
	public ArquivoLogProxy(Arquivo arquivo) {
		this.arquivo = arquivo;
	}
	

	@Override
	public Arquivo abrir() {
		this.arquivo.abrir();
		return this;
	}

	@Override
	public byte[] converter() {
		System.err.println("Operacao de Converter realizada...");
		return this.arquivo.converter();
	}

	@Override
	public void fechar() {
		this.arquivo.fechar();
	}

	@Override
	public void descarregar(byte[] conteudoAssinado) {
		System.err.println("Operacao de Descarregar realizada...");
		this.arquivo.descarregar(conteudoAssinado);
	}

}
