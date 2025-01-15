package br.edu.ifba.inf011;

import br.edu.ifba.inf011.decorator.Arquivo;
import br.edu.ifba.inf011.decorator.ArquivoNumeradorDecorator;
import br.edu.ifba.inf011.decorator.ArquivoQtdeLinhasDecorator;
import br.edu.ifba.inf011.produtos.ArquivoFonte;

public class Client {

	private static final String PATH = 
			"C:\\Users\\fredericojorge\\eclipse-workspace\\Estrutural_Decorator" + 
			"\\src\\br\\edu\\ifba\\inf011\\";
	
	public void run(){
		
		Arquivo arquivo2 = 
				new ArquivoQtdeLinhasDecorator(
					new ArquivoFonte(PATH + "produtos\\ArquivoFonte.java"));
		
		Arquivo arquivo = new ArquivoQtdeLinhasDecorator(
							new ArquivoNumeradorDecorator(
									new ArquivoFonte(PATH + "Client.java")));
				
		arquivo.reset();
		while(arquivo.hasNext())
			System.out.println(arquivo.next());
		
		System.out.println("***************************");
		
		arquivo2.reset();
		while(arquivo2.hasNext())
			System.out.println(arquivo2.next());
		
		
	}
	
	
	public static void main(String[] args) {
		(new Client()).run();
	}

}
