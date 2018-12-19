
package ClassDao;

import ConnectionClass.ConnectionFactor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ClassView.ViewLogin;
import javax.swing.JOptionPane;

public class ValidaAcessoDAL {
    public String Acesso;
    
    public boolean consultar(String login, String senha) {
        boolean autenticado = false;
        String sql;
        try {
            Connection conn = ConnectionFactor.getConnection();
            sql = "SELECT nome_user, senha, setor FROM Usuario WHERE nome_user=? and senha=?";
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
            ResultSet rs;
            rs = ps.executeQuery();
            if (rs.next()) {
                String user = rs.getString("nome_user");
                String pass = rs.getString("senha");
                Acesso = rs.getString("setor");//Aqui armazeno o tipo de acesso ("Administrador" ou "Outros") na variável publica Acesso declarada no inicio do código
                autenticado = true;
            } else {
                //JOptionPane.showMessageDialog(this, "Acesso Negado \nInforme o setor de Inventário");
                ps.close();
                return autenticado;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return autenticado;
    }
}