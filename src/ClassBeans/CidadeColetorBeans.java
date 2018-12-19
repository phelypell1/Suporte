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
public class CidadeColetorBeans {
    
    private int id_Cid;
    private String nome_cid;
    private RegiaoColetorBeans reg_col;

    /**
     * @return the id_Cid
     */
    public int getId_Cid() {
        return id_Cid;
    }

    /**
     * @param id_Cid the id_Cid to set
     */
    public void setId_Cid(int id_Cid) {
        this.id_Cid = id_Cid;
    }

    /**
     * @return the nome_cid
     */
    public String getNome_cid() {
        return nome_cid;
    }

    /**
     * @param nome_cid the nome_cid to set
     */
    public void setNome_cid(String nome_cid) {
        this.nome_cid = nome_cid;
    }

    /**
     * @return the reg_col
     */
    public RegiaoColetorBeans getReg_col() {
        return reg_col;
    }

    /**
     * @param reg_col the reg_col to set
     */
    public void setReg_col(RegiaoColetorBeans reg_col) {
        this.reg_col = reg_col;
    }

    @Override
    public String toString() {
        return getNome_cid();
    }
}
