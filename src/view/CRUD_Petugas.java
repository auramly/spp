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
public class CRUD_Petugas extends javax.swing.JFrame {

    /**
     * Creates new form CRUD_Petugas
     */
    public CRUD_Petugas() {
        initComponents();
        tabelPetugas();

        BtnUpdate.setEnabled(false);
    }
    
    Statement st;
    Connection con = KoneksiDB.getConnection();
    ResultSet rs;
    DefaultComboBoxModel modelc;
    DefaultTableModel model;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cari = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPetugas = new javax.swing.JTable();
        BtnHapus = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnSimpan = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        BtnRefresh = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tId_petugas = new javax.swing.JTextField();
        tNama = new javax.swing.JTextField();
        tPass = new javax.swing.JTextField();
        tUser = new javax.swing.JTextField();
        cbLevel = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Petugas.png"))); // NOI18N
        jLabel2.setText("KELOLA DATA PETUGAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, 60));

        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cariKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariKeyReleased(evt);
            }
        });
        getContentPane().add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 600, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cari Petugas");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, -1, -1));

        tblPetugas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPetugasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPetugas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 730, 230));

        BtnHapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnHapus.setText("Hapus");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(BtnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 150, 35));

        BtnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnUpdate.setText("Ubah");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(BtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 150, 35));

        BtnSimpan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnSimpan.setText("Simpan");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 150, 35));

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
                .addContainerGap(377, Short.MAX_VALUE)
                .addComponent(BtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 730, 90));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Petugas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nama Lengkap");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Level");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));
        getContentPane().add(tId_petugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 200, 35));
        getContentPane().add(tNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 200, 35));
        getContentPane().add(tPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 200, 35));
        getContentPane().add(tUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 200, 35));

        cbLevel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Petugas" }));
        getContentPane().add(cbLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 200, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Bg Crud.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Dashboard dsb = new Dashboard();
        dsb.dashAdmin();
        dsb.setExtendedState(JFrame.MAXIMIZED_BOTH);
        dsb.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void BtnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefreshActionPerformed
        resetForm();
        BtnUpdate.setEnabled(false);
    }//GEN-LAST:event_BtnRefreshActionPerformed

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        String uname = tUser.getText();
        String pass = tPass.getText();
        String nama = tNama.getText();
        String level = cbLevel.getSelectedItem().toString();

        try{
            con.createStatement().executeUpdate("insert into petugas value ('"+tId_petugas.getText()+"', '"+uname+"','"+pass+"','"+nama+"','"+level+"')");
            JOptionPane.showMessageDialog(null, "Data petugas berhasil ditambahkan");
            resetForm();
        }catch (Exception ex) {
            System.out.println(""+ex);
            JOptionPane.showMessageDialog(null, "Gagal!");
        }
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        try {
            String uname = tUser.getText();
            String pass = tPass.getText();
            String nama = tNama.getText();
            String level = cbLevel.getSelectedItem().toString();

            con.createStatement().executeUpdate("update petugas set username='"+uname+"', password='"+pass+"',nama_petugas='"+nama+"', level='"+level+"' where id_petugas='"+model.getValueAt(tblPetugas.getSelectedRow(),0)+"'");
            JOptionPane.showMessageDialog(this, "Data Berhasil Di Edit");
        }catch (Exception e) {
            System.out.println(e);
        }
        resetForm();
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        try {
            con.createStatement().executeUpdate("delete from petugas where id_petugas ='"+model.getValueAt(tblPetugas.getSelectedRow(),0)+"'");
            JOptionPane.showMessageDialog(null, "berhasil");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "gagal");
        }
        resetForm();
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void tblPetugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPetugasMouseClicked
        int i = tblPetugas.getSelectedRow();
        tId_petugas.setText(model.getValueAt(i, 0).toString());
        tNama.setText(model.getValueAt(i, 1).toString());
        tUser.setText(model.getValueAt(i, 2).toString());
        tPass.setText(model.getValueAt(i, 3).toString());
        cbLevel.setSelectedItem(model.getValueAt(i, 4));

        //       disabled item on klik row table
        BtnSimpan.setEnabled(false);
        BtnUpdate.setEnabled(true);
        tId_petugas.setEnabled(false);
    }//GEN-LAST:event_tblPetugasMouseClicked

    private void cariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyPressed
        tabelPetugas();
    }//GEN-LAST:event_cariKeyPressed

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyReleased
        tabelPetugas();
    }//GEN-LAST:event_cariKeyReleased

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
            java.util.logging.Logger.getLogger(CRUD_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD_Petugas().setVisible(true);
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
    private javax.swing.JComboBox<String> cbLevel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tId_petugas;
    private javax.swing.JTextField tNama;
    private javax.swing.JTextField tPass;
    private javax.swing.JTextField tUser;
    private javax.swing.JTable tblPetugas;
    // End of variables declaration//GEN-END:variables

    private void tabelPetugas() {
        String[] judul = {"ID","Nama Petugas","Username","Password","Level"};
        model = new DefaultTableModel(judul,0);
        tblPetugas.setModel(model);
        String sql = "SELECT * FROM petugas where nama_petugas like '%"+cari.getText()+"%' or username like '%"+cari.getText()+"%'or id_petugas like '%"+cari.getText()+"%'or level like '%"+cari.getText()+"%'";
        
        try {
            rs = con.createStatement().executeQuery(sql);
            
            while(rs.next()) {
               String id = rs.getString("id_petugas");
               String nama = rs.getString("nama_petugas");
               String uname = rs.getString("username");
               String pass = rs.getString("password");
               String level = rs.getString("level");
               
                
               String[] data = {id,nama, uname, pass, level};
               model.addRow(data);
           }
        }catch(Exception e) {
           System.out.println(e);
    }
}

    private void resetForm() {
        tId_petugas.setText("");
        tUser.setText("");
        tPass.setText("");
        tNama.setText("");
        cbLevel.setSelectedItem("Level Petugas");   
        tabelPetugas();
        
        BtnSimpan.setEnabled(true);
        BtnUpdate.setEnabled(false);
        tId_petugas.setEnabled(true);
    }
        }
