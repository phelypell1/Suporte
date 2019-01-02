/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDao;

import ClassBeans.MarcaColetorBeans;
import ClassBeans.ModeloColetorBeans;
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
public class ModeloColetorDao {
    public List<ModeloColetorBeans> ModeloColetor() {
        Connection con = ConnectionFactor.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<ModeloColetorBeans> modeloColetor = new ArrayList<>();

        try {
            pst = con.prepareStatement("select * from coletor_modelo");
            rs = pst.executeQuery();

            while (rs.next()) {
                ModeloColetorBeans user = new ModeloColetorBeans();
                user.setId_modelo(rs.getInt("id_mmc"));
                user.setMmc_modelo(rs.getString("nome_mmc"));
                modeloColetor.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar dados para o jcombox 'table.Cidades'");
        }
        return modeloColetor;
    }
}
