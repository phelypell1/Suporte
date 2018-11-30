/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDao;

import ClassBeans.DepartamentoBeans;
import ClassBeans.UsuariosBeans;
import ConnectionClass.ConnectionFactor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DepartamentoDAO {
    
    public List<DepartamentoBeans> DepartamentoRead() {
        Connection con = ConnectionFactor.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<DepartamentoBeans> DepartamentoRead = new ArrayList<>();

        try {
            pst = con.prepareStatement("select * from Departamento order by nome_dep");
            rs = pst.executeQuery();

            while (rs.next()) {
                DepartamentoBeans dep = new DepartamentoBeans();
                dep.setId_dep(rs.getInt("id_dep"));
                dep.setNome_dep(rs.getString("nome_dep"));
                DepartamentoRead.add(dep);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar dados para o jcombox 'table.Cidades'");
        }
        return DepartamentoRead;
    }
    
}
