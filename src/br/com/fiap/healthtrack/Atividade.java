package br.com.fiap.healthtrack;

import java.util.Random;
import java.io.Serializable;



public class Atividade implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int codAtividade;

	private int codUsuario;

	private String nomeAtividade;

	private double duracaoAtividade;


	public Atividade() {

	}

	public Atividade(int codAtividade, int codUsuario, String nomeAtividade, double duracaoAtividade) {

		this.codAtividade = codAtividade;
		this.codUsuario = codUsuario;
		this.nomeAtividade = nomeAtividade;
		this.duracaoAtividade = duracaoAtividade;
	}

	public void getAtividade() {
		System.out.println("Código da atividade: " + codAtividade);
		System.out.println("Código do usuário: " + codUsuario);
		System.out.println("Nome da atividade: " + nomeAtividade);
		System.out.println("Duraçao da atividade: " + duracaoAtividade);
	}

	public int getCodAtividade() {
		return codAtividade;
	}

	public void setCodAtividade(int codAtividade) {
		this.codAtividade = codAtividade;
	}

	public int getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getNomeAtividade() {
		return nomeAtividade;
	}

	public void setNomeAtividade(String nomeAtividade) {
		this.nomeAtividade = nomeAtividade;
	}

	public double getDuracaoAtividade() {
		return duracaoAtividade;
	}

	public void setDuracaoAtividade(double duracaoAtividade) {
		this.duracaoAtividade = duracaoAtividade;
	}
}
