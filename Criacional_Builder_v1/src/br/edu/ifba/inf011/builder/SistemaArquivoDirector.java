package br.edu.ifba.inf011.builder;


public class SistemaArquivoDirector {
	
	private SistemaArquivoBuilder builder;

	public SistemaArquivoDirector(SistemaArquivoBuilder builder) {
		super();
		this.builder = builder;
	}

	public void setBuilder(SistemaArquivoBuilder builder) {
		this.builder = builder;
	}
	
	
	public void makeDriveD() {
		this.builder.init();
		this.builder.construaPasta("d");
		this.builder.adicionarArquivo("docs");
		this.builder.adicionarArquivo("images");
	}
	
	public void makeDriveC() {
		this.builder.init();
		this.builder.construaPasta("c");
		this.builder.adicionarArquivo("system");
		this.builder.adicionarArquivo("temp");
	}	
	

}
