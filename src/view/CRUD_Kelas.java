/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.DefaultComboBoxModel;
import config.KoneksiDB;
/**
 *
 * @author user
 */
public class CRUD_Kelas extends javax.swing.JFrame {

    public CRUD_Kelas() {
        initComponents();
        tabelKelas();
        BtnUpdate.setEnabled(false);
    }
        Statement st;
        Connection con = KoneksiDB.getConnection();
        ResultSet rs;
        DefaultComboBoxModel modelc;
        DefaultTableModel model;

    private void tabelKelas() {
       String[] judul = {"ID","Nama Kelas","Kompetensi Keahlian"};
        model = new DefaultTableModel(judul,0);
        tblKelas.setModel(model);
        String sql = "SELECT * FROM kelas where nama_kelas like '%"+cari.getText()+"%' or kompetensi_keahlian like '%"+cari.getText()+"%' or id_kelas like '%"+cari.getText()+"%'";
        
        try {
            rs = con.createStatement().executeQuery(sql);
            
            while(rs.next()) {
               String id = rs.getString("id_kelas");
               String nama = rs.getString("nama_kelas");
               String jurusan = rs.getString("kompetensi_keahlian");
               
                
               String[] data = {id,nama,jurusan};
               model.addRow(data);
           }
        }catch(Exception e) {
           System.out.println(e); 
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbJurusan = new javax.swing.JComboBox<>();
        BtnSimpan = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKelas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        BtnRefresh = new javax.swing.JButton();
        tId_kelas = new javax.swing.JTextField();
        tNamaKelas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Data Kelas.png"))); // NOI18N
        jLabel2.setText("KELOLA DATA KELAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 450, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Kelas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Kelas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kompetensi");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        cbJurusan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RPL", "MULTIMEDIA" }));
        getContentPane().add(cbJurusan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 200, 35));

        BtnSimpan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnSimpan.setText("Simpan");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 150, 35));

        BtnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnUpdate.setText("Ubah");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(BtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 150, 35));

        BtnHapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnHapus.setText("Hapus");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(BtnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 150, 35));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cari Kelas");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, -1, -1));

        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cariKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariKeyReleased(evt);
            }
        });
        getContentPane().add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 600, 30));

        tblKelas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKelasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKelas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 730, 220));

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("Kembali");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        BtnRefresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnRefresh.setText("Refresh Table");
        BtnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(373, Short.MAX_VALUE)
                .addComponent(BtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 730, 80));
        getContentPane().add(tId_kelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 200, 35));
        getContentPane().add(tNamaKelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 200, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Bg Crud.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Dashboard dsb = new Dashboard ();
        dsb.dashAdmin();
        dsb.setExtendedState(JFrame.MAXIMIZED_BOTH);
        dsb.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void BtnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefreshActionPerformed
        resetForm();
        BtnUpdate.setEnabled(false);
    }//GEN-LAST:event_BtnRefreshActionPerformed

    private void tblKelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKelasMouseClicked
        int i = tblKelas.getSelectedRow();
        tId_kelas.setText(model.getValueAt(i, 0).toString());
        tNamaKelas.setText(model.getValueAt(i, 1).toString());
        cbJurusan.setSelectedItem(model.getValueAt(i, 2));

        //disabled item on klik row table
        BtnSimpan.setEnabled(false);
        tId_kelas.setEnabled(false);
        BtnUpdate.setEnabled(true);
    }//GEN-LAST:event_tblKelasMouseClicked

    private void cariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyPressed
        tabelKelas();
    }//GEN-LAST:event_cariKeyPressed

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyReleased
        tabelKelas();
    }//GEN-LAST:event_cariKeyReleased

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        try {
            con.createStatement().executeUpdate("delete from kelas where id_kelas ='"+model.getValueAt(tblKelas.getSelectedRow(),0)+"'");
            JOptionPane.showMessageDialog(null, "berhasil");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "gagal");
        }
        resetForm();
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        try {
            String nama = tNamaKelas.getText();
            String kompetensi = cbJurusan.getSelectedItem().toString();

            con.createStatement().executeUpdate("update kelas set nama_kelas='"+nama+"', kompetensi_keahlian='"+kompetensi+"' where id_kelas='"+model.getValueAt(tblKelas.getSelectedRow(),0)+"'");
            JOptionPane.showMessageDialog(this, "Data Berhasil Di Edit");
        }catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Data Gagal Di Edit");
        }
        resetForm();
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        String nama = tNamaKelas.getText();
        String kompetensi = cbJurusan.getSelectedItem().toString();

        try{
            con.createStatement().executeUpdate("insert into kelas value ('"+tId_kelas.getText()+"', '"+nama+"','"+kompetensi+"')");
            JOptionPane.showMessageDialog(null, "Kelas baru berhasil ditambahkan!");
            resetForm();
        }catch (Exception ex) {
            System.out.println(""+ex);
            JOptionPane.showMessageDialog(null, "Gagal!");
        }
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariActionPerformed

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
            java.util.logging.Logger.getLogger(CRUD_Kelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD_Kelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD_Kelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD_Kelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD_Kelas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnRefresh;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JButton btnBack;
    private javax.swing.JTextField cari;
    private javax.swing.JComboBox<String> cbJurusan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tId_kelas;
    private javax.swing.JTextField tNamaKelas;
    private javax.swing.JTable tblKelas;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
    tId_kelas.setText("");
        tNamaKelas.setText("");
        cbJurusan.setSelectedItem("");   
        tabelKelas();
        
        BtnSimpan.setEnabled(true);
        tId_kelas.setEnabled(true);     
    }
}
