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
public class RegiaoColetorBeans {
    
    private int id_reg;
    private String nome_reg;

    /**
     * @return the id_reg
     */
    public int getId_reg() {
        return id_reg;
    }

    /**
     * @param id_reg the id_reg to set
     */
    public void setId_reg(int id_reg) {
        this.id_reg = id_reg;
    }

    /**
     * @return the nome_reg
     */
    public String getNome_reg() {
        return nome_reg;
    }

    /**
     * @param nome_reg the nome_reg to set
     */
    public void setNome_reg(String nome_reg) {
        this.nome_reg = nome_reg;
    }

    @Override
    public String toString() {
        return getNome_reg();
    }
}
