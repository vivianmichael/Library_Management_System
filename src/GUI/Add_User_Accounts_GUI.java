package GUI;

import DB.DB;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Extreme
 */
public class Add_User_Accounts_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Add_User_Accounts_GUI
     */
    public Add_User_Accounts_GUI() {
        initComponents();
        setResizable(false);
//         Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
//int X = (screen.width / 2) - (800 / 2); // Center horizontally.
//int Y = (screen.height / 2) - (600 / 2); // Center vertically.
//
//setLocation(X, Y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fnametxt = new javax.swing.JTextField();
        designation = new javax.swing.JTextField();
        unametxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        save = new javax.swing.JButton();
        pwdveritxt = new javax.swing.JPasswordField();
        pwdtxt = new javax.swing.JPasswordField();
        back = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add User Accounts");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/title ori.jpg"))); // NOI18N

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Library Management System", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add User Accounts", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Name");
        jLabel2.setBounds(30, 50, 70, 14);
        jLayeredPane2.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Designation");
        jLabel3.setBounds(30, 110, 70, 14);
        jLayeredPane2.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("User Name");
        jLabel4.setBounds(30, 160, 58, 14);
        jLayeredPane2.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Password");
        jLabel5.setBounds(30, 220, 48, 14);
        jLayeredPane2.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Verify Password");
        jLabel6.setBounds(30, 280, 84, 14);
        jLayeredPane2.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Email");
        jLabel7.setBounds(40, 340, 31, 14);
        jLayeredPane2.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fnametxt.setBounds(140, 50, 210, 20);
        jLayeredPane2.add(fnametxt, javax.swing.JLayeredPane.DEFAULT_LAYER);

        designation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designationActionPerformed(evt);
            }
        });
        designation.setBounds(140, 110, 210, 20);
        jLayeredPane2.add(designation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        unametxt.setBounds(140, 160, 210, 20);
        jLayeredPane2.add(unametxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        emailtxt.setBounds(140, 330, 210, 20);
        jLayeredPane2.add(emailtxt, javax.swing.JLayeredPane.DEFAULT_LAYER);

        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reset.gif"))); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        reset.setBounds(380, 370, 90, 30);
        jLayeredPane2.add(reset, javax.swing.JLayeredPane.DEFAULT_LAYER);

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/save.png"))); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        save.setBounds(490, 370, 90, 30);
        jLayeredPane2.add(save, javax.swing.JLayeredPane.DEFAULT_LAYER);

        pwdveritxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdveritxtActionPerformed(evt);
            }
        });
        pwdveritxt.setBounds(140, 270, 210, 20);
        jLayeredPane2.add(pwdveritxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pwdtxt.setBounds(140, 210, 210, 20);
        jLayeredPane2.add(pwdtxt, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBounds(60, 50, 610, 430);
        jLayeredPane1.add(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/back1.png"))); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        back.setBounds(680, 290, 90, 30);
        jLayeredPane1.add(back, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu2.setText("Navigate");

        jMenuItem8.setText("Home");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem2.setText("Manage Members");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Manage Books");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Manage Book Lending");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Manage Inventory");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Manage Newspaper Reocords");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Manage User Accounts");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-816)/2, (screenSize.height-638)/2, 816, 638);
    }// </editor-fold>//GEN-END:initComponents

    private void designationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_designationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_designationActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
          try
        {
                String password1 = new String (pwdtxt.getPassword());
                String password2 = new String (pwdveritxt.getPassword());
                String Email1=emailtxt.getText();
            if (fnametxt.getText().equals("") || designation.getText().equals("")||emailtxt.getText().equals("")||emailtxt.getText().equals("")||unametxt.getText().equals("")||pwdtxt.getText().equals("")||pwdveritxt.getText().equals("")) 
            {
              JOptionPane.showMessageDialog(this, "Please fill in all fields ", "",JOptionPane.WARNING_MESSAGE);
            }
            else if(!((Email1.indexOf("@")>0)&&((Email1.indexOf(".")-Email1.indexOf("@"))>0)&&(((Email1.length()-1)-Email1.indexOf("."))>1)))
            {
            JOptionPane.showMessageDialog(this, "Please fill the Email field correctly ", "",JOptionPane.WARNING_MESSAGE);
            }
            else if(!(password1.equals(password2)))
            {
                 JOptionPane.showMessageDialog(this, "Passwords verification incorrect ", "",JOptionPane.WARNING_MESSAGE);
            }
            
            
            else
            {
                
                
                String fname=fnametxt.getText();
                String desi=designation.getText();
                String email=emailtxt.getText();
                String uname=unametxt.getText();
                
              
                
                
                
                Connection con = DB.myCon();
            Statement stmt = con.createStatement();
             int inevtoryid=0;
             
            
            String query1="INSERT into user Values('"+uname+"','"+password1 +"','"+fname+"','"+desi+"','"+email+"','Logged Off')";
         
            stmt.executeUpdate(query1);
           JOptionPane.showMessageDialog(this,"User Account created Successfully");
           fnametxt.setText("");
           designation.setText("");
            emailtxt.setText("");
            unametxt.setText("");
            pwdtxt.setText("");
            pwdveritxt.setText("");
            }
            
            
            
        }
        catch (Exception e) 
      {
          JOptionPane.showMessageDialog(this, ""+e.getMessage()+" Error, !","",JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_saveActionPerformed

    private void pwdveritxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdveritxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdveritxtActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new Manage_User_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
            
            fnametxt.setText("");
            designation.setText("");
            emailtxt.setText("");
            unametxt.setText("");
            pwdtxt.setText("");
            pwdveritxt.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        new Home_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new Manage_Members_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new Manage_Books_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new Manage_Book_Lending().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new Manage_Inventory_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new Manage_Newspaper_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        new Manage_User_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add_User_Accounts_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_User_Accounts_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_User_Accounts_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_User_Accounts_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Add_User_Accounts_GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField designation;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JTextField fnametxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPasswordField pwdtxt;
    private javax.swing.JPasswordField pwdveritxt;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JTextField unametxt;
    // End of variables declaration//GEN-END:variables
}