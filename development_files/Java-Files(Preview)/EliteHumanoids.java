/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPages;

import java.awt.Toolkit;

/**
 *
 * @author B N Bhattacharya
 */
public class EliteHumanoids extends javax.swing.JFrame {

    /**
     * Creates new form BASEPage
     */
    public EliteHumanoids() {
         this.setUndecorated(false);
        this.setAlwaysOnTop(true);
        this.setResizable(true);
        this.setVisible(true);
                initComponents();
                Toolkit tk=Toolkit.getDefaultToolkit();
                int xsize= (int) tk.getScreenSize().getWidth();
                int ysize= (int) tk.getScreenSize().getHeight();
                this.setSize(xsize ,ysize);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Base2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        BASE = new javax.swing.JLabel();

        jLabel3.setBackground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("FEEDBACK");
        jLabel3.setToolTipText("");

        jLabel2.setText("FEEDBACK");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Humanoids (ELITE) Robots | MAGNUS Robotical Solutions @Arpan");
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 45)); // NOI18N
        jLabel7.setText("ELITE (Humanoid)  Robots");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(510, 10, 570, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/HUM1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(570, 90, 200, 180);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/HR3.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(570, 390, 200, 180);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel2);
        jPanel2.setBounds(560, 80, 220, 200);

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/HUM2.jpg"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel8);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(960, 80, 220, 190);

        jPanel4.setBackground(new java.awt.Color(255, 51, 0));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jPanel4);
        jPanel4.setBounds(560, 380, 220, 200);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/HUM4.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel10);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(970, 380, 200, 200);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel11.setText("Zorabots Nao");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(790, 130, 180, 70);

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel12.setText("ROBOTIS Op2");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(1190, 130, 150, 60);

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel13.setText("Huma Standard");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(780, 410, 190, 90);

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel14.setText("Robotis Op3");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(1180, 420, 150, 40);

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 51));
        jLabel15.setText("Highly Advanced");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(1180, 430, 160, 70);

        Base2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/wallElite.jpg"))); // NOI18N
        Base2.setText("jLabel1");
        jPanel1.add(Base2);
        Base2.setBounds(0, 0, 1360, 580);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 80, 1360, 580);

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jButton3.setText("FEEDBACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(810, 670, 190, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/back.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1170, 0, 100, 90);

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jButton1.setText("ABOUT US");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1110, 670, 190, 50);

        jButton2.setBackground(new java.awt.Color(0, 204, 0));
        jButton2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jButton2.setText("QUERIES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(510, 670, 200, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/EXIT.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1280, 10, 60, 60);

        jButton4.setBackground(new java.awt.Color(255, 102, 204));
        jButton4.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jButton4.setText("RATE   MAGNUS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(140, 10, 380, 60);

        jButton5.setBackground(new java.awt.Color(51, 255, 0));
        jButton5.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jButton5.setText("My Cart");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(920, 10, 240, 60);

        jButton7.setBackground(new java.awt.Color(255, 255, 0));
        jButton7.setFont(new java.awt.Font("Bahnschrift", 1, 21)); // NOI18N
        jButton7.setText("My Account Profile");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(540, 10, 340, 60);

        BASE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/RED BACK WALLPAPER.jpg"))); // NOI18N
        BASE.setText("jLabel1");
        getContentPane().add(BASE);
        BASE.setBounds(0, 0, 1360, 730);

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
new Feedback().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
System.exit(0);
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
new RATING().setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
ZorabotsNao x=new ZorabotsNao();                            //constructor
ZorabotsNao.jTextField1.setText(EliteHumanoids.jLabel11.getText());    //name
ZorabotsNao.jTextField2.setText(EliteHumanoids.jLabel7.getText());      //type
ZorabotsNao.jTextField3.setText("910000");                       //InitialCost
x.setVisible(true);                                    //form2-visible
this.setVisible(false);                                   //form1-invisible     
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
RobotisOP2 x=new RobotisOP2();                            //constructor
RobotisOP2.jTextField1.setText(EliteHumanoids.jLabel12.getText());    //name
RobotisOP2.jTextField2.setText(EliteHumanoids.jLabel7.getText());      //type
RobotisOP2.jTextField3.setText("672000");                       //InitialCost
x.setVisible(true);                                    //form2-visible
this.setVisible(false);                                   //form1-invisible
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
RobotisOP3 x=new RobotisOP3();                            //constructor
RobotisOP3.jTextField1.setText(EliteHumanoids.jLabel14.getText() + " " + EliteHumanoids.jLabel15.getText() );    //name
RobotisOP3.jTextField2.setText(EliteHumanoids.jLabel7.getText());      //type
RobotisOP3.jTextField3.setText("770000");                       //InitialCost
x.setVisible(true);                                    //form2-visible
this.setVisible(false);                                   //form1-invisible  
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
HumaStandard x=new HumaStandard();                            //constructor
HumaStandard.jTextField1.setText(EliteHumanoids.jLabel13.getText());    //name
HumaStandard.jTextField2.setText(EliteHumanoids.jLabel7.getText());      //type
HumaStandard.jTextField3.setText("83900");                       //InitialCost
x.setVisible(true);                                    //form2-visible
this.setVisible(false);                                   //form1-invisible  
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
   new RoboMart().setVisible(true);
this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new Cart().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new Profile().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(EliteHumanoids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliteHumanoids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliteHumanoids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliteHumanoids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliteHumanoids().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BASE;
    private javax.swing.JLabel Base2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
