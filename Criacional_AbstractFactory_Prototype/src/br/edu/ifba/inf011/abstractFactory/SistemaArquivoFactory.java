package br.edu.ifba.inf011.abstractFactory;

import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.Formatador;
import br.edu.ifba.inf011.produtos.Pasta;

public interface SistemaArquivoFactory {
	
	public Pasta criarPasta(String nome);
	public Arquivo criarArquivo(String nome);
	public Formatador criarFormatador();

}

