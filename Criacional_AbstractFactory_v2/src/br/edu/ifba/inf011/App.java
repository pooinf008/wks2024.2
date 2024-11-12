package br.edu.ifba.inf011;

import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.Pasta;
import br.edu.ifba.inf011.produtos.cloud.ArquivoCloud;
import br.edu.ifba.inf011.produtos.cloud.PastaCloud;
import br.edu.ifba.inf011.produtos.local.ArquivoLocal;
import br.edu.ifba.inf011.produtos.local.PastaLocal;

public class App {
	
	
	public void run2(){
		
		Arquivo arquivo12 = new ArquivoCloud("arquivo_12.arq");
		Arquivo arquivo11 = new ArquivoCloud("arquivo_11.arq");
		Arquivo arquivo21 = new ArquivoCloud("arquivo_21.arq");
		Pasta pasta1 = new PastaCloud("drived");
		Pasta pasta2 = new PastaCloud("drivef");
		
		pasta1.adicionar(arquivo12);
		pasta1.adicionar(arquivo11);
		
		pasta2.adicionar(arquivo21);
		
		System.out.println(pasta1);
		
		System.out.println(pasta2);
		
		
	}	
	
	public void run(){
		
		Arquivo arquivo12 = new ArquivoLocal("arquivo_12.arq");
		Arquivo arquivo11 = new ArquivoLocal("arquivo_11.arq");
		Arquivo arquivo21 = new ArquivoLocal("arquivo_21.arq");
		Pasta pasta1 = new PastaLocal("drived");
		Pasta pasta2 = new PastaLocal("drivef");
		
		pasta1.adicionar(arquivo12);
		pasta1.adicionar(arquivo11);
		
		pasta2.adicionar(arquivo21);
		
		System.out.println(pasta1);
		
		System.out.println(pasta2);
	}
	
	public void run3(){
		
		Arquivo arquivo12 = new ArquivoLocal("arquivo_12.arq");
		Arquivo arquivo11 = new ArquivoLocal("arquivo_11.arq");
		Arquivo arquivo21 = new ArquivoLocal("arquivo_21.arq");
		Pasta pasta1 = new PastaCloud("drived");
		Pasta pasta2 = new PastaCloud("drivef");
		
		pasta1.adicionar(arquivo12);
		pasta1.adicionar(arquivo11);
		
		pasta2.adicionar(arquivo21);
		
		System.out.println(pasta1);
		
		System.out.println(pasta2);
	}	
	
	public static void main(String[] args) {
		(new App()).run3();
	}

}
