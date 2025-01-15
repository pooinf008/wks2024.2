package br.edu.ifba.inf011.produtos;

public abstract class AbstractElementSO implements ElementoSO{
	
	
	@Override
	public void add(ElementoSO elemento) throws UnsupportedOperationException{
		throw new UnsupportedOperationException("");
	}


	@Override
	public void remove(ElementoSO elemento) throws UnsupportedOperationException{
		throw new UnsupportedOperationException("");
	}

	@Override
	public ElementoSO getChild(int ndx) throws UnsupportedOperationException{
		throw new UnsupportedOperationException("");
	}
	
	@Override
	public ElementoSO getComposite(){
		return null;
	}	
	

}
