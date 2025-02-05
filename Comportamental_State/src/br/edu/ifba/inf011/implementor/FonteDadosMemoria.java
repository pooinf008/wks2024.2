package br.edu.ifba.inf011.implementor;

import java.util.HashMap;
import java.util.Map;

public class FonteDadosMemoria implements FonteDados{
	
	public Map<String, String> conteudos;
	
	
	public FonteDadosMemoria() {
		this.conteudos = new HashMap<String, String>();
	}

	@Override
	public String ler(String nome) {
		return this.conteudos.get(nome);
	}

	@Override
	public Boolean existe(String nome) {
		return this.conteudos.containsKey(nome);
	}

	@Override
	public void criar(String nome) {
		this.conteudos.put(nome, "");
	}

	@Override
	public void anexar(String nome, String conteudo) {
		String conteudoAtual = this.conteudos.get(nome);
		conteudoAtual += conteudo;
		this.conteudos.put(nome, conteudoAtual);
	}

}
