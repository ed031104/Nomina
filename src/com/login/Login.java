package com.login;

import com.menu.Menu;
import java.awt.Color;


public class Login extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    Controlador_ventana controlador = new Controlador_ventana();
    Menu ventanamenu = new Menu();
    public Login() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(this);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background_izquierdo = new javax.swing.JPanel();
        TxtInicio = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JLabel();
        NombreUsuario = new javax.swing.JTextField();
        TxtContraseña = new javax.swing.JLabel();
        Contraseña = new javax.swing.JPasswordField();
        BtnIngresar = new javax.swing.JPanel();
        TxtIngresar = new javax.swing.JLabel();
        Registrar = new javax.swing.JLabel();
        Background_derecho = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();
        TextoInicio = new javax.swing.JLabel();
        ImgInicio = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background_izquierdo.setBackground(new java.awt.Color(255, 153, 153));
        Background_izquierdo.setForeground(new java.awt.Color(255, 255, 255));
        Background_izquierdo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtInicio.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        TxtInicio.setForeground(new java.awt.Color(255, 255, 255));
        TxtInicio.setText(" INICIAR SECCION");
        Background_izquierdo.add(TxtInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        TxtUsuario.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        TxtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TxtUsuario.setText("USUARIO");
        Background_izquierdo.add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        NombreUsuario.setBackground(new java.awt.Color(255, 153, 153));
        NombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        NombreUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        NombreUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        NombreUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Background_izquierdo.add(NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 270, 30));

        TxtContraseña.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        TxtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        TxtContraseña.setText("CONTRASEÑA");
        Background_izquierdo.add(TxtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        Contraseña.setBackground(new java.awt.Color(255, 153, 153));
        Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Contraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Background_izquierdo.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 270, 30));

        BtnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        BtnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        TxtIngresar.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        TxtIngresar.setForeground(new java.awt.Color(255, 153, 153));
        TxtIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtIngresar.setText("INGRESAR");
        TxtIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TxtIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TxtIngresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtnIngresarLayout = new javax.swing.GroupLayout(BtnIngresar);
        BtnIngresar.setLayout(BtnIngresarLayout);
        BtnIngresarLayout.setHorizontalGroup(
            BtnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxtIngresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        BtnIngresarLayout.setVerticalGroup(
            BtnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnIngresarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TxtIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Background_izquierdo.add(BtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 210, 30));

        Registrar.setBackground(new java.awt.Color(204, 204, 204));
        Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Registrar.setText("¿No tienes cuenta?, registrate");
        Registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistrarMouseExited(evt);
            }
        });
        Background_izquierdo.add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        getContentPane().add(Background_izquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 399));

        Background_derecho.setBackground(new java.awt.Color(255, 255, 255));
        Background_derecho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        Exit.setForeground(new java.awt.Color(0, 0, 0));
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setText("X");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitMouseExited(evt);
            }
        });
        Background_derecho.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 30, 30));

        TextoInicio.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        TextoInicio.setForeground(new java.awt.Color(255, 153, 153));
        TextoInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoInicio.setText("SISTEMA CONTABLE");
        Background_derecho.add(TextoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 410, -1));

        ImgInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/IMG-20230818-WA0006 (1).jpg"))); // NOI18N
        ImgInicio.setText("jLabel9");
        Background_derecho.add(ImgInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 10, 560, 330));

        getContentPane().add(Background_derecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 0, 410, 399));

        Header.setBackground(new java.awt.Color(0, 0, 0));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
                                                                            //son los colores de las entradas y salidas de los botones
    private void TxtIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtIngresarMouseEntered
        TxtIngresar.setForeground(new Color(255,255,255));
       BtnIngresar.setBackground(new Color(255,102,102));
    }//GEN-LAST:event_TxtIngresarMouseEntered

    private void TxtIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtIngresarMouseExited
        BtnIngresar.setBackground(new Color(255,255,255));
        TxtIngresar.setForeground(new Color(255,153,153 ));
    }//GEN-LAST:event_TxtIngresarMouseExited

    private void RegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarMouseEntered
        Registrar.setForeground(new Color(255,102,102));
    }//GEN-LAST:event_RegistrarMouseEntered

    private void RegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarMouseExited
        Registrar.setForeground(new Color(255,255,255));

    }//GEN-LAST:event_RegistrarMouseExited

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
         int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);  //hace que centre la pestaña y no tenga problemas a la hora de moverse
    }//GEN-LAST:event_HeaderMouseDragged

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
             xMouse = evt.getX();  //hace que se pueda mover la pestaña a cualquier lado
             yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
        Exit.setForeground(Color.red);
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
        Exit.setForeground(Color.BLACK);
    }//GEN-LAST:event_ExitMouseExited

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
       System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarMouseClicked
        Registro Registro = new Registro();
        controlador.cambiarventana(Registro);
        this.dispose();
    }//GEN-LAST:event_RegistrarMouseClicked

    private void TxtIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtIngresarMouseClicked
        controlador.cambiarventana(ventanamenu);
    }//GEN-LAST:event_TxtIngresarMouseClicked
                                                                           // aqui terima los codigos para las entradas y salidas de los colores
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background_derecho;
    private javax.swing.JPanel Background_izquierdo;
    private javax.swing.JPanel BtnIngresar;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JLabel Exit;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel ImgInicio;
    private javax.swing.JTextField NombreUsuario;
    private javax.swing.JLabel Registrar;
    private javax.swing.JLabel TextoInicio;
    private javax.swing.JLabel TxtContraseña;
    private javax.swing.JLabel TxtIngresar;
    private javax.swing.JLabel TxtInicio;
    private javax.swing.JLabel TxtUsuario;
    // End of variables declaration//GEN-END:variables


}


