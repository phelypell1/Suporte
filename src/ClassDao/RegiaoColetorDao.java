/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDao;

import ClassBeans.ModeloColetorBeans;
import ClassBeans.RegiaoColetorBeans;
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
public class RegiaoColetorDao {
    
      public List<RegiaoColetorBeans> RegiaoColetor() {
        Connection con = ConnectionFactor.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<RegiaoColetorBeans> regiaoColetor = new ArrayList<>();

        try {
            pst = con.prepareStatement("select * from Regiao where id_reg = 1");
            rs = pst.executeQuery();

            while (rs.next()) {
                RegiaoColetorBeans user = new RegiaoColetorBeans();
                user.setId_reg(rs.getInt("id_reg"));
                user.setNome_reg(rs.getString("nome_reg"));
                regiaoColetor.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar dados para o jcombox 'table.Cidades'");
        }
        return regiaoColetor;
    }
      
      public List<RegiaoColetorBeans> ListaRegiao() {
        Connection con = ConnectionFactor.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<RegiaoColetorBeans> regiaoColetor = new ArrayList<>();

        try {
            pst = con.prepareStatement("select * from Regiao");
            rs = pst.executeQuery();

            while (rs.next()) {
                RegiaoColetorBeans user = new RegiaoColetorBeans();
                user.setId_reg(rs.getInt("id_reg"));
                user.setNome_reg(rs.getString("nome_reg"));
                regiaoColetor.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar dados para o jcombox 'table.Cidades'");
        }
        return regiaoColetor;
    } 

}
