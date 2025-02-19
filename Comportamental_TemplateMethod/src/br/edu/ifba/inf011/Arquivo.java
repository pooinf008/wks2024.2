package br.edu.ifba.inf011;

import java.io.PrintStream;
import java.util.List;

public interface Arquivo {
	public List<String> read() throws Exception;
	public List<String> content() throws Exception;
	public void write(List<String> content) throws Exception;
	public void append(String content) throws Exception;
	public void dump() throws Exception;
	public void print(PrintStream out) throws Exception;
	public String getNome();
}
