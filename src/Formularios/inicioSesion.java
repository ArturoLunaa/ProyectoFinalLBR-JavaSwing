/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import FiveCod.utils.FCMaterialColors;
import FiveCod.utils.FCMaterialImageFactory;
import FiveCodMaterialAnimation.FCMaterialUIMovement;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import Formularios.FORM_BIENVENIDA;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author artur
 */
public class inicioSesion extends javax.swing.JFrame {
    int mistake=0;
    /**
     * Creates new form inicioSesion
     */
    public inicioSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        inicializarBotones_colores();
    }
    
    private void inicializarBotones_colores() {
    //  jButton1  
        btnIngresar.setBackground(FCMaterialColors.GREEN_400);
        btnIngresar.setForeground(Color.WHITE);
        btnIngresar.addMouseListener(FCMaterialUIMovement.getMovement(btnIngresar,FCMaterialColors.GREEN_400));

        btnSalir.setBackground(FCMaterialColors.RED_400);
        btnSalir.setForeground(Color.WHITE);
        btnSalir.addMouseListener(FCMaterialUIMovement.getMovement(btnSalir,FCMaterialColors.BLUE_400));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("INICIAR SESI??N");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Usuario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 338, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Contrase??a:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("LBR KIKCZ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 344, 188, -1));

        btnIngresar.setText("Ingresar");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 123, 71));

        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 115, 71));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 188, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/plano.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 330, 120));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/logo.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 100, 110));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/jordan azul chico.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
       String user = "Arturo Luna";
       String pw = "1234";
       String user2 = "Emiliano Calzada";
       String pw2 = "1234";
       String user3 = "Luis Espinosa";
       String pw3 = "1234";
       String user4 = "Nataly";
       String pw4 = "1234";
       String usuario = txtUsuario.getText();
       String contra = txtPassword.getText();
       if(usuario.equals(user) && contra.equals(pw)){
           JOptionPane.showMessageDialog(null, "Bienvenido " + user,"Acceso correcto" , JOptionPane.INFORMATION_MESSAGE);
           FORM_BIENVENIDA bienvenida = new FORM_BIENVENIDA();
           bienvenida.setVisible(true);
       }else if (usuario.equals(user2) && contra.equals(pw2)){
           JOptionPane.showMessageDialog(null, "Bienvenido " + user2,"Acceso correcto" , JOptionPane.INFORMATION_MESSAGE);
           FORM_BIENVENIDA bienvenida = new FORM_BIENVENIDA();
           bienvenida.setVisible(true);
       }else if(usuario.equals(user3) && contra.equals(pw3)){
           JOptionPane.showMessageDialog(null, "Bienvenido " + user3,"Acceso correcto" , JOptionPane.INFORMATION_MESSAGE);
           FORM_BIENVENIDA bienvenida = new FORM_BIENVENIDA();
           bienvenida.setVisible(true);
       }else if(usuario.equals(user4) && contra.equals(pw4)){
           JOptionPane.showMessageDialog(null, "Bienvenido " + user4,"Acceso correcto" , JOptionPane.INFORMATION_MESSAGE);
           FORM_BIENVENIDA bienvenida = new FORM_BIENVENIDA();
           bienvenida.setVisible(true);
       } else{
           JOptionPane.showMessageDialog(null, "Usuario o contrase??a incorrectos", "Intente de nuevo", JOptionPane.WARNING_MESSAGE);
           txtUsuario.setText("");
           txtPassword.setText("");
           mistake++;
       }
       if(mistake==3){
           JOptionPane.showMessageDialog(null,"Se cerrar?? el programa" , "Pasaste n??mero de intentos", JOptionPane.WARNING_MESSAGE);
           this.dispose();
       }
    }//GEN-LAST:event_btnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
