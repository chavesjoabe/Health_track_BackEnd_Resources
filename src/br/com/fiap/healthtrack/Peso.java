package br.com.fiap.healthtrack;

import java.io.Serializable;
import java.util.Random;

/**
 * Classe que abstrai o Peso
 *
 * @author Ryan Sczayka Nunes - RM 82046
 * @author Joabe Chaves - RM 85071
 * @author Pedro Perro Salgado de Mendonça - RM 85731
 * @author Joao Vitor de Sousa Escudeiro - RM 77997
 * @author Lucas Alonso Cyrillo
 * @version 1.0
 * */

public class Peso implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 *Código do peso, gerado automaticamente
	 * */
	private int codPeso;
	/**
	 *código do usuário relacionado
	 * */
	private int codUsuario;
	/**
	 *valor do peso
	 * */
	private double pesoUsuario;
	/**
	 *data que o peso é cadastrado
	 * */
	private String dataPeso;
	/**
	 *Método construtor de Peso vazio, com os atributos em default
	 * */
	public Peso(){
	}
	/**
	 *Método construtor de Peso com os atributos passados como parametro
	 * */
	public Peso(int codPeso, int codUsuario, double pesoUsuario, String dataPeso) {
		this.codPeso = codPeso;
		this.codUsuario = codUsuario;
		this.pesoUsuario = pesoUsuario;
		this.dataPeso = dataPeso;
	}
	/**
	 *imprime no console todos os atributos da classe
	 * */
	public void getPeso() {
		System.out.println("Código do peso: " + codPeso);
		System.out.println("Código do usu�rio: " + codUsuario);
		System.out.println("Peso do usuário: " + pesoUsuario);
		System.out.println("Data de cadastro do peso: " + dataPeso);
	}

	public int getCod() { return this.codPeso; }


	public void setCodPeso(int codPeso){
		this.codPeso = codPeso;
	}

	/**
	 *retorna a data que o peso foi cadastrado
	 * */
	public String getDataPeso() {
		return dataPeso;
	}
	/**
	 *cadastra ou altera a data que o peso foi cadastrado.
	 * */
	public void setDataPeso(String dataPeso) {
		this.dataPeso = dataPeso;
	}
	/**
	 *altera ou cadastra um peso para o usuário relacionado
	 * */
	public void setPesoUsuario(double pesoUsuario) {
		this.pesoUsuario = pesoUsuario;
	}
	/**
	 *retorna o peso do usuário relacionado
	 * */
	public double getPesoUsuario() {
		return this.pesoUsuario;
	}

	public int getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}

	@Override
	public String toString() {
		return "cd_peso: " + codPeso + "\t"+
				"vl_peso: " + pesoUsuario + "\t"+
				"dt_peso: " + dataPeso + "\t"+
				"cd_user: " + codUsuario + "\t"+"\n";
	}
}
