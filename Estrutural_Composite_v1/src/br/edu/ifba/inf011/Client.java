package br.edu.ifba.inf011;

import br.edu.ifba.inf011.produtos.Arquivo;
import br.edu.ifba.inf011.produtos.ElementoSO;
import br.edu.ifba.inf011.produtos.Pasta;

public class Client {
	
	public void run(){
		ElementoSO arquivo11 = new Arquivo("arq11.txt", 10.0);
		ElementoSO arquivo12 = new Arquivo("arq12.txt", 20.0);
		ElementoSO pasta1 = new Pasta("pasta1");

		ElementoSO arquivo21 = new Arquivo("arq21.txt", 50.0);
		ElementoSO pasta2 = new Pasta("pasta2");
		
		if(pasta1.getComposite() != null) {
			pasta1.add(arquivo11);
			System.out.println("adicionado arquivo a pasta");
		}	

		if(arquivo11.getComposite() != null) {
			arquivo11.add(arquivo12);
			System.out.println("adicionado arquivo a arquivo");			
		}	
		
		
		try {
			arquivo11.add(arquivo12);
		}catch (UnsupportedOperationException e) {
			System.err.println("NÃO PODE ADICIONAR UM ARQUIVO A OUTRO");
		}	
		
		pasta2.add(arquivo21);

		ElementoSO arquivo = new Arquivo("arq.txt", 30.0);
		ElementoSO raiz = new Pasta("raiz");
		
		raiz.add(arquivo);
		raiz.add(pasta1);
		raiz.add(pasta2);
		
		System.out.println(raiz.getTamanho());
		
		
		
	}
	
	
	public static void main(String[] args) {
		(new Client()).run();
	}

}
