package br.edu.ifba.inf011;


public abstract class ArquivoFramework {
	
	public void assinar(String origem, String destino) {
		Arquivo original = null;
		Arquivo assinado = null;
		
		original = createArquivo(origem);
		
		
		byte[] bytesOrigem = original.abrir().converter();
		original.fechar();
		
		int assinatura = bytesOrigem.hashCode();
		
		byte[] conteudoAssinado = this.anexar(bytesOrigem, assinatura);
		
		assinado = createArquivo(destino);
		
		assinado.abrir().descarregar(conteudoAssinado);
		assinado.fechar();
		
	}

	protected abstract Arquivo createArquivo(String origem);
	
	
	private byte[] anexar(byte[] conteudo, int assinatura) {
		int iCont = 0;
		int jCont = 0;
		byte[] assinado = this.resize(conteudo);
		byte[] anexo = this.getBytes(assinatura);
		for(jCont = 0; iCont < anexo.length; iCont++, jCont++)
			assinado[jCont + conteudo.length] = anexo[jCont];
		return assinado;
	}
	
	
    private  byte[] getBytes(int hash) {
        return new byte[] { (byte) ( hash >>> 24 ), (byte) ( hash >>> 16 ), (byte) ( hash >>> 8 ), (byte) hash};
    }
    
    private byte[] resize(byte[] original) {
    	int iCont = 0;
    	byte[] novo = new byte[original.length + 4];
    	for(iCont = 0; iCont < original.length; iCont++)
    		novo[iCont] = original[iCont];
    	for(; iCont < original.length + 4; iCont++)
    		novo[iCont] = 0;
    	return novo;
    	
    }	

}
