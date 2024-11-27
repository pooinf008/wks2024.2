package br.edu.ifba.inf011.builder.concreteBuilder;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.builder.SistemaArquivoBuilder;
import br.edu.ifba.inf011.produtos.cloud.ArquivoCloud;
import br.edu.ifba.inf011.produtos.cloud.PastaCloud;
import br.edu.ifba.inf011.produtos.local.ArquivoLocal;
import br.edu.ifba.inf011.produtos.local.PastaLocal;

public class SistemaCloudBuilder implements SistemaArquivoBuilder{
	
	private PastaCloud pasta;
	private List<ArquivoCloud> arquivos;
	
	@Override
	public void init() {
		this.pasta = null;
		this.arquivos = new ArrayList<ArquivoCloud>();
	}	

	@Override
	public void construaPasta(String string) {
		this.pasta = new PastaCloud(string); 
	}

	@Override
	public void adicionarArquivo(String string) {
		this.arquivos.add(new ArquivoCloud(string));
	}
	
	public PastaCloud build() {
		if(this.pasta == null)
			this.construaPasta("c");
		for(ArquivoCloud arquivo : this.arquivos)
			this.pasta.adicionar(arquivo);
		return this.pasta;
	}



}
