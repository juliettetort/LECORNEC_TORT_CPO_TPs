/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mastermind_lecornec_tort_2;

/**
 *
 * @author 33782
 */
public class fenetreDeJeu extends javax.swing.JFrame {
String[][] grilleJeu=new String[12][4];

    /**
     * Creates new form fenetreDeJeu
     */
    public fenetreDeJeu() {
        initComponents();
        panneaureglejeu.setVisible(false);
        panneauchoixcouleurs.setVisible(false);
        for (int i=4; i>=0; i--){
            for (int j=12; j<0; j++){
            CelluleGraphique CellGraph = new CelluleGraphique();
            panneaugrille.add(CellGraph);
        }  
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneaugrille = new javax.swing.JPanel();
        Panneauinfojeu = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btn_col1 = new javax.swing.JButton();
        btn_col2 = new javax.swing.JButton();
        btn_col3 = new javax.swing.JButton();
        btn_col4 = new javax.swing.JButton();
        panneaureglejeu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        panneauchoixcouleurs = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneaugrille.setBackground(new java.awt.Color(255, 255, 255));
        panneaugrille.setLayout(new java.awt.GridLayout(12, 4));
        getContentPane().add(panneaugrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 380, 590));

        Panneauinfojeu.setBackground(new java.awt.Color(0, 153, 153));

        jButton1.setText("D??marrer partie");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanneauinfojeuLayout = new javax.swing.GroupLayout(Panneauinfojeu);
        Panneauinfojeu.setLayout(PanneauinfojeuLayout);
        PanneauinfojeuLayout.setHorizontalGroup(
            PanneauinfojeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanneauinfojeuLayout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(142, 142, 142))
        );
        PanneauinfojeuLayout.setVerticalGroup(
            PanneauinfojeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanneauinfojeuLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(Panneauinfojeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 420, 100));

        btn_col1.setText("1");
        btn_col1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        btn_col2.setText("2");
        btn_col2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col2, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 0, -1, -1));

        btn_col3.setText("3");
        getContentPane().add(btn_col3, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 0, -1, -1));

        btn_col4.setText("4");
        btn_col4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col4, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 0, -1, -1));

        panneaureglejeu.setBackground(new java.awt.Color(0, 153, 153));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("R??gle du jeu: Essaye de retrouver la combinaison cach??e par le mastermind, \nvous avez 12 coups et des indices ?? chaque tour de jeu\nBonne chance !");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout panneaureglejeuLayout = new javax.swing.GroupLayout(panneaureglejeu);
        panneaureglejeu.setLayout(panneaureglejeuLayout);
        panneaureglejeuLayout.setHorizontalGroup(
            panneaureglejeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneaureglejeuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        panneaureglejeuLayout.setVerticalGroup(
            panneaureglejeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneaureglejeuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(panneaureglejeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 420, 140));

        panneauchoixcouleurs.setBackground(new java.awt.Color(0, 153, 153));

        jTextArea2.setBackground(new java.awt.Color(0, 153, 153));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Choisisez la couleur que vous souhaitez attribuer : ");
        jScrollPane2.setViewportView(jTextArea2);

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Rouge");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setText("Jaune");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setText("Orange");

        jButton5.setBackground(new java.awt.Color(0, 204, 204));
        jButton5.setText("Bleue");

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Noir");

        jButton9.setText("Blanc");

        jButton10.setBackground(new java.awt.Color(255, 204, 204));
        jButton10.setText("Rose");

        jButton11.setBackground(new java.awt.Color(0, 204, 102));
        jButton11.setText("Vert");

        javax.swing.GroupLayout panneauchoixcouleursLayout = new javax.swing.GroupLayout(panneauchoixcouleurs);
        panneauchoixcouleurs.setLayout(panneauchoixcouleursLayout);
        panneauchoixcouleursLayout.setHorizontalGroup(
            panneauchoixcouleursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneauchoixcouleursLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panneauchoixcouleursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panneauchoixcouleursLayout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panneauchoixcouleursLayout.createSequentialGroup()
                        .addGroup(panneauchoixcouleursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(panneauchoixcouleursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panneauchoixcouleursLayout.createSequentialGroup()
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panneauchoixcouleursLayout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46))))
            .addGroup(panneauchoixcouleursLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        panneauchoixcouleursLayout.setVerticalGroup(
            panneauchoixcouleursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneauchoixcouleursLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panneauchoixcouleursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addGroup(panneauchoixcouleursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton11)
                    .addComponent(jButton10))
                .addGap(18, 18, 18)
                .addGroup(panneauchoixcouleursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        getContentPane().add(panneauchoixcouleurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 410, 240));

        setBounds(0, 0, 941, 1483);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_col1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col1ActionPerformed

    private void btn_col2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col2ActionPerformed

    private void btn_col4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        panneaureglejeu.setVisible(true);
        panneauchoixcouleurs.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDeJeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panneauinfojeu;
    private javax.swing.JButton btn_col1;
    private javax.swing.JButton btn_col2;
    private javax.swing.JButton btn_col3;
    private javax.swing.JButton btn_col4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JPanel panneauchoixcouleurs;
    private javax.swing.JPanel panneaugrille;
    private javax.swing.JPanel panneaureglejeu;
    // End of variables declaration//GEN-END:variables
}
