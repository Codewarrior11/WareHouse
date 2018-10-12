package warehouse;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Appel
 */
public class LoginPage extends javax.swing.JFrame {

    String id;
    String pass;

    public LoginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LoginMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        teacher = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        student = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        mainloginmenu = new javax.swing.JPanel();
        Welcome = new javax.swing.JPanel();
        wlcm_pic = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        adminlogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        admin_username = new javax.swing.JTextField();
        admin_pass = new javax.swing.JPasswordField();
        admin_cancel_btn = new javax.swing.JButton();
        admin_log_btn = new javax.swing.JButton();
        managerlogin = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        manager_id = new javax.swing.JTextField();
        manager_pass = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        manager_login = new javax.swing.JButton();
        manager_cancel = new javax.swing.JButton();
        emp_login = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        emp_id = new javax.swing.JTextField();
        emp_pass = new javax.swing.JPasswordField();
        emp_cancel_btn = new javax.swing.JButton();
        emp_login_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginMenu.setBackground(new java.awt.Color(102, 102, 255));
        LoginMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SignIn");
        LoginMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 60));

        teacher.setFont(new java.awt.Font("Unispace", 0, 36)); // NOI18N
        teacher.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teacher.setText("Salse officer");
        teacher.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        teacher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        teacher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacherMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                teacherMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                teacherMouseExited(evt);
            }
        });
        LoginMenu.add(teacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 210, 50));

        admin.setFont(new java.awt.Font("Unispace", 0, 36)); // NOI18N
        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin.setText("Admin");
        admin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminMouseExited(evt);
            }
        });
        LoginMenu.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 210, 50));

        student.setFont(new java.awt.Font("Unispace", 0, 36)); // NOI18N
        student.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        student.setText("Manager");
        student.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        student.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studentMouseExited(evt);
            }
        });
        LoginMenu.add(student, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 210, 50));
        LoginMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 250, -1));

        jPanel1.add(LoginMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 540));

        mainloginmenu.setBackground(new java.awt.Color(0, 102, 102));
        mainloginmenu.setLayout(new java.awt.CardLayout());

        Welcome.setBackground(new java.awt.Color(51, 51, 51));
        Welcome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wlcm_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hqdefault(1).jpg"))); // NOI18N
        Welcome.add(wlcm_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 540));

        jLabel11.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("WAREHOUSE MANAGEMENT SYSTEM");
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 51), 2, true));
        Welcome.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 450, 60));

        jLabel12.setFont(new java.awt.Font("Andy", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Developed By : ViRuS SqUaD");
        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 0), 1, true));
        Welcome.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 483, 390, 40));

        mainloginmenu.add(Welcome, "card2");

        adminlogin.setBackground(new java.awt.Color(255, 0, 51));
        adminlogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(51, 51, 255));
        jLabel2.setFont(new java.awt.Font("Unispace", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Admin SignIn");
        adminlogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 11, 401, 43));

        jLabel3.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("User Name");
        adminlogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 147, -1, -1));

        jLabel4.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Password");
        adminlogin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 206, 81, -1));
        adminlogin.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 226, 203, 8));
        adminlogin.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 164, 203, 19));

        admin_username.setBackground(new java.awt.Color(255, 0, 51));
        admin_username.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        admin_username.setForeground(new java.awt.Color(255, 255, 255));
        admin_username.setBorder(null);
        admin_username.setOpaque(false);
        adminlogin.add(admin_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 200, 30));

        admin_pass.setBackground(new java.awt.Color(255, 0, 51));
        admin_pass.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        admin_pass.setForeground(new java.awt.Color(255, 255, 255));
        admin_pass.setBorder(null);
        admin_pass.setOpaque(false);
        adminlogin.add(admin_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 200, 30));

        admin_cancel_btn.setBackground(new java.awt.Color(0, 102, 102));
        admin_cancel_btn.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        admin_cancel_btn.setText("Cancel");
        admin_cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_cancel_btnActionPerformed(evt);
            }
        });
        adminlogin.add(admin_cancel_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, -1, -1));

        admin_log_btn.setBackground(new java.awt.Color(0, 102, 102));
        admin_log_btn.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        admin_log_btn.setText("Login");
        admin_log_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_log_btnActionPerformed(evt);
            }
        });
        adminlogin.add(admin_log_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));

        mainloginmenu.add(adminlogin, "card2");

        managerlogin.setBackground(new java.awt.Color(102, 102, 102));
        managerlogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(51, 51, 255));
        jLabel5.setFont(new java.awt.Font("Unispace", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Manager login");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        managerlogin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 401, 43));

        jLabel6.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Manager Id:");
        managerlogin.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Password:");
        managerlogin.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        manager_id.setBackground(new java.awt.Color(102, 102, 102));
        manager_id.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        manager_id.setBorder(null);
        manager_id.setOpaque(false);
        managerlogin.add(manager_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 200, 20));

        manager_pass.setBackground(new java.awt.Color(102, 102, 102));
        manager_pass.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        manager_pass.setBorder(null);
        manager_pass.setOpaque(false);
        managerlogin.add(manager_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 200, 20));
        managerlogin.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 200, 8));
        managerlogin.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 203, 8));

        manager_login.setBackground(new java.awt.Color(0, 0, 0));
        manager_login.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        manager_login.setForeground(new java.awt.Color(255, 255, 255));
        manager_login.setText("Login");
        manager_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manager_loginActionPerformed(evt);
            }
        });
        managerlogin.add(manager_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, -1, -1));

        manager_cancel.setBackground(new java.awt.Color(0, 0, 0));
        manager_cancel.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        manager_cancel.setForeground(new java.awt.Color(255, 255, 255));
        manager_cancel.setText("Cancel");
        manager_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manager_cancelActionPerformed(evt);
            }
        });
        managerlogin.add(manager_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, -1, -1));

        mainloginmenu.add(managerlogin, "card2");

        emp_login.setBackground(new java.awt.Color(102, 0, 102));
        emp_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(51, 51, 255));
        jLabel8.setFont(new java.awt.Font("Unispace", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Teacher login");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        emp_login.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 401, 43));

        jLabel9.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Employee Id:");
        emp_login.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, -1));

        jLabel10.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Password:");
        emp_login.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 190, 110, -1));
        emp_login.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 200, 8));
        emp_login.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 200, 8));

        emp_id.setBackground(new java.awt.Color(102, 0, 102));
        emp_id.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        emp_id.setBorder(null);
        emp_id.setOpaque(false);
        emp_login.add(emp_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 200, 20));

        emp_pass.setBackground(new java.awt.Color(102, 0, 102));
        emp_pass.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        emp_pass.setBorder(null);
        emp_pass.setOpaque(false);
        emp_login.add(emp_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 200, 20));

        emp_cancel_btn.setBackground(new java.awt.Color(0, 0, 0));
        emp_cancel_btn.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        emp_cancel_btn.setForeground(new java.awt.Color(255, 255, 255));
        emp_cancel_btn.setText("Cancel");
        emp_cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_cancel_btnActionPerformed(evt);
            }
        });
        emp_login.add(emp_cancel_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        emp_login_btn.setBackground(new java.awt.Color(0, 0, 0));
        emp_login_btn.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        emp_login_btn.setForeground(new java.awt.Color(255, 255, 255));
        emp_login_btn.setText("Login");
        emp_login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_login_btnActionPerformed(evt);
            }
        });
        emp_login.add(emp_login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        mainloginmenu.add(emp_login, "card2");

        jPanel1.add(mainloginmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 470, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseEntered
        admin.setForeground(Color.red);
    }//GEN-LAST:event_adminMouseEntered

    private void adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseExited
        admin.setForeground(Color.BLACK);
    }//GEN-LAST:event_adminMouseExited

    private void studentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentMouseEntered
        student.setForeground(Color.red);
    }//GEN-LAST:event_studentMouseEntered

    private void studentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentMouseExited
        student.setForeground(Color.BLACK);
    }//GEN-LAST:event_studentMouseExited

    private void teacherMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherMouseEntered
        teacher.setForeground(Color.red);
    }//GEN-LAST:event_teacherMouseEntered

    private void teacherMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherMouseExited
        teacher.setForeground(Color.BLACK);
    }//GEN-LAST:event_teacherMouseExited

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
        mainloginmenu.removeAll();
        mainloginmenu.repaint();
        mainloginmenu.revalidate();

        mainloginmenu.add(adminlogin);
        mainloginmenu.repaint();
        mainloginmenu.revalidate();
        //panel1.setVisible(false);
        //adl.setVisible(true);
    }//GEN-LAST:event_adminMouseClicked

    private void studentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentMouseClicked
        mainloginmenu.removeAll();
        mainloginmenu.repaint();
        mainloginmenu.revalidate();

        mainloginmenu.add(managerlogin);
        mainloginmenu.repaint();
        mainloginmenu.revalidate();
    }//GEN-LAST:event_studentMouseClicked

    private void teacherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherMouseClicked
        mainloginmenu.removeAll();
        mainloginmenu.repaint();
        mainloginmenu.revalidate();

        mainloginmenu.add(emp_login);
        mainloginmenu.repaint();
        mainloginmenu.revalidate();
    }//GEN-LAST:event_teacherMouseClicked

    private void manager_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manager_loginActionPerformed
        loginclass login=new loginclass();
        login.adminlogin(manager_id.getText(), manager_pass.getText().toString(),"Manager");

    }//GEN-LAST:event_manager_loginActionPerformed

    private void admin_log_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_log_btnActionPerformed
       loginclass login=new loginclass();
        login.adminlogin(admin_username.getText(), admin_pass.getText().toString(),"Admin");
    }//GEN-LAST:event_admin_log_btnActionPerformed

    private void admin_cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_cancel_btnActionPerformed
     
        cancelbtn();
    }//GEN-LAST:event_admin_cancel_btnActionPerformed

    private void manager_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manager_cancelActionPerformed
      cancelbtn();
    }//GEN-LAST:event_manager_cancelActionPerformed

    private void emp_cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_cancel_btnActionPerformed
        cancelbtn();
    }//GEN-LAST:event_emp_cancel_btnActionPerformed

    private void emp_login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_login_btnActionPerformed
     loginclass login=new loginclass();
        login.adminlogin(emp_id.getText(), emp_pass.getText().toString(),"Salse Officer");
    }//GEN-LAST:event_emp_login_btnActionPerformed

    
    
    
    public void cancelbtn(){
        mainloginmenu.removeAll();
        mainloginmenu.repaint();
        mainloginmenu.revalidate();

        mainloginmenu.add(Welcome);
        mainloginmenu.repaint();
        mainloginmenu.revalidate();

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginMenu;
    private javax.swing.JPanel Welcome;
    private javax.swing.JLabel admin;
    private javax.swing.JButton admin_cancel_btn;
    private javax.swing.JButton admin_log_btn;
    private javax.swing.JPasswordField admin_pass;
    private javax.swing.JTextField admin_username;
    private javax.swing.JPanel adminlogin;
    private javax.swing.JButton emp_cancel_btn;
    private javax.swing.JTextField emp_id;
    private javax.swing.JPanel emp_login;
    private javax.swing.JButton emp_login_btn;
    private javax.swing.JPasswordField emp_pass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPanel mainloginmenu;
    private javax.swing.JButton manager_cancel;
    private javax.swing.JTextField manager_id;
    private javax.swing.JButton manager_login;
    private javax.swing.JPasswordField manager_pass;
    private javax.swing.JPanel managerlogin;
    private javax.swing.JLabel student;
    private javax.swing.JLabel teacher;
    private javax.swing.JLabel wlcm_pic;
    // End of variables declaration//GEN-END:variables
public void windowclosing() {
        this.setState(LoginPage.HIDE_ON_CLOSE);
    }
}


