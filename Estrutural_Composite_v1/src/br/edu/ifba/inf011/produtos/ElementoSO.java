package br.edu.ifba.inf011.produtos;

public interface ElementoSO {
	
	public String getNome();
	public Double getTamanho();
	public void add(ElementoSO elemento) throws UnsupportedOperationException;
	public void remove(ElementoSO elemento) throws UnsupportedOperationException;
	public ElementoSO getChild(int ndx) throws UnsupportedOperationException;
	public ElementoSO getComposite();

}
