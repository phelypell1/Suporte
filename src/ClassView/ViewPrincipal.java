/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassView;

import ClassBeans.UsuariosBeans;
import com.sun.org.apache.bcel.internal.generic.FLOAD;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author devops
 */
public class ViewPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ViewPrincipal
     */
    public ViewPrincipal() {
        
        initComponents();
        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT));
       
        //AQUI UTILIO O System.getProperty()
        String usuario = System.getProperty("login","");
        c.add(new JLabel(usuario));
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUser = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuNovaOs = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuOsAberta = new javax.swing.JMenuItem();
        menuOsFechada = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuProduto = new javax.swing.JMenuItem();
        menuNovosProdutos = new javax.swing.JMenuItem();
        menuConsulta = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuColetor = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setTitle("Tela Principal");

        jLabelUser.setText("User logado.:");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        menuNovaOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/relatorio (3).png"))); // NOI18N
        menuNovaOs.setText("Centro de Serviços");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem4.setText("Nova OS");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuNovaOs.add(jMenuItem4);

        menuOsAberta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        menuOsAberta.setText("OS Abertas");
        menuOsAberta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOsAbertaActionPerformed(evt);
            }
        });
        menuNovaOs.add(menuOsAberta);

        menuOsFechada.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        menuOsFechada.setText("Atendimento");
        menuOsFechada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOsFechadaActionPerformed(evt);
            }
        });
        menuNovaOs.add(menuOsFechada);

        menuRelatorio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        menuRelatorio.setText("Relatórios");
        menuNovaOs.add(menuRelatorio);

        jMenuBar1.add(menuNovaOs);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/controle-de-estoque.png"))); // NOI18N
        jMenu2.setText("Estoque");

        menuProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        menuProduto.setText("Produtos");
        menuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(menuProduto);

        menuNovosProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        menuNovosProdutos.setText("novos produtos");
        menuNovosProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNovosProdutosActionPerformed(evt);
            }
        });
        jMenu2.add(menuNovosProdutos);

        menuConsulta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        menuConsulta.setText("Consulta");
        menuConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaActionPerformed(evt);
            }
        });
        jMenu2.add(menuConsulta);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Patrimônio");

        jMenuItem3.setText("Cadastro Coletor");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuColetor.setText("Coletores");
        jMenuColetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuColetorActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuColetor);

        jMenuItem2.setText("Impressoras");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelUser)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelUser)
                .addGap(6, 6, 6))
        );

        getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(708, 416));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ViewNewOS novaos = new ViewNewOS();
        novaos.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void menuOsAbertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOsAbertaActionPerformed
        ViewOSAberta aberta = new ViewOSAberta();
        aberta.setVisible(true);
    }//GEN-LAST:event_menuOsAbertaActionPerformed

    private void menuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdutoActionPerformed
       viewEstoque estoque = new viewEstoque();
       estoque.setVisible(true);
               
    }//GEN-LAST:event_menuProdutoActionPerformed

    private void menuNovosProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNovosProdutosActionPerformed
        viewProdutos prod = new viewProdutos();
        prod.setVisible(true);
    }//GEN-LAST:event_menuNovosProdutosActionPerformed

    private void menuOsFechadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOsFechadaActionPerformed
        ViewAtendimento fechada = new ViewAtendimento();
        fechada.setVisible(true);
    }//GEN-LAST:event_menuOsFechadaActionPerformed

    private void menuConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuConsultaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ViewCadColetor cadColetor = new ViewCadColetor();
        cadColetor.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuColetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuColetorActionPerformed
        ViewColetor coletor = new ViewColetor();
        coletor.setVisible(true);
    }//GEN-LAST:event_jMenuColetorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuColetor;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuConsulta;
    private javax.swing.JMenu menuNovaOs;
    private javax.swing.JMenuItem menuNovosProdutos;
    private javax.swing.JMenuItem menuOsAberta;
    private javax.swing.JMenuItem menuOsFechada;
    private javax.swing.JMenuItem menuProduto;
    private javax.swing.JMenuItem menuRelatorio;
    // End of variables declaration//GEN-END:variables
}
