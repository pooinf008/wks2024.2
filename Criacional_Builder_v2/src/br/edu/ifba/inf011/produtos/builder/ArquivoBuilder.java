package br.edu.ifba.inf011.produtos.builder;

import br.edu.ifba.inf011.produtos.local.ArquivoLocal;
import br.edu.ifba.inf011.produtos.local.ArquivoLocalBuilder;
import br.edu.ifba.inf011.produtos.local.ArquivoPermissoes;

public interface ArquivoBuilder {

	public ArquivoLocalBuilder init();
	public ArquivoLocalBuilder write(String content);
	public ArquivoLocalBuilder hidden();
	public ArquivoLocalBuilder read(ArquivoPermissoes permissoes);
	public ArquivoLocalBuilder write(ArquivoPermissoes permissoes);
	public ArquivoLocalBuilder execute(ArquivoPermissoes permissoes);
	public ArquivoLocalBuilder unread(ArquivoPermissoes permissoes);
	public ArquivoLocalBuilder unwrite(ArquivoPermissoes permissoes);
	public ArquivoLocalBuilder unexecute(ArquivoPermissoes permissoes);
	
	public ArquivoLocal build(String nome);
	
}
