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
public class StatusColetorBeans {
    
    private int id_colSts;
    private String nome_colSts;
    private String cor_col;

    /**
     * @return the id_colSts
     */
    public int getId_colSts() {
        return id_colSts;
    }

    /**
     * @param id_colSts the id_colSts to set
     */
    public void setId_colSts(int id_colSts) {
        this.id_colSts = id_colSts;
    }

    /**
     * @return the nome_colSts
     */
    public String getNome_colSts() {
        return nome_colSts;
    }

    /**
     * @param nome_colSts the nome_colSts to set
     */
    public void setNome_colSts(String nome_colSts) {
        this.nome_colSts = nome_colSts;
    }

    /**
     * @return the cor_col
     */
    public String getCor_col() {
        return cor_col;
    }

    /**
     * @param cor_col the cor_col to set
     */
    public void setCor_col(String cor_col) {
        this.cor_col = cor_col;
    }

    @Override
    public String toString() {
        return getNome_colSts();
    }
}