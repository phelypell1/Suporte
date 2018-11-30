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
public class DepartamentoBeans {
    
    private int id_dep;
    private String nome_dep;

    /**
     * @return the id_dep
     */
    public int getId_dep() {
        return id_dep;
    }

    /**
     * @param id_dep the id_dep to set
     */
    public void setId_dep(int id_dep) {
        this.id_dep = id_dep;
    }

    /**
     * @return the nome_dep
     */
    public String getNome_dep() {
        return nome_dep;
    }

    /**
     * @param nome_dep the nome_dep to set
     */
    public void setNome_dep(String nome_dep) {
        this.nome_dep = nome_dep;
    }

    @Override
    public String toString() {
        return getNome_dep();
    }
    
    
    
}
