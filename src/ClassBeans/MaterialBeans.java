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
public class MaterialBeans {
    
    private int id_material;
    private String nome_material;
    private String data_entrada;
    private int quantidade;
    private UsuariosBeans user_id;

    /**
     * @return the id_material
     */
    public int getId_material() {
        return id_material;
    }

    /**
     * @param id_material the id_material to set
     */
    public void setId_material(int id_material) {
        this.id_material = id_material;
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
     * @return the data_entrada
     */
    public String getData_entrada() {
        return data_entrada;
    }

    /**
     * @param data_entrada the data_entrada to set
     */
    public void setData_entrada(String data_entrada) {
        this.data_entrada = data_entrada;
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
     * @return the user_id
     */
    public UsuariosBeans getUser_id() {
        return user_id;
    }

    /**
     * @param user_id the user_id to set
     */
    public void setUser_id(UsuariosBeans user_id) {
        this.user_id = user_id;
    }
    
    
}
