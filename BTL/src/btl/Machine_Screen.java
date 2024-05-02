package btl;

import controller.MyController;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controller.MyController;
import controller.controller;
import model.Bill;
import model.Machine;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author HoNamTu
 */
public class Machine_Screen extends javax.swing.JFrame {

    //private List<Machine> ListMachine;
    private static DefaultTableModel modelMachine;
    private static MyController controller = new MyController();

    public Machine_Screen() {
        List<Machine> machineList = controller.readDataFromFile("src/file/machine.txt");
        String account = controller.readAccountFromFile("src/file/account.txt");
        initComponents();
        setLocationRelativeTo(null);
        bntAccout.setText(account);
        bntMachine.setBackground(Color.decode("#fb8500"));
        modelMachine = (DefaultTableModel) tblMachine.getModel();
        this.showData(machineList, modelMachine);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bntMachine = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bntAccout = new javax.swing.JButton();
        bntLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAddNewMachine = new javax.swing.JButton();
        btnDeleteMachine = new javax.swing.JButton();
        btnEditMachine = new javax.swing.JButton();
        btnShowMachine = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMachine = new javax.swing.JTable();
        btnTechnician = new javax.swing.JButton();
        bntApproval = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bntMachine.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        bntMachine.setMnemonic('N');
        bntMachine.setText("Machine");
        bntMachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntMachineActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        bntAccout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bntAccout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAccoutActionPerformed(evt);
            }
        });

        bntLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bntLogout.setText("Logout");
        bntLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLogoutActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("IT Supporter Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(84, 84, 84)
                .addComponent(bntAccout)
                .addGap(44, 44, 44)
                .addComponent(bntLogout)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(bntAccout, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        btnAddNewMachine.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnAddNewMachine.setText("ADD");
        btnAddNewMachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewMachineActionPerformed(evt);
            }
        });

        btnDeleteMachine.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnDeleteMachine.setText("DELETE");
        btnDeleteMachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMachineActionPerformed(evt);
            }
        });

        btnEditMachine.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnEditMachine.setText("EDIT");
        btnEditMachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditMachineActionPerformed(evt);
            }
        });

        btnShowMachine.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnShowMachine.setText("SHOW");
        btnShowMachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowMachineActionPerformed(evt);
            }
        });

        tblMachine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Họ tên", "Điện thoại", "Serial", "Yêu cầu", "Trạng thái", "Ghi chú"
            }
        ));
        tblMachine.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jScrollPane1.setViewportView(tblMachine);

        btnTechnician.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnTechnician.setText("Technician");
        btnTechnician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTechnicianActionPerformed(evt);
            }
        });

        bntApproval.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        bntApproval.setText("Approval");
        bntApproval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntApprovalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bntApproval, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(btnTechnician, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(bntMachine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(btnAddNewMachine, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btnShowMachine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditMachine)
                .addGap(58, 58, 58)
                .addComponent(btnDeleteMachine)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bntMachine, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnTechnician, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(bntApproval, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddNewMachine, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteMachine, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditMachine, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnShowMachine, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntMachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntMachineActionPerformed
        // TODO add your handling code here:
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

    private void btnAddNewMachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewMachineActionPerformed
        // TODO add your handling code here:
        new Machine_Add().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddNewMachineActionPerformed

    private void btnShowMachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowMachineActionPerformed
        int selectedRow = tblMachine.getSelectedRow();
        try {
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Hãy chọn vào máy muốn xem", "Lỗi", JOptionPane.ERROR_MESSAGE);
                throw new Exception("Loi chon dong");

            } else {
                DefaultTableModel model = (DefaultTableModel) tblMachine.getModel();
                String hoTen = (String) model.getValueAt(selectedRow, 1);
                String SDT = (String) model.getValueAt(selectedRow, 2);
                String serial = (String) model.getValueAt(selectedRow, 3);
                String yeuCau = (String) model.getValueAt(selectedRow, 4);
                String ghiChu = (String) model.getValueAt(selectedRow, 6);
                String trangThai = (String) model.getValueAt(selectedRow, 5);
                String account = controller.readAccountFromFile("src/file/account.txt");
                boolean check = checkValidate();
                if ("Chưa nhận".equals(trangThai) && check && !"admin".equals(account)) {
                    List<Machine> machineList = controller.readDataFromFile("src/file/machine.txt");
                    int index = -1;
                    int ps = 0;
                    for (Machine machine : machineList) {
                        if (SDT.equals(machine.getPhone())) {
                            index = ps;
                        }
                        ps++;
                    }
                    if (index != -1) {
                        MachineShowAdd machine = new MachineShowAdd();
                        machine.displayDetails(index, hoTen, SDT, serial, yeuCau, ghiChu);
                        machine.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Không tồn tại dòng vừa chọn trong cơ sở dữ liệu", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        throw new Exception("Loi dong chon");
                    }

                } else {
                    Machine_Show showMachine = new Machine_Show();
                    showMachine.displayDetails(hoTen, SDT, serial, yeuCau, ghiChu);
                    showMachine.setVisible(true);
                    this.dispose();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_btnShowMachineActionPerformed

    private void btnEditMachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditMachineActionPerformed
        int selectedRow = tblMachine.getSelectedRow();
        try {
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Hãy chọn máy muốn sửa thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
                throw new Exception("Loi chon dong");
            } else {
                DefaultTableModel model = (DefaultTableModel) tblMachine.getModel();
                String hoTen = (String) model.getValueAt(selectedRow, 1);
                String SDT = (String) model.getValueAt(selectedRow, 2);
                String serial = (String) model.getValueAt(selectedRow, 3);
                String yeuCau = (String) model.getValueAt(selectedRow, 4);
                String ghiChu = (String) model.getValueAt(selectedRow, 6);

                Machine_Edit editMachine = new Machine_Edit();
                List<Machine> machineList = controller.readDataFromFile("src/file/machine.txt");
                int index = -1;
                int ps = 0;
                for (Machine machine : machineList) {
                    if (machine.getPhone().equals(SDT)) {
                        index = ps;
                    }
                    ps++;
                }
                if (index != -1) {
                    editMachine.displayDetails(selectedRow, hoTen, SDT, serial, yeuCau, ghiChu);
                    editMachine.setVisible(true);
                    this.dispose();
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Không tồn tại dòng vừa chọn trong cơ sở dữ liệu", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    throw new Exception("Loi dong chon");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnEditMachineActionPerformed

    private void btnDeleteMachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMachineActionPerformed
        // TODO add your handling code here:
        int indexDelete = tblMachine.getSelectedRow();
        List<Machine> machineList = controller.readDataFromFile("src/file/machine.txt");
        try {
            if (machineList.size() == 0) {
                JOptionPane.showMessageDialog(this, "Bảng trống");
            } else if (indexDelete == -1) {
                JOptionPane.showMessageDialog(this, "Chưa chọn máy cần xóa", "Lỗi", JOptionPane.ERROR_MESSAGE);
                throw new Exception("Loi chon dong");
            } else {
                int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa máy này không???", "Message", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.NO_OPTION) {
                    return;
                } else {
                    deleteApproval(indexDelete);
                    machineList.remove(indexDelete);
                    showData(machineList, modelMachine);
                    JOptionPane.showMessageDialog(this, "Máy đã được xóa");
                    controller.writeToFile(machineList, "src/file/Machine.txt");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteMachineActionPerformed

    private void btnTechnicianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTechnicianActionPerformed
        new Technician_Screen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTechnicianActionPerformed

    private void bntApprovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntApprovalActionPerformed
        // TODO add your handling code here:
        new Approval_Screen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bntApprovalActionPerformed

    private void showData(List<Machine> list, DefaultTableModel model) {
        try {
            model.setRowCount(0);
            int count = 1;
            for (Machine machine : list) {
                model.addRow(new Object[]{
                    count++,
                    machine.getName(),
                    machine.getPhone(),
                    machine.getSerial(),
                    machine.getRequirements(),
                    machine.getStatements(),
                    machine.getNotes()
                });
            }
        }
        catch(Exception ex){
            System.out.println("Loi khong co du lieu trong file : " + ex.getMessage());
        }
    }

    private boolean checkValidate() {
        String account = controller.readAccountFromFile("src/file/account.txt");
        List<Bill> billList = controller.readDataFromFile("src/file/bill.txt");
        boolean check = true;
        for (Bill bill : billList) {
            if (account.equals(bill.getAccount()) && "Hoàn thành".equals(bill.getStatements()) == false) {
                check = false;
            }
        }
        return check;
    }

    private void deleteApproval(int indexDelete) {
        List<Machine> machineList = controller.readDataFromFile("src/file/machine.txt");
        List<Bill> billList = controller.readDataFromFile("src/file/bill.txt");
        for (Bill bill : billList) {
            if ((bill.getSerialMachine()).equals((machineList.get(indexDelete)).getSerial())) {
                billList.remove(bill);
                break;
            }
        }
        controller.writeToFile(billList, "src/file/bill.txt");
    }

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
            java.util.logging.Logger.getLogger(Machine_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Machine_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Machine_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Machine_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Machine_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton bntAccout;
    private static javax.swing.JButton bntApproval;
    private static javax.swing.JButton bntLogout;
    private static javax.swing.JButton bntMachine;
    private static javax.swing.JButton btnAddNewMachine;
    private static javax.swing.JButton btnDeleteMachine;
    private static javax.swing.JButton btnEditMachine;
    private static javax.swing.JButton btnShowMachine;
    private static javax.swing.JButton btnTechnician;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tblMachine;
    // End of variables declaration//GEN-END:variables

}
