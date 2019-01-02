/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDao;

import ClassBeans.CidadeColetorBeans;
import ClassBeans.ColetorBeans;
import ClassBeans.DepartamentoColetorBeans;
import ClassBeans.MarcaColetorBeans;
import ClassBeans.ModeloColetorBeans;
import ClassBeans.RegiaoColetorBeans;
import ClassBeans.StatusColetorBeans;
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
    public List<ColetorBeans> ReadListColetor(){
        Connection conn = ConnectionFactor.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql;
        List<ColetorBeans> readlist = new ArrayList<>();
        
        
        try {
            sql ="select id_col, mdc_col, nome_mmc, numero_patrimonio, nome_cid, nome_reg, nome_depCol, data_emprestimo,  nome_colSts "
                    + "from Coletor "
                    + "inner join coletor_Marca on id_marca = mdc_id "
                    + "inner join coletor_modelo on id_mmc = mmc_id "
                    + "inner join Cidades on id_Cid = cid_col "
                    + "inner join Regiao on id_reg = reg_col "
                    + "inner join Departamento_coletor on id_depCol = dep_col "
                    + "inner join status_coletor on id_colSts = sts_col";
                
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                ColetorBeans table = new ColetorBeans();
               
                table.setId_col(rs.getInt("id_col"));
                
                MarcaColetorBeans col = new MarcaColetorBeans();
                col.setMdc_col(rs.getString("mdc_col"));
                table.setMdc_col(col);
                
                ModeloColetorBeans mdc = new ModeloColetorBeans();
                mdc.setMmc_modelo(rs.getString("nome_mmc"));
                table.setMmc_col(mdc);
                
                table.setNumero_patrimonio(rs.getString("numero_patrimonio"));
                
                CidadeColetorBeans cid = new CidadeColetorBeans();
                cid.setNome_cid(rs.getString("nome_cid"));
                table.setCid_col(cid);
                
                RegiaoColetorBeans reg = new RegiaoColetorBeans();
                reg.setNome_reg(rs.getString("nome_reg"));
                table.setReg_col(reg);
                
                DepartamentoColetorBeans dep = new DepartamentoColetorBeans();
                dep.setNome_depCol(rs.getString("nome_depCol"));
                table.setDep_col(dep);
                
                table.setData_emprestimo(rs.getString("data_emprestimo"));
                
                StatusColetorBeans sts = new StatusColetorBeans();
                sts.setNome_colSts(rs.getString("nome_colSts"));
                table.setSts_col(sts);
                
                readlist.add(table);
                
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Não foi possível carregar os dados da tabela ! \n\n"+ex.getMessage());
        }
        return readlist;
    }
}