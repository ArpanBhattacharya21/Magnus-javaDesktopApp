/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPages;

import static AppPages._6DOF.jTextField1;
import static AppPages._6DOF.jTextField6;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author B N Bhattacharya
 */
public class QooperProgrammableRobot extends javax.swing.JFrame {

    /**
     * Creates new form BASEPage
     */
    public QooperProgrammableRobot() {
        //setting resolution
         this.setUndecorated(false);
        this.setAlwaysOnTop(true);
        this.setResizable(true);
        this.setVisible(true);
                initComponents();
                Toolkit tk=Toolkit.getDefaultToolkit();
                int xsize= (int) tk.getScreenSize().getWidth();
                int ysize= (int) tk.getScreenSize().getHeight();
                this.setSize(xsize ,ysize);
                
                jTextField1.setEditable(false);
                jTextField2.setEditable(false);
                jTextField3.setEditable(false);
                jTextField5.setEditable(false);
                jTextField6.setEditable(false);
                       
                        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton7 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        BASE2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        BASE = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();

        jLabel3.setBackground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("FEEDBACK");
        jLabel3.setToolTipText("");

        jLabel2.setText("FEEDBACK");

        jLabel5.setText("jLabel5");
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 200));

        jLabel13.setText("Final Cost");

        jRadioButton1.setText("Body & Hardware");

        jRadioButton2.setText("jRadioButton2");

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product | MAGNUS");
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanel2.setPreferredSize(new java.awt.Dimension(200, 180));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/WR6M.jpg"))); // NOI18N
        jPanel2.add(jLabel14);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(620, 10, 250, 250);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 255, 0));
        jButton3.setText("ADD  TO  CART");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(890, 570, 180, 60);

        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(1050, 20, 290, 40);

        jButton5.setBackground(new java.awt.Color(0, 255, 0));
        jButton5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton5.setText("BUY  NOW");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(1170, 570, 140, 60);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Name Of Product:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(890, 20, 170, 40);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Type");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(890, 80, 110, 30);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Initial Cost");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(890, 140, 130, 40);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Quantity");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(890, 190, 110, 30);

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 25)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Additional Cost ");
        jLabel12.setEnabled(false);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(930, 350, 200, 40);

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 0, 0));
        jButton6.setText("Want Service Pack Too");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(930, 250, 380, 40);

        jCheckBox1.setBackground(new java.awt.Color(255, 102, 102));
        jCheckBox1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jCheckBox1.setText("Body & Hardware");
        jCheckBox1.setEnabled(false);
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(630, 340, 200, 40);

        jCheckBox2.setBackground(new java.awt.Color(255, 51, 255));
        jCheckBox2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jCheckBox2.setText("Program Services");
        jCheckBox2.setEnabled(false);
        jPanel1.add(jCheckBox2);
        jCheckBox2.setBounds(630, 390, 200, 40);

        jButton7.setBackground(new java.awt.Color(0, 0, 153));
        jButton7.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(204, 204, 204));
        jButton7.setText("Get Additional Cost");
        jButton7.setEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(930, 300, 380, 40);

        jTextField2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(1050, 80, 260, 40);

        jTextField3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(1050, 140, 260, 40);

        jTextField5.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jTextField5.setText("0");
        jTextField5.setEnabled(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(1130, 350, 210, 40);

        jComboBox1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Qty:", "1", "2", "3", "4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(1050, 200, 200, 30);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Final Cost");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(920, 450, 180, 40);

        jTextField6.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(1130, 450, 210, 40);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        jLabel11.setText("Choose Your Service Pack:");
        jLabel11.setEnabled(false);
        jPanel3.add(jLabel11);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(610, 290, 300, 160);

        jButton8.setBackground(new java.awt.Color(51, 0, 51));
        jButton8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 0));
        jButton8.setText("Get Final Cost");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(910, 510, 390, 50);

        BASE2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/WALLPrd.jpg"))); // NOI18N
        BASE2.setText("jLabel1");
        jPanel1.add(BASE2);
        BASE2.setBounds(0, 0, 1398, 650);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 80, 1360, 650);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/back.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1130, -10, 100, 90);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/EXIT.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1260, 10, 60, 60);

        jButton4.setBackground(new java.awt.Color(255, 102, 204));
        jButton4.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jButton4.setText("RATE   MAGNUS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(810, 10, 310, 60);

        jButton2.setBackground(new java.awt.Color(0, 204, 0));
        jButton2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jButton2.setText("QUERIES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(590, 10, 200, 60);

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jButton1.setText("ABOUT US");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(370, 10, 190, 60);

        BASE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/RED BACK WALLPAPER.jpg"))); // NOI18N
        BASE.setText("jLabel1");
        getContentPane().add(BASE);
        BASE.setBounds(0, 0, 1360, 730);

        jTextField7.setText("jTextField7");
        getContentPane().add(jTextField7);
        jTextField7.setBounds(689, 210, 10, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
new AboutUs().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new Queries().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
System.exit(0);
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
new RATING().setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
{                                         
ImageIcon icon= new ImageIcon("src/AppPages/MessageLogo.png");
               
        String x= jTextField6.getText();
        if ("".equals(x))
        {
          JOptionPane.showMessageDialog(this,"Get Final Cost","ERROR!!", JOptionPane.PLAIN_MESSAGE, icon); 
        }       
        
else
        {
            String Item = jTextField1.getText();
            String Price = jTextField6.getText();
         try
{
    Class.forName("java.sql.DriverManager");
    Connection con = (Connection)
    DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
    Statement stmt = (Statement) con.createStatement();
    String query1 = "USE Magnus;";
    stmt.executeUpdate(query1);
    String query2 = "SELECT * FROM Cart Where Date = CURDATE();";
    ResultSet rs = stmt.executeQuery(query2);
    String U_id="";
    while(rs.next())
    {
        U_id = rs.getString("U_Id");
    }
    //Query
     String query3 = "Delete from cart WHERE Item IS NULL;";
     String query4 = "INSERT INTO Cart(U_Id,Item,Price,Date) VALUES ('"+U_id+"','"+Item+"',"+Price+",CURDATE());"; 
     stmt.executeUpdate(query3);
     stmt.executeUpdate(query4); 
     }
 catch(Exception e)
 {
     JOptionPane.showMessageDialog(this, e.getMessage());
 }    
         new ModeOfPay().setVisible(true);
        }
// TODO add your handling code here:
    }// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
//validation on service pack button
        String a=jTextField1.getText();
        String b=jTextField2.getText();
        String c=jTextField3.getText();
        if (("".equals(a)) || ("".equals(b)) || ("".equals(c)) )
        {
            ImageIcon icon= new ImageIcon("src/AppPages/MessageLogo.png");
                   JOptionPane.showMessageDialog(this,"Fill the above fields","ERROR!!", JOptionPane.PLAIN_MESSAGE, icon);
        }


// enabling all controls that are listed//
        jLabel11.setEnabled(true);
      jCheckBox1.setEnabled(true);
      jCheckBox2.setEnabled(true);
      jButton7.setEnabled(true);
      jLabel12.setEnabled(true);
jTextField5.setEnabled(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

        jTextField2.setEditable(false);// TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
float Cost=(float) 0.0;
if (jCheckBox1.isSelected())                 //hardware
{
    float x= Float.parseFloat(jTextField3.getText());   //original cost
    float add= (float) (0.3*x);                         //additional    
    Cost=Cost+add;
}
if (jCheckBox2.isSelected())                    //program
{
    float x= Float.parseFloat(jTextField3.getText());
    float add= (float)  (0.4*x);
    Cost=Cost+add;
}
jTextField5.setText(Float.toString(Cost));
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
if (jComboBox1.getSelectedIndex()==1)
{
    jTextField7.setText("1");
}
else if (jComboBox1.getSelectedIndex()==2)
{
    jTextField7.setText("2");
}
else if (jComboBox1.getSelectedIndex()==3)
{
    jTextField7.setText("3");
}
else if (jComboBox1.getSelectedIndex()==4)
{
    jTextField7.setText("4");
}


// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
   // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
String x= jTextField6.getText();
String y="";
if (!y.equals(x))
{
   jButton5.setEnabled(true);
                        jButton3.setEnabled(true); 
}
// TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        if (jComboBox1.getSelectedIndex()==0)
{
    JOptionPane.showMessageDialog(this,"Choose quantity!!");
}
        
        float a= Float.parseFloat(jTextField3.getText());    //imput of original cost
float b= Float.parseFloat(jTextField5.getText());          //additional cost
float c= Float.parseFloat(jTextField7.getText());        //quantity
float d= ((a*c)+b);
jTextField6.setText(Float.toString(d));

// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
{                                         
ImageIcon icon= new ImageIcon("src/AppPages/MessageLogo.png");
               
        String x= jTextField6.getText();
        if ("".equals(x))
        {
          JOptionPane.showMessageDialog(this,"Get Final Cost","ERROR!!", JOptionPane.PLAIN_MESSAGE, icon); 
        }       
        
else
        {
            String Item = jTextField1.getText();
            String Price = jTextField6.getText();
         try
{
    Class.forName("java.sql.DriverManager");
    Connection con = (Connection)
    DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
    Statement stmt = (Statement) con.createStatement();
    String query1 = "USE Magnus;";
    stmt.executeUpdate(query1);
    String query2 = "SELECT * FROM Cart Where Date = CURDATE();";
    ResultSet rs = stmt.executeQuery(query2);
    String U_id="";
    while(rs.next())
    {
        U_id = rs.getString("U_Id");
    }
    
     String query3 = "Delete from cart WHERE Item IS NULL;";
     String query4 = "INSERT INTO Cart(U_Id,Item,Price,Date) VALUES ('"+U_id+"','"+Item+"',"+Price+",CURDATE());"; 
     stmt.executeUpdate(query3);
     stmt.executeUpdate(query4);
    
    JOptionPane.showMessageDialog(this, "Added in Cart!");
    /*Back to main page*/ new RoboMart().setVisible(true);
                          this.setVisible(false);
}
 catch(Exception e)
 {
     JOptionPane.showMessageDialog(this, e.getMessage());
 }    
        }

// TODO add your handling code here:
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
new WheeledRobo().setVisible(true);
this.setVisible(false);
        
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(QooperProgrammableRobot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QooperProgrammableRobot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QooperProgrammableRobot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QooperProgrammableRobot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QooperProgrammableRobot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BASE;
    private javax.swing.JLabel BASE2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    public static javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
