/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.mantenimiento;

import Modelo.Dao;
import Modelo.Repuesto;
import Utilidades.Utilidades;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.apache.poi.ss.formula.functions.Subtotal;
import view.Login;
import view.entradasalidas.ActualizarVht;
import static view.mantenimiento.nuevoMant.tablenuevoResp;
import static view.entradasalidas.RegistVht.table;

/**
 *
 * @author Dani
 */
public class nuevoDetalleR extends javax.swing.JFrame {

    /**
     * Creates new form nuevoResp
     */
    boolean nuevo=false;
    Dao dao= new Dao();
    Date fecha=new Date();
    String resultado="";int filaM;
    static Login is;
String ip;
	String nombreUser = Login.txtusuario.getText();
    public nuevoDetalleR() {
        initComponents();
        
        darcolor();
        
        
          this.setIconImage(new ImageIcon(getClass().getResource("/images/format-justify-fill.png")).getImage());

            try {
          ip = InetAddress.getLocalHost().getHostAddress() + " - " + InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException ex) {
            Logger.getLogger(nuevoDetalleR.class.getName()).log(Level.SEVERE, null, ex);
        }

            this.setTitle("Nuevo registro. " + nombreUser+"@ServiciosGeneralesViviana " + "[{"+ ip +"}]" );

                    txtcodigo.setText(nuevoMant.txtcodigo.getText());

       
       
        
        
        
        
           datefa.setText(Utilidades.formatDate(fecha));
     
        
        try {
            txtip.setText(InetAddress.getLocalHost().getHostAddress() + " - " + InetAddress.getLocalHost().getHostName());
        } catch (UnknownHostException ex) {
            Logger.getLogger(nuevoMant.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        txtuser.setText(nombreUser);
        txtdescripcion.grabFocus();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtip = new javax.swing.JTextField();
        txtuser = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        datefa = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        btnc = new javax.swing.JButton();
        txtiva = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtprec = new javax.swing.JTextField();
        txtsubtotal = new javax.swing.JTextField();
        txtimporteiva = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtcant = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtcodigo1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Codigo");

        txtcodigo.setEditable(false);
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoKeyTyped(evt);
            }
        });

        jLabel4.setText("Descripción");

        jLabel6.setText("Iva");

        jLabel8.setText("Marca");

        txtip.setEditable(false);
        txtip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtipActionPerformed(evt);
            }
        });

        txtuser.setEditable(false);

        jLabel15.setText("Usuario");

        jLabel16.setText("Ip");

        datefa.setEditable(false);

        jLabel17.setText("Fecha de Actualización");

        txtdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdescripcionKeyTyped(evt);
            }
        });

        txtmarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmarcaKeyTyped(evt);
            }
        });

        btnc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/applications-system.png"))); // NOI18N
        btnc.setText("Grabar");
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncActionPerformed(evt);
            }
        });
        btnc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btncKeyTyped(evt);
            }
        });

        txtiva.setEditable(false);
        txtiva.setText("18.00");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtprec.setEditable(false);
        txtprec.setText("0.00");
        txtprec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecActionPerformed(evt);
            }
        });
        txtprec.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtprecFocusGained(evt);
            }
        });
        txtprec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprecKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecKeyTyped(evt);
            }
        });

        txtsubtotal.setEditable(false);
        txtsubtotal.setText("0.00");

        txtimporteiva.setEditable(false);
        txtimporteiva.setText("0.00");

        jLabel13.setText("Precio");

        txtcant.setText("0");
        txtcant.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcantFocusGained(evt);
            }
        });
        txtcant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcantKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantKeyTyped(evt);
            }
        });

        jLabel7.setText("Importe iva");

        txttotal.setEditable(false);
        txttotal.setText("0.00");

        jLabel12.setText("Cantidad");

        jLabel14.setText("Total");

        jLabel9.setText("SubTotal");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtimporteiva, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsubtotal, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttotal, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcant, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(txtprec, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtprec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtimporteiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtcodigo1.setEditable(false);
        txtcodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigo1ActionPerformed(evt);
            }
        });
        txtcodigo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigo1KeyTyped(evt);
            }
        });

        jLabel5.setText("Id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtdescripcion)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtiva, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                    .addComponent(txtip)
                    .addComponent(txtuser)
                    .addComponent(datefa)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnc, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtcodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(datefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnc)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtipActionPerformed

    private void btncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
            
               nuevo=true;
               
                if (txtdescripcion.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar la descripción del producto");
            txtdescripcion.setText("");
            txtdescripcion.grabFocus();
            return;
        } 
                    if (txtcant.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe completar el campo cantidad");
            txtcant.setText("");
            txtcant.grabFocus();
            return;
        } 
               // int cant =Integer.parseInt(txtcant.getText());
                   if (!Utilidades.isNumeric(txtcant.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un valor numerico");
            txtcant.setText("");
            txtcant.grabFocus();
            return;
        } 
                   int cant =Integer.parseInt(txtcant.getText());
                     if (cant<=0) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un valor mayor a 0");
            txtcant.setText("");
            txtcant.grabFocus();
            return;
        }        
                   
                          if (!Utilidades.isDecimal(txtprec.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un valor numerico");
            txtprec.setText("");
            txtprec.grabFocus();
            return;
        } 
                          
                                          if (!Utilidades.isDecimal(txtsubtotal.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un valor numerico en el campo subtotal");
            txtsubtotal.setText("");
            txtsubtotal.grabFocus();
            return;
        }
                                          if (!Utilidades.isDecimal(txtimporteiva.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un valor numerico en el campo importe iva");
            txtimporteiva.setText("");
            txtimporteiva.grabFocus();
            return;
        }
                                          if (!Utilidades.isDecimal(txttotal.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un valor numerico en el campo total");
            txttotal.setText("");
            txttotal.grabFocus();
            return;
        }
            Repuesto r=new  Repuesto();
            
                r.setIdmantenimiento(txtcodigo.getText());
                r.setDescripcion(txtdescripcion.getText());
                r.setMarca(txtmarca.getText());
                
                r.setIva(Double.parseDouble(txtiva.getText()));
                r.setCantidad(Integer.parseInt(txtcant.getText()));
                r.setPrecio(Double.parseDouble(txtprec.getText()));
                r.setSubtotal(Double.parseDouble(txtsubtotal.getText()));
                r.setImporteiva(Double.parseDouble(txtimporteiva.getText()));
                r.setTotal(Double.parseDouble(txttotal.getText()));
                
                r.setFecham(datefa.getText());
                r.setNumusum(txtuser.getText());
                r.setIp(txtip.getText());
                
            if(nuevo){
                resultado=dao.GuardarRepuesto(r);
                JOptionPane.showMessageDialog(rootPane, resultado);
             enablefalse();
             quitarcolor();
             btnc.setEnabled(false);
            }
        
            dao.mostrarRespXID(nuevoMant.txtcodigo.getText());
           tablenuevoResp.setRowSelectionInterval(0, 0);
           
           txtdescripcion.grabFocus();
           
           
           
            
        
    }//GEN-LAST:event_btncActionPerformed

    private void txtprecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtprecActionPerformed

    private void txtprecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecKeyTyped
char cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
                btnc.grabFocus();
            }
        
         cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ESCAPE){
                 dispose();
            }             
        
        
    }//GEN-LAST:event_txtprecKeyTyped

    private void txtcantKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantKeyReleased
     
        if(txtcant.getText().equals("")){
          txtprec.setEditable(false);
          txtprec.setText("");
          txtprec.setBackground(new Color(255,255,255)); 
          txttotal.setText("");
             txtsubtotal.setText("");
             txtimporteiva.setText("");
     
      }else{ 
            int cant=Integer.parseInt(txtcant.getText());
                if(cant>0){
                  txtprec.setEditable(true);
                  txtprec.setBackground(new Color(255,255,153)); 
                  txtprec.setText("");
                  txtprec.grabFocus();
                  
                }else{
                    txtprec.setEditable(false);
                    txtprec.setText("");
                    txtprec.setBackground(new Color(255,255,255)); 
                    txttotal.setText("");
             txtsubtotal.setText("");
             txtimporteiva.setText("");
                    } 
        }
 
    }//GEN-LAST:event_txtcantKeyReleased

    private void txtprecKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecKeyReleased
     int cantidad;double precio = 0,total,subt,igv;
         DecimalFormat df = new DecimalFormat("#.00");
         
//         txtprec.getText().equals("") || !Utilidades.isNumeric(txtprec.getText()) || 
         if(!Utilidades.isDecimal(txtprec.getText())){
             txttotal.setText("");
             txtsubtotal.setText("");
             txtimporteiva.setText("");
         }else{
             
            double vprecio=Double.parseDouble(txtprec.getText());
            if( (vprecio>0) ||   (vprecio>0.00)){
                  cantidad =Integer.parseInt(txtcant.getText());
            precio=Double.parseDouble(txtprec.getText());

            total=cantidad * precio;
           // txttotal.setText(String.valueOf(total));
             txttotal.setText("" + df.format(total).replace(',', '.'));

           subt=total/1.18;
           txtsubtotal.setText("" + df.format(subt).replace(',', '.'));

            DecimalFormat dfx = new DecimalFormat("0.00");

           igv=total-subt;
           txtimporteiva.setText("" + dfx.format(igv).replace(',', '.'));
          }else{
      
             txttotal.setText("");
             txtsubtotal.setText("");
              txtimporteiva.setText("");
       
        }
         }

    }//GEN-LAST:event_txtprecKeyReleased

    private void txtcantFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcantFocusGained
      if(txtcant.getText().trim().toLowerCase().equals("0")){
	txtcant.setText("");
      }
    }//GEN-LAST:event_txtcantFocusGained

    private void txtprecFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtprecFocusGained
        if(txtprec.getText().trim().toLowerCase().equals("0.00")){
	txtprec.setText("");
        }
    }//GEN-LAST:event_txtprecFocusGained

    private void txtdescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescripcionKeyTyped
char cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
                txtmarca.grabFocus();
            }
        
         cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ESCAPE){
                 dispose();
            }              // TODO add your handling code here:
    }//GEN-LAST:event_txtdescripcionKeyTyped

    private void txtmarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmarcaKeyTyped
char cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
                txtcant.grabFocus();
            }
        
         cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ESCAPE){
                 dispose();
            }              // TODO add your handling code here:
    }//GEN-LAST:event_txtmarcaKeyTyped

    private void txtcantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantKeyTyped
char cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
                txtprec.grabFocus();
            }
        
         cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ESCAPE){
                 dispose();
            }              // TODO add your handling code here:
    }//GEN-LAST:event_txtcantKeyTyped

    private void btncKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btncKeyTyped
char cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
                btnc.doClick();
                    
            }
        
         cTeclaPresionada=evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ESCAPE){
                 dispose();
            } 
        
                      // TODO add your handling code here:
    }//GEN-LAST:event_btncKeyTyped

    private void txtcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyTyped
       char cTeclaPresionada=evt.getKeyChar();
      
    }//GEN-LAST:event_txtcodigoKeyTyped

    private void txtcodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigo1ActionPerformed

    private void txtcodigo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigo1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigo1KeyTyped

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
            java.util.logging.Logger.getLogger(nuevoDetalleR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevoDetalleR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevoDetalleR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevoDetalleR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevoDetalleR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnc;
    public static javax.swing.JTextField datefa;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JTextField txtcant;
    public static javax.swing.JTextField txtcodigo;
    public static javax.swing.JTextField txtcodigo1;
    public static javax.swing.JTextField txtdescripcion;
    public static javax.swing.JTextField txtimporteiva;
    public static javax.swing.JTextField txtip;
    public static javax.swing.JTextField txtiva;
    public static javax.swing.JTextField txtmarca;
    public static javax.swing.JTextField txtprec;
    public static javax.swing.JTextField txtsubtotal;
    public static javax.swing.JTextField txttotal;
    public static javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables

public void darcolor(){
    txtdescripcion.setBackground(new Color(255,255,153)); 
txtmarca.setBackground(new Color(255,255,153)); 
txtiva.setBackground(new Color(255,255,153)); 
txtimporteiva.setBackground(new Color(255,255,153)); 
txtcant.setBackground(new Color(255,255,153)); 
txttotal.setBackground(new Color(255,255,153)); 
}

public void quitarcolor(){
    txtdescripcion.setBackground(new Color(255,255,255)); 
txtmarca.setBackground(new Color(255,255,255)); 
txtiva.setBackground(new Color(255,255,255)); 
txtimporteiva.setBackground(new Color(255,255,255)); 
txtcant.setBackground(new Color(255,255,255)); 
txtprec.setBackground(new Color(255,255,255)); 
txttotal.setBackground(new Color(255,255,255)); 
}
public void enablefalse(){
    txtdescripcion.setEditable(false);
txtmarca.setEditable(false);
txtiva.setEditable(false);
txtimporteiva.setEditable(false);
txtcant.setEditable(false);
txtprec.setEditable(false);
txttotal.setEditable(false);
}

}