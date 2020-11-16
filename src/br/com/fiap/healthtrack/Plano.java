package br.com.fiap.healthtrack;

import java.io.Serializable;
import java.util.Random;

/**
 * Classe que abstrai o Plano
 *
 * @author Ryan Sczayka Nunes - RM 82046
 * @author Joabe Chaves - RM 85071
 * @author Pedro Perro Salgado de Mendonça - RM 85731
 * @author Joao Vitor de Sousa Escudeiro - RM 77997
 * @author Lucas Alonso Cyrillo
 * @version 1.0
 */

public class Plano implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * Código do plano gerado automaticamente
     */
    private int codPlano;

    /**
     * gerador de código do plano
     */
    private Random gerador = new Random();

    /**
     * Nome do plano
     */
    private String nomePlano;

    /**
     * Descrição do plano
     */
    private String descPlano;

    /**
     * Valor do plano
     */
    private double valorPlano;

    /**
     * Aulas com personal trainer por semana
     */
    private int personalTrainer;

    /**
     * Método construtor de plano Vazio com os atributos em default
     */
    public Plano() {
        this.codPlano = gerador.nextInt(100);
    }

    /**
     * Método construtor de plano com os atributos como parametro
     */
    public Plano(String nomePlano, String descPlano, double valorPlano, int personalTrainer) {
        this.codPlano = gerador.nextInt(100);
        this.nomePlano = nomePlano;
        this.descPlano = descPlano;
        this.valorPlano = valorPlano;
        this.personalTrainer = personalTrainer;
    }

    /**
     * imprime todas as informações do plano no console
     */
    public void getPlano() {
        System.out.println("Código do plano: " + codPlano);
        System.out.println("Nome do plano: " + nomePlano);
        System.out.println("Descriçao do plano: " + descPlano);
        System.out.println("Valor do plano: " + valorPlano);
        System.out.println("Personal trainer: " + personalTrainer);
    }

    /**
     * retorna o valor do plano
     */
    public double getValorPlano() {
        return valorPlano;
    }

    /**
     * cadastra ou altera o valor do plano
     */
    public void setValorPlano(double valorPlano) {
        this.valorPlano = valorPlano;
    }

    /**
     * retorna o nome do plano
     */
    public String getNomePlano() {
        return nomePlano;
    }

    /**
     * cadastra ou altera o nome do plano
     */
    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    /**
     * Retorna a descrição do plano
     */
    public String getDescPlano() {
        return descPlano;
    }

    /**
     * cadastra ou altera a descrição do plano
     */
    public void setDescPlano(String descPlano) {
        this.descPlano = descPlano;
    }

    /**
     * Retorna a quantidade de aulas com personal trainer do plano
     */
    public int getPersonalTrainer() {
        return personalTrainer;
    }

    /**
     * Cadastra ou altera a quantidade de aulas com personal trainer do plano
     */
    public void setPersonalTrainer(int personalTrainer) {
        this.personalTrainer = personalTrainer;
    }
}
