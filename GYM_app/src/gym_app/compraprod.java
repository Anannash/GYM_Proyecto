/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gym_app;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent; 
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

/**
 *
<<<<<<< HEAD
 * @author ANDREA MORALES CHAVEZ                  
=======
 * @author ANDREA MORALES CHAVEZ uuyuy jjjggh
>>>>>>> origin/Andrea
 */
public class compraprod extends javax.swing.JFrame {

    /**
     * Creates new form Rutinas
     */
    public compraprod() throws FontFormatException, IOException {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);

        /*IMAGENES*/
       /*
        Document doc = imctxt.getDocument();
        doc.addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                actualizarImagen();
                System.out.println("Insert");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                actualizarImagen();
                System.out.println("Eliminar");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                actualizarImagen();
                System.out.println("Cambio");
            }

            public void actualizarImagen() {
                try {
                    // Obtener el valor como un número

                    double imc = Double.parseDouble(imctxt.getText());

                    // Determinar qué imagen mostrar según el valor ingresado
                    ImageIcon imagen;
                    if (imc < 18.5) {
                        imagen = new ImageIcon("src/Image/1azul.png");
                        System.out.println("Inserto 1");
                    } else if (imc <= 24.9) {
                        imagen = new ImageIcon("src/Image/2Verde.png");
                        System.out.println("Inserto 2");
                    } else if (imc <= 29.9) {
                        imagen = new ImageIcon("src/Image/3Amarillo.png");
                        System.out.println("Inserto 3");
                    } else if (imc <= 34.9) {
                        imagen = new ImageIcon("src/Image/4Naranja.png");
                        System.out.println("Inserto 4");
                    } else if (imc <= 39.9) {
                        imagen = new ImageIcon("src/Image/5Anaranjado.png");
                        System.out.println("Inserto 5");
                    } else {
                        imagen = new ImageIcon("src/Image/6Rojo.png");
                        System.out.println("Inserto 6");
                    }

                    // Establecer la imagen en el JLabel
                    LabelIMC.setIcon(imagen);
                } catch (NumberFormatException ex) {
                    // En caso de que el texto no sea un número válido, no se actualiza la imagen
                    LabelIMC.setIcon(null);
                    System.out.println(ex);
                }
            }
        });*/

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fechatxt = new javax.swing.JTextField();
        noControltxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Lcliente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Lcliente2 = new javax.swing.JLabel();
        arttxt = new javax.swing.JTextField();
        buscartbtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        articulosarea = new javax.swing.JTextArea();
        totaltxt = new javax.swing.JTextField();
        añadirbtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        compratxt = new javax.swing.JTextArea();
        Lcliente1 = new javax.swing.JLabel();
        Lcliente4 = new javax.swing.JLabel();
        Lcliente5 = new javax.swing.JLabel();
        Lcliente6 = new javax.swing.JLabel();
        articuloctxt = new javax.swing.JTextField();
        Lcliente3 = new javax.swing.JLabel();
        confirmarbtn = new javax.swing.JButton();
        provtxt = new javax.swing.JTextField();
        buscarprovbtn = new javax.swing.JButton();
        Lcliente7 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(244, 246, 248));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(MAXIMIZED_BOTH);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Compra proveedores");

        fechatxt.setEditable(false);
        fechatxt.setBackground(new java.awt.Color(204, 204, 204));
        fechatxt.setText("09/10/2024");
        fechatxt.setCaretColor(new java.awt.Color(153, 153, 153));
        fechatxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        noControltxt.setEditable(false);
        noControltxt.setBackground(new java.awt.Color(204, 204, 204));
        noControltxt.setText("21550747");
        noControltxt.setCaretColor(new java.awt.Color(153, 153, 153));
        noControltxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(noControltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(fechatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fechatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noControltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lcliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(Lcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Lcliente2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Lcliente2.setText("Artículo a comprar");
        jPanel1.add(Lcliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        arttxt.setBackground(new java.awt.Color(204, 204, 204));
        arttxt.setCaretColor(new java.awt.Color(153, 153, 153));
        arttxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(arttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 210, -1));

        buscartbtn.setFont(new java.awt.Font("Bahnschrift", 1, 13)); // NOI18N
        buscartbtn.setText("Buscar por articulo");
        buscartbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscartbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscartbtnActionPerformed(evt);
            }
        });
        jPanel1.add(buscartbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 170, -1));

        articulosarea.setColumns(20);
        articulosarea.setRows(5);
        jScrollPane2.setViewportView(articulosarea);

        totaltxt.setEditable(false);
        totaltxt.setBackground(new java.awt.Color(204, 204, 204));
        totaltxt.setCaretColor(new java.awt.Color(153, 153, 153));
        totaltxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        añadirbtn.setFont(new java.awt.Font("Bahnschrift", 1, 13)); // NOI18N
        añadirbtn.setText("Añadir al carrito");
        añadirbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        añadirbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirbtnActionPerformed(evt);
            }
        });

        compratxt.setColumns(20);
        compratxt.setRows(5);
        compratxt.setText("2232\t10\t\t450.23 \t\t$4,502.30\n8665\t5\t\t320.50\t\t$1602.50");
        jScrollPane3.setViewportView(compratxt);

        Lcliente1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Lcliente1.setText("id articulo");

        Lcliente4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Lcliente4.setText("No. unidades");

        Lcliente5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Lcliente5.setText("Precio por unidad");

        Lcliente6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Lcliente6.setText("Total de articulo");

        articuloctxt.setBackground(new java.awt.Color(204, 204, 204));
        articuloctxt.setCaretColor(new java.awt.Color(153, 153, 153));
        articuloctxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        articuloctxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                articuloctxtActionPerformed(evt);
            }
        });

        Lcliente3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Lcliente3.setText("TOTAL DE COMPRA");

        confirmarbtn.setFont(new java.awt.Font("Bahnschrift", 1, 13)); // NOI18N
        confirmarbtn.setText("Confirmar compra");
        confirmarbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirmarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Lcliente1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Lcliente4)
                                .addGap(57, 57, 57)
                                .addComponent(Lcliente5)
                                .addGap(26, 26, 26)
                                .addComponent(Lcliente6))
                            .addComponent(totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lcliente3)
                            .addComponent(confirmarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(articuloctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(añadirbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(articuloctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(añadirbtn))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Lcliente4)
                                .addComponent(Lcliente5)
                                .addComponent(Lcliente6))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Lcliente1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Lcliente3)
                        .addGap(11, 11, 11)
                        .addComponent(totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmarbtn))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 780, 490));

        provtxt.setBackground(new java.awt.Color(204, 204, 204));
        provtxt.setCaretColor(new java.awt.Color(153, 153, 153));
        provtxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(provtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 210, -1));

        buscarprovbtn.setFont(new java.awt.Font("Bahnschrift", 1, 13)); // NOI18N
        buscarprovbtn.setText("Buscar por proveedor");
        buscarprovbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarprovbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarprovbtnActionPerformed(evt);
            }
        });
        jPanel1.add(buscarprovbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 170, -1));

        Lcliente7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Lcliente7.setText("Proveedor");
        jPanel1.add(Lcliente7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirbtnActionPerformed
        String prod = articuloctxt.getText();
        String articulo = arttxt.getText();
        
        exclusivoKaren g = new exclusivoKaren();
        String datos_e =""; 
        datos_e = datos_e + g.leer_producto(articulo,prod);
        compratxt.setText(datos_e);
    }//GEN-LAST:event_añadirbtnActionPerformed

    private void buscartbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscartbtnActionPerformed
        String articulo = arttxt.getText(); 
         exclusivoKaren g = new exclusivoKaren();
        String datos_e = g.leer(articulo);
        
        articulosarea.setText(datos_e);
       
    }//GEN-LAST:event_buscartbtnActionPerformed

    private void buscarprovbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarprovbtnActionPerformed
         String proveedor = provtxt.getText();
         exclusivoKaren g = new exclusivoKaren();
        String datos_e = g.leer(proveedor);
        
        articulosarea.setText(datos_e);
    }//GEN-LAST:event_buscarprovbtnActionPerformed

    private void confirmarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmarbtnActionPerformed

    private void articuloctxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_articuloctxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_articuloctxtActionPerformed

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
            java.util.logging.Logger.getLogger(entrevista_rutina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(entrevista_rutina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(entrevista_rutina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(entrevista_rutina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new compraprod().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(compraprod.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(compraprod.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lcliente;
    private javax.swing.JLabel Lcliente1;
    private javax.swing.JLabel Lcliente2;
    private javax.swing.JLabel Lcliente3;
    private javax.swing.JLabel Lcliente4;
    private javax.swing.JLabel Lcliente5;
    private javax.swing.JLabel Lcliente6;
    private javax.swing.JLabel Lcliente7;
    private javax.swing.JTextField articuloctxt;
    private javax.swing.JTextArea articulosarea;
    private javax.swing.JTextField arttxt;
    private javax.swing.JButton añadirbtn;
    private javax.swing.JButton buscarprovbtn;
    private javax.swing.JButton buscartbtn;
    private javax.swing.JTextArea compratxt;
    private javax.swing.JButton confirmarbtn;
    private javax.swing.JTextField fechatxt;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField noControltxt;
    private javax.swing.JTextField provtxt;
    private javax.swing.JTextField totaltxt;
    // End of variables declaration//GEN-END:variables
}
