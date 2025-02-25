package br.edu.ifba.inf011.produtos.local;

import br.edu.ifba.inf011.produtos.Capability;
import br.edu.ifba.inf011.visitors.SistemaArquivoVisitor;

public class LocalCapability implements Capability{
	
	private String user;
	private String pwd;
	private Integer version;
	
	public LocalCapability(String user, String pwd, Integer version) {
		super();
		this.user = user;
		this.pwd = pwd;
		this.version = version;
	}

	@Override
	public String getUser() {
		return this.user;
	}

	@Override
	public String getPWD() {
		return this.pwd;
	}
	
	@Override
	public Integer getVersion() {
		return this.version;
	}	

	@Override
	public void update(Integer version) {
		this.version = version;
	}
	
	@Override
	public void accept(SistemaArquivoVisitor visitor) {
		visitor.visitCapability(this);
	}		

}
