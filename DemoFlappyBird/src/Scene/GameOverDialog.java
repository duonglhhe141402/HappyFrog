/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scene;

import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author conqu
 */
public class GameOverDialog extends javax.swing.JDialog {

    private final String NO_MEDAL = "/image/NoMedal.png";
    private final String BRONZE_MEDAL = "/image/BronzeMedal.png";
    private final String SILVER_MEDAL = "/image/SilverMedal.png";
    private final String GOLD_MEDAL = "/image/GoldMedal2.png";
    private final String NO_MEDAL_NAME = "Better luck next time...";
    private final String BRONZE_MEDAL_NAME = "Congrat!\n You got a Bronze Medal ^^";
    private final String SILVER_MEDAL_NAME = "Congrat!\n You got a Silver Medal \\(￣︶￣*\\))";
    private final String GOLD_MEDAL_NAME = "Congrat!\n You got a Gold Medal (づ￣ 3￣)づ";

    /**
     * Creates new form GameOverDialog
     * @param score
     */
    public GameOverDialog(JFrame frame, int score) {
        super(frame, "GAME OVER");
        initComponents();
        setMedal(score);

    }

    private void setMedal(int score) {
        ImageIcon icon;
        String medal;

        if (score < 10) {
            icon = new ImageIcon(getClass().getResource(NO_MEDAL));
            medal = NO_MEDAL_NAME;
        } else if (score < 20) {
            icon = new ImageIcon(getClass().getResource(BRONZE_MEDAL));
            medal = BRONZE_MEDAL_NAME;
        } else if (score < 30) {
            icon = new ImageIcon(getClass().getResource(SILVER_MEDAL));
            medal = SILVER_MEDAL_NAME;
        } else {
            icon = new ImageIcon(getClass().getResource(GOLD_MEDAL));
            medal = GOLD_MEDAL_NAME;
        }

        this.medalLabel.setIcon(icon);
        this.medalNameLabel.setText(medal);
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
        medalLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        medalNameLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Game Over");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 232, 45));

        medalLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/GoldMedal2.png"))); // NOI18N
        getContentPane().add(medalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jButton1.setText("OK");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        medalNameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        medalNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        medalNameLabel.setText("Congrat! You got Gold Medal (づ￣ 3￣)づ");
        medalNameLabel.setToolTipText("");
        medalNameLabel.setFocusable(false);
        medalNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        medalNameLabel.setOpaque(true);
        getContentPane().add(medalNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel medalLabel;
    private javax.swing.JLabel medalNameLabel;
    // End of variables declaration//GEN-END:variables
}
