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
public class ModeloColetorBeans {
    
    private int id_modelo;
    private String mmc_modelo;

    /**
     * @return the id_modelo
     */
    public int getId_modelo() {
        return id_modelo;
    }

    /**
     * @param id_modelo the id_modelo to set
     */
    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    /**
     * @return the mmc_modelo
     */
    public String getMmc_modelo() {
        return mmc_modelo;
    }

    /**
     * @param mmc_modelo the mmc_modelo to set
     */
    public void setMmc_modelo(String mmc_modelo) {
        this.mmc_modelo = mmc_modelo;
    }

    @Override
    public String toString() {
        return getMmc_modelo();
    }
}