package br.edu.ifba.inf011.builder.concreteBuilder;

import br.edu.ifba.inf011.builder.SistemaArquivoBuilder;

public class SistemaDescricaoBuilder implements SistemaArquivoBuilder{

	private String nomePasta;
	private String nomesArquivos;
	
	
	@Override
	public void init() {
		this.nomePasta = "minhaPasta";
		this.nomesArquivos = "[";
		
	}

	@Override
	public void construaPasta(String string) {
		this.nomePasta = string;
	}

	@Override
	public void adicionarArquivo(String string) {
		this.nomesArquivos = this.nomesArquivos + 
							 string + ", ";
	}
	
	public String getDescricao() {
		return this.nomePasta + "\n" +
				"\t" + 
				this.nomesArquivos.substring(0, this.nomesArquivos.length() - 2) 
				+ "]";
	}

}
