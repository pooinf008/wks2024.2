package br.edu.ifba.inf011.singleton;

import java.util.HashMap;
import java.util.Map;

import br.edu.ifba.inf011.produtos.local.ArquivoLocal;
import br.edu.ifba.inf011.produtos.local.PastaLocal;
import br.edu.ifba.inf011.protype.Prototype;

public class GerentePrototipo {
	
	public static final String DRIVE_D = "DRIVE_D";
	
	private Map<String, Prototype> prototipos;
	
	private static GerentePrototipo gerente;
	
	
	public static GerentePrototipo instancia() {
		
		int qtdeInstancias = Integer.parseInt(System.getProperty("instancias"));
		System.out.println("QUANTIDADES DE INSTANCIAS " + qtdeInstancias);
		if(GerentePrototipo.gerente == null)
			GerentePrototipo.gerente = new GerentePrototipo();
		return GerentePrototipo.gerente;
	}
	
	
	private GerentePrototipo() {
		this.prototipos = new HashMap<String, Prototype>();
		this.init();
	}
	
	private void init() {
		PastaLocal pastaLocal = new PastaLocal("d");
		ArquivoLocal docs = new ArquivoLocal("docs");
		ArquivoLocal imgs = new ArquivoLocal("images");
		pastaLocal.adicionar(docs);
		pastaLocal.adicionar(imgs);
		this.prototipos.put(GerentePrototipo.DRIVE_D, pastaLocal);
	}
	
	
	public void adicionar(String chave, Prototype prototipo) {
		this.prototipos.put(chave, prototipo.prototipar());
	}
	
	public Prototype criar(String chave) {
		return this.prototipos.get(chave).prototipar();
	}
	
	
	
	
	
	

}
