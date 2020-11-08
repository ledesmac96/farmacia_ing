package com.mycompany.farmacia;


public class Menú extends javax.swing.JFrame {

    public Menú() {
        initComponents();
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_lat = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnVentas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnFarmacias1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnMedicamentos = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnInformes = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnLabo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        menu_sup = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelOptions = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        menu_lat.setToolTipText("Menu lateral");
        menu_lat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon_sales.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setAlignmentY(0.0F);
        menu_lat.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 40, 40));

        btnVentas.setBackground(new java.awt.Color(22, 39, 49));
        btnVentas.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        menu_lat.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 280, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon_pharmacy.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setAlignmentY(0.0F);
        menu_lat.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 40, 40));

        btnFarmacias1.setBackground(new java.awt.Color(0, 102, 102));
        btnFarmacias1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnFarmacias1.setText("Farmacias");
        btnFarmacias1.setToolTipText("");
        btnFarmacias1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFarmacias1ActionPerformed(evt);
            }
        });
        menu_lat.add(btnFarmacias1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 280, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon_medicine.png"))); // NOI18N
        jLabel5.setAlignmentY(0.0F);
        menu_lat.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 50, 40));

        btnMedicamentos.setBackground(new java.awt.Color(22, 39, 49));
        btnMedicamentos.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnMedicamentos.setText("Medicamentos");
        btnMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicamentosActionPerformed(evt);
            }
        });
        menu_lat.add(btnMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 280, 80));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon_report.png"))); // NOI18N
        jLabel7.setAlignmentY(0.0F);
        menu_lat.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 40, 40));

        btnInformes.setBackground(new java.awt.Color(22, 39, 49));
        btnInformes.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnInformes.setText("Gestión de Informes");
        btnInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformesActionPerformed(evt);
            }
        });
        menu_lat.add(btnInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 280, 80));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon_lab.png"))); // NOI18N
        jLabel6.setAlignmentY(0.0F);
        menu_lat.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, 40));

        btnLabo.setBackground(new java.awt.Color(22, 39, 49));
        btnLabo.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnLabo.setText("Laboratorios");
        btnLabo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaboActionPerformed(evt);
            }
        });
        menu_lat.add(btnLabo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 280, 80));

        jLabel1.setBackground(new java.awt.Color(22, 39, 49));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/menu_lat.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        menu_lat.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 770));

        getContentPane().add(menu_lat);
        menu_lat.setBounds(0, 0, 280, 770);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/menu_sup.png"))); // NOI18N

        javax.swing.GroupLayout menu_supLayout = new javax.swing.GroupLayout(menu_sup);
        menu_sup.setLayout(menu_supLayout);
        menu_supLayout.setHorizontalGroup(
            menu_supLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1160, Short.MAX_VALUE)
        );
        menu_supLayout.setVerticalGroup(
            menu_supLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(menu_sup);
        menu_sup.setBounds(270, 0, 1160, 103);

        jPanelOptions.setBackground(new java.awt.Color(47, 79, 79));
        jPanelOptions.setAlignmentX(0.0F);
        jPanelOptions.setAlignmentY(0.0F);
        jPanelOptions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel8.setText("Seleccione alguna opción:");
        jPanelOptions.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        jButton1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jButton1.setText("Registrar Farmacia");
        jButton1.setAlignmentY(0.0F);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jButton2.setText("Eliminar Farmacia");
        jButton2.setAlignmentY(0.0F);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jButton3.setText("Modificar datos");
        jButton3.setAlignmentY(0.0F);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(180, 180, 180))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jPanelOptions.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 650, 460));

        getContentPane().add(jPanelOptions);
        jPanelOptions.setBounds(280, 100, 1150, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnFarmacias1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFarmacias1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFarmacias1ActionPerformed

    private void btnMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMedicamentosActionPerformed

    private void btnLaboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLaboActionPerformed

    private void btnInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInformesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

   
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
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menú().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFarmacias1;
    private javax.swing.JButton btnInformes;
    private javax.swing.JButton btnLabo;
    private javax.swing.JButton btnMedicamentos;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelOptions;
    private javax.swing.JPanel menu_lat;
    private javax.swing.JPanel menu_sup;
    // End of variables declaration//GEN-END:variables
}
