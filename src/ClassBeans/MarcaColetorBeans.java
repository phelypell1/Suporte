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
public class MarcaColetorBeans {
    
    private int id_marca;
    private String mdc_col;

    /**
     * @return the id_marca
     */
    public int getId_marca() {
        return id_marca;
    }

    /**
     * @param id_marca the id_marca to set
     */
    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    /**
     * @return the mdc_col
     */
    public String getMdc_col() {
        return mdc_col;
    }

    /**
     * @param mdc_col the mdc_col to set
     */
    public void setMdc_col(String mdc_col) {
        this.mdc_col = mdc_col;
    }

    @Override
    public String toString() {
        return getMdc_col();
    }
}