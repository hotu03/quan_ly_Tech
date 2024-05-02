/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package btl;


import controller.MyController;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import model.Bill;
import model.Machine;
import model.Technician;

/**
 *
 * @author Duc Xuan
 */
public class MachineShowAdd extends javax.swing.JFrame {

    private static MyController controller = new MyController();

    private static int index;

    public MachineShowAdd() {
        String account = controller.readAccountFromFile("src/file/account.txt");
        initComponents();
        setLocationRelativeTo(null);
        bntAccount.setText(account);
    }

    public void displayDetails(int ps, String hoTen, String SDT, String serial, String yeuCau, String ghiChu) {
        txtHoTen.setText(hoTen);
        txtSDT.setText(SDT);
        txtSerial.setText(serial);
        txtYeuCau.setText(yeuCau);
        txtGhiChu.setText(ghiChu);
        index = ps;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        bntExit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        addMachine = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtSerial = new javax.swing.JTextField();
        btnTechnician = new javax.swing.JButton();
        bntApproval = new javax.swing.JButton();
        bntMachine = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bntAccount = new javax.swing.JButton();
        bntLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(724, 418));

        txtHoTen.setEnabled(false);

        txtSDT.setEnabled(false);

        txtYeuCau.setColumns(20);
        txtYeuCau.setRows(5);
        txtYeuCau.setEnabled(false);
        jScrollPane1.setViewportView(txtYeuCau);

        txtGhiChu.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Họ tên");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Điện thoại");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Yêu cầu");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Ghi chú");

        bntExit.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        bntExit.setText("EXIT");
        bntExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExitActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel7.setText("Show Machine");

        addMachine.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addMachine.setText("Nhận máy");
        addMachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMachineActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Serial Machine");

        txtSerial.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 175, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(179, 179, 179))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(addMachine)
                        .addGap(147, 147, 147)
                        .addComponent(bntExit)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(35, 35, 35))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(27, 27, 27)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSerial, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtGhiChu)
                                .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                                .addComponent(txtHoTen, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(26, 26, 26))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntExit)
                    .addComponent(addMachine))
                .addGap(35, 35, 35))
        );

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

        bntMachine.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        bntMachine.setMnemonic('N');
        bntMachine.setText("Machine");
        bntMachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntMachineActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        bntAccount.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        bntAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAccountActionPerformed(evt);
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
                .addComponent(bntAccount)
                .addGap(34, 34, 34)
                .addComponent(bntLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(bntAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntMachine, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntApproval, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTechnician, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bntMachine, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnTechnician, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(bntApproval, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTechnicianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTechnicianActionPerformed
        // TODO add your handling code here:
        new Technician_Screen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTechnicianActionPerformed

    private void bntApprovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntApprovalActionPerformed
        new Approval_Screen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bntApprovalActionPerformed

    private void bntMachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntMachineActionPerformed
        // TODO add your handling code here:
        new Machine_Screen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bntMachineActionPerformed

    private void bntAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntAccountActionPerformed

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

    private void addMachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMachineActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(this, "Bạn xác nhận nhận máy chứ", "Xác nhận", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String account = controller.readAccountFromFile("src/file/account.txt");
            List<Machine> machineList = controller.readDataFromFile("src/file/machine.txt");
            List<Technician> technicianList = controller.readDataFromFile("src/file/technician.txt");
            List<Bill> billList = controller.readDataFromFile("src/file/bill.txt");
            machineList.get(index).setStatements("Đã nhận");
            controller.writeToFile(machineList, "src/file/machine.txt");
            Machine machine = machineList.get(index);
            ArrayList<String> billID = new ArrayList<String>();
            for (Bill bill : billList) {
                billID.add(bill.getBillID());
            }
            String newBillID = generateBillID();
            do {
                // Generate a new BillID
                newBillID = generateBillID();
            } while (billID.contains(newBillID));
            Technician technician = new Technician();
            for(Technician tech : technicianList){
                if(account.equals(tech.getAccountName())){
                    technician = tech;
                }
            }   
            Bill newBill = new Bill(newBillID, machine.getName(), machine.getPhone(), machine.getSerial(), machine.getRequirements(), "Nhận máy", technician.getName(), technician.getPhone(), technician.getAccountName(), machine.getNotes());
            billList.add(newBill);
            controller.writeToFile(billList, "src/file/bill.txt");
            new Machine_Screen().setVisible(true);
            this.dispose();
            JOptionPane.showMessageDialog(this, "Thêm máy thành công", "Thông báo", JOptionPane.OK_OPTION);
        }
    
    }//GEN-LAST:event_addMachineActionPerformed

    private void bntExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExitActionPerformed
        // TODO add your handling code here:
        new Machine_Screen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bntExitActionPerformed

public static String generateBillID() {
        // Define the characters for letters and numbers
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";

        // Create a StringBuilder to store the generated billID
        StringBuilder billIDBuilder = new StringBuilder();

        // Create a Random object
        Random random = new Random();

        // Generate the first two characters (letters)
        for (int i = 0; i < 2; i++) {
            int index = random.nextInt(letters.length());
            char randomChar = letters.charAt(index);
            billIDBuilder.append(randomChar);
        }

        // Generate the next three characters (numbers)
        for (int i = 0; i < 3; i++) {
            int index = random.nextInt(numbers.length());
            char randomChar = numbers.charAt(index);
            billIDBuilder.append(randomChar);
        }

        // Convert the StringBuilder to a String and return the result
        return billIDBuilder.toString();
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
            java.util.logging.Logger.getLogger(MachineShowAdd.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MachineShowAdd.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MachineShowAdd.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MachineShowAdd.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MachineShowAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMachine;
    private static javax.swing.JButton bntAccount;
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
    protected static javax.swing.JTextField txtGhiChu;
    protected static javax.swing.JTextField txtHoTen;
    protected static javax.swing.JTextField txtSDT;
    protected static javax.swing.JTextField txtSerial;
    protected static javax.swing.JTextArea txtYeuCau;
    // End of variables declaration//GEN-END:variables
}
