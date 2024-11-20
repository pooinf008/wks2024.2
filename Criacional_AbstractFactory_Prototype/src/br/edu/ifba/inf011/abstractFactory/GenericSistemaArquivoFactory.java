package br.edu.ifba.inf011.abstractFactory;

import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.Formatador;
import br.edu.ifba.inf011.produtos.Pasta;

public class GenericSistemaArquivoFactory implements SistemaArquivoFactory{
	
	public Pasta pasta;
	public Arquivo arquivo;
	public Formatador formatador;	
	
	public GenericSistemaArquivoFactory(Pasta pasta, Arquivo arquivo, Formatador formatador) {
		super();
		this.pasta = pasta;
		this.arquivo = arquivo;
		this.formatador = formatador;
	}

	@Override
	public Pasta criarPasta(String nome) {
		Pasta pasta = (Pasta) this.pasta.prototipar();
		pasta.renomear(nome);
		return pasta;
	}

	@Override
	public Arquivo criarArquivo(String nome) {
		Arquivo arquivo = (Arquivo) this.arquivo.prototipar();
		arquivo.renomear(nome);
		return arquivo;
	}

	@Override
	public Formatador criarFormatador() {
		return (Formatador) this.formatador.prototipar();
	}
	
	

	
	

	

}
