/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package canteen.sales.operations;

import javax.swing.JOptionPane;

/**
 *
 *
 * @author WINCHESTER
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Registration() {
        initComponents();
        
        name_txt.setToolTipText("first letter must be uppercase and only alphabetic characters allowed.");
        surname_txt.setToolTipText("fisr letter must be uppercase, and only alphabetic characters allowed.");
        username_txt.setToolTipText("Only alphanumeric characters allowed");
        phoneNumb_txt.setToolTipText("Only numeric characters allowed");
        password_txt.setToolTipText("at least one uppercase letter, one lowercase letter,one digit and no spaces. ");
        food_txt.setToolTipText("only alphabetic characters allowed.");
        
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
        username_txt = new javax.swing.JTextField();
        phoneNumb_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        password_txt = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        food_txt = new javax.swing.JTextField();
        cancelbutton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        surname_txt = new javax.swing.JTextField();
        name_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRATION FORM");
        setBackground(new java.awt.Color(51, 102, 255));
        setMinimumSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 51), 5), "Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(0, 204, 51))); // NOI18N

        phoneNumb_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumb_txtActionPerformed(evt);
            }
        });

        jLabel5.setText("Phone number:");

        jLabel3.setText("Password:");

        password_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_txtActionPerformed(evt);
            }
        });

        jLabel6.setText("What is your favorite food?");

        cancelbutton.setBackground(new java.awt.Color(0, 204, 0));
        cancelbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelbutton.setText("Cancel");
        cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbuttonActionPerformed(evt);
            }
        });

        registerButton.setBackground(new java.awt.Color(0, 204, 0));
        registerButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        name_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_txtActionPerformed(evt);
            }
        });

        jLabel1.setText(" Name:");

        jLabel2.setText("Surname:");

        jLabel4.setText("Username:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(food_txt)
                    .addComponent(password_txt)
                    .addComponent(phoneNumb_txt)
                    .addComponent(name_txt)
                    .addComponent(surname_txt)
                    .addComponent(username_txt))
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(cancelbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(surname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(phoneNumb_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(food_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelbutton))
                .addGap(49, 49, 49))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void name_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_txtActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_name_txtActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed

        if ((name_txt.getText().equals("")) || surname_txt.getText().equals("") || username_txt.getText().equals("") || phoneNumb_txt.getText().equals("") || password_txt.getPassword().equals("") || food_txt.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Please fill in all fields!!", "register", JOptionPane.ERROR_MESSAGE);
            return;
            
        }

        //REGEX KURALLARI
        String nameRegex = "^[A-ZÇĞİÖŞÜ][a-zçğıöşü]+$";
        String surnameRegex = "^[A-ZÇĞİÖŞÜ][a-zçğıöşü]+$";
        String usernameRegex = "^[a-zA-ZğĞüÜşŞıİöÖçÇ0-9]+$";
        String phoneRegex = "^\\d+$";
        String passwordRegex = "^(?=.*[a-zğüşıöç])(?=.*[A-ZĞÜŞİÖÇ])(?=.*\\d).+$";
        String favoritefoodRegex = "^[a-zA-ZğĞüÜşŞıİöÖçÇ]+$";
        
        if (!name_txt.getText().matches(nameRegex) || !surname_txt.getText().matches(surnameRegex)
                || !username_txt.getText().matches(usernameRegex) || !phoneNumb_txt.getText().matches(phoneRegex) || !String.valueOf(password_txt.getPassword()).matches(passwordRegex)
                || !food_txt.getText().matches(favoritefoodRegex)) {
            
            String errorMessage = "Invalid input!! Please check your input formats";
            System.out.println(errorMessage); 
            JOptionPane.showMessageDialog(rootPane, errorMessage, "Register", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //kontrol ett sonra basarılı ise kaydı yap
        Person newPerson = new Person();
        
        newPerson.name = name_txt.getText();
        newPerson.surname = surname_txt.getText();
        newPerson.username = username_txt.getText();
        newPerson.phonenumber = phoneNumb_txt.getText();
        newPerson.password = String.valueOf(password_txt.getPassword());
        newPerson.foodQuestion = food_txt.getText();
        
        if (DatabaseManager.AddPerson(newPerson)) {
            JOptionPane.showMessageDialog(rootPane, "Registred Successfully!!");
        } else {
            
            JOptionPane.showMessageDialog(rootPane, "This username used before!!");
        }
        
        setVisible(false);
        Login backLogin = new Login();
        backLogin.setVisible(true);
        

    }//GEN-LAST:event_registerButtonActionPerformed

    private void cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbuttonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        MainMenuUser backmenu = new MainMenuUser();
        backmenu.setVisible(true);
    }//GEN-LAST:event_cancelbuttonActionPerformed

    private void phoneNumb_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumb_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumb_txtActionPerformed

    private void password_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_txtActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbutton;
    private javax.swing.JTextField food_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name_txt;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JTextField phoneNumb_txt;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField surname_txt;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}
