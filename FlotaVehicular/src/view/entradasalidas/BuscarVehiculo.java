/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.entradasalidas;

import Modelo.Dao;
import javax.swing.JOptionPane;

/**
 *
 * @author Dani
 */
public class BuscarVehiculo extends javax.swing.JFrame {

    /**
     * Creates new form BuscarVehiculo
     */
    
    Dao dao= new Dao();
    
    public BuscarVehiculo() {
        initComponents();
        dao.mostrarVehiculos_2("", "", "", "","","","");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablevehiculo_2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("Enviar datos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablevehiculo_2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablevehiculo_2.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tablevehiculo_2);

        jTabbedPane1.addTab("tab1", jScrollPane1);

        jButton1.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      if(ActualizarMP.placa1){  
        String placa="";
         int filabex = BuscarVehiculo.tablevehiculo_2.getSelectedRow();
        try {
            if (filabex == -1) {
                JOptionPane.showMessageDialog(null, "no ha seleccionado ningun registro");
            } else {
                placa = (String) BuscarVehiculo.tablevehiculo_2.getValueAt(filabex, 3);

                  ActualizarMP.txtplaca.setText(placa);

                this.dispose();
            }
        } catch (Exception e) {
        }
        ActualizarMP.placa1=false;
     }
      
       if(ActualizarVht.placa2){  
        String placa="";
         int filabex = BuscarVehiculo.tablevehiculo_2.getSelectedRow();
        try {
            if (filabex == -1) {
                JOptionPane.showMessageDialog(null, "no ha seleccionado ningun registro");
            } else {
                placa = (String) BuscarVehiculo.tablevehiculo_2.getValueAt(filabex, 3);

                  ActualizarVht.txtplacat.setText(placa);

                this.dispose();
            }
        } catch (Exception e) {
        }
        ActualizarVht.placa2=false;
     }
       
       if(nuevomp.placa3){  
        String placa="";
         int filabex = BuscarVehiculo.tablevehiculo_2.getSelectedRow();
        try {
            if (filabex == -1) {
                JOptionPane.showMessageDialog(null, "no ha seleccionado ningun registro");
            } else {
                placa = (String) BuscarVehiculo.tablevehiculo_2.getValueAt(filabex, 3);

                  nuevomp.txtplaca.setText(placa);

                this.dispose();
            }
        } catch (Exception e) {
        }
       nuevomp.placa3=false;
     }
      
         if(nuevovht.placa4){  
        String placa="";
         int filabex = BuscarVehiculo.tablevehiculo_2.getSelectedRow();
        try {
            if (filabex == -1) {
                JOptionPane.showMessageDialog(null, "no ha seleccionado ningun registro");
            } else {
                placa = (String) BuscarVehiculo.tablevehiculo_2.getValueAt(filabex, 3);

                  nuevovht.txtplacat.setText(placa);

                this.dispose();
            }
        } catch (Exception e) {
        }
       nuevovht.placa4=false;
     }
         
      if(ActualizarVht.placa5){ 
          
        String placa="";
         int filabex = BuscarVehiculo.tablevehiculo_2.getSelectedRow();
        try {
            if (filabex == -1) {
                JOptionPane.showMessageDialog(null, "no ha seleccionado ningun registro");
            } else {
                placa = (String) BuscarVehiculo.tablevehiculo_2.getValueAt(filabex, 3);

                  ActualizarVht.txtplacac.setText(placa);

                this.dispose();
            }
        } catch (Exception e) {
        }
       ActualizarVht.placa5=false;
     }
      
       if(nuevovht.placa6){ 
          
        String placa="";
         int filabex = BuscarVehiculo.tablevehiculo_2.getSelectedRow();
        try {
            if (filabex == -1) {
                JOptionPane.showMessageDialog(null, "no ha seleccionado ningun registro");
            } else {
                placa = (String) BuscarVehiculo.tablevehiculo_2.getValueAt(filabex, 3);

                  nuevovht.txtplacac.setText(placa);

                this.dispose();
            }
        } catch (Exception e) {
        }
       nuevovht.placa6=false;
     }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTable tablevehiculo_2;
    // End of variables declaration//GEN-END:variables
}
