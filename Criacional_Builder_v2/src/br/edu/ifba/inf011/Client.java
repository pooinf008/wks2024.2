package br.edu.ifba.inf011;

import br.edu.ifba.inf011.produtos.local.ArquivoLocal;
import br.edu.ifba.inf011.produtos.local.ArquivoPermissoes;

public class Client {
	
	
	public void run(){
		
		
		ArquivoLocal arquivoLocal = ArquivoLocal.builder() 
				    			   .init()
				    			   .build("meu_arquivo1.sys");
		
		ArquivoLocal arquivoLocal3 = ArquivoLocal.builder()
 			   .init()
 			   .hidden()
 			   .build("meu_arquivo3.sys");
		
		ArquivoLocal arquivoLocal2 = ArquivoLocal.builder()
	 			   .init()
	 			   .hidden()
	 			   .execute(ArquivoPermissoes.OWNER)
	 			   .read(ArquivoPermissoes.OWNER)
	 			   .unwrite(ArquivoPermissoes.OWNER)
	 			   .execute(ArquivoPermissoes.ALL)
	 			   .build("meu_arquivo2.sys");
		
		System.out.println(arquivoLocal);
		System.out.println("******************");
		System.out.println(arquivoLocal2);
		System.out.println("******************");
		System.out.println(arquivoLocal3);
		
		
	}	
	
	
	public static void main(String[] args) {
		(new Client()).run();
	}

}
