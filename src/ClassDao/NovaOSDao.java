/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDao;

import ClassBeans.SolicitacaoOSBeans;
import ConnectionClass.ConnectionFactor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author devops
 */
public class NovaOSDao {
    public int Os;
    public void Cadastrar(SolicitacaoOSBeans os){
        Connection conn = ConnectionFactor.getConnection();
        PreparedStatement stmt = null;
        String sql;
        try {
            
            sql = "insert into solicitacaoOS (user_id, dep_id, inf_cab, inf_sol, data_sol, tipourg_id,sts_id) values (?,?,?,?,?,?,?)";
                stmt = conn.prepareStatement(sql);
                stmt.setInt(1, os.getUser_id().getId_user());
                stmt.setInt(2, os.getDep_id().getId_dep());
                stmt.setString(3, os.getInfo_cab());
                stmt.setString(4, os.getInfo_sol());
                stmt.setString(5, os.getData_sol());
                stmt.setInt(6, os.getUrg_id().getId_urgencia());
                stmt.setInt(7, os.getSts_id().getId_sts());
                stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Solicitação realizada com sucesso !");
            //JOptionPane.showMessageDialog(null,"Anote seu número de OS: "+ConsultaNumOS(Os));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar solicitação ! Erro no tratamento Cadastrar da classe NovaOS\n"+ex.getMessage());
        }
    }
    
    /*public int ConsultaNumOS(int numOs){
        Connection conn = ConnectionFactor.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql;
      
        sql = "select max(id_OS) from solicitacaoOS";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, numOs);
            if(rs.next()){
                Os = rs.getInt("numOs");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
       
        return Os;
    }*/
}