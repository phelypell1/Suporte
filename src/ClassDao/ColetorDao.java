/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDao;

import ClassBeans.ColetorBeans;
import ConnectionClass.ConnectionFactor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author devops
 */

public class ColetorDao {

    public void CadastrarColetor(ColetorBeans col){
        Connection conn = ConnectionFactor.getConnection();
        PreparedStatement pst = null;
        String sql;
        
        
        try {
           sql = "insert into Coletor (mdc_id, mmc_id, imei_1, imei_2, numero_patrimonio, so_col, data_compra, sts_col, cid_col, reg_col, dep_col)"
                   + "values (?,?,?,?,?,?,?,?,?,?,?)";
           pst =  conn.prepareStatement(sql);
           
           pst.setInt(1, col.getMdc_col().getId_marca());
           pst.setInt(2, col.getMmc_col().getId_modelo());
           pst.setString(3, col.getImei_1());
           pst.setString(4, col.getImei_2());
           pst.setString(5, col.getNumero_patrimonio());
           pst.setString(6, col.getSo_col());
           pst.setString(7, col.getData_compra());
           pst.setInt(8, col.getSts_col().getId_colSts());
           pst.setInt(9, col.getCid_col().getId_Cid());
           pst.setInt(10, col.getReg_col().getId_reg());
           pst.setInt(11, col.getDep_col().getId_depCol());
           pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Coletor cadastrado com sucesso !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}