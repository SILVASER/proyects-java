/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.caja;

import Modelo.Dao;
import javax.swing.JOptionPane;
import static view.caja.RegistCaja.tablecaja;

/**
 *
 * @author Dani
 */
public class BuscarColaborador extends javax.swing.JFrame {

    /**
     * Creates new form BuscarColaborador
     */
    Dao dao=new Dao();
    public BuscarColaborador() {
        initComponents();
        dao.mostrarEmpleados1("", "", "", "", "", "");
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
        TableBuscarEmpleado = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("Enviar datos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TableBuscarEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TableBuscarEmpleado.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(TableBuscarEmpleado);

        jTabbedPane1.addTab("Registro de empleados", jScrollPane1);

        jButton1.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    if(SearchDetalleCaja.aux1 == true){
           String id = "",Nombre = "";

        int filawwzz = BuscarColaborador.TableBuscarEmpleado.getSelectedRow();
    
        try {
            if (filawwzz == -1) {
                JOptionPane.showMessageDialog(null, "no ha seleccionado ningun registro");
            } else {
                Nombre = (String) BuscarColaborador.TableBuscarEmpleado.getValueAt(filawwzz, 2);
                id = (String) BuscarColaborador.TableBuscarEmpleado.getValueAt(filawwzz, 3);

                SearchDetalleCaja.txtcola.setText(Nombre);
                SearchDetalleCaja.txtcola1.setText(id);

                this.dispose();
            }
        } catch (Exception e) {
        }
        SearchDetalleCaja.aux1 = false;
       }
    
    if(ActAperturaCaja.aux2 == true){
           String Nombre = "";

        int filawwzz = BuscarColaborador.TableBuscarEmpleado.getSelectedRow();
    
        try {
            if (filawwzz == -1) {
                JOptionPane.showMessageDialog(null, "no ha seleccionado ningun registro");
            } else {
                Nombre = (String) BuscarColaborador.TableBuscarEmpleado.getValueAt(filawwzz, 3);

                ActAperturaCaja.txtusuario.setText(Nombre);
          

                this.dispose();
            }
        } catch (Exception e) {
        }
       ActAperturaCaja.aux2 = false;
       }
    
    if(ActDetalleCaja.aux3 == true){
        String Nombre = "";

        int filawwzz = BuscarColaborador.TableBuscarEmpleado.getSelectedRow();
    
        try {
            if (filawwzz == -1) {
                JOptionPane.showMessageDialog(null, "no ha seleccionado ningun registro");
            } else {
                Nombre = (String) BuscarColaborador.TableBuscarEmpleado.getValueAt(filawwzz, 3);

               ActDetalleCaja.txtcodigocolaborador.setText(Nombre);
          
                this.dispose();
            }
        } catch (Exception e) {
        }
       ActDetalleCaja.aux3 = false;
       }
    
     if(AperturaCaja.aux4 == true){
        String Nombre = "";

        int filawwzz = BuscarColaborador.TableBuscarEmpleado.getSelectedRow();
    
        try {
            if (filawwzz == -1) {
                JOptionPane.showMessageDialog(null, "no ha seleccionado ningun registro");
            } else {
                Nombre = (String) BuscarColaborador.TableBuscarEmpleado.getValueAt(filawwzz, 3);

               AperturaCaja.txtusuario.setText(Nombre);
          
                this.dispose();
            }
        } catch (Exception e) {
        }
       AperturaCaja.aux4 = false;
       }
     
          
      if(NuevoMovimiento.aux6 == true){
        String Nombre = "";

        int filawwzz = BuscarColaborador.TableBuscarEmpleado.getSelectedRow();
    
        try {
            if (filawwzz == -1) {
                JOptionPane.showMessageDialog(null, "no ha seleccionado ningun registro");
            } else {
                Nombre = (String) BuscarColaborador.TableBuscarEmpleado.getValueAt(filawwzz, 3);

              NuevoMovimiento.txtcodigocolaborador.setText(Nombre);
          
                this.dispose();
            }
        } catch (Exception e) {
        }
       NuevoMovimiento.aux6 = false;
       }
      
       if(NuevoMovimientoAP.aux7 == true){
        String Nombre = "";

        int filawwzz = BuscarColaborador.TableBuscarEmpleado.getSelectedRow();
    
        try {
            if (filawwzz == -1) {
                JOptionPane.showMessageDialog(null, "no ha seleccionado ningun registro");
            } else {
                Nombre = (String) BuscarColaborador.TableBuscarEmpleado.getValueAt(filawwzz, 3);

              NuevoMovimientoAP.txtcodigocolaborador.setText(Nombre);
          
                this.dispose();
            }
        } catch (Exception e) {
        }
      NuevoMovimientoAP.aux7 = false;
       }
     
//      if(NuevoDetalleCaja.aux5 == true){
//        String Nombre = "";
//
//        int filawwzz = BuscarColaborador.TableBuscarEmpleado.getSelectedRow();
//    
//        try {
//            if (filawwzz == -1) {
//                JOptionPane.showMessageDialog(null, "no ha seleccionado ningun registro");
//            } else {
//                Nombre = (String) BuscarColaborador.TableBuscarEmpleado.getValueAt(filawwzz, 3);
//
//               NuevoDetalleCaja.txtcodigocolaborador.setText(Nombre);
//          
//                this.dispose();
//            }
//        } catch (Exception e) {
//        }
//       NuevoDetalleCaja.aux5 = false;
//       }
    
    
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
            java.util.logging.Logger.getLogger(BuscarColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new BuscarColaborador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TableBuscarEmpleado;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
