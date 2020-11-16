package br.com.fiap.healthtrack;


import java.io.Serializable;
import java.util.Random;

/**
 * Classe que abstrai um Usuário
 * @author Ryan Sczayka Nunes - RM 82046
 * @author Joabe Chaves - RM 85071
 * @author Pedro Perro Salgado de Mendonça - RM 85731
 * @author Joao Vitor de Sousa Escudeiro - RM 77997
 * @author Lucas Alonso Cyrillo
 * @version 1.0
 * */

public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 *Código de usuário gerado automaticamente
	 */
	private int codUsuario;
	/**
	 *Nome do Usuário
	 */
	private String nome;
	/**
	 *Email do Usuário
	 */
	private String email;
	/**
	 *Data de Nascimento do Usuário
	 */
	private String dataNasc;
	/**
	 *Altura do Usuário
	 */
	private double altura;
	/**
	 *Sexo do Usuário
	 */
	private String sexo;
	/**
	 *Senha cadastrada
	 */
	private String senha;
	/**
	 *Gerador de numero do usuário
	 */
	private Random gerador = new Random();

	/**
	 * Método construtor de um usuário vazio, somente com o código identificador
	 */
	public Usuario() {
		this.codUsuario = gerador.nextInt(100);
	}
	/**
	 *Método construtor de Classe com todos os atributos passados como parametro
	 */
	public Usuario(String nome, String email, String dataNasc, double altura, String sexo, String senha) {
		this.codUsuario = gerador.nextInt(100);
		this.nome = nome;
		this.email = email;
		this.dataNasc = dataNasc;
		this.altura = altura;
		this.sexo = sexo;
		this.senha = senha;
	}

	/**
	 * Exibe no console todos os dados do Usuário
	 */

	public void getUsuario() {
		System.out.println("Codigo do usuario: " + codUsuario);
		System.out.println("Nome do usuario: " + nome);
		System.out.println("Email do usuario: " + email);
		System.out.println("Data de nascimento do usuario: " + dataNasc);
		System.out.println("Altura do usuario: " + altura);
		System.out.println("Sexo do usuario: " + sexo);
	}

	/**
	 * Retorna o código do Usuário
	 */
	
	public int getCodUsuario() {
		String sql = "SELECT id FROM users";
		return codUsuario;
	}
	/**
	 *Retorna o nome do Usuário
	 */
	public String getNome() {
		return nome;
	}
	/**
	 *cadastra ou altera o nome do Usuário
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 *Retorna o endereço de email cadastrado
	 */
	public String getEmail() {
		return email;
	}
	/**
	 *cadastra ou altera o endereço de email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 *retorna a data de nascimento cadastrada
	 */
	public String getDataNasc() {
		return dataNasc;
	}
	/**
	 *cadastra ou altera a data de nascimento
	 */
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	/**
	 *retorna a altura cadastrada
	 */
	public double getAltura() {
		return altura;
	}
	/**
	 *cadastra ou altera a altura
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	/**
	 *retorna o sexo cadastrado
	 */
	public String getSexo() {
		return sexo;
	}
	/**
	 *cadastra ou altera o sexo
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	/**
	 *cadastra ou altera a senha
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
