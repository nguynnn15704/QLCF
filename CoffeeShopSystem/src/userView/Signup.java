package userView;

import dao.UserDao;
import javax.swing.JOptionPane;
import java.sql.Date;

public class Signup extends javax.swing.JFrame {

    UserDao user = new UserDao();

    public Signup() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        signPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        signPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        signUsername = new javax.swing.JTextField();
        btnSignup = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(100, 19, 19));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Bạn đã có tài khoản?");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(100, 19, 19));
        jLabel1.setText("TẠO TÀI KHOẢN");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 200, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Số điện thoại:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, 20));

        signPhone.setBackground(new java.awt.Color(255, 255, 255));
        signPhone.setForeground(new java.awt.Color(0, 0, 0));
        signPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signPhoneActionPerformed(evt);
            }
        });
        jPanel2.add(signPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 240, 40));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Mật khẩu:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 60, 20));

        signPassword.setBackground(new java.awt.Color(255, 255, 255));
        signPassword.setForeground(new java.awt.Color(0, 0, 0));
        signPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(signPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 240, 40));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tên đăng nhập:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, 20));

        signUsername.setBackground(new java.awt.Color(255, 255, 255));
        signUsername.setForeground(new java.awt.Color(0, 0, 0));
        signUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUsernameActionPerformed(evt);
            }
        });
        jPanel2.add(signUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 240, 40));

        btnSignup.setBackground(new java.awt.Color(100, 19, 19));
        btnSignup.setForeground(new java.awt.Color(255, 255, 255));
        btnSignup.setText("Đăng ký");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 240, 40));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("Đăng nhập");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 100, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 480, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Kiểm tra các TextField không rỗng
    public boolean isEmpty() {
        if (signPhone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name is required", "Warning", 2);
            return false;
        }
        if (signUsername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username is required", "Warning", 2);
            return false;
        }
        if (String.valueOf(signPassword.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password is required", "Warning", 2);
            return false;
        }
        return true;
    }

    private void signPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signPhoneActionPerformed
        
    }//GEN-LAST:event_signPhoneActionPerformed

    private void signPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signPasswordActionPerformed
       
    }//GEN-LAST:event_signPasswordActionPerformed

    private void signUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUsernameActionPerformed
        
    }//GEN-LAST:event_signUsernameActionPerformed

    // Đăng ký
    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        if (isEmpty()) {
            int id = user.getMaxRow() + 1; // Lấy ID mới là giá trị lớn nhất hiện tại cộng thêm 1
            String phone = signPhone.getText();
            String username = signUsername.getText();
            String password = String.valueOf(signPassword.getPassword());
            Date signday = new Date(System.currentTimeMillis()); // Ngày đăng ký tài khoản
            if (!user.isPhoneExist(phone)) {
                if (!user.isUsernameExist(username)){
                    user.insert(id, phone,signday, username, password);
                    new Login().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Tên đăng nhập đã tồn tại", "Warning", 2);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Số điện thoại này đã được đăng ký", "Warning", 2);
            }
        }
    }//GEN-LAST:event_btnSignupActionPerformed

    // Link tới Login Frame
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Login LogInFrame = new Login();
        LogInFrame.setVisible(true);
        LogInFrame.pack();
        LogInFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoginMouseClicked

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField signPassword;
    private javax.swing.JTextField signPhone;
    private javax.swing.JTextField signUsername;
    // End of variables declaration//GEN-END:variables
}
