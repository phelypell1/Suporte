/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDao;

import ClassBeans.CidadeColetorBeans;
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
public class CidadeColetorDao {
    
    public List<CidadeColetorBeans> CidadeColetor() {
        Connection con = ConnectionFactor.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<CidadeColetorBeans> cidadeColetor = new ArrayList<>();

        try {
            pst = con.prepareStatement("select * from Cidades where id_Cid = 1");
            rs = pst.executeQuery();

            while (rs.next()) {
                CidadeColetorBeans cid = new CidadeColetorBeans();
                cid.setId_Cid(rs.getInt("id_Cid"));
                cid.setNome_cid(rs.getString("nome_cid"));
                cidadeColetor.add(cid);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar dados para o jcombox 'table.Cidades'");
        }
        return cidadeColetor;
    }
    
    public List<CidadeColetorBeans> ListaCidade() {
        Connection con = ConnectionFactor.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<CidadeColetorBeans> cidadeColetor = new ArrayList<>();

        try {
            pst = con.prepareStatement("select * from Cidades");
            rs = pst.executeQuery();

            while (rs.next()) {
                CidadeColetorBeans cid = new CidadeColetorBeans();
                cid.setId_Cid(rs.getInt("id_Cid"));
                cid.setNome_cid(rs.getString("nome_cid"));
                cidadeColetor.add(cid);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar dados para o jcombox 'table.Cidades'");
        }
        return cidadeColetor;
    }
}