/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPages;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author B N Bhattacharya
 */
public class ModeOfPay extends javax.swing.JFrame {

    /**
     * Creates new form Pre_Billing
     */
    public ModeOfPay() {
        this.setUndecorated(false);
        this.setAlwaysOnTop(true);
        this.setResizable(true);
        this.setVisible(true);
                initComponents();
                Toolkit tk=Toolkit.getDefaultToolkit();
                int xsize= (int) tk.getScreenSize().getWidth();
                int ysize= (int) tk.getScreenSize().getHeight();
                this.setSize(xsize ,ysize);
                
                jLabel5.setEnabled(false);
                                jLabel6.setEnabled(false);

                                                jLabel7.setEnabled(false);

                                                                jLabel7.setEnabled(false);

                                                                                jLabel8.setEnabled(false);

                                                                                                jLabel9.setEnabled(false);

                                                                                                                jLabel10.setEnabled(false);

                                                                                                                                jLabel11.setEnabled(false);
                jLabel12.setEnabled(false);
                jLabel13.setEnabled(false);
                jLabel14.setEnabled(false);
                jLabel15.setEnabled(false);
                jLabel16.setEnabled(false);
jTextField1.setEnabled(false);
jPasswordField2.setEnabled(false);
jPasswordField3.setEnabled(false);
jPasswordField4.setEnabled(false);
jTextField5.setEnabled(false);
                jPasswordField1.setEnabled(false);
                 jComboBox1.setEnabled(false);

                
                                
                
                
                
                
                                                                                                                                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField4 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PrName = new javax.swing.JTextField();
        PrType = new javax.swing.JTextField();
        Cost = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        jLabel4.setText("jLabel4");

        jRadioButton4.setText("jRadioButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mode of Payment | Magnus RoboMart  | MAGNUS");
        getContentPane().setLayout(null);

        jRadioButton1.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(102, 0, 102));
        jRadioButton1.setText("Cash On Delivery");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(30, 160, 260, 40);

        jRadioButton2.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(102, 0, 102));
        jRadioButton2.setText("Debit/Credit Card");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(30, 260, 270, 40);

        jRadioButton3.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(102, 0, 102));
        jRadioButton3.setText("Net Banking");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(930, 130, 190, 40);

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("M  A  G  N  U  S");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 690, 290, 30);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 50)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Select  Mode  Of  Payment");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 60, 640, 70);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 0));
        jLabel8.setText("CVV");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 250, 60, 30);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 0));
        jLabel7.setText("ReEnter Card Number");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 190, 190, 40);

        jPasswordField4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jPasswordField4.setEchoChar('*');
        jPanel1.add(jPasswordField4);
        jPasswordField4.setBounds(220, 250, 210, 40);
        jPanel1.add(jPasswordField2);
        jPasswordField2.setBounds(220, 130, 210, 40);
        jPanel1.add(jPasswordField3);
        jPasswordField3.setBounds(220, 190, 210, 40);

        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(220, 70, 210, 40);

        jComboBox1.setBackground(new java.awt.Color(0, 0, 255));
        jComboBox1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Bank:", "Axis Bank", "State Bank", "HDFC Bank'", "PNB", "ICICI Bank", " " }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(30, 10, 190, 40);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 0));
        jLabel5.setText("Name on the card");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 70, 170, 40);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 0));
        jLabel6.setText("Card Number");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 130, 150, 40);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(210, 60, 10, 250);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 330, 440, 310);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/http___pluspng.com_img-png_amp-bank-logo-png-12-png-2152.png"))); // NOI18N
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1130, 270, 170, 60);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/304px-ICICI_Bank_Logo.svg.png"))); // NOI18N
        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(1130, 200, 170, 50);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/328px-Canara_Bank_Logo.svg.png"))); // NOI18N
        jLabel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(930, 270, 170, 60);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/axis-bank-logo.png"))); // NOI18N
        jLabel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12);
        jLabel12.setBounds(930, 200, 170, 50);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/Punjab-National-Bank.jpg"))); // NOI18N
        jLabel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13);
        jLabel13.setBounds(930, 350, 170, 60);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/Kotak_Mahindra_Bank_logo.png"))); // NOI18N
        jLabel14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14);
        jLabel14.setBounds(1130, 350, 170, 60);

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel15.setText("Username Of Selected Bank");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(900, 480, 210, 40);

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel16.setText("Password");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(900, 530, 130, 40);

        jTextField5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(1130, 480, 190, 40);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(1130, 530, 190, 40);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 0));
        jButton2.setText("CANCEL");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(280, 0, 210, 80);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("PROCEED");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(0, 0, 210, 80);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(830, 610, 490, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/Pre-Billing.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1366, 730);
        getContentPane().add(PrName);
        PrName.setBounds(630, 220, 180, 40);
        getContentPane().add(PrType);
        PrType.setBounds(590, 290, 220, 40);
        getContentPane().add(Cost);
        Cost.setBounds(590, 350, 240, 40);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(1210, 370, 6, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
if (jRadioButton2.isSelected())
{ //disabling controls for net banking
    jLabel9.setEnabled(false);
    jLabel10.setEnabled(false);
    jLabel11.setEnabled(false);
    jLabel12.setEnabled(false);
    jLabel13.setEnabled(false);
    jLabel14.setEnabled(false);
    jLabel15.setEnabled(false);
    jLabel16.setEnabled(false);
    jTextField5.setEnabled(false);
    jPasswordField1.setEnabled(false);
    
    //enabling required controls
    jLabel5.setEnabled(true);
    jLabel6.setEnabled(true);
    jLabel7.setEnabled(true);
    jLabel8.setEnabled(true);
    jComboBox1.setEnabled(true);
    jTextField1.setEnabled(true);
    jPasswordField2.setEnabled(true);
    jPasswordField3.setEnabled(true);
    jPasswordField4.setEnabled(true);
}
        



// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if (jRadioButton1.isSelected())    //COD
{
    Billing x = new Billing();
   Billing.Pmode.setText("COD");   
   x.setVisible(true);
}
        
       else if (jRadioButton2.isSelected())          //Dr/Cr Card
{
    String a=jTextField1.getText();
String b=jPasswordField2.getText();
String c=jPasswordField3.getText();
String d=jPasswordField4.getText();
if (jComboBox1.getSelectedIndex()==0)
{              JOptionPane.showMessageDialog(this, "Choose a Bank!");} 

else if("".equals(a))
 {               
     JOptionPane.showMessageDialog(this, "Enter Name on Card");
 }
         else if ("".equals(b))
              {
                  JOptionPane.showMessageDialog(this, "Enter Card Number");
              }
         else if ("".equals(c))
              { JOptionPane.showMessageDialog(this, "Re-Enter Card Number");}
          else if (!c.equals(b))
   {JOptionPane.showMessageDialog(this, "Re Entered Card number don't match. Enter again!!");}
         else if ("".equals(d))
              { JOptionPane.showMessageDialog(this, "Enter CVV!"); }   
   else   //ALL FIELDS PERFECT- DB Entry Enabling
   { 
           Billing x = new Billing();
   Billing.Pmode.setText("Dr/Cr Card");
              x.setVisible(true);
   }
}
 //-----------------------------------------------------------------------------
else if (jRadioButton3.isSelected())                     //NetBank 
{
              //validation - Choose Bank
    String f=jTextField5.getText();
    String g=jPasswordField1.getText();
    String e=jTextField2.getText();    //hiddenField
        if ("".equals(e))
        { JOptionPane.showMessageDialog(this, "Choose a Bank!");}
        else if (("".equals(f)) || ("".equals(g)))// validation - blank field
        {JOptionPane.showMessageDialog(this, "Enter username and password of your bank!!");}
      else 
   { 
          
        Billing x = new Billing();
   Billing.Pmode.setText("Net Banking");
    x.setVisible(true);
   }
}
//-----------------------------------------------------------------------------

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
if (jRadioButton3.isSelected())
{
    //disabling controls for Cr/Dr card
    jLabel5.setEnabled(false);
    jLabel6.setEnabled(false);
    jLabel7.setEnabled(false);
    jLabel8.setEnabled(false);
    jComboBox1.setEnabled(false);
    jTextField1.setEnabled(false);
    jPasswordField2.setEnabled(false);
    jPasswordField3.setEnabled(false);
    jPasswordField4.setEnabled(false);
    
    //enabling required
    jLabel9.setEnabled(true);
    jLabel10.setEnabled(true);
    jLabel11.setEnabled(true);
    jLabel12.setEnabled(true);
    jLabel13.setEnabled(true);
    jLabel14.setEnabled(true);
    jLabel15.setEnabled(true);
    jLabel16.setEnabled(true);
    jTextField5.setEnabled(true);
    jPasswordField1.setEnabled(true);
}    


// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
jLabel9.setEnabled(false);
jLabel10.setEnabled(false);
jLabel11.setEnabled(false);
//jLabel12.setEnabled(false);
jLabel13.setEnabled(false);
jLabel14.setEnabled(false);
        jTextField2.setText("mm");
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
jLabel9.setEnabled(false);
//jLabel10.setEnabled(false);
jLabel11.setEnabled(false);
jLabel12.setEnabled(false);
jLabel13.setEnabled(false);
jLabel14.setEnabled(false);      
jTextField2.setText("mm");
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
jLabel9.setEnabled(false);
jLabel10.setEnabled(false);
//jLabel11.setEnabled(false);
jLabel12.setEnabled(false);
jLabel13.setEnabled(false);
jLabel14.setEnabled(false);    
jTextField2.setText("mm");
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
//jLabel9.setEnabled(false);
jLabel10.setEnabled(false);
jLabel11.setEnabled(false);
jLabel12.setEnabled(false);
jLabel13.setEnabled(false);
jLabel14.setEnabled(false);    
jTextField2.setText("mm");
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
jLabel9.setEnabled(false);
jLabel10.setEnabled(false);
jLabel11.setEnabled(false);
jLabel12.setEnabled(false);
//jLabel13.setEnabled(false);
jLabel14.setEnabled(false);        
jTextField2.setText("mm");
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
jLabel9.setEnabled(false);
jLabel10.setEnabled(false);
jLabel11.setEnabled(false);
jLabel12.setEnabled(false);
jLabel13.setEnabled(false);
//jLabel14.setEnabled(false);    
jTextField2.setText("mm");
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ModeOfPay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModeOfPay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModeOfPay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModeOfPay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModeOfPay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Cost;
    public static javax.swing.JTextField PrName;
    public static javax.swing.JTextField PrType;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}