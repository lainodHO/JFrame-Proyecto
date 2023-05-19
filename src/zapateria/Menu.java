/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zapateria;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Daniel Hernandez
 */
public class Menu extends javax.swing.JFrame {

   Carrito crr=new Carrito();
    public Menu() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
         AjustarImagen(lb1, "imgs", "a1.jpg");
         AjustarImagen(lb2, "imgs", "a2.jpg");
        AjustarImagen(lb3, "imgs", "a3.jpg");
        AjustarImagen(lb4, "imgs", "a4.png");
        AjustarImagen(lb5, "imgs", "a5.jpg");
        AjustarImagen(lb6, "imgs", "a6.png");
        AjustarImagen(lb7, "imgs", "a7.jpg");
        AjustarImagen(lb8, "imgs", "a8.jpg");
    }

   public void AjustarImagen(JLabel etiqueta,String ruta,String nombre){
    ImageIcon img =new ImageIcon(getClass().getResource("/"+ruta+"/"+nombre));
    Icon icono=new ImageIcon(img.getImage().getScaledInstance(etiqueta.getWidth(), etiqueta.getHeight(), Image.SCALE_DEFAULT));
    etiqueta.setIcon(icono);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemmenusalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        botasmujer = new javax.swing.JMenuItem();
        zapatosmujer = new javax.swing.JMenuItem();
        tenismujer = new javax.swing.JMenuItem();
        guarachesmujer = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itembotashombre = new javax.swing.JMenuItem();
        itemzapatoshombre = new javax.swing.JMenuItem();
        itemtenishombre = new javax.swing.JMenuItem();
        itemhuarachesshombre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 36)); // NOI18N
        jLabel1.setText("La Zapateria Del Zapatero");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 530, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1580, 60));

        lb2.setText(" ");
        lb2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 70, 210, 140));

        lb1.setText(" ");
        lb1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 210, 140));

        lb3.setText(" ");
        lb3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 210, 140));

        lb4.setText(" ");
        lb4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 210, 140));

        lb5.setText(" ");
        lb5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 210, 140));

        lb6.setText(" ");
        lb6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 280, 210, 140));

        lb7.setText(" ");
        lb7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 210, 140));

        lb8.setText(" ");
        lb8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 480, 210, 140));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Visitar Carrito");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setOpaque(true);
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 250, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Carrito.png"))); // NOI18N
        jButton1.setText(" ");
        jButton1.setToolTipText("Agregar Cosas al carrito");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 120, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 370, 180));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Opciones");

        itemmenusalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemmenusalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/salir.png"))); // NOI18N
        itemmenusalir.setText("Salir");
        itemmenusalir.setToolTipText("Salir del sistema");
        itemmenusalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemmenusalirActionPerformed(evt);
            }
        });
        jMenu1.add(itemmenusalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Calzado");
        jMenu2.setToolTipText("Seleccione una Publicidad");

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/m.png"))); // NOI18N
        jMenu3.setText("Mujer");
        jMenu3.setToolTipText("Calzados de Mujer");

        botasmujer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        botasmujer.setText("Botas");
        botasmujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botasmujerActionPerformed(evt);
            }
        });
        jMenu3.add(botasmujer);

        zapatosmujer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        zapatosmujer.setText("Zapatos");
        zapatosmujer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zapatosmujerMouseClicked(evt);
            }
        });
        zapatosmujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zapatosmujerActionPerformed(evt);
            }
        });
        jMenu3.add(zapatosmujer);

        tenismujer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        tenismujer.setText("Tenis");
        tenismujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenismujerActionPerformed(evt);
            }
        });
        jMenu3.add(tenismujer);

        guarachesmujer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        guarachesmujer.setText("Huaraches");
        guarachesmujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guarachesmujerActionPerformed(evt);
            }
        });
        jMenu3.add(guarachesmujer);

        jMenu2.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/h.png"))); // NOI18N
        jMenu4.setText("Hombre");
        jMenu4.setToolTipText("Calzados de Hombre");

        itembotashombre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itembotashombre.setText("Botas");
        itembotashombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itembotashombreActionPerformed(evt);
            }
        });
        jMenu4.add(itembotashombre);

        itemzapatoshombre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itemzapatoshombre.setText("Zapatos");
        itemzapatoshombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemzapatoshombreActionPerformed(evt);
            }
        });
        jMenu4.add(itemzapatoshombre);

        itemtenishombre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itemtenishombre.setText("Tenis");
        itemtenishombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemtenishombreActionPerformed(evt);
            }
        });
        jMenu4.add(itemtenishombre);

        itemhuarachesshombre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itemhuarachesshombre.setText("Huaraches");
        itemhuarachesshombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemhuarachesshombreActionPerformed(evt);
            }
        });
        jMenu4.add(itemhuarachesshombre);

        jMenu2.add(jMenu4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemmenusalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemmenusalirActionPerformed
         System.exit(0);
    }//GEN-LAST:event_itemmenusalirActionPerformed

    private void guarachesmujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guarachesmujerActionPerformed
        AjustarImagen(lb1, "imgs", "hm1.jpg");
        AjustarImagen(lb2, "imgs", "hm2.jpg");
        AjustarImagen(lb3, "imgs", "hm3.jpg");
        AjustarImagen(lb4, "imgs", "hm4.jpg");
        AjustarImagen(lb5, "imgs", "hm5.jpg");
        AjustarImagen(lb6, "imgs", "hm6.jpg");
        AjustarImagen(lb7, "imgs", "hm7.jpg");
        AjustarImagen(lb8, "imgs", "hm8.jpg");
    }//GEN-LAST:event_guarachesmujerActionPerformed

    private void tenismujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenismujerActionPerformed
        AjustarImagen(lb1, "imgs", "tm1.jpg");
        AjustarImagen(lb2, "imgs", "tm2.jpg");
        AjustarImagen(lb3, "imgs", "tm3.jpg");
        AjustarImagen(lb4, "imgs", "tm4.jpg");
        AjustarImagen(lb5, "imgs", "tm5.jpg");
        AjustarImagen(lb6, "imgs", "tm6.jpg");
        AjustarImagen(lb7, "imgs", "tm7.jpg");
        AjustarImagen(lb8, "imgs", "tm8.jpg");
    }//GEN-LAST:event_tenismujerActionPerformed

    private void zapatosmujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zapatosmujerActionPerformed
        AjustarImagen(lb1, "imgs", "zm1.jpg");
        AjustarImagen(lb2, "imgs", "zm2.jpg");
        AjustarImagen(lb3, "imgs", "zm3.jpg");
        AjustarImagen(lb4, "imgs", "zm4.jpg");
        AjustarImagen(lb5, "imgs", "zm5.jpg");
        AjustarImagen(lb6, "imgs", "zm6.jpg");
        AjustarImagen(lb7, "imgs", "zm7.jpg");
        AjustarImagen(lb8, "imgs", "zm8.jpg");
    }//GEN-LAST:event_zapatosmujerActionPerformed

    private void zapatosmujerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zapatosmujerMouseClicked

    }//GEN-LAST:event_zapatosmujerMouseClicked

    private void botasmujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botasmujerActionPerformed
        AjustarImagen(lb1, "imgs", "bm1.jpg");
        AjustarImagen(lb2, "imgs", "bm2.jpg");
        AjustarImagen(lb3, "imgs", "bm3.jpg");
        AjustarImagen(lb4, "imgs", "bm4.jpg");
        AjustarImagen(lb5, "imgs", "bm5.jpg");
        AjustarImagen(lb6, "imgs", "bm6.jpg");
        AjustarImagen(lb7, "imgs", "bm7.jpg");
        AjustarImagen(lb8, "imgs", "bm8.jpg");
    }//GEN-LAST:event_botasmujerActionPerformed

    private void itembotashombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itembotashombreActionPerformed
        AjustarImagen(lb1, "imgs", "bh1.jpg");
        AjustarImagen(lb2, "imgs", "bh2.jpg");
        AjustarImagen(lb3, "imgs", "bh3.jpg");
        AjustarImagen(lb4, "imgs", "bh4.jpg");
        AjustarImagen(lb5, "imgs", "bh5.jpg");
        AjustarImagen(lb6, "imgs", "bh6.jpg");
        AjustarImagen(lb7, "imgs", "bh7.jpg");
        AjustarImagen(lb8, "imgs", "bh8.jpg");
    }//GEN-LAST:event_itembotashombreActionPerformed

    private void itemzapatoshombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemzapatoshombreActionPerformed
         AjustarImagen(lb1, "imgs","zh1.jpg");
        AjustarImagen(lb2, "imgs", "zh2.jpg");
        AjustarImagen(lb3, "imgs", "zh3.jpg");
        AjustarImagen(lb4, "imgs", "zh4.jpg");
        AjustarImagen(lb5, "imgs", "zh5.jpg");
        AjustarImagen(lb6, "imgs", "zh6.jpg");
        AjustarImagen(lb7, "imgs", "zh7.jpg");
        AjustarImagen(lb8, "imgs", "zh8.jpg");
    }//GEN-LAST:event_itemzapatoshombreActionPerformed

    private void itemtenishombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemtenishombreActionPerformed
        AjustarImagen(lb1, "imgs", "th1.jpg");
        AjustarImagen(lb2, "imgs", "th2.jpg");
        AjustarImagen(lb3, "imgs", "th3.jpg");
        AjustarImagen(lb4, "imgs", "th4.jpg");
        AjustarImagen(lb5, "imgs", "th5.jpg");
        AjustarImagen(lb6, "imgs", "th6.jpg");
        AjustarImagen(lb7, "imgs", "th7.jpg");
        AjustarImagen(lb8, "imgs", "th8.jpg");
    }//GEN-LAST:event_itemtenishombreActionPerformed

    private void itemhuarachesshombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemhuarachesshombreActionPerformed
          AjustarImagen(lb1,"imgs","hh1.jpg");
        AjustarImagen(lb2, "imgs", "hh2.jpg");
        AjustarImagen(lb3, "imgs", "hh3.jpg");
        AjustarImagen(lb4, "imgs", "hh4.jpg");
        AjustarImagen(lb5, "imgs", "hh5.jpg");
        AjustarImagen(lb6, "imgs", "hh6.jpg");
        AjustarImagen(lb7, "imgs", "hh7.jpg");
        AjustarImagen(lb8, "imgs", "hh8.jpg");
    }//GEN-LAST:event_itemhuarachesshombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       crr.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem botasmujer;
    private javax.swing.JMenuItem guarachesmujer;
    private javax.swing.JMenuItem itembotashombre;
    private javax.swing.JMenuItem itemhuarachesshombre;
    private javax.swing.JMenuItem itemmenusalir;
    private javax.swing.JMenuItem itemtenishombre;
    private javax.swing.JMenuItem itemzapatoshombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JMenuItem tenismujer;
    private javax.swing.JMenuItem zapatosmujer;
    // End of variables declaration//GEN-END:variables
}
