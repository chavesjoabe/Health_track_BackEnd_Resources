package br.com.fiap.healthtrack;

import java.io.Serializable;
import java.util.Random;

/**
 * Classe que abstrai o Refeições
 *
 * @author Ryan Sczayka Nunes - RM 82046
 * @author Joabe Chaves - RM 85071
 * @author Pedro Perro Salgado de Mendonça - RM 85731
 * @author Joao Vitor de Sousa Escudeiro - RM 77997
 * @author Lucas Alonso Cyrillo
 * @version 1.0
 * */

public class Refeicao implements Serializable {

	/**
	 * código da refeição, gerado automaticamente
	 * */
	private int codRefeicao;
	/**
	 *Código do usuário relacionado
	 * */
	private int codUsuario;
	/**
	 *tipo de refeição
	 * */
	private String tipoRefeicao;
	/**
	 *valor calórico da refeiçao
	 * */
	private double calorias;
	/**
	 *data que a refeição foi feita
	 * */
	private String dataRefeicao;
	/**
	 *Método construtor de refeição com os atributos em default
	 * */
	public Refeicao() {

	}

	public Refeicao(int codRefeicao, int codUsuario, String tipoRefeicao, double calorias, String dataRefeicao) {
		this.codRefeicao = codRefeicao;
		this.codUsuario = codUsuario;
		this.tipoRefeicao = tipoRefeicao;
		this.calorias = calorias;
		this.dataRefeicao = dataRefeicao;
	}

	/**
	 *Método construtor de refeição com os atributos passados pelos parametros
	 * */


	public int getCodRefeicao() {
		return codRefeicao;
	}

	public void setCodRefeicao(int codRefeicao) {
		this.codRefeicao = codRefeicao;
	}

	public int getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getTipoRefeicao() {
		return tipoRefeicao;
	}

	public void setTipoRefeicao(String tipoRefeicao) {
		this.tipoRefeicao = tipoRefeicao;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	public String getDataRefeicao() {
		return dataRefeicao;
	}

	public void setDataRefeicao(String dataRefeicao) {
		this.dataRefeicao = dataRefeicao;
	}
}
