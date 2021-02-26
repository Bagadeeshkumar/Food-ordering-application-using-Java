import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class vegbf1 extends javax.swing.JFrame {
    int price=0,tprice1,tprice2,tprice3,tprice4,tprice5,tprice6,tprice7,tprice8,tprice9,tprice10,tprice11,tprice12,tprice13,tprice14,tprice15;
    
     void calculate(){
        if(jCheckBox1.isSelected())
        {
            Integer spinner1 = (Integer) jSpinner1.getValue();
            int price1= Integer.parseInt(jLabel1.getText());
            tprice1=(spinner1)*(price1);
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]{jCheckBox1.getLabel(), jSpinner1.getValue(),tprice1});
        }
      if(jCheckBox2.isSelected())
        {
            Integer spinner1 = (Integer) jSpinner2.getValue();
            int price1= Integer.parseInt(jLabel2.getText());
            tprice2=(spinner1)*(price1);
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]{jCheckBox2.getLabel(), jSpinner2.getValue(),tprice2});
        }
      if(jCheckBox3.isSelected())
        {
            Integer spinner1 = (Integer) jSpinner3.getValue();
            int price1= Integer.parseInt(jLabel3.getText());
            tprice3=(spinner1)*(price1);
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]{jCheckBox3.getLabel(), jSpinner3.getValue(),tprice3});
        }
      if(jCheckBox4.isSelected())
        {
            Integer spinner1 = (Integer) jSpinner4.getValue();
            int price1= Integer.parseInt(jLabel4.getText());
            tprice4=(spinner1)*(price1);
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]{jCheckBox4.getLabel(), jSpinner4.getValue(),tprice4});
        }
      if(jCheckBox5.isSelected())
        {
            Integer spinner1 = (Integer) jSpinner5.getValue();
            int price1= Integer.parseInt(jLabel5.getText());
            tprice5=(spinner1)*(price1);
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]{jCheckBox5.getLabel(), jSpinner5.getValue(),tprice5});
        }
      if(jCheckBox6.isSelected())
        {
            Integer spinner1 = (Integer) jSpinner6.getValue();
            int price1= Integer.parseInt(jLabel6.getText());
            tprice6=(spinner1)*(price1);
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]{jCheckBox6.getLabel(), jSpinner6.getValue(),tprice6});
        }
      if(jCheckBox7.isSelected())
        {
            Integer spinner1 = (Integer) jSpinner7.getValue();
            int price1= Integer.parseInt(jLabel7.getText());
            tprice7=(spinner1)*(price1);
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]{jCheckBox7.getLabel(), jSpinner7.getValue(),tprice7});
        }
      if(jCheckBox8.isSelected())
        {
            Integer spinner1 = (Integer) jSpinner8.getValue();
            int price1= Integer.parseInt(jLabel8.getText());
            tprice8=(spinner1)*(price1);
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]{jCheckBox8.getLabel(), jSpinner8.getValue(),tprice8});
        }
      if(jCheckBox9.isSelected())
        {
            Integer spinner1 = (Integer) jSpinner9.getValue();
            int price1= Integer.parseInt(jLabel9.getText());
            tprice9=(spinner1)*(price1);
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]{jCheckBox9.getLabel(), jSpinner9.getValue(),tprice9});
        }
      if(jCheckBox10.isSelected())
        {
            Integer spinner1 = (Integer) jSpinner10.getValue();
            int price1= Integer.parseInt(jLabel10.getText());
            tprice10=(spinner1)*(price1);
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]{jCheckBox10.getLabel(), jSpinner10.getValue(),tprice10});
        }
      if(jCheckBox11.isSelected())
        {
            Integer spinner1 = (Integer) jSpinner11.getValue();
            int price1= Integer.parseInt(jLabel1.getText());
            tprice11=(spinner1)*(price1);
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]{jCheckBox11.getLabel(), jSpinner11.getValue(),tprice11});
        }
      if(jCheckBox12.isSelected())
        {
            Integer spinner1 = (Integer) jSpinner12.getValue();
            int price1= Integer.parseInt(jLabel12.getText());
            tprice12=(spinner1)*(price1);
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]{jCheckBox12.getLabel(), jSpinner12.getValue(),tprice12});
        }
      if(jCheckBox13.isSelected())
        {
            Integer spinner1 = (Integer) jSpinner13.getValue();
            int price1= Integer.parseInt(jLabel13.getText());
            tprice13=(spinner1)*(price1);
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]{jCheckBox13.getLabel(), jSpinner13.getValue(),tprice13});
        }
      if(jCheckBox14.isSelected())
        {
            Integer spinner1 = (Integer) jSpinner14.getValue();
            int price1= Integer.parseInt(jLabel14.getText());
            tprice14=(spinner1)*(price1);
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]{jCheckBox14.getLabel(), jSpinner14.getValue(),tprice14});
        }
      if(jCheckBox15.isSelected())
        {
            Integer spinner1 = (Integer) jSpinner15.getValue();
            int price1= Integer.parseInt(jLabel15.getText());
            tprice15=(spinner1)*(price1);
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]{jCheckBox15.getLabel(), jSpinner15.getValue(),tprice15});
        }
        price=price+tprice1+tprice2+tprice3+tprice4+tprice5+tprice6+tprice7+tprice8+tprice9+tprice10+tprice11+tprice12+tprice13+tprice14+tprice15;
        jLabel16.setText("TOTAL= "+price);
        jTable1.setEnabled(false);
   }
    public vegbf1() {
        initComponents();
         this.setResizable(false);//this is used not to change the window size
       
    }
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jSpinner6 = new javax.swing.JSpinner();
        jSpinner7 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jSpinner8 = new javax.swing.JSpinner();
        jSpinner9 = new javax.swing.JSpinner();
        jSpinner10 = new javax.swing.JSpinner();
        jSpinner11 = new javax.swing.JSpinner();
        jSpinner12 = new javax.swing.JSpinner();
        jSpinner13 = new javax.swing.JSpinner();
        jSpinner14 = new javax.swing.JSpinner();
        jSpinner15 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("10");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 117, -1, -1));

        jCheckBox1.setText("IDLY");
        jPanel4.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 113, -1, -1));

        jCheckBox2.setText("DOSAI");
        jPanel4.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 162, -1, -1));

        jCheckBox3.setText("PONGAL");
        jPanel4.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 205, -1, -1));

        jCheckBox4.setText("POORI");
        jPanel4.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 248, -1, -1));

        jCheckBox5.setText("PAROTTA");
        jPanel4.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 291, -1, -1));

        jCheckBox6.setText("CHAPPATHI");
        jPanel4.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 335, -1, -1));

        jCheckBox7.setText("KESARI");
        jPanel4.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 378, -1, -1));
        jPanel4.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));
        jPanel4.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 163, -1, -1));
        jPanel4.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 206, -1, -1));
        jPanel4.add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 249, -1, -1));
        jPanel4.add(jSpinner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 292, -1, -1));
        jPanel4.add(jSpinner6, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 336, -1, -1));
        jPanel4.add(jSpinner7, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 379, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("25");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 166, -1, -1));

        jCheckBox8.setText("BOOST");
        jPanel4.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 113, -1, -1));

        jCheckBox9.setText("MILK");
        jPanel4.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 162, -1, -1));

        jCheckBox10.setText("HORLICKS");
        jPanel4.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 205, -1, -1));

        jCheckBox11.setText("COFFEE");
        jPanel4.add(jCheckBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 248, -1, -1));

        jCheckBox12.setText("TEA");
        jPanel4.add(jCheckBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 291, 66, -1));

        jCheckBox13.setText("BADAM");
        jPanel4.add(jCheckBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 421, -1, -1));

        jCheckBox14.setText("VENNILA");
        jPanel4.add(jCheckBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 464, -1, -1));

        jCheckBox15.setText("CHOCOLATE");
        jPanel4.add(jCheckBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 509, -1, -1));
        jPanel4.add(jSpinner8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 114, -1, -1));
        jPanel4.add(jSpinner9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 163, -1, -1));
        jPanel4.add(jSpinner10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 206, -1, -1));
        jPanel4.add(jSpinner11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 249, -1, -1));
        jPanel4.add(jSpinner12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 292, -1, -1));
        jPanel4.add(jSpinner13, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 422, -1, -1));
        jPanel4.add(jSpinner14, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 465, -1, -1));
        jPanel4.add(jSpinner15, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 510, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM", "QUANTITY", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 320, 260));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("20");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 20, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("15");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 252, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("10");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("15");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 339, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("10");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 382, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("10");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 117, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("6");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 166, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("10");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 209, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("8");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 252, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("7");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 295, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setText("20");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 425, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setText("20");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 468, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel15.setText("20");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 513, -1, -1));
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, 88, 25));

        jButton2.setText("ORDER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 390, -1, -1));

        jButton3.setText("CANCEL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 390, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel18.setText("VARIETIES");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel19.setText("FOOD ITEMS");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel20.setText("QUANTITY");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel21.setText(" PRICE(Rs.)");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel17.setText(" ITEMS");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel22.setText("  DRINKS ");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel23.setText("QUANTITY");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel24.setText(" PRICE(Rs.)");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel25.setText("BILL DETAILS");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel27.setText("QUANTITY");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel28.setText(" PRICE(Rs.)");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel29.setText(" ITEMS");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel26.setText("ICE CREAMS");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/white-crumpled-abstract-background_MJJSlyvO_L.jpg"))); // NOI18N
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        calculate();
        int result = JOptionPane.showConfirmDialog(rootPane, "You hava ordered for RUPEES "+price+".Click ok to proceed further. For any clarification please verify the bill details.","confirmation", JOptionPane.OK_CANCEL_OPTION);
if (result  == JOptionPane.OK_OPTION) 
{
    confirm c=new confirm();
    c.setVisible(true);
    this.setVisible(false);
}
if(result==JOptionPane.CANCEL_OPTION)
{
     DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);
            price=0;
            jLabel16.setText("TOTAL= "+price);
}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        order o=new order();
        o.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed
    
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
            java.util.logging.Logger.getLogger(vegbf1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vegbf1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vegbf1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vegbf1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vegbf1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

