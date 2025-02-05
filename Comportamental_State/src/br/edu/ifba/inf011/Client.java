package br.edu.ifba.inf011;

import br.edu.ifba.inf011.abstraction.GerenteConteudoAvancado;
import br.edu.ifba.inf011.abstraction.GerenteConteudoBasico;
import br.edu.ifba.inf011.implementor.FonteDados;
import br.edu.ifba.inf011.implementor.FonteDadosDisco;
import br.edu.ifba.inf011.implementor.FonteDadosMemoria;

public abstract class Client {
	
	public static final String PATH = "C:\\Users\\fredericojorge\\Desktop\\content\\";
	
	
	public abstract FonteDados createFonteDados();
	
	public void run() {
		GerenteConteudoBasico conteudo = 
				new GerenteConteudoBasico(this.createFonteDados());
		
		try {
			conteudo.escrever("arq1.txt", "Conteudo de Arq1\n");
			conteudo.escrever("arq2.txt", "Conteudo de Arq2\n");
			System.out.println(conteudo.ler("arq1.txt"));
			System.out.println(conteudo.ler("arq2.txt"));
			conteudo.escreverSomente();
			conteudo.escrever("arq1.txt", "Mais Conteudo de Arq1\n");
			System.out.println(conteudo.ler("arq1.txt"));
			System.out.println(conteudo.ler("arq2.txt"));
		}catch(UnsupportedOperationException ex) {
			ex.printStackTrace();
		}	
		

		
	}
	
	public void run2() {
		GerenteConteudoAvancado conteudo = 
				new GerenteConteudoAvancado(this.createFonteDados());
		
		conteudo.escrever("arq1.txt", "Conteudo de Arq1\n");
		
		conteudo.copiar("arq1.txt", "arq3.txt");
		
		System.out.println(conteudo.ler("arq3.txt"));
		
		conteudo.escrever("arq1.txt", "Conteudo de Arq1\n");
		
		conteudo.copiar("arq1.txt", "arq2.txt");
		
		System.out.println(conteudo.ler("arq2.txt"));
		
		
	}
	
	
}
