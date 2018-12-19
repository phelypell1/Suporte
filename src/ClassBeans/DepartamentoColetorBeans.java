/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassBeans;

/**
 *
 * @author devops
 */
public class DepartamentoColetorBeans {
    private int id_depCol;
    private String  nome_depCol;

    /**
     * @return the id_depCol
     */
    public int getId_depCol() {
        return id_depCol;
    }

    /**
     * @param id_depCol the id_depCol to set
     */
    public void setId_depCol(int id_depCol) {
        this.id_depCol = id_depCol;
    }

    /**
     * @return the nome_depCol
     */
    public String getNome_depCol() {
        return nome_depCol;
    }

    /**
     * @param nome_depCol the nome_depCol to set
     */
    public void setNome_depCol(String nome_depCol) {
        this.nome_depCol = nome_depCol;
    }

    @Override
    public String toString() {
        return getNome_depCol();
    }
}