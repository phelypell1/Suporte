/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDao;

import ClassBeans.StatusBeans;
import ClassBeans.TipoUrgenciaBeans;
import ConnectionClass.ConnectionFactor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class StatusDao {
    public List<StatusBeans> StatusRead() {
        Connection con = ConnectionFactor.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<StatusBeans> StatusRead = new ArrayList<>();

        try {
            pst = con.prepareStatement("select * from status order by id_Status");
            rs = pst.executeQuery();

            while (rs.next()) {
                StatusBeans status = new StatusBeans();
                status.setId_sts(rs.getInt("id_status"));
                status.setNome_sts(rs.getString("nome_status"));
                StatusRead.add(status);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar dados para o jcombox 'table.Cidades'");
        }
        return StatusRead;
    }
}
