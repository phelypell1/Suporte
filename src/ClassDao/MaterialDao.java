package ClassDao;
import ClassBeans.MaterialBeans;
import ClassBeans.UsuariosBeans;
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
public class MaterialDao {
    public void btnCadastrar(MaterialBeans mat){
        Connection conn = ConnectionFactor.getConnection();
        PreparedStatement stmt = null;
        String sql;
        try {
            sql="insert into Material (nome_material, data_entrada, quantidade, user_id, valor_unit) "
                + "values(?,?,?,?,?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, mat.getNome_material());
            stmt.setString(2,mat.getData_entrada());
            stmt.setInt(3, mat.getQuantidade());
            stmt.setInt(4, mat.getUser_id().getId_user());
            stmt.setDouble(5, mat.getValor_unit());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error ! \n "+ex.getMessage());
        }
    }
    
    public void btnAlterar(MaterialBeans material){
        Connection conn = ConnectionFactor.getConnection();
        PreparedStatement stmt = null;
        String sql;
        
        
        try {
            sql = "update Material set nome_material=?, data_entrada=?, quantidade=?, user_id=?, obs_text=?, valor_unit=?"
                    + "where id_mat=?";
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, material.getNome_material());
            stmt.setString(2, material.getData_entrada());
            stmt.setInt(3, material.getQuantidade());
            stmt.setInt(4, material.getUser_id().getId_user());
            stmt.setString(5, material.getObser());
            stmt.setDouble(6, material.getValor_unit());
            stmt.setInt(7, material.getId_material());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados atulizados com sucesso !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        
        
    }
    public List<MaterialBeans> MaterialRead(){
        Connection conn = ConnectionFactor.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql;
        List<MaterialBeans> materialist = new ArrayList<>();
        try {
            sql = "select id_mat, nome_material, data_entrada, quantidade, nome_user, valor_unit from Material"
                    + " inner join Usuario on id_user = user_id";
            pst = conn.prepareStatement(sql);
            rs =  pst.executeQuery();
             while(rs.next()){
                 MaterialBeans mat = new MaterialBeans();
                 mat.setId_material(rs.getInt("id_mat"));
                 mat.setNome_material(rs.getString("nome_material"));
                 mat.setData_entrada(rs.getString("data_entrada"));
                 mat.setQuantidade(rs.getInt("quantidade"));
                 UsuariosBeans user = new UsuariosBeans();
                 user.setNome_user(rs.getString("nome_user"));
                 mat.setValor_unit(rs.getDouble("valor_unit"));
                 mat.setUser_id(user);
                 materialist.add(mat);
             }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null ,ex.getMessage());
        }
        return materialist;
    }
}
