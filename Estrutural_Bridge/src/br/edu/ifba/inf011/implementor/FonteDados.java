package br.edu.ifba.inf011.implementor;

public interface FonteDados {
	
	public String ler (String nome);
	public Boolean existe(String nome);
	public void criar(String nome);
	public void anexar(String nome, String conteudo);

}
