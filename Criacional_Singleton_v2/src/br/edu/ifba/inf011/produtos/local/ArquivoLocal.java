package br.edu.ifba.inf011.produtos.local;

import java.util.Objects;

import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.protype.Prototype;

public class ArquivoLocal implements Arquivo{

	private String nome;
	
	public ArquivoLocal(String nome) {
		super();
		this.nome = nome;
	}
	
	public ArquivoLocal(ArquivoLocal outro) {
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
		return "[Arquivo Local]: " + this.nome; 
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public Prototype prototipar() {
		return new ArquivoLocal(this);
	}

	@Override
	public void renomear(String nome) {
		this.nome = nome;
	}
	

}
