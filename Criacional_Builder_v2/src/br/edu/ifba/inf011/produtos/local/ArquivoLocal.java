package br.edu.ifba.inf011.produtos.local;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.builder.ArquivoBuilder;

public class ArquivoLocal implements Arquivo{

	private String nome;
	private String conteudo;
	private Boolean hidden;
	private List<Boolean> permissoes;
	private Boolean aberto;
	
	
	public static ArquivoBuilder builder(){
		return new ArquivoLocalBuilder();
	}
	

	public ArquivoLocal(String nome, String conteudo, Boolean hidden, List<Boolean> permissoes) {
		super();
		this.nome = nome;
		this.conteudo = conteudo;
		this.hidden = hidden;
		this.permissoes = new ArrayList<Boolean>(permissoes);
		this.aberto = Boolean.FALSE;
	}

	@Override
	public Arquivo abrir() {
		this.aberto = true;
		return this;
	}

	@Override
	public byte[] converter() {
		return conteudo.getBytes();
	}

	@Override
	public void fechar() {
		this.aberto = false;
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
	public String toString() {

		char[] charPermissao = {'r', 'w', 'x'}; 
		
		StringBuilder strPermissoes = new StringBuilder();
		for(int iCont = 0; iCont < this.permissoes.size(); iCont++)
			strPermissoes.append((!this.permissoes.get(iCont)) ? '-' : charPermissao[iCont % 3]); 
		
		return "[" + nome + "] : = " + conteudo + " (" +
				((hidden) ? "h" : "") + ")" + strPermissoes.toString();
	}
	
	
	
	
	

}
