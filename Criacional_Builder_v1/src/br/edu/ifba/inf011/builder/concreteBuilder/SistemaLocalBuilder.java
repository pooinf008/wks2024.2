package br.edu.ifba.inf011.builder.concreteBuilder;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.builder.SistemaArquivoBuilder;
import br.edu.ifba.inf011.produtos.local.ArquivoLocal;
import br.edu.ifba.inf011.produtos.local.PastaLocal;

public class SistemaLocalBuilder implements SistemaArquivoBuilder{
	
	private PastaLocal pasta;
	private List<ArquivoLocal> arquivos;
	
	@Override
	public void init() {
		this.pasta = null;
		this.arquivos = new ArrayList<ArquivoLocal>();
	}	

	@Override
	public void construaPasta(String string) {
		this.pasta = new PastaLocal(string); 
	}

	@Override
	public void adicionarArquivo(String string) {
		this.arquivos.add(new ArquivoLocal(string));
	}
	
	public PastaLocal build() {
		if(this.pasta == null)
			this.construaPasta("c");
		for(ArquivoLocal arquivo : this.arquivos)
			this.pasta.adicionar(arquivo);
		return this.pasta;
	}



}
