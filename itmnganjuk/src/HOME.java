/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author user
 */
public class HOME extends javax.swing.JFrame {

    /**
     * Creates new form HOME
     */
    public HOME() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bPersegiPanjang = new javax.swing.JButton();
        bPersegi = new javax.swing.JButton();
        bLingkaran = new javax.swing.JButton();
        bSegitiga = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("APLIKASI BANGUN DATAR");

        bPersegiPanjang.setText("PERSEGI PANJANG");
        bPersegiPanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPersegiPanjangActionPerformed(evt);
            }
        });

        bPersegi.setText("PERSEGI");
        bPersegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPersegiActionPerformed(evt);
            }
        });

        bLingkaran.setText("LINGKARAN");
        bLingkaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLingkaranActionPerformed(evt);
            }
        });

        bSegitiga.setText("SEGITIGA");
        bSegitiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSegitigaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bPersegiPanjang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bPersegi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bLingkaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bSegitiga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(bPersegiPanjang)
                .addGap(18, 18, 18)
                .addComponent(bPersegi)
                .addGap(18, 18, 18)
                .addComponent(bLingkaran)
                .addGap(18, 18, 18)
                .addComponent(bSegitiga)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPersegiPanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPersegiPanjangActionPerformed
        new PERSEGIPANJANG().setVisible(true);
    }//GEN-LAST:event_bPersegiPanjangActionPerformed

    private void bLingkaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLingkaranActionPerformed
        new LINGKARAN().setVisible(true);   
    }//GEN-LAST:event_bLingkaranActionPerformed

    private void bPersegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPersegiActionPerformed
        new PERSEGI().setVisible(true);
    }//GEN-LAST:event_bPersegiActionPerformed

    private void bSegitigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSegitigaActionPerformed
        new SEGITIGA().setVisible(true);
    }//GEN-LAST:event_bSegitigaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HOME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLingkaran;
    private javax.swing.JButton bPersegi;
    private javax.swing.JButton bPersegiPanjang;
    private javax.swing.JButton bSegitiga;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
