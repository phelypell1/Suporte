/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDao;

import ClassBeans.StatusColetorBeans;
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
public class StatusColetorDao {
    public List<StatusColetorBeans> StatusColRead() {
        Connection con = ConnectionFactor.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<StatusColetorBeans> StatusRead = new ArrayList<>();

        try {
            pst = con.prepareStatement("select * from status_coletor");
            rs = pst.executeQuery();

            while (rs.next()) {
                StatusColetorBeans status = new StatusColetorBeans();
                status.setId_colSts(rs.getInt("id_colSts"));
                status.setNome_colSts(rs.getString("nome_colSts"));
                StatusRead.add(status);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar dados para o jcombox");
        }
        return StatusRead;
    }
    
}
