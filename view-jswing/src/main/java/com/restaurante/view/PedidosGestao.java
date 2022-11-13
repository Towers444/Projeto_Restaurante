/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.restaurante.view;

/**
 *
 * @author Aluno
 */
public class PedidosGestao extends javax.swing.JFrame {

    /**
     * Creates new form PedidosGestao
     */
    public PedidosGestao() {
        initComponents();
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
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botaoCadastroCardapio = new javax.swing.JButton();
        botaoInicio = new javax.swing.JButton();
        botaoPedidos = new javax.swing.JButton();
        botaoCreditos = new javax.swing.JButton();
        botaoCadastroFuncionario = new javax.swing.JButton();
        botaoEstoque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(235, 191, 16));

        jPanel4.setBackground(new java.awt.Color(176, 48, 39));

        jPanel5.setBackground(new java.awt.Color(173, 28, 17));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Olá, seja bem vindo!");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(34, 34, 34))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(50, 50, 50))
        );

        botaoCadastroCardapio.setBackground(new java.awt.Color(176, 48, 39));
        botaoCadastroCardapio.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        botaoCadastroCardapio.setForeground(new java.awt.Color(255, 255, 255));
        botaoCadastroCardapio.setText("Gerenciar Cardápio");
        botaoCadastroCardapio.setBorder(null);
        botaoCadastroCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroCardapioActionPerformed(evt);
            }
        });

        botaoInicio.setBackground(new java.awt.Color(176, 48, 39));
        botaoInicio.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        botaoInicio.setForeground(new java.awt.Color(255, 255, 255));
        botaoInicio.setText("Início");
        botaoInicio.setBorder(null);
        botaoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInicioActionPerformed(evt);
            }
        });

        botaoPedidos.setBackground(new java.awt.Color(176, 48, 39));
        botaoPedidos.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        botaoPedidos.setForeground(new java.awt.Color(255, 255, 255));
        botaoPedidos.setText("Consultar Pedidos");
        botaoPedidos.setBorder(null);
        botaoPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPedidosActionPerformed(evt);
            }
        });

        botaoCreditos.setBackground(new java.awt.Color(176, 48, 39));
        botaoCreditos.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        botaoCreditos.setForeground(new java.awt.Color(255, 255, 255));
        botaoCreditos.setText("Sobre nós");
        botaoCreditos.setBorder(null);
        botaoCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCreditosActionPerformed(evt);
            }
        });

        botaoCadastroFuncionario.setBackground(new java.awt.Color(176, 48, 39));
        botaoCadastroFuncionario.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        botaoCadastroFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        botaoCadastroFuncionario.setText("Gerenciar Funcionário");
        botaoCadastroFuncionario.setBorder(null);
        botaoCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroFuncionarioActionPerformed(evt);
            }
        });

        botaoEstoque.setBackground(new java.awt.Color(176, 48, 39));
        botaoEstoque.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        botaoEstoque.setForeground(new java.awt.Color(255, 255, 255));
        botaoEstoque.setText("Consultar Estoque");
        botaoEstoque.setBorder(null);
        botaoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(botaoInicio))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(botaoCadastroCardapio))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(botaoCadastroFuncionario))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(botaoCreditos))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoEstoque)
                    .addComponent(botaoPedidos)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(botaoInicio)
                .addGap(18, 18, 18)
                .addComponent(botaoCadastroCardapio)
                .addGap(28, 28, 28)
                .addComponent(botaoCadastroFuncionario)
                .addGap(26, 26, 26)
                .addComponent(botaoPedidos)
                .addGap(27, 27, 27)
                .addComponent(botaoEstoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(botaoCreditos)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 631, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 905, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastroCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroCardapioActionPerformed
        
    }//GEN-LAST:event_botaoCadastroCardapioActionPerformed

    private void botaoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInicioActionPerformed
        //carregarNovaPaginaInicial();
    }//GEN-LAST:event_botaoInicioActionPerformed

    private void botaoPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPedidosActionPerformed

    private void botaoCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCreditosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCreditosActionPerformed

    private void botaoCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCadastroFuncionarioActionPerformed

    private void botaoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoEstoqueActionPerformed

    
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
            java.util.logging.Logger.getLogger(PedidosGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidosGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidosGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidosGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidosGestao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastroCardapio;
    private javax.swing.JButton botaoCadastroFuncionario;
    private javax.swing.JButton botaoCreditos;
    private javax.swing.JButton botaoEstoque;
    private javax.swing.JButton botaoInicio;
    private javax.swing.JButton botaoPedidos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}