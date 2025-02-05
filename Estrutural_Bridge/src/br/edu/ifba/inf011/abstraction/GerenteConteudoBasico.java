package br.edu.ifba.inf011.abstraction;

import br.edu.ifba.inf011.implementor.FonteDados;

public class GerenteConteudoBasico {
	
	protected FonteDados fonte;
	
	public GerenteConteudoBasico(FonteDados fonte) {
		this.fonte = fonte;
	}
	
	
	public void setFonteDados(FonteDados fonte) {
		this.fonte = fonte;
	}
	
	public String ler(String nome){
		if(fonte.existe(nome))
			return fonte.ler(nome);
		return "";
	}
	
	public void escrever(String nome, String conteudo){
		if(!fonte.existe(nome))
			fonte.criar(nome);
		fonte.anexar(nome, conteudo);
	}

}
