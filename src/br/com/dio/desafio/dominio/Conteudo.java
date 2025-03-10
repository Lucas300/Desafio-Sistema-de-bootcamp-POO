package br.com.dio.desafio.dominio;

public abstract class Conteudo {
//todo bootcamp tem um conteudo - toda mentoria e cursos tem um conteudo
	public static final int XP_PADRAO = 10;
	private String titulo;
	private String descricao;

	public Conteudo() {

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public abstract int calcularXp();
}
