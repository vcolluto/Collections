package org.java.lessons;



public abstract class Animale implements Comparable<Animale> {
	protected String nome;
	protected String razza;

	public String getRazza() {
		return razza;
	}

	public void setRazza(String razza) {
		this.razza = razza;
	}

	public Animale(String nome, String razza) {
		super();
		this.nome = nome;
		this.razza=razza;
	}
	
	public Animale(String nome) {
		super();
		this.nome = nome;
		this.razza="undefined";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void faiVerso();	//sarà implementato dalle sottoclassi
	
	@Override
	public int compareTo(Animale o) {		//ordinamento predefinito per nome		
		return this.nome.compareTo(o.getNome());	
	}
	
}
