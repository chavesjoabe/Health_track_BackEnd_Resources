package br.com.fiap.healthtrack;

import java.io.Serializable;

/**
 * Classe que abstrai o Plano Prata herdando da classe Plano
 *
 * @author Ryan Sczayka Nunes - RM 82046
 * @author Joabe Chaves - RM 85071
 * @author Pedro Perro Salgado de Mendonça - RM 85731
 * @author Joao Vitor de Sousa Escudeiro - RM 77997
 * @author Lucas Alonso Cyrillo
 * @version 1.0
 */

public class Prata extends Plano implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Método construtor do plano Prata com os atributos como parametro
     */
    public Prata(String nomePlano, String descPlano, double valorPlano, int personalTrainer) {
        super(nomePlano, descPlano, valorPlano, personalTrainer);
    }
}
