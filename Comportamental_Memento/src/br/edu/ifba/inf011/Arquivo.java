package br.edu.ifba.inf011;

import java.util.List;

public interface Arquivo {
	public List<String> read() throws Exception;
	public void write(List<String> content) throws Exception;
	public void append(String content) throws Exception;
	public void dump() throws Exception;
	
	
	
}
