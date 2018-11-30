
package ClassDao;

import ConnectionClass.ConnectionFactor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ClassView.ViewLogin;

public class ValidaAcessoDAL {
    
    
    public boolean ValidaAcesso(String usuario, String senha){
        Connection conn = ConnectionFactor.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean autenticado = false;
        
        try {
            stmt = conn.prepareStatement("select nome_user, senha from Usuario where nome_user = ? and senha = ?");
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            if(rs.next()){
             String  user = rs.getString("nome_user");
             String pass = rs.getString("senha");
             //Acesso = rs.getString("Acesso");
              
            }
            else{
                stmt.close();
                return autenticado;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ValidaAcessoDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
          return autenticado;  
    }
}