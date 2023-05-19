/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zapateria;

import java.awt.Image;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Hernandez
 */
public class Carrito extends javax.swing.JFrame {

    /**
     * Creates new form Carrito
     */
    String initialname = "";
    int tableRow = 0;

    public Carrito() {
        initComponents();
        this.setDefaultCloseOperation(2);
        this.setSize(915, 580);
        this.setLocationRelativeTo(this);
        btnderecha.setVisible(false);
        btnizquierda.setVisible(false);
        btnagregar.setVisible(false);
        btntotal.setVisible(false);
        // Crear una nueva lista

    }

    public void AjustarImagen(JLabel etiqueta, String ruta, String nombre) {
        ImageIcon img = new ImageIcon(getClass().getResource("/" + ruta + "/" + nombre));
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(etiqueta.getWidth(), etiqueta.getHeight(), Image.SCALE_DEFAULT));
        etiqueta.setIcon(icono);
        initialname = nombre;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        btnagregar = new javax.swing.JButton();
        lbimg = new javax.swing.JLabel();
        btnderecha = new javax.swing.JButton();
        btnizquierda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btntotal = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        btsm = new javax.swing.JMenuItem();
        zpsm = new javax.swing.JMenuItem();
        tnsm = new javax.swing.JMenuItem();
        hsm = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itembotashombre = new javax.swing.JMenuItem();
        itemzapatoshombre = new javax.swing.JMenuItem();
        itemtenishombre = new javax.swing.JMenuItem();
        itemhuarachesshombre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tabla1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 590, 460));

        btnagregar.setText("Agregar al carrito");
        btnagregar.setToolTipText("Agregar Calzado");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, 40));

        lbimg.setBackground(new java.awt.Color(255, 255, 255));
        lbimg.setText(" ");
        lbimg.setOpaque(true);
        jPanel1.add(lbimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 240, 160));

        btnderecha.setText(">");
        btnderecha.setToolTipText("Siguiente imagen");
        btnderecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnderechaMouseClicked(evt);
            }
        });
        btnderecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnderechaActionPerformed(evt);
            }
        });
        jPanel1.add(btnderecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 70, 40));

        btnizquierda.setText("<");
        btnizquierda.setToolTipText("Imagen Anterior");
        btnizquierda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnizquierdaItemStateChanged(evt);
            }
        });
        btnizquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnizquierdaActionPerformed(evt);
            }
        });
        jPanel1.add(btnizquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 70, 40));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selecione en Opciones");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 200, 30));

        btntotal.setText("Total");
        btntotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotalActionPerformed(evt);
            }
        });
        jPanel1.add(btntotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 110, 30));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Opciones");
        jMenu1.setToolTipText("Seleccione una opcion");

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/m.png"))); // NOI18N
        jMenu3.setText("Mujer");
        jMenu3.setToolTipText("Calzados de Mujer");

        btsm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btsm.setText("Botas");
        btsm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsmActionPerformed(evt);
            }
        });
        jMenu3.add(btsm);

        zpsm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        zpsm.setText("Zapatos");
        zpsm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zpsmMouseClicked(evt);
            }
        });
        zpsm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zpsmActionPerformed(evt);
            }
        });
        jMenu3.add(zpsm);

        tnsm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        tnsm.setText("Tenis");
        tnsm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnsmActionPerformed(evt);
            }
        });
        jMenu3.add(tnsm);

        hsm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        hsm.setText("Huaraches");
        hsm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hsmActionPerformed(evt);
            }
        });
        jMenu3.add(hsm);

        jMenu1.add(jMenu3);

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

        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btsmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsmActionPerformed
        AjustarImagen(lbimg, "imgs", "bm1.jpg");
        btnderecha.setVisible(true);
        btnizquierda.setVisible(true);
        btnagregar.setVisible(true);


    }//GEN-LAST:event_btsmActionPerformed

    private void zpsmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zpsmMouseClicked

    }//GEN-LAST:event_zpsmMouseClicked

    private void zpsmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zpsmActionPerformed
        AjustarImagen(lbimg, "imgs", "zm1.jpg");
        btnderecha.setVisible(true);
        btnizquierda.setVisible(true);
        btnagregar.setVisible(true);

    }//GEN-LAST:event_zpsmActionPerformed

    private void tnsmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnsmActionPerformed
        AjustarImagen(lbimg, "imgs", "tm1.jpg");
        btnderecha.setVisible(true);
        btnizquierda.setVisible(true);
        btnagregar.setVisible(true);
    }//GEN-LAST:event_tnsmActionPerformed

    private void hsmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hsmActionPerformed
        AjustarImagen(lbimg, "imgs", "hm1.jpg");
        btnderecha.setVisible(true);
        btnizquierda.setVisible(true);
        btnagregar.setVisible(true);
    }//GEN-LAST:event_hsmActionPerformed

    private void itembotashombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itembotashombreActionPerformed
        AjustarImagen(lbimg, "imgs", "bh1.jpg");
        btnderecha.setVisible(true);
        btnizquierda.setVisible(true);
        btnagregar.setVisible(true);
    }//GEN-LAST:event_itembotashombreActionPerformed

    private void itemzapatoshombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemzapatoshombreActionPerformed
        AjustarImagen(lbimg, "imgs", "zh1.jpg");
        btnderecha.setVisible(true);
        btnizquierda.setVisible(true);
        btnagregar.setVisible(true);
    }//GEN-LAST:event_itemzapatoshombreActionPerformed

    private void itemtenishombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemtenishombreActionPerformed
        AjustarImagen(lbimg, "imgs", "th1.jpg");
        btnderecha.setVisible(true);
        btnizquierda.setVisible(true);
        btnagregar.setVisible(true);
    }//GEN-LAST:event_itemtenishombreActionPerformed

    private void itemhuarachesshombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemhuarachesshombreActionPerformed
        AjustarImagen(lbimg, "imgs", "hh1.jpg");
        btnderecha.setVisible(true);
        btnizquierda.setVisible(true);
        btnagregar.setVisible(true);
    }//GEN-LAST:event_itemhuarachesshombreActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        if (tableRow == 0) {
            tabla1.setValueAt(initialname.substring(0, 3), 0, 0);
            tableRow += 1;

        } else {
            tabla1.setValueAt(initialname.substring(0, 3), tableRow, 0);
            tableRow += 1;
        }
        Random r = new Random();
        if (tableRow == 1) {
            tabla1.setValueAt("$ " + r.nextInt(1000) + ".00", 0, 1);

        } else {
            tabla1.setValueAt("$ " + r.nextInt(1000) + ".00", tableRow - 1, 1);

        }

        btnderecha.setVisible(false);
        btnizquierda.setVisible(false);
        btnagregar.setVisible(false);
        AjustarImagen(lbimg, "imgs", "");


    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnderechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnderechaActionPerformed

        String type = initialname.substring(0, 1);
        String gender = initialname.substring(1, 2);
        int position = Integer.parseInt(initialname.substring(2, 3));

        switch (gender) {
            case "h":
                switch (type) {
                    case "b":
                        position += 1;
                        AjustarImagen(lbimg, "imgs", "bh" + position + ".jpg");

                        break;
                    case "z":
                        position += 1;
                        AjustarImagen(lbimg, "imgs", "zh" + position + ".jpg");
                        break;
                    case "t":
                        position += 1;
                        AjustarImagen(lbimg, "imgs", "th" + position + ".jpg");
                        break;
                    case "h":
                        position += 1;
                        AjustarImagen(lbimg, "imgs", "hh" + position + ".jpg");
                        break;

                }
                break;
            case "m":
                switch (type) {
                    case "b":
                        position += 1;
                        AjustarImagen(lbimg, "imgs", "bm" + position + ".jpg");

                        break;
                    case "z":
                        position += 1;
                        AjustarImagen(lbimg, "imgs", "zm" + position + ".jpg");
                        break;
                    case "t":
                        position += 1;
                        AjustarImagen(lbimg, "imgs", "tm" + position + ".jpg");
                        break;
                    case "h":
                        position += 1;
                        AjustarImagen(lbimg, "imgs", "hm" + position + ".jpg");
                        break;

                }

                break;

        }


    }//GEN-LAST:event_btnderechaActionPerformed

    private void btnizquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnizquierdaActionPerformed

        String type = initialname.substring(0, 1);
        String gender = initialname.substring(1, 2);
        int position = Integer.parseInt(initialname.substring(2, 3));

        switch (gender) {
            case "h":
                switch (type) {
                    case "b":
                        position -= 1;
                        AjustarImagen(lbimg, "imgs", "bh" + position + ".jpg");

                        break;
                    case "z":
                        position -= 1;
                        AjustarImagen(lbimg, "imgs", "zh" + position + ".jpg");
                        break;
                    case "t":
                        position -= 1;
                        AjustarImagen(lbimg, "imgs", "th" + position + ".jpg");
                        break;
                    case "h":
                        position -= 1;
                        AjustarImagen(lbimg, "imgs", "hh" + position + ".jpg");
                        break;

                }
                break;
            case "m":
                switch (type) {
                    case "b":
                        position -= 1;
                        AjustarImagen(lbimg, "imgs", "bm" + position + ".jpg");

                        break;
                    case "z":
                        position -= 1;
                        AjustarImagen(lbimg, "imgs", "zm" + position + ".jpg");
                        break;
                    case "t":
                        position -= 1;
                        AjustarImagen(lbimg, "imgs", "tm" + position + ".jpg");
                        break;
                    case "h":
                        position -= 1;
                        AjustarImagen(lbimg, "imgs", "hm" + position + ".jpg");
                        break;

                }

                break;

        }

    }//GEN-LAST:event_btnizquierdaActionPerformed

    private void btnizquierdaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnizquierdaItemStateChanged
/////////////////////////////////////////////////////////////////////////////
    }//GEN-LAST:event_btnizquierdaItemStateChanged

    private void btnderechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnderechaMouseClicked


    }//GEN-LAST:event_btnderechaMouseClicked

    private void btntotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalActionPerformed
      //  int total = 0;
      //  Object x = new Object();
      //  for (int i = 0; i < tabla1.getRowCount(); i++) {
      //      x = tabla1.getValueAt(1, i);
      //      break;
            //total+= Integer.parseInt();
      //  }
      //  JOptionPane.showMessageDialog(null, "Su Total a Pagar es: " + x, "Titulo", JOptionPane.OK_OPTION);
    }//GEN-LAST:event_btntotalActionPerformed

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
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnderecha;
    private javax.swing.JButton btnizquierda;
    private javax.swing.JButton btntotal;
    private javax.swing.JMenuItem btsm;
    private javax.swing.JMenuItem hsm;
    private javax.swing.JMenuItem itembotashombre;
    private javax.swing.JMenuItem itemhuarachesshombre;
    private javax.swing.JMenuItem itemtenishombre;
    private javax.swing.JMenuItem itemzapatoshombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbimg;
    private javax.swing.JTable tabla1;
    private javax.swing.JMenuItem tnsm;
    private javax.swing.JMenuItem zpsm;
    // End of variables declaration//GEN-END:variables
}
