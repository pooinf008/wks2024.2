package br.edu.ifba.inf011;

import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.ElementoSO;
import br.edu.ifba.inf011.produtos.Pasta;

public class Client {
	
	public void run(){
		Arquivo arquivo11 = new Arquivo("arq11.txt", 10.0);
		Arquivo arquivo12 = new Arquivo("arq12.txt", 20.0);
		Pasta pasta1 = new Pasta("pasta1");

		Arquivo arquivo21 = new Arquivo("arq21.txt", 50.0);
		Pasta pasta2 = new Pasta("pasta2");
		
		pasta1.add(arquivo11);
		pasta2.add(arquivo21);

		Arquivo arquivo = new Arquivo("arq.txt", 30.0);
		Pasta raiz = new Pasta("raiz");
		
		raiz.add(arquivo);
		raiz.add(pasta1);
		raiz.add(pasta2);
		
		System.out.println(arquivo.getTamanho());
		
		
		
	}
	
	
	public static void main(String[] args) {
		(new Client()).run();
	}

}
