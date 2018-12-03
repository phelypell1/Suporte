/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDao;

import ClassBeans.DepartamentoBeans;
import ClassBeans.SolicitacaoOSBeans;
import ClassBeans.StatusBeans;
import ClassBeans.TipoUrgenciaBeans;
import ClassBeans.UsuariosBeans;
import ConnectionClass.ConnectionFactor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    
    
    
    public List<SolicitacaoOSBeans> ReadTable(){
        Connection conn = ConnectionFactor.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql;
        List<SolicitacaoOSBeans> readlist = new ArrayList<>();
        
        
        try {
            sql = "select id_OS, nome_user, nome_dep, inf_cab,inf_sol,data_sol, nome_urg, nome_status from solicitacaoOS "
                + "inner join Usuario on id_user = user_id "
                + "inner join Departamento on id_dep = dep_id "
                + "inner join TipoUrgencia on id_urgencia = tipourg_id "
                + "inner join status on id_status = sts_id";
        
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                SolicitacaoOSBeans table = new SolicitacaoOSBeans();
                
                table.setId_solicitacao(rs.getInt("id_OS"));
               //Irá trazer o nome do usuário implementando o foreign key//
                UsuariosBeans user =  new UsuariosBeans();
                user.setNome_user(rs.getString("nome_user"));
                table.setUser_id(user);
                
                DepartamentoBeans dep = new DepartamentoBeans();
                dep.setNome_dep(rs.getString("nome_dep"));
                table.setDep_id(dep);
                
                table.setInfo_cab(rs.getString("inf_cab"));
                table.setInfo_sol(rs.getString("inf_sol"));
                
                table.setData_sol(rs.getString("data_sol"));
                
                TipoUrgenciaBeans urg = new TipoUrgenciaBeans();
                urg.setNome_urg(rs.getString("nome_urg"));
                table.setUrg_id(urg);
                
                StatusBeans status = new StatusBeans();
                status.setNome_sts(rs.getString("nome_status"));
                table.setSts_id(status);
                
                //JOptionPane.showMessageDialog(null, sts);
                readlist.add(table);
                
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Não foi possível carregar os dados da tabela ! \n\n"+ex.getMessage());
        }
        return readlist;
    }
    public List<SolicitacaoOSBeans> ReadTableOs(String num){
        Connection conn = ConnectionFactor.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql;
        
        List<SolicitacaoOSBeans> readlist = new ArrayList<>();
        
        
        try {
            sql = "select id_OS, nome_user, nome_dep, inf_cab,inf_sol,data_sol, nome_urg, nome_status from solicitacaoOS "
                + "inner join Usuario on id_user = user_id "
                + "inner join Departamento on id_dep = dep_id "
                + "inner join TipoUrgencia on id_urgencia = tipourg_id "
                + "inner join status on id_status = sts_id"
                    + "where id_OS like ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, "%"+num+"%");
            rs = pst.executeQuery();
            
            while(rs.next()){
                SolicitacaoOSBeans table = new SolicitacaoOSBeans();
                
                table.setId_solicitacao(rs.getInt("id_OS"));
               //Irá trazer o nome do usuário implementando o foreign key//
                UsuariosBeans user =  new UsuariosBeans();
                user.setNome_user(rs.getString("nome_user"));
                table.setUser_id(user);
                
                DepartamentoBeans dep = new DepartamentoBeans();
                dep.setNome_dep(rs.getString("nome_dep"));
                table.setDep_id(dep);
                
                table.setInfo_cab(rs.getString("inf_cab"));
                table.setInfo_sol(rs.getString("inf_sol"));
                
                table.setData_sol(rs.getString("data_sol"));
                
                TipoUrgenciaBeans urg = new TipoUrgenciaBeans();
                urg.setNome_urg(rs.getString("nome_urg"));
                table.setUrg_id(urg);
                
                StatusBeans status = new StatusBeans();
                status.setNome_sts(rs.getString("nome_status"));
                table.setSts_id(status);
                
                //JOptionPane.showMessageDialog(null, sts);
                readlist.add(table);
                
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Não foi possível carregar os dados da tabela ! \n\n"+ex.getMessage());
        }
        return readlist;
    }
    
}