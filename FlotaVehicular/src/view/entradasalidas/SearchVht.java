/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.entradasalidas;

import Modelo.Dao;
import Utilidades.Utilidades;
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
public class SearchVht extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
      String fechac="";
    Dao dao=new Dao();
     static Login is;
     String ip;
    String nombreUser = Login.txtusuario.getText();  
    public static boolean buscarvht = false;
    public static boolean  bvcv2 = false;
    
    public SearchVht() {
        initComponents();
        
            try {
          ip = InetAddress.getLocalHost().getHostAddress() + " - " + InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException ex) {
            Logger.getLogger(SearchVht.class.getName()).log(Level.SEVERE, null, ex);
        }

            this.setTitle("Encontrar registro.  " + nombreUser+"@ServiciosGeneralesViviana " + "[{"+ ip +"}]" );

                  this.setIconImage(new ImageIcon(getClass().getResource("/images/system-search.png")).getImage());

       txtid.setText("");
       txt1.setText("");
       txtpt.setText("");
       txtpc.setText("");
       txtconductor.setText("");
       txtid.setText("");
      
       datef.setDate(null);
       
        txt1.setVisible(false);
        tabbedpanel();
        txtid.grabFocus();
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
        txtid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtconductor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtpt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtpc = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(544, 555));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        datef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datefMouseClicked(evt);
            }
        });
        datef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                datefKeyTyped(evt);
            }
        });

        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidKeyTyped(evt);
            }
        });

        jLabel2.setText("Codigo Vehículo");

        jLabel1.setText("Fecha de salida");

        jLabel4.setText("Conductor");

        txtconductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconductorActionPerformed(evt);
            }
        });
        txtconductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtconductorKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/system-users.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
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

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete_16x16.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/applications-system_1.png"))); // NOI18N

        txtpt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtptKeyTyped(evt);
            }
        });

        jLabel5.setText("Placa de tracto");

        jLabel6.setText("Placa de carreta");

        txtpc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpcKeyTyped(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/system-search.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtconductor, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(txtpc, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpt, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addComponent(datef, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1))
                    .addComponent(datef, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtconductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jButton1))
                .addGap(34, 34, 34)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        datef.getDateEditor().addPropertyChangeListener(new java.beans.PropertyChangeListener(){
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                //Aquí agregaremos la funcionalidad que queremos
                /* edad();
                txtedad.setText(ed);*/

                obtenerFecha();

                //por ejemplo al seleccionar una fecha le mostrare un diálogo con la fecha de hoy
                // JOptionPane.showMessageDialog(rootPane, "la fecha es "+new Date());
            }
        });

        jTabbedPane1.addTab("Buscar Registro", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void datefMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datefMouseClicked

    }//GEN-LAST:event_datefMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         BuscarOperador beklqw= new BuscarOperador();
        beklqw.setVisible(true);
        beklqw.setLocationRelativeTo(null);
        buscarvht=true;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String id="",nombre="",fecha="",placat="",placac="";

        
        if(datef.getDate()== null){
            txt1.setText("");
        }else{
            txt1.getText();
        }
        fecha=txt1.getText();

        id=txtid.getText();
        placat=txtpt.getText();
        placac=txtpc.getText();
        nombre=txtconductor.getText();

        dao.mostrarEntradaSalidasVHT(fecha,nombre,placat,placac,id);
        
        if(RegistVht.table.getRowCount()==0){
           JOptionPane.showMessageDialog(null, "No se encontraron resultados en la busqueda.!");
            dao.mostrarEntradaSalidasVHT("","","","","");
           
        }
        RegistVht.table.setRowSelectionInterval(0, 0);
        txtid.setText("");
        txtpt.setText("");
        txtpc.setText("");
        txtid.setText("");
        txtconductor.setText("");

        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtconductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconductorKeyTyped
 char cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
                jButton3.grabFocus();
            }
        
         cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ESCAPE){
                 dispose();
            }         // TODO add your handling code here:
    }//GEN-LAST:event_txtconductorKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyTyped
 char cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
                jButton3.doClick();
            }
        
          cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ESCAPE){
                 dispose();
            }
        
                 // TODO add your handling code here:
    }//GEN-LAST:event_jButton3KeyTyped

    private void txtptKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtptKeyTyped
char cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
                txtpc.grabFocus();
            }
        
         cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ESCAPE){
                 dispose();
            }         // TODO add your handling code here:
    }//GEN-LAST:event_txtptKeyTyped

    private void txtpcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpcKeyTyped
char cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
                txtconductor.grabFocus();
            }
        
         cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ESCAPE){
                 dispose();
            }         // TODO add your handling code here:
    }//GEN-LAST:event_txtpcKeyTyped

    private void datefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datefKeyTyped
char cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
                txtid.grabFocus();
            }
        
         cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ESCAPE){
                 dispose();
            }         // TODO add your handling code here:
    }//GEN-LAST:event_datefKeyTyped

    private void txtidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyTyped
        char cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
//            txtplaca.grabFocus();
        }

        cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ESCAPE){
            dispose();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_txtidKeyTyped

    private void txtconductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconductorActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 BuscarVht bvcv= new BuscarVht();
        bvcv.setVisible(true);
        bvcv.setLocationRelativeTo(null);
        bvcv2=true;        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchVht.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchVht.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchVht.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchVht.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchVht().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final com.toedter.calendar.JDateChooser datef = new com.toedter.calendar.JDateChooser();
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txt1;
    public static javax.swing.JTextField txtconductor;
    public static javax.swing.JTextField txtid;
    private javax.swing.JTextField txtpc;
    private javax.swing.JTextField txtpt;
    // End of variables declaration//GEN-END:variables
public void obtenerFecha() {

//        Date d = new Date();
//        SimpleDateFormat f = new SimpleDateFormat("yyyy");
//        int f1 = Integer.parseInt(f.format(d));
//
//        String f2 = Utilidades.formatDate2(jdfechanacimiento.getDate());
//        int f3 = Integer.valueOf(f2);
//
//        int edad = f1 - f3;

        String rx = Utilidades.formatDate(datef.getDate());
        txt1.setText(rx);


    }
 public void tabbedpanel(){
	
JLabel lab = new JLabel("Buscar Trabajador"); 
lab.setPreferredSize(new Dimension(120, 35)); 
jTabbedPane1.setTabComponentAt(0, lab);

jTabbedPane1.setUI( new shapeTabbedPaneUI() );

}
}
