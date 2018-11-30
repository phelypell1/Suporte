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
public class StatusBeans {
    private int id_sts;
    private String nome_sts;

    /**
     * @return the id_sts
     */
    public int getId_sts() {
        return id_sts;
    }

    /**
     * @param id_sts the id_sts to set
     */
    public void setId_sts(int id_sts) {
        this.id_sts = id_sts;
    }

    /**
     * @return the nome_sts
     */
    public String getNome_sts() {
        return nome_sts;
    }

    /**
     * @param nome_sts the nome_sts to set
     */
    public void setNome_sts(String nome_sts) {
        this.nome_sts = nome_sts;
    }

    @Override
    public String toString() {
        return getNome_sts();
    }
    
    
    
}
