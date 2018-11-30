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
public class TecnicosBeans {
    
    private int id_tec;
    private String nome_tec;
    private boolean ativo;

    /**
     * @return the id_tec
     */
    public int getId_tec() {
        return id_tec;
    }

    /**
     * @param id_tec the id_tec to set
     */
    public void setId_tec(int id_tec) {
        this.id_tec = id_tec;
    }

    /**
     * @return the nome_tec
     */
    public String getNome_tec() {
        return nome_tec;
    }

    /**
     * @param nome_tec the nome_tec to set
     */
    public void setNome_tec(String nome_tec) {
        this.nome_tec = nome_tec;
    }

    /**
     * @return the ativo
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}