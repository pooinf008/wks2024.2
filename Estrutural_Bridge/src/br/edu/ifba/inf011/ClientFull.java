package br.edu.ifba.inf011;

import br.edu.ifba.inf011.abstraction.GerenteConteudoAvancado;
import br.edu.ifba.inf011.abstraction.GerenteConteudoBasico;
import br.edu.ifba.inf011.implementor.FonteDados;
import br.edu.ifba.inf011.implementor.FonteDadosDisco;
import br.edu.ifba.inf011.implementor.FonteDadosMemoria;

public class ClientFull {
	
	public static final String PATH = "C:\\Users\\fredericojorge\\Desktop\\content\\";
	

	public FonteDados fonte;
	
	
	public ClientFull(TipoFonte fonte) {
		if(fonte == TipoFonte.DISK)
			this.fonte = new FonteDadosDisco(PATH);
		else if(fonte == TipoFonte.MEMORY)
			this.fonte = new FonteDadosMemoria();
	}
	
	
	public void run() {
		GerenteConteudoBasico conteudo = 
				new GerenteConteudoBasico(this.fonte);
		
		conteudo.escrever("arq1.txt", "Conteudo de Arq1\n");
		conteudo.escrever("arq2.txt", "Conteudo de Arq2\n");
		
		System.out.println(conteudo.ler("arq1.txt"));
		System.out.println(conteudo.ler("arq2.txt"));
		
		conteudo.escrever("arq1.txt", "Mais Conteudo de Arq1\n");

		System.out.println(conteudo.ler("arq1.txt"));
		System.out.println(conteudo.ler("arq2.txt"));
		
	}
	
	public void run2() {
		GerenteConteudoAvancado conteudo = 
				new GerenteConteudoAvancado(this.fonte);
		
		conteudo.escrever("arq1.txt", "Conteudo de Arq1\n");
		
		conteudo.copiar("arq1.txt", "arq3.txt");
		
		System.out.println(conteudo.ler("arq3.txt"));
		
		conteudo.escrever("arq1.txt", "Conteudo de Arq1\n");
		
		conteudo.copiar("arq1.txt", "arq2.txt");
		
		System.out.println(conteudo.ler("arq2.txt"));
	}
	
	
	public static void main(String[] args) {
		(new ClientFull(TipoFonte.DISK)).run();
	}

}
