/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.restaurante.view;


public class PaginaClientes extends javax.swing.JFrame {


    public PaginaClientes() {
        initComponents();
    }

    CadastrarPedidosCliente janela8 = new CadastrarPedidosCliente();
    ConsultarComandaCliente janela9 = new ConsultarComandaCliente();
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BotaoMostrarCardapio = new javax.swing.JButton();
        botaoInicio = new javax.swing.JButton();
        BotaoPedidos = new javax.swing.JButton();
        BotaoCreditos = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(235, 191, 16));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(176, 48, 39));

        jPanel3.setBackground(new java.awt.Color(173, 28, 17));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Olá, seja bem vindo!");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(50, 50, 50))
        );

        BotaoMostrarCardapio.setBackground(new java.awt.Color(176, 48, 39));
        BotaoMostrarCardapio.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotaoMostrarCardapio.setForeground(new java.awt.Color(255, 255, 255));
        BotaoMostrarCardapio.setText("Cardápio");
        BotaoMostrarCardapio.setBorder(null);
        BotaoMostrarCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMostrarCardapioActionPerformed(evt);
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

        BotaoPedidos.setBackground(new java.awt.Color(176, 48, 39));
        BotaoPedidos.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotaoPedidos.setForeground(new java.awt.Color(255, 255, 255));
        BotaoPedidos.setText("Comanda");
        BotaoPedidos.setBorder(null);
        BotaoPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPedidosActionPerformed(evt);
            }
        });

        BotaoCreditos.setBackground(new java.awt.Color(176, 48, 39));
        BotaoCreditos.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotaoCreditos.setForeground(new java.awt.Color(255, 255, 255));
        BotaoCreditos.setText("Sobre nós");
        BotaoCreditos.setBorder(null);
        BotaoCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCreditosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(botaoInicio))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotaoCreditos)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BotaoPedidos)
                        .addComponent(BotaoMostrarCardapio))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(botaoInicio)
                .addGap(38, 38, 38)
                .addComponent(BotaoMostrarCardapio)
                .addGap(35, 35, 35)
                .addComponent(BotaoPedidos)
                .addGap(34, 34, 34)
                .addComponent(BotaoCreditos)
                .addGap(0, 101, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sistema Sabor e Arte");

        jTextArea2.setBackground(new java.awt.Color(235, 191, 16));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("Seja bem vindo ao Sistema Sabor e Arte, um projeto para a administração de restaurantes.\n\nEssa página é dedicada aos clientes do sistema em que nela você pode encon-trar funções como a mostragem do cardápio do restaurante, do qual se pode  realizar pedidos, além da sua comanda virtual e  uma página de créditos dos desenvolvedores do projeto.");
        jTextArea2.setBorder(null);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoMostrarCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMostrarCardapioActionPerformed
        carregarNovaPaginaPedidos();
    }//GEN-LAST:event_BotaoMostrarCardapioActionPerformed

    private void botaoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInicioActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoInicioActionPerformed

    private void BotaoPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPedidosActionPerformed
        carregarNovaPaginaComandaCliente();
    }//GEN-LAST:event_BotaoPedidosActionPerformed

    private void BotaoCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCreditosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoCreditosActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaClientes().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCreditos;
    private javax.swing.JButton BotaoMostrarCardapio;
    private javax.swing.JButton BotaoPedidos;
    private javax.swing.JButton botaoInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables

    public void carregarNovaPaginaPedidos() {

        if (janela8 == null) {
            janela8 = new CadastrarPedidosCliente();
            janela8.setLocationRelativeTo(null);
            janela8.setVisible(true);
            janela8.setResizable(false);
        } else {
            janela8.setLocationRelativeTo(null);
            janela8.setVisible(true);
            janela8.setResizable(false);
      }

    }
    
    public void carregarNovaPaginaComandaCliente() {

        if (janela9 == null) {
            janela9 = new ConsultarComandaCliente();
            janela9.setLocationRelativeTo(null);
            janela9.setVisible(true);
            janela9.setResizable(false);
        } else {
            janela9.setLocationRelativeTo(null);
            janela9.setVisible(true);
            janela9.setResizable(false);
      }

    }
}
