package br.edu.ifba.inf011.produtos.cloud;

import br.edu.ifba.inf011.produtos.Arquivo;

public class ArquivoCloud implements Arquivo{

	private String nome;
	
	public ArquivoCloud(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public Arquivo abrir() {
		return this;
	}

	@Override
	public byte[] converter() {
		return null;
	}

	@Override
	public void fechar() {
	}

	@Override
	public void descarregar(byte[] conteudoAssinado) {
	}
	
	public String toString() {
		return "[Arquivo Cloud]: " + this.nome; 
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public void renomear(String nome) {
		this.nome = nome;
	}
	

}
