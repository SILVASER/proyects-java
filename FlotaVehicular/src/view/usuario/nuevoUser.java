/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.usuario;

import Modelo.Dao;
import Modelo.Rol;
import Modelo.Usuarios;
import Utilidades.Utilidades;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import view.Login;
import static view.usuario.RegisUsuarios.tableUsuarios;

/**
 *
 * @author Dani
 */
public class nuevoUser extends javax.swing.JFrame {

    /**
     * Creates new form nuevoUsuario
     */
    Dao dao = new Dao();
    boolean nuevo = false;
    Date fecha = new Date();

    String resultado = "", Activo = "", Admin = "";
    static Login is;
    String ip;
    String nombreUser = Login.txtusuario.getText();

    public nuevoUser() {
        initComponents();
        darcolor();
        this.setIconImage(new ImageIcon(getClass().getResource("/images/edit-copy.png")).getImage());

        try {
            ip = InetAddress.getLocalHost().getHostAddress() + " - " + InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException ex) {
            Logger.getLogger(nuevoUser.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.setTitle("Registrar empleado. " + nombreUser + "@ServiciosGeneralesViviana " + "[{" + ip + "}]");

        dao.listarRol(cbrol);

//        txtfechactual.setText(Utilidades.formatDate(fecha));
        txtfecha.setText(Utilidades.formatDate(fecha));
        try {
            txtip.setText(InetAddress.getLocalHost().getHostAddress() + " - " + InetAddress.getLocalHost().getHostName());
        } catch (UnknownHostException ex) {
            Logger.getLogger(nuevoUser.class.getName()).log(Level.SEVERE, null, ex);
        }

        txtuser.setText(nombreUser);
        ckadmin.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtemail = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        txtuser = new javax.swing.JTextField();
        txtip = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ckactivo = new javax.swing.JCheckBox();
        cbrol = new javax.swing.JComboBox<>();
        txtnombres = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JTextField();
        txtnombreUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbcodigo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ckadmin = new javax.swing.JCheckBox();
        txtnd = new javax.swing.JTextField();
        txtide = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jdfechaingreso = new com.toedter.calendar.JDateChooser();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtemailKeyTyped(evt);
            }
        });

        txtfecha.setEditable(false);

        txtuser.setEditable(false);

        txtip.setEditable(false);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/applications-system.png"))); // NOI18N
        jButton9.setText("Grabar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jButton9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton9KeyTyped(evt);
            }
        });

        jLabel12.setText("Ip");

        jLabel11.setText("User");

        jLabel10.setText("Fecha Actualización");

        jLabel9.setText("Fecha Ingreso");

        jLabel8.setText("Email");

        ckactivo.setSelected(true);
        ckactivo.setText("Activo");

        cbrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbrolActionPerformed(evt);
            }
        });
        cbrol.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbrolFocusGained(evt);
            }
        });
        cbrol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbrolKeyTyped(evt);
            }
        });

        txtnombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombresActionPerformed(evt);
            }
        });
        txtnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnombresKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombresKeyTyped(evt);
            }
        });

        txtcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraseñaActionPerformed(evt);
            }
        });
        txtcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontraseñaKeyTyped(evt);
            }
        });

        txtnombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreUsuarioActionPerformed(evt);
            }
        });
        txtnombreUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnombreUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreUsuarioKeyTyped(evt);
            }
        });

        jLabel1.setText("Nombre de usuario");

        jLabel2.setText("Contraseña");

        jLabel5.setText("N° de Documento");

        jLabel6.setText("Nombres");

        jLabel7.setText("Rol");

        cbcodigo.setEnabled(false);
        cbcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcodigoActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("* máximo 8 caracteres");

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("* máximo 15 caracteres");

        ckadmin.setSelected(true);
        ckadmin.setText("Administrador");

        txtnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtndActionPerformed(evt);
            }
        });
        txtnd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtndKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtndKeyTyped(evt);
            }
        });

        txtide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtideActionPerformed(evt);
            }
        });
        txtide.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtideKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtideKeyTyped(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/system-users.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ckactivo)
                                    .addGap(18, 18, 18)
                                    .addComponent(ckadmin))
                                .addComponent(txtnombres)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(cbcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbrol, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtnd, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtide, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdfechaingreso, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(txtip)
                    .addComponent(txtuser, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtfecha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtemail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jdfechaingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(txtip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jButton9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtcontraseña, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jButton2)
                        .addComponent(txtide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtnd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbrol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckactivo)
                    .addComponent(ckadmin))
                .addGap(78, 78, 78))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Usuarios u = new Usuarios();
        
        if (txtnombreUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un nombre de usuario de ocho digitos");
            txtnombreUsuario.grabFocus();
            return;
        }
        if (txtcontraseña.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar una contraseña");
            txtcontraseña.grabFocus();
            return;
        }

        if (txtnd.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar el documento de identidad");
            txtnd.grabFocus();
            return;
        }

        if (jdfechaingreso.getDate() == null) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar una fecha de ingreso");
            jdfechaingreso.grabFocus();
            return;
        }

        u.setUsername(txtnombreUsuario.getText());
        System.out.println(txtnombreUsuario.getText());
        u.setPassword(txtcontraseña.getText());
                System.out.println(txtcontraseña.getText());

        u.setNumdoc(txtnd.getText());
          System.out.println(txtnd.getText());
        
        u.setIde(txtide.getText());
          System.out.println(txtide.getText());
        u.setNombres(txtnombres.getText());
          System.out.println(txtnombres.getText());
        u.setEmail(txtemail.getText());
          System.out.println(txtemail.getText());

        if (ckactivo.isSelected()) {
            Activo = "1";
        } else {  
            Activo = "0";
        }

        u.setEsactivo(Activo);

          System.out.println(Activo);
        if (ckadmin.isSelected()) {
            Admin = "1";
        } else {
            Admin = "0";
        }
        u.setEsadmin(Admin);
          System.out.println(Admin);
        
//INSERT INTO USUARIOS (USERNAME,PASSWORD,NUMDOC,IDEMPLEADO,NOMBRES,EMAIL,ESACTIVO,ESADMIN,IDROL,FECHAC,FECHAM,NOMUSUM,IP) 
                
        u.setRol(cbcodigo.getSelectedItem().toString());
          System.out.println(cbcodigo.getSelectedItem().toString());
        u.setFechac(Utilidades.formatDate(jdfechaingreso.getDate()));
        System.out.println(Utilidades.formatDate(jdfechaingreso.getDate()));
        u.setFecham(txtfecha.getText());
        System.out.println(txtfecha.getText());
        u.setNomusum(txtuser.getText());
        System.out.println(txtuser.getText());
        
        u.setIp(txtip.getText());
        System.out.println(txtip.getText());

        nuevo = true;

        if (nuevo) {
            if (dao.existenumdoc(txtnd.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Ya existe numero de documento");
                return;
            }
        }

        if (nuevo) {
            resultado = dao.GuardarUsuario(u);
            JOptionPane.showMessageDialog(rootPane, resultado);
            quitarColor();
            dao.mostrarUsuarios("", "", "", "");
            tableUsuarios.setRowSelectionInterval(0, 0);
        }
        
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void cbrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbrolActionPerformed
        Rol r = (Rol) cbrol.getSelectedItem();
        String id = r.getIdrol();
        dao.listarIdrol(cbcodigo, id);
    }//GEN-LAST:event_cbrolActionPerformed

    private void txtnombreUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreUsuarioKeyTyped
        if (txtnombreUsuario.getText().length() == 8) {
            evt.consume();
        }

        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            txtcontraseña.grabFocus();
        }

        cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_txtnombreUsuarioKeyTyped

    private void txtcontraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraseñaKeyTyped
        if (txtcontraseña.getText().length() == 15) {
            evt.consume();
        }

        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            txtnd.grabFocus();
        }

        cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_txtcontraseñaKeyTyped

    private void cbcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcodigoActionPerformed
        if (cbcodigo.getSelectedItem().equals("1")) {
            ckadmin.setSelected(true);
        } else {
            ckadmin.setSelected(false);
        }
    }//GEN-LAST:event_cbcodigoActionPerformed

    private void txtnombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreUsuarioActionPerformed


    }//GEN-LAST:event_txtnombreUsuarioActionPerformed

    private void txtnombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombresActionPerformed
        String cadena = (txtnombres.getText()).toUpperCase();
        txtnombres.setText(cadena);
    }//GEN-LAST:event_txtnombresActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed

    }//GEN-LAST:event_txtemailActionPerformed

    private void txtnombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyTyped
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            cbrol.grabFocus();
        }

        cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_txtnombresKeyTyped

    private void txtemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyTyped
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            jButton9.grabFocus();
        }

        cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_txtemailKeyTyped

    private void jButton9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton9KeyTyped
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            jButton9.doClick();
        }

        cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_jButton9KeyTyped

    private void txtcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontraseñaActionPerformed

    private void txtnombreUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreUsuarioKeyReleased
        String cadena = (txtnombreUsuario.getText()).toUpperCase();
        txtnombreUsuario.setText(cadena);
    }//GEN-LAST:event_txtnombreUsuarioKeyReleased

    private void txtnombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyReleased
        String cadena = (txtnombres.getText()).toUpperCase();
        txtnombres.setText(cadena);
    }//GEN-LAST:event_txtnombresKeyReleased

    private void cbrolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbrolKeyTyped
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            txtemail.grabFocus();

        }

        cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_cbrolKeyTyped

    private void cbrolFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbrolFocusGained
        cbrol.showPopup();
    }//GEN-LAST:event_cbrolFocusGained

    private void txtndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtndActionPerformed

    private void txtndKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtndKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtndKeyReleased

    private void txtndKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtndKeyTyped
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {

            String nd = txtnd.getText();

            String idempleado = dao.getIdEmpleado(nd);

            if (idempleado.equals("no existe")) {
                JOptionPane.showMessageDialog(null, "El N° de documento no existe");
                txtnd.grabFocus();
                return;
            }
            txtide.setText(idempleado);
            txtnombres.grabFocus();

        }

        cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_txtndKeyTyped

    private void txtideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtideActionPerformed

    private void txtideKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtideKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtideKeyReleased

    private void txtideKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtideKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtideKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        buscarUsu bu=new buscarUsu();
        bu.setVisible(true);
        bu.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(nuevoUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevoUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevoUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevoUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevoUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbcodigo;
    public static javax.swing.JComboBox<String> cbrol;
    public static javax.swing.JCheckBox ckactivo;
    private javax.swing.JCheckBox ckadmin;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser jdfechaingreso;
    public static javax.swing.JTextField txtcontraseña;
    public static javax.swing.JTextField txtemail;
    public static javax.swing.JTextField txtfecha;
    public static javax.swing.JTextField txtide;
    public static javax.swing.JTextField txtip;
    public static javax.swing.JTextField txtnd;
    public static javax.swing.JTextField txtnombreUsuario;
    public static javax.swing.JTextField txtnombres;
    public static javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
public void darcolor() {
        txtnombreUsuario.setBackground(new Color(255, 255, 153));
        txtcontraseña.setBackground(new Color(255, 255, 153));
        txtnd.setBackground(new Color(255, 255, 153));
        txtide.setBackground(new Color(255, 255, 153));
        txtnombres.setBackground(new Color(255, 255, 153));
        txtemail.setBackground(new Color(255, 255, 153));
        cbrol.setBackground(new Color(255, 255, 153));
    }

    public void quitarColor() {
        txtnombreUsuario.setBackground(new Color(255, 255, 255));
        txtcontraseña.setBackground(new Color(255, 255, 255));
        txtnd.setBackground(new Color(255, 255, 255));
        txtide.setBackground(new Color(255, 255, 255));
        txtnombres.setBackground(new Color(255, 255, 255));
        txtemail.setBackground(new Color(255, 255, 255));
        cbrol.setBackground(new Color(255, 255, 255));
    }

}
