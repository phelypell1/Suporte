/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDao;

import ClassBeans.UsuariosBeans;
import ConnectionClass.ConnectionFactor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author devops
 */
public class UsuariosDao {
    
    public List<UsuariosBeans> UsuarioRead() {
        Connection con = ConnectionFactor.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<UsuariosBeans> UsuarioRead = new ArrayList<>();

        try {
            pst = con.prepareStatement("select * from Usuario order by nome_user");
            rs = pst.executeQuery();

            while (rs.next()) {
                UsuariosBeans user = new UsuariosBeans();
                user.setId_user(rs.getInt("id_user"));
                user.setNome_user(rs.getString("nome_user"));
                UsuarioRead.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar dados para o jcombox 'table.Cidades'");
        }
        return UsuarioRead;
    }
}
