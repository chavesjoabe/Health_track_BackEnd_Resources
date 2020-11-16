package br.com.fiap.healthtrack;


import java.io.Serializable;
import java.util.Random;

/**
 * Classe que abstrai o Feed Favoritado
 *
 * @author Ryan Sczayka Nunes - RM 82046
 * @author Joabe Chaves - RM 85071
 * @author Pedro Perro Salgado de Mendonça - RM 85731
 * @author Joao Vitor de Sousa Escudeiro - RM 77997
 * @author Lucas Alonso Cyrillo
 * @version 1.0
 * */

public class FeedFavorito extends Feed implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/**
	 * codigo do Feed favorito gerado automaticamente
	 * */
	private int codFavorito;
	/**
	 * codigo do Feed relacionado
	 * */
	private int codFeed;
	/**
	 *codigo do usuario relacionado
	 * */
	private int codUsuario;
	/**
	 *gerador de codigo do Feed favoritado
	 * */
	private Random gerador = new Random();

	/**
	 *Método construtor de um feed favorito vazio, com os atributos em default
	 * */
	public FeedFavorito() {}

	/**
	 *Método construtor de um Feed com os atributos passados no parametro
	 * */
	
	public FeedFavorito(int codFeed, int codUsuario) {
		this.codFavorito = gerador.nextInt(100);
		this.codFeed = codFeed;
		this.codUsuario = codUsuario;
	}
}
