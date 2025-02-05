package br.edu.ifba.inf011.abstraction.state;

import br.edu.ifba.inf011.implementor.FonteDados;

public interface GerenteConteudoState {

	public GerenteConteudoState lerSomente();
	public GerenteConteudoState escreverSomente();
	public GerenteConteudoState restaurar();
	public String ler(FonteDados fonte, String nome) throws UnsupportedOperationException;
	public void escrever(FonteDados fonte, String nome, String conteudo) throws UnsupportedOperationException;

}
