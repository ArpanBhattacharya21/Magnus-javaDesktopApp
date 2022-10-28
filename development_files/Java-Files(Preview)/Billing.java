/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPages;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.random;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author B N Bhattacharya
 */
public class Billing extends javax.swing.JFrame {

    /**
     * Creates new form Billing
     */
    public Billing() {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(true);
        this.setVisible(true);
                initComponents();
                Toolkit tk=Toolkit.getDefaultToolkit();
                int xsize= (int) tk.getScreenSize().getWidth();
                int ysize= (int) tk.getScreenSize().getHeight();
                this.setSize(xsize ,ysize);
                
                showDate();
                showTime();
                
                DefaultTableModel model = (DefaultTableModel)
                jTable1.getModel();
                //CONNECTIVITY AND OVERALL CALCULATION
       //Sales ID generation
                double a = random();
                double b = random();
        String A = Double.toString(a);
        String B = Double.toString(b);
        String CodeB = A.substring(2,6);
        String CodeA = B.substring(2,5);
        String S_ID = "S"+CodeA+CodeB;                                           //S_ID
        
        try
{
    Class.forName("java.sql.DriverManager");
    Connection con = (Connection)
    DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
    Statement stmt = (Statement) con.createStatement();
    String query1 = "USE Magnus;";
    String query2 = "SELECT * FROM Cart WHERE Date = CURDATE();";
    stmt.executeUpdate(query1);
    String U_ID="";                                                              //U_ID
    ResultSet rs =stmt.executeQuery(query2);
    while(rs.next())
    {
      U_ID = rs.getString("U_Id");
    }
    String query3 = "SELECT * FROM Customer WHERE U_Id='"+U_ID+"';";
    ResultSet cust =stmt.executeQuery(query3);
    String name="",phone="",address="";
    while(cust.next())
    {
      name = cust.getString("Cname");                                             //Cname
      phone =cust.getString("PhoneNo");                                           //Phone
      address = cust.getString("Address");                                        //Address
    }
    String query4 = "SELECT SUM(Price) FROM CART;";
    ResultSet amt =stmt.executeQuery(query4);
    String AMT="";                                                                //Total Amount
    while(amt.next())
    {
     AMT= amt.getString("SUM(Price)");
    }
    
    String query5 ="SELECT * FROM Cart WHERE Date = CURDATE();";
    ResultSet ITEM = stmt.executeQuery(query5);                                  //Item Names
    while(ITEM.next())
    {
        String item = ITEM.getString("Item");
        String prc =ITEM.getString("Price");
        model.addRow(new Object[] {item,prc});
    }
    
    //PRINTING
    CID.setText(U_ID);
    Fname.setText(name);
    Cphone.setText(phone);
    Caddress.setText(address);
    Tamount.setText(AMT);
    SalesID.setText(S_ID);
    String ITEMn="",AMOUNT="";
    
    //Putting in Sales
    for(int i=0;i<jTable1.getRowCount();i++)
    {
       ITEMn = (String) jTable1.getValueAt(i,0);
       AMOUNT = (String) jTable1.getValueAt(i,1);
       String query7 = "INSERT INTO Sales VALUES ('"+S_ID+"','"+U_ID+"','"+ITEMn+"','"+AMOUNT+"',NULL,CURDATE());";      
       stmt.executeUpdate(query7);
    }    
     String query9= "DELETE from CART;";
    stmt.executeUpdate(query9);
    }
 catch(Exception e)
 {
     JOptionPane.showMessageDialog(this, e.getMessage());
 } 
    }
    //=================================================================================================================================
    //=================================================================================================================================
    //LIVE CLOCK
     void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        jLabel11.setText(s.format(d));

    }
     
 //live clock
    void showTime() {
        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
        jLabel12.setText(s.format(d));   
            }

        }
        ).start();
                
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
        jLabel7 = new javax.swing.JLabel();
        CID = new javax.swing.JTextField();
        Cphone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Caddress = new javax.swing.JTextArea();
        SalesID = new javax.swing.JTextField();
        Pmode = new javax.swing.JTextField();
        Tamount = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        BASE = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MAGNUS Billings  |  MAGNUS  Robotical Technologies @Arpan");
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/EXIT.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1290, 10, 60, 60);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("       M A G N U S   BILLING");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0)));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(370, 30, 680, 60);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 240, 220, 40);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Customer's Phone Number");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 390, 300, 40);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Customer's Address");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 470, 220, 40);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sales ID:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(970, 180, 120, 30);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Payment Mode");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1140, 580, 220, 40);

        CID.setEditable(false);
        CID.setBackground(new java.awt.Color(153, 153, 153));
        CID.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(CID);
        CID.setBounds(340, 230, 450, 50);

        Cphone.setEditable(false);
        Cphone.setBackground(new java.awt.Color(153, 153, 153));
        Cphone.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Cphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CphoneActionPerformed(evt);
            }
        });
        getContentPane().add(Cphone);
        Cphone.setBounds(340, 380, 440, 50);

        jScrollPane1.setBackground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setHorizontalScrollBar(null);

        Caddress.setEditable(false);
        Caddress.setBackground(new java.awt.Color(153, 153, 153));
        Caddress.setColumns(20);
        Caddress.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        Caddress.setLineWrap(true);
        Caddress.setRows(5);
        Caddress.setText("\n");
        Caddress.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Caddress);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(340, 470, 320, 80);

        SalesID.setEditable(false);
        SalesID.setBackground(new java.awt.Color(255, 255, 255));
        SalesID.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(SalesID);
        SalesID.setBounds(970, 220, 370, 40);

        Pmode.setEditable(false);
        Pmode.setBackground(new java.awt.Color(255, 255, 255));
        Pmode.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(Pmode);
        Pmode.setBounds(990, 630, 320, 50);

        Tamount.setEditable(false);
        Tamount.setBackground(new java.awt.Color(255, 255, 255));
        Tamount.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Tamount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Tamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TamountActionPerformed(evt);
            }
        });
        getContentPane().add(Tamount);
        Tamount.setBounds(340, 580, 300, 60);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 300, 920, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 450, 920, 10);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(920, 580, 450, 20);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(920, 700, 450, 30);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(920, 90, 60, 610);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("                      Customer Details");
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(255, 0, 204), new java.awt.Color(255, 0, 204)));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(270, 130, 490, 40);

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Products:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(1030, 280, 220, 40);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("         Product Details");
        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 255), new java.awt.Color(51, 204, 255), null, null));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(970, 120, 300, 40);
        getContentPane().add(jSeparator8);
        jSeparator8.setBounds(0, 560, 920, 20);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Total Amount:");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        jPanel1.add(jLabel8);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 580, 220, 50);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 90, 170, 30);

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 130, 180, 30);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.orange, java.awt.Color.orange));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 80, 220, 90);

        jTable1.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Items", "Price"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(950, 320, 390, 230);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(0, 370, 920, 10);

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Customer's Name");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(30, 310, 220, 40);

        Fname.setEditable(false);
        Fname.setBackground(new java.awt.Color(153, 153, 153));
        Fname.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(Fname);
        Fname.setBounds(340, 310, 450, 50);

        BASE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/Billing.jpg"))); // NOI18N
        getContentPane().add(BASE);
        BASE.setBounds(10, 0, 1366, 730);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(0, 370, 920, 10);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
 try
{
    Class.forName("java.sql.DriverManager");
    Connection con = (Connection)
    DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
    Statement stmt = (Statement) con.createStatement();
        String S_ID= SalesID.getText();
        String MODE= Pmode.getText();
        String query11 = "USE magnus;";
        String query8 = "Update Sales SET ModeOfPay ='"+MODE+"' WHERE S_Id ='"+S_ID+"';";
        stmt.executeQuery(query11);
        stmt.executeUpdate(query8);
}
 catch(Exception e)
 {
     JOptionPane.showMessageDialog(this, e.getMessage());
 }
        ImageIcon icon= new ImageIcon("src/AppPages/MessageLogo.png");
        JOptionPane.showMessageDialog(this, "Order Placed! \n Thank You for visiting MAGNUS!!");
System.exit(0);
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void TamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TamountActionPerformed

    private void name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name2ActionPerformed

    private void CphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CphoneActionPerformed

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BASE;
    public static javax.swing.JTextField CID;
    public static javax.swing.JTextArea Caddress;
    public static javax.swing.JTextField Cphone;
    public static javax.swing.JTextField Fname;
    public static javax.swing.JTextField Pmode;
    public static javax.swing.JTextField SalesID;
    public static javax.swing.JTextField Tamount;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
