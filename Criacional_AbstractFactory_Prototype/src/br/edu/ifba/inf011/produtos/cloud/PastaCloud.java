package br.edu.ifba.inf011.produtos.cloud;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.Pasta;
import br.edu.ifba.inf011.produtos.local.PastaLocal;
import br.edu.ifba.inf011.protype.Prototype;

public class PastaCloud implements Pasta{
	
	private String nome;
	private List<Arquivo> arquivos = new ArrayList<Arquivo>();
	

	public PastaCloud(String nome) {
		this.nome = nome;
	}
	
	public PastaCloud(PastaCloud pasta) {
	    this(pasta.getNome());
		for(Arquivo arquivo : pasta.arquivos)
			this.adicionar((Arquivo)arquivo.prototipar());		
	}	
	
	private String getNome() {
		return this.nome;
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
	public Prototype prototipar() {
		return new PastaCloud(this);
	}

	@Override
	public void renomear(String nome) {
		this.nome = nome;
	}	

}
