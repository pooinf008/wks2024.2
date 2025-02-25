package br.edu.ifba.inf011.produtos;

import br.edu.ifba.inf011.visitors.SistemaArquivoVisitor;

public interface Capability {
	
	public String getUser();
	public String getPWD();
	public void update(Integer version);
	public Integer getVersion();
	public void accept(SistemaArquivoVisitor visitor);

}
