package br.edu.ifba.inf011;

import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.Formatador;
import br.edu.ifba.inf011.produtos.Pasta;
import br.edu.ifba.inf011.produtos.local.ArquivoLocal;
import br.edu.ifba.inf011.produtos.local.FormatadorLocal;
import br.edu.ifba.inf011.produtos.local.PastaLocal;
import br.edu.ifba.inf011.protype.GerentePrototipo;
import br.edu.ifba.inf011.protype.Prototype;

public class Client {
	
	public void run() {
		
		GerentePrototipo gerente = new GerentePrototipo();
		
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
		
		System.out.println(pasta3);
		
		
	}
	
	
	public void run2(){
		
		Arquivo arquivo12 = new ArquivoLocal("arquivo_12.arq");
		Arquivo arquivo11 = new ArquivoLocal("arquivo_11.arq");
		Arquivo arquivo21 = new ArquivoLocal("arquivo_21.arq");
		Pasta pasta1 = new PastaLocal("drived");
		Pasta pasta2 = new PastaLocal("drivef");
		Formatador formatador = new FormatadorLocal();
		
		pasta1.adicionar(arquivo12);
		pasta1.adicionar(arquivo11);
		
		pasta2.adicionar(arquivo21);
		

		Arquivo arquivo13 = (Arquivo) arquivo12.prototipar();
		
//		System.out.println(arquivo12);
//		System.out.println(arquivo13);
		
		arquivo13.renomear("arquivo_13.arq");
		
//		System.out.println(arquivo12);
//		System.out.println(arquivo13);
		
		
		Pasta pasta3 = (Pasta) pasta1.prototipar();
		
		System.out.println(pasta1);
		System.out.println(pasta3);
		
		//System.out.println(pasta1);
		
		pasta3.renomear("driveg");
		pasta3.adicionar(arquivo13);
		arquivo12.renomear("novo_arquivo.arq");
		
		
		//System.out.println(pasta2);
		
		System.out.println(pasta1);
		System.out.println(pasta3);		
		
		//formatador.formatar(arquivo21);
		
	}
	
	
	public static void main(String[] args) {
		(new Client()).run();
	}

}
