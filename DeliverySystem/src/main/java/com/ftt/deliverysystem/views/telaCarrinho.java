package com.ftt.deliverysystem.views;

import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Nicolas
 */
public class telaCarrinho extends javax.swing.JFrame {
JFrame ultimaTela;
    /**
     * Creates new form Carrinho
     */
    public telaCarrinho(JFrame ultimaTela) {
        initComponents();
        this.ultimaTela = ultimaTela;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnFinaliza = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbValorTotal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbProduto1 = new javax.swing.JLabel();
        lbComprarAgora1 = new javax.swing.JLabel();
        lbFavoritar1 = new javax.swing.JLabel();
        lbExcluir1 = new javax.swing.JLabel();
        lbSUbtração1 = new javax.swing.JLabel();
        txtQuantidade1 = new javax.swing.JTextField();
        lbSoma1 = new javax.swing.JLabel();
        lbValor1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbProduto2 = new javax.swing.JLabel();
        lbComprarAgora2 = new javax.swing.JLabel();
        lbFavoritar2 = new javax.swing.JLabel();
        lbExcluir2 = new javax.swing.JLabel();
        lbSUbtração2 = new javax.swing.JLabel();
        txtQuantidade2 = new javax.swing.JTextField();
        lbSoma2 = new javax.swing.JLabel();
        lbValor2 = new javax.swing.JLabel();
        lbCarrinho = new javax.swing.JLabel();
        lbFavoritos = new javax.swing.JLabel();
        btnFuraFIla = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        lbValorFrete = new javax.swing.JLabel();
        btnVoltarC = new javax.swing.JButton();
        btnSobre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        btnFinaliza.setText("Finalizar compra");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Valor Total:");

        lbValorTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbValorTotal.setText("Valor");

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));

        lbProduto1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbProduto1.setText("Produto 1");

        lbComprarAgora1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbComprarAgora1.setForeground(new java.awt.Color(51, 51, 255));
        lbComprarAgora1.setText("Comprar agora");

        lbFavoritar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbFavoritar1.setForeground(new java.awt.Color(0, 0, 255));
        lbFavoritar1.setText("Favoritar");

        lbExcluir1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbExcluir1.setForeground(new java.awt.Color(0, 51, 255));
        lbExcluir1.setText("Excluir");

        lbSUbtração1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbSUbtração1.setText("-");

        txtQuantidade1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtQuantidade1.setText("0");

        lbSoma1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbSoma1.setText("+");

        lbValor1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbValor1.setText("Valor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbComprarAgora1)
                        .addGap(45, 45, 45)
                        .addComponent(lbFavoritar1)
                        .addGap(48, 48, 48)
                        .addComponent(lbExcluir1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbSUbtração1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbSoma1)
                        .addGap(31, 31, 31)
                        .addComponent(lbValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProduto1)
                    .addComponent(lbSUbtração1)
                    .addComponent(txtQuantidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSoma1)
                    .addComponent(lbValor1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbComprarAgora1)
                    .addComponent(lbFavoritar1)
                    .addComponent(lbExcluir1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 51));

        lbProduto2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbProduto2.setText("Produto 2");

        lbComprarAgora2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbComprarAgora2.setForeground(new java.awt.Color(51, 51, 255));
        lbComprarAgora2.setText("Comprar agora");

        lbFavoritar2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbFavoritar2.setForeground(new java.awt.Color(0, 0, 255));
        lbFavoritar2.setText("Favoritar");

        lbExcluir2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbExcluir2.setForeground(new java.awt.Color(0, 51, 255));
        lbExcluir2.setText("Excluir");

        lbSUbtração2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbSUbtração2.setText("-");

        txtQuantidade2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtQuantidade2.setText("0");

        lbSoma2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbSoma2.setText("+");

        lbValor2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbValor2.setText("Valor");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbSUbtração2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantidade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbSoma2)
                        .addGap(31, 31, 31)
                        .addComponent(lbValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbComprarAgora2)
                        .addGap(45, 45, 45)
                        .addComponent(lbFavoritar2)
                        .addGap(48, 48, 48)
                        .addComponent(lbExcluir2)
                        .addGap(0, 272, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbSUbtração2)
                        .addComponent(txtQuantidade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbSoma2)
                        .addComponent(lbValor2))
                    .addComponent(lbProduto2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbComprarAgora2)
                    .addComponent(lbFavoritar2)
                    .addComponent(lbExcluir2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbCarrinho.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbCarrinho.setForeground(new java.awt.Color(255, 255, 255));
        lbCarrinho.setText("Carrinho ( )");

        lbFavoritos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbFavoritos.setForeground(new java.awt.Color(255, 255, 255));
        lbFavoritos.setText("Favoritos ( )");

        btnFuraFIla.setText("Fura Fila");
        btnFuraFIla.setContentAreaFilled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Valor Frete:");

        lbValorFrete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbValorFrete.setText("ValorFrete");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 365, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnFinaliza)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbValorFrete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(28, 28, 28))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lbCarrinho)
                        .addGap(42, 42, 42)
                        .addComponent(lbFavoritos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnFuraFIla)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFavoritos))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFuraFIla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbValorFrete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFinaliza)
                .addContainerGap())
        );

        btnVoltarC.setText("Produtos");
        btnVoltarC.setContentAreaFilled(false);
        btnVoltarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarCActionPerformed(evt);
            }
        });

        btnSobre.setText("Sobre");
        btnSobre.setContentAreaFilled(false);
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnVoltarC, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarCActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ultimaTela.setVisible(true);
    }//GEN-LAST:event_btnVoltarCActionPerformed

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        // TODO add your handling code here:
         Sobre sobre = new Sobre(this);
    sobre.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_btnSobreActionPerformed

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
            java.util.logging.Logger.getLogger(telaCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCarrinho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinaliza;
    private javax.swing.JRadioButton btnFuraFIla;
    private javax.swing.JButton btnSobre;
    private javax.swing.JButton btnVoltarC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbCarrinho;
    private javax.swing.JLabel lbComprarAgora1;
    private javax.swing.JLabel lbComprarAgora2;
    private javax.swing.JLabel lbExcluir1;
    private javax.swing.JLabel lbExcluir2;
    private javax.swing.JLabel lbFavoritar1;
    private javax.swing.JLabel lbFavoritar2;
    private javax.swing.JLabel lbFavoritos;
    private javax.swing.JLabel lbProduto1;
    private javax.swing.JLabel lbProduto2;
    private javax.swing.JLabel lbSUbtração1;
    private javax.swing.JLabel lbSUbtração2;
    private javax.swing.JLabel lbSoma1;
    private javax.swing.JLabel lbSoma2;
    private javax.swing.JLabel lbValor1;
    private javax.swing.JLabel lbValor2;
    private javax.swing.JLabel lbValorFrete;
    private javax.swing.JLabel lbValorTotal;
    private javax.swing.JTextField txtQuantidade1;
    private javax.swing.JTextField txtQuantidade2;
    // End of variables declaration//GEN-END:variables
}
