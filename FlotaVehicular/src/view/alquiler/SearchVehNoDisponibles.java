/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.alquiler;

import Modelo.Dao;
import view.alquiler.SearchVehNoDisponibles;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import swing.xp.shapeTabbedPaneUI;
import view.Login;



/**
 *
 * @author Dani
 */
public class SearchVehNoDisponibles extends javax.swing.JFrame {

    /**
     * Creates new form SearchVeh
     */
    String fechac="";
    Dao dao=new Dao();
      static Login is;
     String ip;
    String nombreUser = Login.txtusuario.getText();  
    
    public SearchVehNoDisponibles() {
        initComponents();
        

            try {
          ip = InetAddress.getLocalHost().getHostAddress() + " - " + InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException ex) {
            Logger.getLogger(SearchVehNoDisponibles.class.getName()).log(Level.SEVERE, null, ex);
        }

            this.setTitle("Encontrar registro.  " + nombreUser+"@ServiciosGeneralesViviana " + "[{"+ ip +"}]" );

                  this.setIconImage(new ImageIcon(getClass().getResource("/images/system-search.png")).getImage());

//                   dao.listarTipoVH(cbtipov);
      
        tabbedpanel();
        txtma.grabFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtma = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtmodelo = new javax.swing.JTextField();
        txtc = new javax.swing.JTextField();
        txtmar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        txtplaca = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(184, 221, 182));

        jPanel2.setBackground(new java.awt.Color(184, 221, 182));

        jLabel7.setText("Matricula");

        jLabel2.setText("Modelo");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete_16x16.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Check_16x16.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton3KeyTyped(evt);
            }
        });

        txtma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmaKeyTyped(evt);
            }
        });

        jLabel8.setText("Codigo Vehiculo");

        txtmodelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmodeloKeyTyped(evt);
            }
        });

        txtc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcKeyTyped(evt);
            }
        });

        txtmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmarActionPerformed(evt);
            }
        });
        txtmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmarKeyTyped(evt);
            }
        });

        jLabel9.setText("Marca");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/applications-system_1.png"))); // NOI18N

        txtplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtplacaActionPerformed(evt);
            }
        });
        txtplaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtplacaKeyTyped(evt);
            }
        });

        jLabel10.setText("Placa");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmar)
                            .addComponent(txtmodelo))))
                .addGap(51, 51, 51))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Busqueda", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     String codigo="",marca="",modelo="",tipov="",matricula="",placa="";
//        
//       
//     tipov=cbtipov.getSelectedItem().toString();
//           
        codigo=txtc.getText();
        matricula=txtma.getText();
        placa=txtplaca.getText();
        marca=txtmar.getText();
        modelo=txtmodelo.getText();
       System.out.println(txtma.getText());
        
        dao.mostrarVehiculosNoDisponibles(codigo,matricula,placa,marca,modelo,"");
        
        if(RegistVehiculosAlq.tablenodisponibles.getRowCount()==0){
             JOptionPane.showMessageDialog(null, "No se encontraron resultados en la busqueda.!");
              dao.mostrarVehiculosNoDisponibles("","","","","","");
          }
        RegistVehiculosAlq.tablenodisponibles.setRowSelectionInterval(0, 0);

        txtma.setText("");
        txtmar.setText("");
        txtplaca.setText("");
        txtc.setText("");
        txtmodelo.setText("");
       
       

        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcKeyTyped
char cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
                txtma.grabFocus();
            }
        
         cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ESCAPE){
                 dispose();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_txtcKeyTyped

    private void txtmaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmaKeyTyped
char cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
                txtmar.grabFocus();
            }
        
         cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ESCAPE){
                 dispose();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_txtmaKeyTyped

    private void txtmarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmarKeyTyped
char cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
                txtmodelo.grabFocus();
            }
        
         cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ESCAPE){
                 dispose();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_txtmarKeyTyped

    private void txtmodeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmodeloKeyTyped
char cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
                jButton3.grabFocus();
            }
        
         cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ESCAPE){
                 dispose();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_txtmodeloKeyTyped

    private void jButton3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyTyped
char cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
                jButton3.doClick();
            }
        
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton3KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtplacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtplacaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtplacaKeyTyped

    private void txtmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmarActionPerformed

    private void txtplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtplacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtplacaActionPerformed

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
            java.util.logging.Logger.getLogger(SearchVehNoDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchVehNoDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchVehNoDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchVehNoDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchVehNoDisponibles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtc;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txtmar;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtplaca;
    // End of variables declaration//GEN-END:variables
 public void tabbedpanel(){
	
JLabel lab = new JLabel("Buscar Vehiculo de Alquiler"); 
lab.setPreferredSize(new Dimension(160, 35)); 
jTabbedPane1.setTabComponentAt(0, lab);

jTabbedPane1.setUI( new shapeTabbedPaneUI() );

}

   
}
