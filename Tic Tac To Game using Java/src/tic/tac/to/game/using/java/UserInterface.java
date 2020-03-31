package tic.tac.to.game.using.java;
import javax.swing.JOptionPane;
public class UserInterface extends javax.swing.JFrame {

    int turn = 2;
    int buttonused[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int p1won[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int p2won[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    int p1won() {
        if (p1won[0] == 1 && p1won[1] == 1 && p1won[2] == 1) {
            return 1;
        }
        if (p1won[3] == 1 && p1won[4] == 1 && p1won[5] == 1) {
            return 1;
        }
        if (p1won[6] == 1 && p1won[7] == 1 && p1won[8] == 1) {
            return 1;
        }
        if (p1won[0] == 1 && p1won[3] == 1 && p1won[6] == 1) {
            return 1;
        }
        if (p1won[1] == 1 && p1won[4] == 1 && p1won[7] == 1) {
            return 1;
        }
        if (p1won[2] == 1 && p1won[5] == 1 && p1won[8] == 1) {
            return 1;
        }
        if (p1won[2] == 1 && p1won[4] == 1 && p1won[6] == 1) {
            return 1;
        }
        if (p1won[0] == 1 && p1won[4] == 1 && p1won[8] == 1) {
            return 1;
        }
        
        return 0;
    }

    int p2won() {
        if (p2won[0] == 1 && p2won[1] == 1 && p2won[2] == 1) {
            return 1;
        }
        if (p2won[3] == 1 && p2won[4] == 1 && p2won[5] == 1) {
            return 1;
        }
        if (p2won[6] == 1 && p2won[7] == 1 && p2won[8] == 1) {
            return 1;
        }
        if (p2won[0] == 1 && p2won[3] == 1 && p2won[6] == 1) {
            return 1;
        }
        if (p2won[1] == 1 && p2won[4] == 1 && p2won[7] == 1) {
            return 1;
        }
        if (p2won[2] == 1 && p2won[5] == 1 && p2won[8] == 1) {
            return 1;
        }
        if (p2won[2] == 1 && p2won[4] == 1 && p2won[6] == 1) {
            return 1;
        }
        if (p2won[0] == 1 && p2won[4] == 1 && p2won[8] == 1) {
            return 1;
        }
        return 0;
    }

    public UserInterface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b6 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton10.setText("Play Again");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if (buttonused[5] == 0) {
            if (turn % 2 == 0) {
                turn++;
                buttonused[5] = 1;
                b6.setText("X");
                p1won[5] = 1;
            } else {
                turn++;
                buttonused[5] = 1;
                b6.setText("O");
                p2won[5] = 1;
            }
        } else {
            JOptionPane.showMessageDialog(this, "This button is used already");
        }
        int result1 = p1won();
        int result2 = p2won();
        
        if(result1 == 1)
        {
            JOptionPane.showMessageDialog(this,"***Player 1 is win***");
        }
        if(result2 == 1)
        {
            JOptionPane.showMessageDialog(this,"***Player 2 is won***");
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if (buttonused[1] == 0) {
            if (turn % 2 == 0) {
                turn++;
                buttonused[1] = 1;
                b2.setText("X");
                p1won[1] = 1;
            } else {
                turn++;
                buttonused[1] = 1;
                b2.setText("O");
                p2won[1] = 1;
            }
        } else {
            JOptionPane.showMessageDialog(this, "This button is used already");
        }
        int result1 = p1won();
        int result2 = p2won();
        
        if(result1 == 1)
        {
            JOptionPane.showMessageDialog(this,"***Player 1 is win***");
        }
        if(result2 == 1)
        {
            JOptionPane.showMessageDialog(this,"***Player 2 is won***");
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if (buttonused[0] == 0) {
            if (turn % 2 == 0) {
                turn++;
                buttonused[0] = 1;
                b1.setText("X");
                p1won[0] = 1;
            } else {
                turn++;
                buttonused[0] = 1;
                b1.setText("O");
                p2won[0] = 1;
            }
        } else {
            JOptionPane.showMessageDialog(this, "This button is used already");
        }
        int result1 = p1won();
        int result2 = p2won();
        
        if(result1 == 1)
        {
            JOptionPane.showMessageDialog(this,"***Player 1 is win***");
        }
        if(result2 == 1)
        {
            JOptionPane.showMessageDialog(this,"***Player 2 is won***");
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if (buttonused[6] == 0) {
            if (turn % 2 == 0) {
                turn++;
                buttonused[6] = 1;
                b7.setText("X");
                p1won[6] = 1;
            } else {
                turn++;
                buttonused[6] = 1;
                b7.setText("O");
                p2won[6] = 1;
            }
        } else {
            JOptionPane.showMessageDialog(this, "This button is used already");
        }
        int result1 = p1won();
        int result2 = p2won();
        
        if(result1 == 1)
        {
            JOptionPane.showMessageDialog(this,"***Player 1 is win***");
        }
        if(result2 == 1)
        {
            JOptionPane.showMessageDialog(this,"***Player 2 is won***");
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if (buttonused[2] == 0) {
            if (turn % 2 == 0) {
                turn++;
                buttonused[2] = 1;
                b3.setText("X");
                p1won[2] = 1;
            } else {
                turn++;
                buttonused[2] = 1;
                b3.setText("O");
                p2won[2] = 1;
            }
        } else {
            JOptionPane.showMessageDialog(this, "This button is used already");
        }
        int result1 = p1won();
        int result2 = p2won();
        
        if(result1 == 1)
        {
            JOptionPane.showMessageDialog(this,"***Player 1 is win***");
        }
        if(result2 == 1)
        {
            JOptionPane.showMessageDialog(this,"***Player 2 is won***");
        }
     }//GEN-LAST:event_b3ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if (buttonused[7] == 0) {
            if (turn % 2 == 0) {
                turn++;
                buttonused[7] = 1;
                b8.setText("X");
                p1won[7] = 1;
            } else {
                turn++;
                buttonused[7] = 1;
                b8.setText("O");
                p2won[7] = 1;
            }
        } else {
            JOptionPane.showMessageDialog(this, "This button is used already");
        }
        int result1 = p1won();
        int result2 = p2won();
        if(result1 == 1)
        {
            JOptionPane.showMessageDialog(this,"***Player 1 is win***");
        }
        if(result2 == 1)
        {
            JOptionPane.showMessageDialog(this,"***Player 2 is won***");
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if (buttonused[3] == 0) {
            if (turn % 2 == 0) {
                turn++;
                buttonused[3] = 1;
                b4.setText("X");
                p1won[3] = 1;
            } else {
                turn++;
                buttonused[3] = 1;
                b4.setText("O");
                p2won[3] = 1;
            }
        } else {
            JOptionPane.showMessageDialog(this, "This button is used already");
        }
        int result1 = p1won();
        int result2 = p2won();
        
        if(result1 == 1)
        {
            JOptionPane.showMessageDialog(this,"***Player 1 is win***");
        }
        if(result2 == 1)
        {
            JOptionPane.showMessageDialog(this,"***Player 2 is won***");
        }
     }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if (buttonused[4] == 0) {
            if (turn % 2 == 0) {
                turn++;
                buttonused[4] = 1;
                b5.setText("X");
                p1won[4] = 1;
            } else {
                turn++;
                buttonused[4] = 1;
                b5.setText("O");
                p2won[4] = 1;
            }
        } else {
            JOptionPane.showMessageDialog(this, "This button is used already");
        }
        int result1 = p1won();
        int result2 = p2won();
        
        if(result1 == 1)
        {
            JOptionPane.showMessageDialog(this,"***Player 1 is win***");
        }
        if(result2 == 1)
        {
            JOptionPane.showMessageDialog(this,"***Player 2 is won***");
        }
     }//GEN-LAST:event_b5ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if (buttonused[8] == 0) {
            if (turn % 2 == 0) {
                turn++;
                buttonused[8] = 1;
                b9.setText("X");
                p1won[8] = 1;
            } else {
                turn++;
                buttonused[8] = 1;
                b9.setText("O");
                p2won[8] = 1;
            }
        } else {
            JOptionPane.showMessageDialog(this, "This button is used already");
        }
        int result1 = p1won();
        int result2 = p2won();
        
        if(result1 == 1)
        {
            JOptionPane.showMessageDialog(this,"***Player 1 is win***");
        }
        if(result2 == 1)
        {
            JOptionPane.showMessageDialog(this,"***Player 2 is won***");
        }
     }//GEN-LAST:event_b9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
     b1.setText("");
     b2.setText("");
     b3.setText("");
     b4.setText("");
     b5.setText("");
     b6.setText("");
     b7.setText("");
     b8.setText("");
     b9.setText("");
     turn = 2;
     for(int i = 0; i < 9; i++)
     {
         buttonused[i] = 0;
     }
     for(int i = 0; i < 9; i++)
     {
         p1won[i] = 0;
     }
     for(int i = 0; i < 9; i++)
     {
         p2won[i] = 0;
     }
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton jButton10;
    // End of variables declaration//GEN-END:variables
}
