package br.edu.ifba.inf011.singleton;

import java.util.HashMap;
import java.util.Map;

import br.edu.ifba.inf011.produtos.local.ArquivoLocal;
import br.edu.ifba.inf011.produtos.local.PastaLocal;
import br.edu.ifba.inf011.protype.Prototype;

public class GerenteAvancadoPrototipo extends GerentePrototipo{

	int qtdeCriadas = 0;
	
	private static GerentePrototipo gerente;	
	
	public static GerentePrototipo instancia() {
		
		String tipo = System.getProperty("gerente");

		if(GerenteAvancadoPrototipo.gerente == null) {
			if(tipo.equals("AVANCADO"))
				GerenteAvancadoPrototipo.gerente = new GerenteAvancadoPrototipo();
			else
				GerenteAvancadoPrototipo.gerente = new GerentePrototipo();
		}	
		return GerenteAvancadoPrototipo.gerente;
	}	
	
	private GerenteAvancadoPrototipo() {
		
	}
	
	public Prototype criar(String chave) {
		qtdeCriadas++;
		return super.criar(chave);
	}
	
	
	
	
	
	

}
