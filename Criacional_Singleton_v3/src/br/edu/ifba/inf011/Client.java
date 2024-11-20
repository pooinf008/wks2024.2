package br.edu.ifba.inf011;

import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.Pasta;
import br.edu.ifba.inf011.produtos.local.ArquivoLocal;
import br.edu.ifba.inf011.produtos.local.PastaLocal;
import br.edu.ifba.inf011.singleton.GerenteAvancadoPrototipo;
import br.edu.ifba.inf011.singleton.GerentePrototipo;

public class Client {
	
	public void run() {
		
		
		
		GerentePrototipo.registrar(GerenteAvancadoPrototipo.instance());
		
		GerentePrototipo gerente = GerentePrototipo.get();
		
		System.out.println(gerente);
		
		
		Pasta pasta = (Pasta) gerente.criar(GerentePrototipo.DRIVE_D);
		System.out.println(pasta);
		
		pasta.renomear("f");
		
		Pasta pasta2 = (Pasta) gerente.criar(GerentePrototipo.DRIVE_D);
		
		System.out.println(pasta);
		System.out.println(pasta2);
		
		Arquivo arquivo12 = new ArquivoLocal("arquivo_12.arq");
		Arquivo arquivo11 = new ArquivoLocal("arquivo_11.arq");
		Pasta pasta1 = new PastaLocal("drived");
		
		pasta1.adicionar(arquivo12);
		pasta1.adicionar(arquivo11);	
		
		gerente.adicionar("MINHA_ESTRUTURA", pasta1);
		
		Pasta pasta3 = (Pasta) gerente.criar("MINHA_ESTRUTURA");
		
		
		
	}
	
	

	
	
	public static void main(String[] args) {
		(new Client()).run();
	}

}
