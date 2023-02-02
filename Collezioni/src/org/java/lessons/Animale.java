package org.java.lessons;

public abstract class Animale {
	protected String nome;

	public Animale(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void faiVerso();	//sarà implementato dalle sottoclassi
	
}
