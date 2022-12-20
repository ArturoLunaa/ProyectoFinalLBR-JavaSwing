/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import Clases.ConexionBD;
import FiveCod.utils.FCMaterialColors;
import FiveCod.utils.FCMaterialImageFactory;
import FiveCodMaterialAnimation.FCMaterialUIMovement;
import Formularios.Clientes;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Formularios.INVENTARIOS;
import java.awt.Color;
import javax.swing.ImageIcon;
/**
 *
 * @author artur
 */
public class ActualizarI extends javax.swing.JFrame {

    /**
     * Creates new form ActualizarI
     */
    public ActualizarI() {
        initComponents();
        inicializarBotones_colores();
    }

    private void inicializarBotones_colores() {
    //  jButton1  
    actualizar_inv.setBackground(FCMaterialColors.GREEN_400);
    actualizar_inv.setForeground(Color.WHITE);
    actualizar_inv.addMouseListener(FCMaterialUIMovement.getMovement(actualizar_inv,FCMaterialColors.GREEN_400));
    actualizar_inv.setIcon(new ImageIcon(FCMaterialImageFactory.getIstance().getImage(FCMaterialImageFactory.FLOPPY_DRIVE)));
    
    btnLimpiar.setBackground(FCMaterialColors.BLUE_400);
    btnLimpiar.setForeground(Color.WHITE);
    btnLimpiar.addMouseListener(FCMaterialUIMovement.getMovement(btnLimpiar,FCMaterialColors.GREEN_400));
    
    btnRegresar.setBackground(FCMaterialColors.BLUE_400);
    btnRegresar.setForeground(Color.WHITE);
    btnRegresar.addMouseListener(FCMaterialUIMovement.getMovement(btnRegresar,FCMaterialColors.GREEN_400));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AItxtMarca = new javax.swing.JTextField();
        AItxtTalla = new javax.swing.JTextField();
        actualizar_inv = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AItxtID = new javax.swing.JTextField();
        AItxtModelo = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        AItxtPrecio = new javax.swing.JTextField();
        AItxtStock = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(AItxtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 120, -1));
        getContentPane().add(AItxtTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 120, -1));

        actualizar_inv.setText("Actualizar inventario");
        actualizar_inv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        actualizar_inv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar_invActionPerformed(evt);
            }
        });
        getContentPane().add(actualizar_inv, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 220, 71));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ACTUALIZAR INVENTARIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 30, -1, -1));

        AItxtID.setEditable(false);
        getContentPane().add(AItxtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 120, -1));
        getContentPane().add(AItxtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 120, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, 100, 60));

        btnRegresar.setText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 570, 100, 58));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Modelo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Marca:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Talla:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Precio:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Stock:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));
        getContentPane().add(AItxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 120, -1));
        getContentPane().add(AItxtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 120, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/plano.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 260, 340));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/jordan azul chico.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizar_invActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar_invActionPerformed
        // TODO add your handling code here:
       try {
            ConexionBD Con = new ConexionBD();
            Con.ConectarBD();
            String id = AItxtID.getText();
            String mod = AItxtModelo.getText();
            String mar = AItxtMarca.getText();
            String talla = AItxtTalla.getText();
            String precio = AItxtPrecio.getText();
            String stock = AItxtStock.getText();
            //String formaPago = AVcbxFormaPago.getSelectedItem().toString();

            String SQL = "UPDATE inventario SET modelo='" + mod + "',marca='" + mar + "',talla='" + talla + "',"
                    + "precio='" + precio + "',stock='" + stock + "'"
                    + "WHERE id ='" + id + "'";
            Con.sentencia.execute(SQL);
            JOptionPane.showMessageDialog(null,
                    "¡Registro Actualizado con Éxito!");
            Con.DesconectarBD();
        } catch (SQLException ex) {
            Logger.getLogger(ActualizarV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_actualizar_invActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
            AItxtModelo.setText("");
            AItxtMarca.setText("");
            AItxtTalla.setText("");
            AItxtPrecio.setText("");
            AItxtStock.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        INVENTARIOS inventario = new INVENTARIOS();
        inventario.setVisible(true);
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ActualizarI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField AItxtID;
    public javax.swing.JTextField AItxtMarca;
    public javax.swing.JTextField AItxtModelo;
    public javax.swing.JTextField AItxtPrecio;
    public javax.swing.JTextField AItxtStock;
    public javax.swing.JTextField AItxtTalla;
    private javax.swing.JButton actualizar_inv;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
