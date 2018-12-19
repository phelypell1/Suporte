package ClassDao;

import ClassBeans.TecnicosBeans;
import ConnectionClass.ConnectionFactor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TecnicosDao {

     public List<TecnicosBeans> TodosUsuarioRead() {
        Connection con = ConnectionFactor.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<TecnicosBeans> tecRead = new ArrayList<>();

        try {
            pst = con.prepareStatement("select * from Tecnicos");
            rs = pst.executeQuery();

            while (rs.next()) {
                TecnicosBeans user = new TecnicosBeans();
                user.setId_tec(rs.getInt("id_tec"));
                user.setNome_tec(rs.getString("nome_tec"));
                tecRead.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar dados para o jcombox 'table.Cidades'");
        }
        return tecRead;
    }
}
