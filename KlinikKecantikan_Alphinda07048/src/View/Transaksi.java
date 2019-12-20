package View;

import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import AllObject.AllObject;

public class Transaksi extends javax.swing.JFrame {

    public Transaksi() {
        initComponents();
        for (int i = 0; i < AllObject.produkArr.size(); i++) {
            CBProduk.addItem(AllObject.produkArr.get(i).getProduk());
            
        }
        
        for (int a = 0; a < AllObject.treatArr.size(); a++) {
            CBTreat.addItem(AllObject.treatArr.get(a).getJenis());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CBProduk = new javax.swing.JComboBox<String>();
        txtidProduk = new javax.swing.JTextField();
        txtHargaProduk = new javax.swing.JTextField();
        txtJumlahProduk = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        CBTreat = new javax.swing.JComboBox<String>();
        txtIdTreat = new javax.swing.JTextField();
        txtHargaTreat = new javax.swing.JTextField();
        btnTambahTreat = new javax.swing.JButton();
        btnProduk = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelTransaksi = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTotalHargaSemua = new javax.swing.JTextField();
        TotalBayar = new javax.swing.JTextField();
        txtKembalian = new javax.swing.JTextField();
        btnSelesai = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        RBMember = new javax.swing.JRadioButton();
        RBNonMember = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 51, 0));
        jLabel7.setText("klinik kecantikan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Data Produk");

        CBProduk.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        CBProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBProdukActionPerformed(evt);
            }
        });

        txtidProduk.setEnabled(false);
        txtidProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidProdukActionPerformed(evt);
            }
        });

        txtHargaProduk.setEnabled(false);
        txtHargaProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaProdukActionPerformed(evt);
            }
        });

        txtJumlahProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahProdukActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CBProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHargaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtJumlahProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(0, 88, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJumlahProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHargaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        jLabel3.setText("Data Treatment");

        CBTreat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        CBTreat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBTreatActionPerformed(evt);
            }
        });

        txtIdTreat.setEnabled(false);

        txtHargaTreat.setEnabled(false);

        btnTambahTreat.setBackground(new java.awt.Color(102, 204, 255));
        btnTambahTreat.setText("Tambahkan");
        btnTambahTreat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahTreatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(CBTreat, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdTreat, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHargaTreat, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTambahTreat)
                        .addGap(71, 71, 71))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBTreat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdTreat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHargaTreat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambahTreat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnProduk.setBackground(new java.awt.Color(102, 204, 255));
        btnProduk.setText("Tambahkan");
        btnProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdukActionPerformed(evt);
            }
        });

        tabelTransaksi.setBackground(new java.awt.Color(204, 255, 204));
        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Produk / Treatment", "Id", "Jumlah", "Harga"
            }
        ));
        jScrollPane1.setViewportView(tabelTransaksi);

        jLabel4.setText("Total Harga");

        jLabel5.setText("Jumlah Bayar");

        jLabel6.setText("Kembalian");

        txtTotalHargaSemua.setEnabled(false);

        TotalBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalBayarActionPerformed(evt);
            }
        });
        TotalBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TotalBayarKeyPressed(evt);
            }
        });

        txtKembalian.setBackground(new java.awt.Color(51, 0, 51));
        txtKembalian.setEnabled(false);

        btnSelesai.setText("Selesai");
        btnSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelesaiActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        RBMember.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        RBMember.setText("Member");

        RBNonMember.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        RBNonMember.setText("Non Member");
        RBNonMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBNonMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RBNonMember)
                                        .addGap(31, 31, 31)
                                        .addComponent(btnProduk))
                                    .addComponent(RBMember))
                                .addGap(84, 84, 84))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TotalBayar, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                            .addComponent(txtTotalHargaSemua)
                                            .addComponent(txtKembalian))
                                        .addContainerGap())
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSelesai)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                        .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17))))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(RBMember)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProduk)
                            .addComponent(RBNonMember)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtTotalHargaSemua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(TotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelesai)
                    .addComponent(btnKeluar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBProdukActionPerformed
            if (CBProduk.getSelectedIndex() > 0) {
                System.out.println(AllObject.produkArr.get(CBProduk.getSelectedIndex()-1).getId());
                txtidProduk.setText(AllObject.produkArr.get(CBProduk.getSelectedIndex()-1).getId());
                txtHargaProduk.setText(AllObject.produkArr.get(CBProduk.getSelectedIndex()-1).getHarga());
            }
//        ArrayList<Insert_Produk> insert = new ArrayList<>();
//        
//        Object cb = CBProduk.getSelectedItem();
//        if (cb.equals("1")) {
//            txtNamaProduk.setText("Obat Jerawat");
//            txtHargaProduk.setText(String.valueOf(50000));
//        } else if (cb.equals("2")) {
//            txtNamaProduk.setText("Night Cream");
//            txtHargaProduk.setText(String.valueOf(400000));
//        } else if (cb.equals("3")) {
//            txtNamaProduk.setText("Day Cream");
//            txtHargaProduk.setText(String.valueOf(200000));
//        } else if (cb.equals("4")) {
//            txtNamaProduk.setText("Cleanser");
//            txtHargaProduk.setText(String.valueOf(90000));
//        } else if (cb.equals("5")) {
//            txtNamaProduk.setText("Acne Cream");
//            txtHargaProduk.setText(String.valueOf(85000));
//        } else if (cb.equals("6")) {
//            txtNamaProduk.setText("Sun Screen");
//            txtHargaProduk.setText(String.valueOf(280000));
//        }
    }//GEN-LAST:event_CBProdukActionPerformed

    private void txtHargaProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaProdukActionPerformed

    private void CBTreatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBTreatActionPerformed
            if (CBTreat.getSelectedIndex() > 0) {
                System.out.println(AllObject.treatArr.get(CBTreat.getSelectedIndex()-1).getId());
                txtIdTreat.setText(AllObject.treatArr.get(CBTreat.getSelectedIndex()-1).getId());
                txtHargaTreat.setText(AllObject.treatArr.get(CBTreat.getSelectedIndex()-1).getHarga());
            }

//        Object cb = CBTreat.getSelectedItem();
//        if (cb.equals("1")) {
//            txtIdTreat.setText("SPA");
//            txtHargaTreat.setText(String.valueOf(50000));
//        } else if (cb.equals("2")) {
//            txtIdTreat.setText("Facial");
//            txtHargaTreat.setText(String.valueOf(65000));
//        } else if (cb.equals("3")) {
//            txtIdTreat.setText("Lulur");
//            txtHargaTreat.setText(String.valueOf(80000));
//        }

    }//GEN-LAST:event_CBTreatActionPerformed

    private void btnProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdukActionPerformed
        double th = Double.parseDouble(txtHargaProduk.getText()) * Double.parseDouble(txtJumlahProduk.getText());
        double hp = Double.parseDouble(txtHargaProduk.getText());
        double ts = th - (0.2 * th);
        
        if (RBMember.isSelected()) {
            RBNonMember.setSelected(false);
        } else if (RBNonMember.isSelected()) {
            RBMember.setSelected(false);
        }

        if (RBMember.isSelected()) {
            model.addRow(new Object[]{CBProduk.getSelectedItem(), txtidProduk.getText(), txtJumlahProduk.getText(),
                String.valueOf(ts)});
            tabelTransaksi.setModel(model);

        } else if (RBNonMember.isSelected()) {
            model.addRow(new Object[]{CBProduk.getSelectedItem(), txtidProduk.getText(), txtJumlahProduk.getText(),
                String.valueOf(th)});
            tabelTransaksi.setModel(model);
        }

        int jumlahBaris = tabelTransaksi.getRowCount();
        double totalBiaya = 0;
        double hargaBarang;
        TableModel tabelModel;
        tabelModel = tabelTransaksi.getModel();
        for (int i = 0; i < jumlahBaris; i++) {
            hargaBarang = Double.parseDouble(tabelModel.getValueAt(i, 3).toString());
            totalBiaya = totalBiaya + hargaBarang;
        }
        txtTotalHargaSemua.setText(String.valueOf(totalBiaya));
    }//GEN-LAST:event_btnProdukActionPerformed

    private void TotalBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalBayarActionPerformed

    }//GEN-LAST:event_TotalBayarActionPerformed

    private void TotalBayarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TotalBayarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            double tb = Double.parseDouble(TotalBayar.getText());
            double ts = Double.parseDouble(txtTotalHargaSemua.getText());
            double tk = tb - ts;

            txtKembalian.setText(String.valueOf(tk));
        }

    }//GEN-LAST:event_TotalBayarKeyPressed

    private void btnTambahTreatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahTreatActionPerformed
        double hp = Double.parseDouble(txtHargaTreat.getText());
        double th = Double.parseDouble(txtHargaTreat.getText());
        double ts = hp;
        
        model.addRow(new Object[]{CBTreat.getSelectedItem(), txtIdTreat.getText(),null,
            String.valueOf(ts)});
            tabelTransaksi.setModel(model);
        
        int jumlahBaris = tabelTransaksi.getRowCount();
        double totalBiaya = 0;
        double hargaTreat;
        TableModel tabelModel;
        tabelModel = tabelTransaksi.getModel();
        for (int i = 0; i < jumlahBaris; i++) {
            hargaTreat = Double.parseDouble(tabelModel.getValueAt(i, 3).toString());
            totalBiaya = totalBiaya + hargaTreat;
        }
        txtTotalHargaSemua.setText(String.valueOf(totalBiaya));
    }//GEN-LAST:event_btnTambahTreatActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void txtJumlahProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahProdukActionPerformed
        
    }//GEN-LAST:event_txtJumlahProdukActionPerformed

    private void RBNonMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBNonMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBNonMemberActionPerformed

    private void btnSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelesaiActionPerformed
        txtidProduk.setText("");
        txtIdTreat.setText("");
        txtJumlahProduk.setText("");
        txtHargaProduk.setText("");
        txtHargaTreat.setText("");
        txtTotalHargaSemua.setText("");
        txtKembalian.setText("");
        TotalBayar.setText("");
        CBProduk.setSelectedItem("-");
        CBTreat.setSelectedItem("-");
        RBMember.setSelected(false);
        RBNonMember.setSelected(false);
        tabelTransaksi.setModel(model);
    }//GEN-LAST:event_btnSelesaiActionPerformed

    private void txtidProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidProdukActionPerformed
     
    }//GEN-LAST:event_txtidProdukActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBProduk;
    private javax.swing.JComboBox<String> CBTreat;
    private javax.swing.JRadioButton RBMember;
    private javax.swing.JRadioButton RBNonMember;
    private javax.swing.JTextField TotalBayar;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnProduk;
    private javax.swing.JButton btnSelesai;
    private javax.swing.JButton btnTambahTreat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelTransaksi;
    private javax.swing.JTextField txtHargaProduk;
    private javax.swing.JTextField txtHargaTreat;
    private javax.swing.JTextField txtIdTreat;
    private javax.swing.JTextField txtJumlahProduk;
    private javax.swing.JTextField txtKembalian;
    private javax.swing.JTextField txtTotalHargaSemua;
    private javax.swing.JTextField txtidProduk;
    // End of variables declaration//GEN-END:variables

    int baris = 0;
    static Object kolom[] = {"Id", "Produk / Treatment", "Jumlah", "Harga"};

    DefaultTableModel model = new DefaultTableModel(kolom, baris++);
}