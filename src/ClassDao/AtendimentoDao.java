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

public class AtendimentoDao {
    
    public void UpdateSolicitacao(SolicitacaoOSBeans sol){
        Connection conn = ConnectionFactor.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql;
        
        
        try {
            sql = ("update solicitacaoOS set sts_id=?, tec_id=?, inf_atendimento=? where id_OS =? ");
            pst = conn.prepareStatement(sql);
            
            pst.setInt(1, sol.getSts_id().getId_sts());
            pst.setInt(2, sol.getTec_id().getId_tec());
            pst.setString(3, sol.getInf_atendimento());
            pst.setInt(4, sol.getId_solicitacao());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atendimento finalizado com sucesso !");
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "ERROR ! " +ex.getMessage());
        }
        
        
    }
}
