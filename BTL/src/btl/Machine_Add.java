package btl;

import controller.MyController;
import java.awt.Color;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import model.Machine;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author HoNamTu
 */
public class Machine_Add extends javax.swing.JFrame {

    private static MyController controller = new MyController();

    public Machine_Add() {
        String account = controller.readAccountFromFile("src/file/account.txt");
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Nhóm 12");
        bntAccout.setText(account);
        bntMachine.setBackground(Color.decode("#fb8500"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bntMachine = new javax.swing.JButton();
        bntApproval = new javax.swing.JButton();
        btnTechnician = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bntAccout = new javax.swing.JButton();
        bntLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtHoTen = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtYeuCau = new javax.swing.JTextArea();
        txtGhiChu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bntAdd = new javax.swing.JButton();
        bntExit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtSerial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bntMachine.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        bntMachine.setMnemonic('N');
        bntMachine.setText("Machine");
        bntMachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntMachineActionPerformed(evt);
            }
        });

        bntApproval.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        bntApproval.setText("Approval");
        bntApproval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntApprovalActionPerformed(evt);
            }
        });

        btnTechnician.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnTechnician.setText("Technician");
        btnTechnician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTechnicianActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        bntAccout.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        bntAccout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAccoutActionPerformed(evt);
            }
        });

        bntLogout.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        bntLogout.setText("Logout");
        bntLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLogoutActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("IT Supporter Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(bntAccout)
                .addGap(34, 34, 34)
                .addComponent(bntLogout)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bntAccout, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        txtYeuCau.setColumns(20);
        txtYeuCau.setRows(5);
        jScrollPane1.setViewportView(txtYeuCau);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Họ tên");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Điện thoại");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Yêu cầu");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Ghi chú");

        bntAdd.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        bntAdd.setText("ADD");
        bntAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAddActionPerformed(evt);
            }
        });

        bntExit.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        bntExit.setText("EXIT");
        bntExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExitActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Add Machine");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Serial Machine");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(179, 179, 179))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtGhiChu)
                                .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                                .addComponent(txtHoTen, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(bntAdd)
                        .addGap(140, 140, 140)
                        .addComponent(bntExit)
                        .addGap(63, 63, 63))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntAdd)
                    .addComponent(bntExit))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntApproval, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTechnician, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntMachine, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bntMachine, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnTechnician, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(bntApproval, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntMachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntMachineActionPerformed
        // TODO add your handling code here:
        new Machine_Screen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bntMachineActionPerformed

    private void bntAccoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAccoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntAccoutActionPerformed

    private void bntLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLogoutActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn logout không???", "Message", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.NO_OPTION) {
            return;
        } else {
            new Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_bntLogoutActionPerformed

    private void bntAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAddActionPerformed
        // TODO add your handling code here:
        String hoTen = txtHoTen.getText();
        String SDT = txtSDT.getText();
        String serial = txtSerial.getText();
        String yeuCau = txtYeuCau.getText();
        String ghiChu = txtGhiChu.getText();
        List<Machine> machineList = controller.readDataFromFile("src/file/machine.txt");
        try {
            if (hoTen.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không được để trống họ tên", "Lỗi", JOptionPane.OK_OPTION);
                throw new Exception("Loi trong ten");
            } else if (SDT.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không được để trống số điện thoại", "Lỗi", JOptionPane.OK_OPTION);
                throw new Exception("Loi trong so dien thoai");
            } else if (yeuCau.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không được để trống yêu cầu", "Lỗi", JOptionPane.OK_OPTION);
                throw new Exception("Loi trong yeu cau");
            } else if (serial.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không được để trống số sê - ri", "Lỗi", JOptionPane.OK_OPTION);
                throw new Exception("Loi trong serial");
            } else if (!checkSerial(serial)) {
                JOptionPane.showMessageDialog(this, "Serial đã tồn tại, hãy kiểm tra lại Serial của máy", "Lỗi", JOptionPane.ERROR_MESSAGE);
                throw new Exception("Loi trung serial");
            } 
            else if(!isNumeric(SDT)){
                JOptionPane.showMessageDialog(this, "Lỗi kí tự và chữ cái trong số điện thoại", "Error", JOptionPane.ERROR_MESSAGE);
                throw new Exception("Loi ki tu trong so dien thoai");
            }else {
                int option = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn thêm máy này chứ ?", "Xác nhận", JOptionPane.OK_CANCEL_OPTION);
                if (option == JOptionPane.OK_OPTION) {
                    Machine machine = new Machine(hoTen, SDT, serial, yeuCau, "Chưa nhận", ghiChu);
                    machineList.add(machine);
                    controller.writeToFile(machineList, "src/file/machine.txt");
                    new Machine_Screen().setVisible(true);
                    this.dispose();
                }
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }


    }//GEN-LAST:event_bntAddActionPerformed

    private void bntExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExitActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(rootPane, "Bạn chắc chắn muốn thoát???", "Message", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.NO_OPTION) {
            return;
        } else {
            new Machine_Screen().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_bntExitActionPerformed

    private void btnTechnicianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTechnicianActionPerformed
        // TODO add your handling code here:
        new Technician_Screen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTechnicianActionPerformed

    private void bntApprovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntApprovalActionPerformed
        // TODO add your handling code here:
        new Approval_Screen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bntApprovalActionPerformed

    private boolean checkSerial(String serial) {
        List<Machine> machineList = controller.readDataFromFile("src/file/machine.txt");
        for (Machine mc : machineList) {
            if (serial.equals(mc.getSerial())) {
                return false;
            }
        }
        return true;
    }
    private boolean isNumeric(String check) {
        // Sử dụng biểu thức chính quy để kiểm tra chuỗi có chứa toàn số không
        return check.matches("\\d+");
    }
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
            java.util.logging.Logger.getLogger(Machine_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Machine_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Machine_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Machine_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Machine_Add().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton bntAccout;
    private static javax.swing.JButton bntAdd;
    private static javax.swing.JButton bntApproval;
    private static javax.swing.JButton bntExit;
    private static javax.swing.JButton bntLogout;
    private static javax.swing.JButton bntMachine;
    private static javax.swing.JButton btnTechnician;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextField txtGhiChu;
    private static javax.swing.JTextField txtHoTen;
    private static javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSerial;
    private static javax.swing.JTextArea txtYeuCau;
    // End of variables declaration//GEN-END:variables

}
