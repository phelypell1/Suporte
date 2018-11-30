/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDao;

import ClassBeans.DepartamentoBeans;
import ClassBeans.TipoUrgenciaBeans;
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
public class PropriedadeDao {
    
    public List<TipoUrgenciaBeans> TipoUrgemciaRead() {
        Connection con = ConnectionFactor.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<TipoUrgenciaBeans> TipoUrgenciaRead = new ArrayList<>();

        try {
            pst = con.prepareStatement("select * from TipoUrgencia order by id_urgencia");
            rs = pst.executeQuery();

            while (rs.next()) {
                TipoUrgenciaBeans urg = new TipoUrgenciaBeans();
                urg.setId_urgencia(rs.getInt("id_urgencia"));
                urg.setNome_urg(rs.getString("nome_urg"));
                TipoUrgenciaRead.add(urg);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar dados para o jcombox 'table.Cidades'");
        }
        return TipoUrgenciaRead;
    }
}
