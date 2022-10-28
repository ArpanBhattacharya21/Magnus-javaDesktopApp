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
public class LeggedRobots extends javax.swing.JFrame {

    /**
     * Creates new form BASEPage
     */
    public LeggedRobots() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
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
        setTitle("Legged Robots (Products Page)  |  MAGNUS Robotical Technologies  @Arpan");
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LEGGED   ROBOTS");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(530, 0, 460, 80);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/LR1.jpg"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 80, 200, 180);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/LR2.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(490, 80, 200, 180);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/LR3.jpg"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(970, 80, 200, 180);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/LR4.jpg"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 380, 200, 180);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/LR5.jpg"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(490, 380, 200, 180);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 25)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Lego MindStorm");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(220, 90, 230, 80);

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Alpha 1 PRO Human");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(700, 110, 250, 50);

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("EZ- Robo JD");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(1180, 110, 170, 50);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("LynuxMotion Prep");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(220, 480, 240, 30);

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 25)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Iron Boy");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(700, 470, 190, 50);

        Base2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPages/bg2.jpg"))); // NOI18N
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
        jLabel4.setBounds(1180, 0, 100, 90);

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
        jButton4.setBounds(130, 10, 360, 60);

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
        jButton5.setBounds(910, 10, 250, 60);

        jButton7.setBackground(new java.awt.Color(255, 255, 0));
        jButton7.setFont(new java.awt.Font("Bahnschrift", 1, 21)); // NOI18N
        jButton7.setText("My Account Profile");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(520, 10, 340, 60);

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

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
new RoboMart().setVisible(true);
this.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
LegoMind x=new LegoMind();                            //constructor
LegoMind.jTextField1.setText(LeggedRobots.jLabel11.getText());    //name
LegoMind.jTextField2.setText(LeggedRobots.jLabel5.getText());      //type
LegoMind.jTextField3.setText("24430");                       //InitialCost
x.setVisible(true);                                    //form2-visible
this.setVisible(false);                                   //form1-invisible  
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
Alpha1 x=new Alpha1();                            //constructor
Alpha1.jTextField1.setText(LeggedRobots.jLabel12.getText());    //name
Alpha1.jTextField2.setText(LeggedRobots.jLabel5.getText());      //type
Alpha1.jTextField3.setText("50300");                       //InitialCost
x.setVisible(true);                                    //form2-visible
this.setVisible(false);                                   //form1-invisible  
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
EZRobo x=new EZRobo();                            //constructor
EZRobo.jTextField1.setText(LeggedRobots.jLabel13.getText());    //name
EZRobo.jTextField2.setText(LeggedRobots.jLabel5.getText());      //type
EZRobo.jTextField3.setText("30300");                       //InitialCost
x.setVisible(true);                                    //form2-visible
this.setVisible(false);                                   //form1-invisible  
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
LynuxMotion x=new LynuxMotion();                            //constructor
LynuxMotion.jTextField1.setText(LeggedRobots.jLabel14.getText());    //name
LynuxMotion.jTextField2.setText(LeggedRobots.jLabel5.getText());      //type
LynuxMotion.jTextField3.setText("25760");                       //InitialCost
x.setVisible(true);                                    //form2-visible
this.setVisible(false);                                   //form1-invisible  
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
IronBoy x=new IronBoy();                            //constructor
IronBoy.jTextField1.setText(LeggedRobots.jLabel14.getText());    //name
IronBoy.jTextField2.setText(LeggedRobots.jLabel5.getText());      //type
IronBoy.jTextField3.setText("47600");                       //InitialCost
x.setVisible(true);                                    //form2-visible
this.setVisible(false);                                     //form1-invisible 
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(LeggedRobots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeggedRobots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeggedRobots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeggedRobots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeggedRobots().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
