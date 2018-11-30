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
public class TipoMaterialBeans {
    
    private int id_tipoMat;
    private String nome_material;
    private int quantidade;
    private int qtn_anterior;
    private String dataEntrada;
    private UsuariosBeans id_user;
    private boolean materialAtivo;
    private int total;

    /**
     * @return the id_tipoMat
     */
    public int getId_tipoMat() {
        return id_tipoMat;
    }

    /**
     * @param id_tipoMat the id_tipoMat to set
     */
    public void setId_tipoMat(int id_tipoMat) {
        this.id_tipoMat = id_tipoMat;
    }

    /**
     * @return the nome_material
     */
    public String getNome_material() {
        return nome_material;
    }

    /**
     * @param nome_material the nome_material to set
     */
    public void setNome_material(String nome_material) {
        this.nome_material = nome_material;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the qtn_anterior
     */
    public int getQtn_anterior() {
        return qtn_anterior;
    }

    /**
     * @param qtn_anterior the qtn_anterior to set
     */
    public void setQtn_anterior(int qtn_anterior) {
        this.qtn_anterior = qtn_anterior;
    }

    /**
     * @return the dataEntrada
     */
    public String getDataEntrada() {
        return dataEntrada;
    }

    /**
     * @param dataEntrada the dataEntrada to set
     */
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    /**
     * @return the id_user
     */
    public UsuariosBeans getId_user() {
        return id_user;
    }

    /**
     * @param id_user the id_user to set
     */
    public void setId_user(UsuariosBeans id_user) {
        this.id_user = id_user;
    }

    /**
     * @return the materialAtivo
     */
    public boolean isMaterialAtivo() {
        return materialAtivo;
    }

    /**
     * @param materialAtivo the materialAtivo to set
     */
    public void setMaterialAtivo(boolean materialAtivo) {
        this.materialAtivo = materialAtivo;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
}
