package br.edu.ifba.inf011.produtos.local;

import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.visitors.SistemaArquivoVisitor;

public class ArquivoLocal implements Arquivo{

	private String nome;
	private Integer tamanho;
	private Integer versao;
	
	public ArquivoLocal(String nome, Integer tamanho) {
		super();
		this.nome = nome;
		this.tamanho = tamanho;
		this.versao = 1;
	}
	
	public String toString() {
		return "[Arquivo Local]: " + this.nome; 
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public void renomear(String nome) {
		this.nome = nome;
	}

	@Override
	public Integer getTamanho() {
		return tamanho;
	}

	@Override
	public void atualizar() {
		this.versao += 1;
	}

	@Override
	public Integer getVersao() {
		return this.versao;
	}

	@Override
	public void aceitar(SistemaArquivoVisitor visitor) {
		visitor.visitArquivo(this);
	}
	

}
