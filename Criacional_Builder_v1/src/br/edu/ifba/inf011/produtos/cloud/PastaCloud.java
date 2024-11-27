package br.edu.ifba.inf011.produtos.cloud;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.Pasta;

public class PastaCloud implements Pasta{
	
	private String nome;
	private List<Arquivo> arquivos = new ArrayList<Arquivo>();
	

	public PastaCloud(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void adicionar(Arquivo arquivo) {
		this.arquivos.add(arquivo);
	}
	
	
	public String toString() {
		StringBuffer rep = new StringBuffer("[Sistema de Arquivos Cloud]  protocolo://" + this.nome + "\n");
		for(Arquivo arquivo : this.arquivos)
			rep.append("\t+++"  + this.nome + "/" + arquivo + "\n");
		return rep.toString();
	}

	@Override
	public void renomear(String nome) {
		this.nome = nome;
	}

}
