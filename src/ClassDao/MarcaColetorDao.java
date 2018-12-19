/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDao;

import ClassBeans.MarcaColetorBeans;
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
public class MarcaColetorDao {
    
     public List<MarcaColetorBeans> MarcaColetor() {
        Connection con = ConnectionFactor.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<MarcaColetorBeans> marcaColetor = new ArrayList<>();

        try {
            pst = con.prepareStatement("select * from coletor_Marca");
            rs = pst.executeQuery();

            while (rs.next()) {
                MarcaColetorBeans user = new MarcaColetorBeans();
                user.setId_marca(rs.getInt("id_marca"));
                user.setMdc_col(rs.getString("mdc_col"));
                marcaColetor.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar dados para o jcombox 'table.Cidades'");
        }
        return marcaColetor;

    }
}