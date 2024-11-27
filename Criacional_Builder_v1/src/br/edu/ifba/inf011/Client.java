package br.edu.ifba.inf011;

import br.edu.ifba.inf011.builder.SistemaArquivoBuilder;
import br.edu.ifba.inf011.builder.SistemaArquivoDirector;
import br.edu.ifba.inf011.builder.concreteBuilder.SistemaCloudBuilder;
import br.edu.ifba.inf011.builder.concreteBuilder.SistemaDescricaoBuilder;
import br.edu.ifba.inf011.builder.concreteBuilder.SistemaLocalBuilder;
import br.edu.ifba.inf011.produtos.cloud.PastaCloud;
import br.edu.ifba.inf011.produtos.local.PastaLocal;

public class Client {
	
	
	public void run(){
		SistemaArquivoBuilder localBuilder = new SistemaLocalBuilder();
		SistemaArquivoBuilder cloudBuilder = new SistemaCloudBuilder();		
		SistemaArquivoDirector director = new SistemaArquivoDirector(localBuilder);
		director.makeDriveC();
		PastaLocal c = ((SistemaLocalBuilder) localBuilder).build();
		director.setBuilder(cloudBuilder);
		director.makeDriveD();
		PastaCloud d = ((SistemaCloudBuilder) cloudBuilder).build();
		System.out.println(c);
		System.out.println(d);
	}
	
	public void run2(){
		SistemaDescricaoBuilder builder = new SistemaDescricaoBuilder();		
		SistemaArquivoDirector director = new SistemaArquivoDirector(builder);
		director.makeDriveC();
		String strC = builder.getDescricao();
		director.makeDriveD();
		String strD = builder.getDescricao();
		System.out.println(strC);
		System.out.println(strD);
	}	
	
	
	public static void main(String[] args) {
		(new Client()).run2();
	}

}
