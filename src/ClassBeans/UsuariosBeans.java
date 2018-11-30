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
public class UsuariosBeans {
    private int id_user;
    private String nome_user;
    private String senha;
    private String data_criacao;

    /**
     * @return the id_user
     */
    public int getId_user() {
        return id_user;
    }

    /**
     * @param id_user the id_user to set
     */
    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    /**
     * @return the nome_user
     */
    public String getNome_user() {
        return nome_user;
    }

    /**
     * @param nome_user the nome_user to set
     */
    public void setNome_user(String nome_user) {
        this.nome_user = nome_user;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the data_criacao
     */
    public String getData_criacao() {
        return data_criacao;
    }

    /**
     * @param data_criacao the data_criacao to set
     */
    public void setData_criacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    @Override
    public String toString() {
        return getNome_user();
    }
    
    
}
