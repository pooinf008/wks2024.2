package br.edu.ifba.inf011.produtos.local;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.produtos.builder.ArquivoBuilder;

public class ArquivoLocalBuilder implements ArquivoBuilder{
	
	private String nome;
	private StringBuilder conteudo;
	private Boolean hidden;
	private List<Boolean> permissoes;

	
	
	public ArquivoLocalBuilder init() {
		this.conteudo = new StringBuilder();
		this.hidden = Boolean.FALSE;
		this.permissoes = new ArrayList<Boolean>();
		for(int iCont = 0; iCont < 9; iCont++)
			this.permissoes.add(Boolean.FALSE);
		
		this.read(ArquivoPermissoes.OWNER);
		this.write(ArquivoPermissoes.OWNER);
		this.read(ArquivoPermissoes.GROUP);
		return this;
	};
	
	public ArquivoLocalBuilder write(String content) {
		this.conteudo.append(content);
		return this;
	}
	
	public ArquivoLocalBuilder hidden() {
		this.hidden = Boolean.TRUE;
		return this;
	}
	
	public ArquivoLocalBuilder read(ArquivoPermissoes permissoes) {
		this.permissoes.set(0 + permissoes.getValor(), Boolean.TRUE);
		return this;
	}
	
	public ArquivoLocalBuilder write(ArquivoPermissoes permissoes) {
		this.permissoes.set(1 + permissoes.getValor(), Boolean.TRUE);
		return this;
	}
	
	public ArquivoLocalBuilder execute(ArquivoPermissoes permissoes) {
		this.permissoes.set(2+ permissoes.getValor(), Boolean.TRUE);
		return this;
	}
	
	public ArquivoLocalBuilder unread(ArquivoPermissoes permissoes) {
		this.permissoes.set(0 + permissoes.getValor(), Boolean.FALSE);
		return this;
	}
	
	public ArquivoLocalBuilder unwrite(ArquivoPermissoes permissoes) {
		this.permissoes.set(1 + permissoes.getValor(), Boolean.FALSE);
		return this;
	}
	
	public ArquivoLocalBuilder unexecute(ArquivoPermissoes permissoes) {
		this.permissoes.set(2+ permissoes.getValor(), Boolean.FALSE);
		return this;
	}	
	
	public ArquivoLocal build(String nome) {
		return new ArquivoLocal(nome, this.conteudo.toString(),
						    this.hidden, 
						    this.permissoes);		
	}


	
	
	
}
