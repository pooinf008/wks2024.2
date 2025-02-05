package br.edu.ifba.inf011;

import java.time.LocalDateTime;
import java.util.Objects;

// Classe Arquivo
public class Arquivo implements Entrada, Prototype{
    private String nome;
    private String conteudo;
    private LocalDateTime ultimaModificacao;

    public Arquivo(String nome, String conteudo, LocalDateTime ultimaModificacao) {
        this.nome = nome;
        this.conteudo = conteudo;
        this.ultimaModificacao = ultimaModificacao;
    }

    public Arquivo(Arquivo arquivo) {
    	this.nome = arquivo.getNome();
    	this.conteudo = arquivo.getConteudo();
    	this.ultimaModificacao = arquivo.getUltimaModificacao();
	}

	public String getNome() {
        return nome;
    }

    public String getConteudo() {
        return conteudo;
    }

    public LocalDateTime getUltimaModificacao() {
        return ultimaModificacao;
    }
    
    
    public void escrever(String conteudo) {
    	this.conteudo = conteudo;
    	this.ultimaModificacao = LocalDateTime.now();
    }
    
    public Integer getTamanho() {
    	return this.conteudo.length();
    }
    
    public Prototype prototype() {
    	return new Arquivo(this);
    }
    
    public String toString() {
    	return this.getNome() + "\t" + this.getTamanho() + " Kb \t" + this.getUltimaModificacao();
    }

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arquivo other = (Arquivo) obj;
		return Objects.equals(nome, other.nome);
	}
    
    
    
}

