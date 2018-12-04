/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDao;

import ClassBeans.MaterialBeans;
import ConnectionClass.ConnectionFactor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author devops
 */
public class MaterialDao {
    
    public void btnCadastrar(MaterialBeans mat){
        
        Connection conn = ConnectionFactor.getConnection();
        PreparedStatement stmt = null;
        String sql;
                
        try {
            sql="insert into Material (nome_material, data_entrada, quantidade, user_id) "
                + "values(?,?,?,?)";
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, mat.getNome_material());
            stmt.setString(2,mat.getData_entrada());
            stmt.setInt(3, mat.getQuantidade());
            stmt.setInt(4, mat.getUser_id().getId_user());
            stmt.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso !");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error ! \n "+ex.getMessage());
        }
    }
}
