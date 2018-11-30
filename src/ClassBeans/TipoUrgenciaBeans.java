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
public class TipoUrgenciaBeans {
    private int id_urgencia;
    private String nome_urg;
    private String cor_urg;

    /**
     * @return the id_urgencia
     */
    public int getId_urgencia() {
        return id_urgencia;
    }

    /**
     * @param id_urgencia the id_urgencia to set
     */
    public void setId_urgencia(int id_urgencia) {
        this.id_urgencia = id_urgencia;
    }

    /**
     * @return the nome_urg
     */
    public String getNome_urg() {
        return nome_urg;
    }

    /**
     * @param nome_urg the nome_urg to set
     */
    public void setNome_urg(String nome_urg) {
        this.nome_urg = nome_urg;
    }

    /**
     * @return the cor_urg
     */
    public String getCor_urg() {
        return cor_urg;
    }

    /**
     * @param cor_urg the cor_urg to set
     */
    public void setCor_urg(String cor_urg) {
        this.cor_urg = cor_urg;
    }

    @Override
    public String toString() {
        return getNome_urg();
    }
}
