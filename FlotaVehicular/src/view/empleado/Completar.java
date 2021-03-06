/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.empleado;

import view.empleado.*;
import Modelo.Dao;
import Modelo.Empleado;
import Utilidades.Utilidades;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static view.empleado.RegisTrabajadores.tableEmpleados;

/**
 *
 * @author Dani
 */
public class Completar extends javax.swing.JFrame {

    /**
     * Creates new form completar
     */
    boolean actualizar=false;
    String resultado="",valor="";
    Dao dao=new Dao();
    Date fecha=new Date();
    
    public Completar() {
        initComponents();
         this.setIconImage(new ImageIcon(getClass().getResource("/images/document-save-as.png")).getImage());

        txtff.setText(Utilidades.formatDate(fecha));
           txtff.setDisabledTextColor(Color.blue);
           jButton1.grabFocus();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbact = new javax.swing.JComboBox<>();
        txtff = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acción en el Documento");
        setResizable(false);

        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel2KeyTyped(evt);
            }
        });

        jLabel1.setText("Acción en el Documento ");

        cbact.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Actualizar", "Guardar" }));
        cbact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbactKeyTyped(evt);
            }
        });

        txtff.setBackground(new java.awt.Color(255, 255, 204));
        txtff.setForeground(new java.awt.Color(0, 0, 204));
        txtff.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtff.setEnabled(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Check_16x16.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton1KeyTyped(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete_16x16.png"))); // NOI18N
        jButton2.setToolTipText("");

        jLabel3.setText("Genera los documentos y realiza transacciones*");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/applications-system_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbact, 0, 150, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtff, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jSeparator2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
        if(cbact.getSelectedItem().equals("Actualizar")) {
                enableTrue();
                darcolor();
		dispose();
                 Actualizar.cbtipodoc.grabFocus();
                
					}

						
						if(cbact.getSelectedItem().equals("Guardar")) {
							actualizar=true;
                                                        
                                                        
                                                        
                                                         if (Actualizar.txtdoc.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar el documento de identidad");
           Actualizar.txtdoc.grabFocus();
            return;
        }
            if (Actualizar.txtnombre.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar nombre del trabajador");
           Actualizar.txtnombre.grabFocus();
            return;
        }
            
              if (Actualizar.datefi.getDate()==null) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar la fecha de ingreso");
            Actualizar.datefi.grabFocus();
            return;
        }
                                                            Empleado ex=new Empleado();

							valor=Actualizar.cbtipodoc.getSelectedItem().toString();
                                                        System.out.println(valor);
							ex.setIdtipodoc(dao.verificarTipoDoc(valor));
                                                        
							ex.setNumdoc(Actualizar.txtdoc.getText());
                                                        System.out.println(Actualizar.txtdoc.getText());

							ex.setNombres(Actualizar.txtnombre.getText());
                                                        System.out.println(Actualizar.txtnombre.getText());
							// String userr="x3";
							// u.setUsername(userr);

							ex.setDirección(Actualizar.txtdireccion.getText());
                                                        System.out.println(Actualizar.txtdireccion.getText());

							// String ps="123";
							// u.setPassword(ps);
							// System.out.println(txtcontraseña.getText());

							ex.setPais(Actualizar.txtp.getText());
                                                        System.out.println(Actualizar.txtp.getText());

							// String doc="dni";
							// u.setNumdoc(doc);
							// System.out.println(txtdoc.getText());

							ex.setDepartamento(Actualizar.txtd.getText());
                                                        System.out.println(Actualizar.txtd.getText());

							// String ap="ap";
							// u.setPaterno(ap);
							// System.out.println(txtpaterno.getText());

							 ex.setProvincia(Actualizar.txtpr.getText());
                                                        System.out.println(Actualizar.txtpr.getText());

							// String m="mtt";
							// u.setMaterno(m);
							// System.out.println(txtmaterno.getText());

							ex.setDistrito(Actualizar.txtdis.getText());
                                                        System.out.println(Actualizar.txtdis.getText());

							// String noms="nombre";
							// u.setNombres(noms);
							// System.out.println(txtnombres.getText());
							String valor2=Actualizar.cbsexo.getSelectedItem().toString();
							ex.setSexo(valor2);
                                                         System.out.println(valor2);

                                                        
                                                     
                                                        ex.setTelefono(Actualizar.txttelefono.getText());
                                                        System.out.println(Actualizar.txttelefono.getText());

                                                     
                                                        ex.setEmail(Actualizar.txtemail.getText());
                                                        System.out.println(Actualizar.txtemail.getText());

                                                        

                                                         if(Actualizar.datefn.getDate()==null){
                                                                Actualizar.txt3.setText("");
                                                             }
                                                        ex.setFecnacimiento(Actualizar.txt3.getText());

                                                        
                                                        ex.setEdad(Integer.parseInt(Actualizar.txtedad.getText()));
                                                         System.out.println(Actualizar.txtedad.getText());
                                                                 
                                                        String perConducir;
							if (Actualizar.ckpermiso.isSelected()) {
								perConducir = "1";
							} else {
								perConducir = "0";
							} 
                                                        
                                                        ex.setPerconducir(perConducir);
                                                        System.out.println(perConducir);
                                                        
                                                        
                                                       String valor3=Actualizar.cbdependencia.getSelectedItem().toString();
							ex.setIddependencia(dao.verificarDependencia(valor3));
//                                                        System.out.println(valor3);

                                                        ex.setOrganización(Actualizar.txtorga.getText());
                                                        ex.setTipoemp(Actualizar.txttipoe.getText());
                                                        
                                                        String valor4=Actualizar.cbcarg.getSelectedItem().toString();
							ex.setIdcargo(dao.verificarCARGO(valor4));
  
                                                         ex.setTipolicencia(Actualizar.txttipol.getText());
                                                        ex.setNlicencia(Actualizar.txtnl.getText());

							// String em="email";
							// u.setEmail(em);
							// System.out.println(txtemail.getText());
							String Activo;
							if (Actualizar.ckactivo.isSelected()) {
								Activo = "1";
							} else {
								Activo = "0";
							}
							
							ex.setActivo(Activo);
							 System.out.println(Activo);
                                                         
							String jefe;
							if (Actualizar.ckjefe.isSelected()) {
								jefe = "1";
							} else {
								jefe = "0";
							}

							ex.setJefe(jefe);
                                                       System.out.println("PERMISO= " + jefe);
							
							  
                                                            if(Actualizar.datefi.getDate()==null){
                                                                Actualizar.txt1.setText("");
                                                             }
  
							ex.setFechaIngreso(Actualizar.txt1.getText());
                                                        
                                                        
                                                         if(Actualizar.dateft.getDate()==null){
                                                                Actualizar.txt2.setText("");
                                                             }
							ex.setFechaSalida(Actualizar.txt2.getText());


							
							if(actualizar){
								resultado=dao.ModificarEmpleado(ex);
								JOptionPane.showMessageDialog(rootPane, resultado);

                                                                dao.mostrarEmpleados("","","","","","");								
                                                                tableEmpleados.setRowSelectionInterval(0, 0);
                                                                quitarcolor();
                                                                enableFalse();
							}
							dispose();
							
                                                }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
   
 
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyTyped
        char cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
                 jButton1.doClick();
            }
        
         cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ESCAPE){
                 dispose();
            }
    }//GEN-LAST:event_jButton1KeyTyped

    private void cbactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbactKeyTyped
     char cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
                 jButton1.grabFocus();
                 
            }
        
         cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ESCAPE){
                 dispose();
            }       
    }//GEN-LAST:event_cbactKeyTyped

    private void jPanel2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2KeyTyped

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
            java.util.logging.Logger.getLogger(Completar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Completar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Completar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Completar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Completar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbact;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtff;
    // End of variables declaration//GEN-END:variables
public void enableTrue() {

		Actualizar.cbtipodoc.setEnabled(true);
		Actualizar.txtdoc.setEditable(true);
		Actualizar.txtnombre.setEditable(true);
		Actualizar.txtdireccion.setEditable(true);
		Actualizar.txtp.setEditable(true);
		Actualizar.txtd.setEditable(true);
		Actualizar.txtpr.setEditable(true);
		Actualizar.txtdis.setEditable(true);
		Actualizar.cbsexo.setEnabled(true);
                Actualizar.txttelefono.setEditable(true);
                Actualizar.txtemail.setEditable(true);
                Actualizar.datefn.setEnabled(true);
                Actualizar.datefi.setEnabled(true);
                Actualizar.ckactivo.setEnabled(true);
                Actualizar.dateft.setEnabled(true);
                Actualizar.ckjefe.setEnabled(true);
                Actualizar.ckpermiso.setEnabled(true);
                Actualizar.txtedad.setEditable(true);
                
                Actualizar.cbdependencia.setEnabled(true);
                Actualizar.cbcarg.setEnabled(true);
                Actualizar.txtorga.setEditable(true);
                Actualizar.txttipoe.setEditable(true);
                Actualizar.txttipol.setEditable(true);
                Actualizar.txtnl.setEditable(true);
	}
	public void enableFalse() {

		Actualizar.cbtipodoc.setEnabled(false);
		Actualizar.txtdoc.setEditable(false);
		Actualizar.txtnombre.setEditable(false);
		Actualizar.txtdireccion.setEditable(false);
		Actualizar.txtp.setEditable(false);
		Actualizar.txtd.setEditable(false);
		Actualizar.txtpr.setEditable(false);
		Actualizar.txtdis.setEditable(false);
		Actualizar.cbsexo.setEnabled(false);
                Actualizar.txttelefono.setEditable(false);
                Actualizar.txtemail.setEditable(false);
                Actualizar.datefn.setEnabled(false);
                Actualizar.datefi.setEnabled(false);
                Actualizar.ckactivo.setEnabled(false);
                Actualizar.dateft.setEnabled(false);
                Actualizar.ckjefe.setEnabled(false);
                Actualizar.ckpermiso.setEnabled(false);
                Actualizar.txtedad.setEditable(false);

                Actualizar.cbdependencia.setEnabled(false);
                Actualizar.cbcarg.setEnabled(false);
                Actualizar.txtorga.setEditable(false);
                Actualizar.txttipoe.setEditable(false);
                Actualizar.txttipol.setEditable(false);
                Actualizar.txtnl.setEditable(false);
	}
           public void darcolor(){
                Actualizar.cbtipodoc.setBackground(new Color(255,255,153)); 
		Actualizar.txtdoc.setBackground(new Color(255,255,153)); 
		Actualizar.txtnombre.setBackground(new Color(255,255,153)); 
		Actualizar.txtdireccion.setBackground(new Color(255,255,153)); 
		Actualizar.txtp.setBackground(new Color(255,255,153)); 
		Actualizar.txtd.setBackground(new Color(255,255,153)); 
		Actualizar.txtpr.setBackground(new Color(255,255,153)); 
		Actualizar.txtdis.setBackground(new Color(255,255,153)); 
		Actualizar.cbsexo.setBackground(new Color(255,255,153)); 
                Actualizar.txttelefono.setBackground(new Color(255,255,153)); 
                Actualizar.txtemail.setBackground(new Color(255,255,153)); 
//                Actualizar.datefn.setBackground(new Color(255,255,153)); 
//                Actualizar.datefi.setBackground(new Color(255,255,153)); 
                Actualizar.ckactivo.setBackground(new Color(255,255,153)); 
//                Actualizar.dateft.setBackground(new Color(255,255,153)); 
                Actualizar.ckjefe.setBackground(new Color(255,255,153)); 
                Actualizar.ckpermiso.setBackground(new Color(255,255,153)); 
                Actualizar.txtedad.setBackground(new Color(255,255,153)); 
                
                Actualizar.cbdependencia.setBackground(new Color(255,255,153)); 
                Actualizar.cbcarg.setBackground(new Color(255,255,153)); 
                Actualizar.txtorga.setBackground(new Color(255,255,153)); 
                Actualizar.txttipoe.setBackground(new Color(255,255,153)); 
                Actualizar.txttipol.setBackground(new Color(255,255,153)); 
                Actualizar.txtnl.setBackground(new Color(255,255,153)); 
   }
           
            public void quitarcolor(){
                Actualizar.cbtipodoc.setBackground(new Color(255,255,255)); 
                Actualizar.cbcarg.setBackground(new Color(255,255,255)); 
		Actualizar.txtdoc.setBackground(new Color(255,255,255)); 
		Actualizar.txtnombre.setBackground(new Color(255,255,255)); 
		Actualizar.txtdireccion.setBackground(new Color(255,255,255)); 
		Actualizar.txtp.setBackground(new Color(255,255,255)); 
		Actualizar.txtd.setBackground(new Color(255,255,255)); 
		Actualizar.txtpr.setBackground(new Color(255,255,255)); 
		Actualizar.txtdis.setBackground(new Color(255,255,255)); 
		Actualizar.cbsexo.setBackground(new Color(255,255,255)); 
                Actualizar.txttelefono.setBackground(new Color(255,255,255)); 
                Actualizar.txtemail.setBackground(new Color(255,255,255)); 
//                Actualizar.datefn.setBackground(new Color(255,255,255)); 
//                Actualizar.datefi.setBackground(new Color(255,255,255)); 
                Actualizar.ckactivo.setBackground(new Color(255,255,255)); 
//                Actualizar.dateft.setBackground(new Color(255,255,255)); 
                Actualizar.ckjefe.setBackground(new Color(255,255,255)); 
                Actualizar.ckpermiso.setBackground(new Color(255,255,255)); 
                Actualizar.txtedad.setBackground(new Color(255,255,255)); 
                
                Actualizar.cbdependencia.setBackground(new Color(255,255,255)); 
                Actualizar.txtorga.setBackground(new Color(255,255,255)); 
                Actualizar.txttipoe.setBackground(new Color(255,255,255)); 
                Actualizar.txttipol.setBackground(new Color(255,255,255)); 
                Actualizar.txtnl.setBackground(new Color(255,255,255)); 
   }
}
