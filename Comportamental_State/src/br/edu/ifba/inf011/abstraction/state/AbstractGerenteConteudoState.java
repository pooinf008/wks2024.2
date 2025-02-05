package br.edu.ifba.inf011.abstraction.state;

import br.edu.ifba.inf011.implementor.FonteDados;

public class AbstractGerenteConteudoState implements GerenteConteudoState {

	@Override
	public GerenteConteudoState lerSomente() {
		return this;
	}

	@Override
	public GerenteConteudoState escreverSomente() {
		return this;
	}

	@Override
	public GerenteConteudoState restaurar() {
		return this;
	}
	
	@Override
	public String ler(FonteDados fonte, String nome) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Não Rola!!!");
	}
	
	@Override
	public void escrever(FonteDados fonte, String nome, String conteudo) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("NÃO ROLA!");
	}	

	protected String doLer(FonteDados fonte, String nome) throws UnsupportedOperationException {
		if(fonte.existe(nome))
			return fonte.ler(nome);
		return "";
	}

	protected void doEscrever(FonteDados fonte, String nome, String conteudo) throws UnsupportedOperationException {
		if(!fonte.existe(nome))
			fonte.criar(nome);
		fonte.anexar(nome, conteudo);
	}

}
