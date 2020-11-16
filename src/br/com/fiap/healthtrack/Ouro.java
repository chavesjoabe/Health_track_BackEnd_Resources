package br.com.fiap.healthtrack;

import java.io.Serializable;

/**
 * Classe que abstrai o Plano Ouro herdando da classe Plano
 *
 * @author Ryan Sczayka Nunes - RM 82046
 * @author Joabe Chaves - RM 85071
 * @author Pedro Perro Salgado de Mendonça - RM 85731
 * @author Joao Vitor de Sousa Escudeiro - RM 77997
 * @author Lucas Alonso Cyrillo
 * @version 1.0
 */

public class Ouro extends Plano implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Consultas com nutrcionista por semana
     */
    private int nutricionista;

    /**
     * Método construtor do plano Ouro com os atributos como parametro
     */
    public Ouro(String nomePlano, String descPlano, double valorPlano, int personalTrainer, int nutricionista) {
        super(nomePlano, descPlano, valorPlano, personalTrainer);
        this.nutricionista = nutricionista;
    }

    /**
     * cadastra ou edita a quantidade de consultas com nutricista por semana do plano
     */
    public void setNutricionista(int nutricionista) {
        this.nutricionista = nutricionista;
    }

    /**
     * retorna a quantidade de consultas com nutricista por semana do plano
     */
    public int getNutricionista() {
        return nutricionista;
    }
}
