package br.edu.ifba.inf011.produtos.cloud;

import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.local.ArquivoLocal;
import br.edu.ifba.inf011.protype.Prototype;

public class ArquivoCloud implements Arquivo{

	private String nome;
	
	public ArquivoCloud(String nome) {
		super();
		this.nome = nome;
	}

	public ArquivoCloud(ArquivoCloud outro) {
		this(outro.getNome());
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
	public Prototype prototipar() {
		return new ArquivoCloud(this);
	}

	@Override
	public void renomear(String nome) {
		this.nome = nome;
	}	
	

}
