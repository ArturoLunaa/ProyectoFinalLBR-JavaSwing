/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.ConexionBD;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.util.logging.PlatformLogger;
import sun.util.logging.PlatformLogger.Level;
import Formularios.FORM_BIENVENIDA;

// Importamos una libreria para hacer los botones mas esteticos
import FiveCod.utils.FCMaterialColors;
import FiveCod.utils.FCMaterialImageFactory;
import FiveCodLookAndFeelThemeV2.FiveCodMaterialLookAndFeel;
import FiveCodMaterialAnimation.FCMaterialUIMovement;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
/**
 *
 * @author artur
 */
public class Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public Clientes() {
        initComponents();
        Crear_Modelo();
        this.setLocationRelativeTo(null);
        inicializarBotones_colores();
    }

    private void inicializarBotones_colores() {
    //  jButton1  
    btnGuardar.setBackground(FCMaterialColors.GREEN_400);
    btnGuardar.setForeground(Color.WHITE);
    btnGuardar.addMouseListener(FCMaterialUIMovement.getMovement(btnGuardar,FCMaterialColors.GREEN_400));
    btnGuardar.setIcon(new ImageIcon(FCMaterialImageFactory.getIstance().getImage(FCMaterialImageFactory.FLOPPY_DRIVE)));
        //  jButton1  
    btnLimpiar.setBackground(FCMaterialColors.BLUE_400);
    btnLimpiar.setForeground(Color.WHITE);
    btnLimpiar.addMouseListener(FCMaterialUIMovement.getMovement(btnLimpiar,FCMaterialColors.GREEN_400));
    btnLimpiar.setIcon(new ImageIcon(FCMaterialImageFactory.getIstance().getImage(FCMaterialImageFactory.FLOPPY_DRIVE)));
        //  jButton1  
    btnConsultar.setBackground(FCMaterialColors.GREEN_400);
    btnConsultar.setForeground(Color.WHITE);
    btnConsultar.addMouseListener(FCMaterialUIMovement.getMovement(btnConsultar,FCMaterialColors.GREEN_400));
    btnConsultar.setIcon(new ImageIcon(FCMaterialImageFactory.getIstance().getImage(FCMaterialImageFactory.FLOPPY_DRIVE)));
        //  jButton1  
    btnActualizar.setBackground(FCMaterialColors.GREEN_400);
    btnActualizar.setForeground(Color.WHITE);
    btnActualizar.addMouseListener(FCMaterialUIMovement.getMovement(btnActualizar,FCMaterialColors.GREEN_400));
    btnActualizar.setIcon(new ImageIcon(FCMaterialImageFactory.getIstance().getImage(FCMaterialImageFactory.FLOPPY_DRIVE)));
        //  jButton1  
    btnEliminar.setBackground(FCMaterialColors.RED_400);
    btnEliminar.setForeground(Color.WHITE);
    btnEliminar.addMouseListener(FCMaterialUIMovement.getMovement(btnEliminar,FCMaterialColors.RED_400));
    btnEliminar.setIcon(new ImageIcon(FCMaterialImageFactory.getIstance().getImage(FCMaterialImageFactory.FLOPPY_DRIVE)));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Registros = new javax.swing.JTable();
        btnConsultar = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtNombres = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btn_RegresarC = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 136, 213, -1));

        Tabla_Registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabla_Registros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 73, 788, 486));

        btnConsultar.setText("Consultar");
        btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 594, -1, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 174, 213, -1));

        btnActualizar.setText("Actualizar");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 594, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(989, 594, -1, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 212, 213, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estado:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));
        getContentPane().add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 252, 215, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombres:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellidos:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Correo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tel??fono:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 291, 213, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Direcci??n:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Gesti??n de Clientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 11, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 348, -1, -1));
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 213, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 348, -1, -1));
        getContentPane().add(btn_RegresarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 0, 0, 700));

        btnRegresar.setText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/plano.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 320, 250));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/fondo jordan azul.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        ConexionBD Con = new ConexionBD();
        Con.ConectarBD();
        String nom, ape, tel, dir, edo, correo;
        nom = txtNombres.getText();
        ape = txtApellidos.getText();
        tel = txtTelefono.getText();
        dir = txtDireccion.getText();
        edo = txtEstado.getText();
        correo = txtCorreo.getText();
            if (!nom.isEmpty()) {
                if (!ape.isEmpty()) {
                    if (!tel.isEmpty()) {
                        if (!dir.isEmpty()) {
                            if (!edo.isEmpty()) {
                                if (!correo.isEmpty()) {
                                        try {
                                            String SQL = "INSERT INTO clientes"
                                                    + "(nombres,apellidos,telefono,direccion,estado,correo)"
                                                    + " VALUES "
                                                    + "('" + nom + "','" + ape + "','" + tel + "','" + dir + "','" + edo + "','" + correo + "');";
                                            Con.sentencia.execute(SQL);
                                            JOptionPane.showMessageDialog(null, "??Los datos fueron guardados con ??xito!");
                                        } catch (SQLException ex) {
                                            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                                        }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Por favor ingrese el estado");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Por favor ingrese el motivo de ingreso");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Por favor ingrese la direcci??n");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor ingrese el tel??fono");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese los apellidos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre");
        }
        Con.DesconectarBD();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
       Consultar();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String ID = Tabla_Registros.getValueAt(Tabla_Registros.getSelectedRow(), 0).toString();
        String nom = Tabla_Registros.getValueAt(Tabla_Registros.getSelectedRow(), 1).toString();
        String ape = Tabla_Registros.getValueAt(Tabla_Registros.getSelectedRow(), 2).toString();
        String tel = Tabla_Registros.getValueAt(Tabla_Registros.getSelectedRow(), 3).toString();
        String dir = Tabla_Registros.getValueAt(Tabla_Registros.getSelectedRow(), 4).toString();
        String edo = Tabla_Registros.getValueAt(Tabla_Registros.getSelectedRow(), 5).toString();
        String correo = Tabla_Registros.getValueAt(Tabla_Registros.getSelectedRow(), 6).toString();
        ActualizarC Act = new ActualizarC(null, true);
        Act.ACtxtID.setText(ID);
        Act.ACtxtNombre.setText(nom);
        Act.ACtxtApellidos.setText(ape);
        Act.ACtxtTelefono.setText(tel);
        Act.ACtxtDireccion.setText(dir);
        Act.ACtxtEstado.setText(edo);
        Act.ACtxtCorreo.setText(correo);
        Act.setVisible(true);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       try{
            String ID = Tabla_Registros.getValueAt(Tabla_Registros.getSelectedRow(), 0).toString();
            ConexionBD Con = new ConexionBD();
            Con.ConectarBD();;
            String SQL = "DELETE FROM clientes WHERE id='"+ID+"'";
            Con.sentencia.execute(SQL);
            JOptionPane.showMessageDialog(null, "??El registro fue eliminado!");
            Con.DesconectarBD();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombres.setText("");
        txtApellidos.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtEstado.setText("");
        txtCorreo.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        FORM_BIENVENIDA bienvenida = new FORM_BIENVENIDA();
        bienvenida.setVisible(true);
        
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            UIManager.setLookAndFeel(new FiveCodMaterialLookAndFeel());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FORM_BIENVENIDA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }
     //CONSULTAR REGISTROS 
    DefaultTableModel modelo;

    private void Crear_Modelo() {
        try {
            modelo = (new DefaultTableModel(
                    null, new String[]{
                         "ID", "Nombres", "Apellidos", "Telefono",
                        "Direcci??n", "Estado", "Correo"}) {
                Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class,
                    java.lang.String.class, java.lang.String.class,
                    java.lang.String.class, java.lang.String.class,
                    java.lang.String.class,
                };
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false};

                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int colIndex) {
                    return canEdit[colIndex];
                }
            });
            Tabla_Registros.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString() + "Error");
        }
    }

    private void Consultar() {
        try {
            int i = 0;
            Object Ob[] = null;
            ConexionBD Con = new ConexionBD();
            Con.ConectarBD();
            String SQL = "SELECT * FROM clientes";
            Con.resultado = Con.sentencia.executeQuery(SQL);
            while (Con.resultado.next()) {
                modelo.addRow(Ob);
                modelo.setValueAt(Con.resultado.getString("id"), i, 0);
                modelo.setValueAt(Con.resultado.getString("nombres"), i, 1);
                modelo.setValueAt(Con.resultado.getString("apellidos"), i, 2);
                modelo.setValueAt(Con.resultado.getString("telefono"), i, 3);
                modelo.setValueAt(Con.resultado.getString("direccion"), i, 4);
                modelo.setValueAt(Con.resultado.getString("estado"), i, 5);
                modelo.setValueAt(Con.resultado.getString("correo"), i, 6);
                i++;
            }
            Con.DesconectarBD();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_Registros;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel btn_RegresarC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
