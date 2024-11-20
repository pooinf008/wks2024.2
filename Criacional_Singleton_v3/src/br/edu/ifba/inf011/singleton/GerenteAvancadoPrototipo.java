package br.edu.ifba.inf011.singleton;

import java.util.HashMap;
import java.util.Map;

import br.edu.ifba.inf011.produtos.local.ArquivoLocal;
import br.edu.ifba.inf011.produtos.local.PastaLocal;
import br.edu.ifba.inf011.protype.Prototype;

public class GerenteAvancadoPrototipo extends GerentePrototipo{

	int qtdeCriadas = 0;
	
	private static GerenteAvancadoPrototipo instance;	
	
	public static GerenteAvancadoPrototipo instance() {
		if(GerenteAvancadoPrototipo.instance == null)
			GerenteAvancadoPrototipo.instance = new GerenteAvancadoPrototipo();
		return GerenteAvancadoPrototipo.instance;
	}	
	
	
	private GerenteAvancadoPrototipo() {
		
	}
	
	public Prototype criar(String chave) {
		qtdeCriadas++;
		return super.criar(chave);
	}
	
	
	
	
	
	

}
