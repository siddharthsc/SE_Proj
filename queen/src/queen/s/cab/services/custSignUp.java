package queen.s.cab.services;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siddharth
 */
public class custSignUp extends javax.swing.JFrame {

    /**
     * Creates new form custSignUp
     */
    public custSignUp() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer's Signup Page");
        setMinimumSize(new java.awt.Dimension(1000, 1000));
        setSize(new java.awt.Dimension(750, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Microsoft Tai Le", 2, 14)); // NOI18N
        jLabel1.setText("User ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(450, 60, 91, 18);

        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 2, 14)); // NOI18N
        jLabel2.setText("First Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(450, 140, 91, 18);

        jLabel3.setFont(new java.awt.Font("Microsoft Tai Le", 2, 14)); // NOI18N
        jLabel3.setText("Last Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(450, 180, 91, 18);

        jLabel4.setFont(new java.awt.Font("Microsoft Tai Le", 2, 14)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(460, 220, 91, 18);

        jLabel5.setFont(new java.awt.Font("Microsoft Tai Le", 2, 14)); // NOI18N
        jLabel5.setText("Phone No.");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(450, 260, 91, 18);

        jLabel6.setFont(new java.awt.Font("Microsoft Tai Le", 2, 14)); // NOI18N
        jLabel6.setText("Password");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(450, 100, 91, 18);

        jTextField1.setFont(new java.awt.Font("Microsoft Tai Le", 2, 14)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(560, 260, 130, 24);

        jTextField2.setFont(new java.awt.Font("Microsoft Tai Le", 2, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(560, 60, 130, 20);

        jTextField4.setFont(new java.awt.Font("Microsoft Tai Le", 2, 14)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(560, 140, 130, 20);

        jTextField5.setFont(new java.awt.Font("Microsoft Tai Le", 2, 14)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(560, 180, 130, 20);

        jTextField6.setFont(new java.awt.Font("Microsoft Tai Le", 2, 14)); // NOI18N
        getContentPane().add(jTextField6);
        jTextField6.setBounds(560, 220, 130, 20);

        jPasswordField1.setFont(new java.awt.Font("Microsoft Tai Le", 2, 14)); // NOI18N
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(560, 100, 130, 20);

        jButton1.setText("Submit");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 300, 130, 30);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 750, 0);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgQ1.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 750, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(custSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(custSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(custSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(custSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new custSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
