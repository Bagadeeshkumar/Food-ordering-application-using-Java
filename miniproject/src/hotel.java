public class hotel extends javax.swing.JFrame {
    public hotel() {
        initComponents();
         this.setResizable(false);//this is used not to change the window size
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("                 HOTELS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 10, 579, 76);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("VAIGAI HOTEL ");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(34, 161, 115, 25);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("5 RATINGS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(65, 127, 67, 16);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("4 RATINGS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(199, 127, 67, 16);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("3 RATINGS");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(322, 127, 67, 16);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("2 RATINGS");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(470, 127, 67, 16);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("1 RATING");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(621, 127, 59, 16);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("RAJA HOTEL");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(34, 204, 99, 25);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("UMA HOTEL");
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(34, 247, 97, 25);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("UMAR HOTEL");
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(179, 161, 105, 25);

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("RANI MESS");
        jPanel1.add(jRadioButton5);
        jRadioButton5.setBounds(179, 204, 93, 25);

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("GOWRI HOTEL");
        jPanel1.add(jRadioButton6);
        jRadioButton6.setBounds(179, 247, 111, 25);

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("VANI MESS");
        jPanel1.add(jRadioButton7);
        jRadioButton7.setBounds(313, 161, 93, 25);

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setText("LAKSHMI HOTEL");
        jPanel1.add(jRadioButton8);
        jRadioButton8.setBounds(444, 161, 121, 25);

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setText("RAM HOTEL");
        jPanel1.add(jRadioButton9);
        jRadioButton9.setBounds(444, 204, 97, 25);

        buttonGroup1.add(jRadioButton10);
        jRadioButton10.setText("HARRY MESS");
        jPanel1.add(jRadioButton10);
        jRadioButton10.setBounds(605, 161, 105, 25);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("The above hotels are around you");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(228, 361, 262, 22);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(520, 430, 49, 25);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/explosion-colored-powder-white-background-isolated-71572090.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(-260, 0, 1020, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         this.setVisible(false);
        order o=new order();
        o.setVisible(true);
       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables
}
