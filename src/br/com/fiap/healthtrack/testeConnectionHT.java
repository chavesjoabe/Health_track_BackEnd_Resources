package br.com.fiap.healthtrack;

import Model.PesoDao;

public class testeConnectionHT {
    public static void main(String[] args) {

        //instancia do pesoDao
        PesoDao pesoDao = new PesoDao();

        //metodo que retorna todos os pesos do banco de dados
        System.out.println(pesoDao.getAll());

        //metodo que atualiza os dados de um peso a partir da coluna cd_weight
        /*System.out.println("Resultado do metodo UPDATE() \n");
        pesoDao.update(212.22, "25/10/2020", 11);
        System.out.println(pesoDao.getById(11));
        System.out.println();*/

        //metodo que deleta um registro de peso a partir da coluna cd_weight
        /*System.out.println("Resultado do metodo DELETE()\n");
        pesoDao.delete(11);
        pesoDao.getAll().clear();
        System.out.println(pesoDao.getAll());*/


    }
}
