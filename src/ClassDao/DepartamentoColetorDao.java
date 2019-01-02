/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDao;

import ClassBeans.DepartamentoColetorBeans;
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
public class DepartamentoColetorDao {
    
    public List<DepartamentoColetorBeans> departamentoColetor() {
        Connection con = ConnectionFactor.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<DepartamentoColetorBeans> depColetor = new ArrayList<>();

        try {
            pst = con.prepareStatement("select * from Departamento_coletor where id_depCol = 4");
            rs = pst.executeQuery();

            while (rs.next()) {
                DepartamentoColetorBeans dep = new DepartamentoColetorBeans();
                dep.setId_depCol(rs.getInt("id_depCol"));
                dep.setNome_depCol(rs.getString("nome_depCol"));
                depColetor.add(dep);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar dados para o jcombox 'table.Cidades'");
        }
        return depColetor;
    }
    
    public List<DepartamentoColetorBeans> ListaDepartamento() {
        Connection con = ConnectionFactor.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<DepartamentoColetorBeans> depColetor = new ArrayList<>();

        try {
            pst = con.prepareStatement("select * from Departamento_coletor order by nome_depCol");
            rs = pst.executeQuery();

            while (rs.next()) {
                DepartamentoColetorBeans dep = new DepartamentoColetorBeans();
                dep.setId_depCol(rs.getInt("id_depCol"));
                dep.setNome_depCol(rs.getString("nome_depCol"));
                depColetor.add(dep);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar dados para o jcombox 'table.Cidades'"+e.getMessage());
        }
        return depColetor;
    }
    
}
