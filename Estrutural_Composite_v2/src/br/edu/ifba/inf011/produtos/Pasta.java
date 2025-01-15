package br.edu.ifba.inf011.produtos;

import java.util.ArrayList;
import java.util.List;


public class Pasta implements ElementoSO{
	
	private String nome;
	private List<ElementoSO> elementosSO = new ArrayList<ElementoSO>();
	

	public Pasta(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void add(ElementoSO arquivo) {
		this.elementosSO.add(arquivo);
	}

	public void remove(ElementoSO elemento) {
		this.remove(elemento);
	}	

	public Double getTamanho() {
		Double tamanho = 0.0;
		for(ElementoSO elementoSO : this.elementosSO)
			tamanho += elementoSO.getTamanho();
		return tamanho;
	}

	public ElementoSO getChild(int ndx) {
		return this.elementosSO.get(ndx);
	}
	
	public String toString() {
		StringBuffer rep = new StringBuffer("[Sistema de Arquivos Local]" + this.nome + "\n");
		for(ElementoSO arquivo : this.elementosSO)
			rep.append("\t+++"  + this.nome + "/" + arquivo + "\n");
		return rep.toString();
	}
	
	public ElementoSO getComposite(){
		return this;
	}		
}
