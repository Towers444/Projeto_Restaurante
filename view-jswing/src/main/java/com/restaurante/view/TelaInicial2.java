/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.restaurante.view;


public class TelaInicial2 extends javax.swing.JFrame {


    public TelaInicial2() {
        initComponents();
    }
    
    cadastroUsuario janela2 = new cadastroUsuario();
    PaginaClientes janela3 = new PaginaClientes();

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botaoPaginaGestao = new javax.swing.JButton();
        botaoPaginaCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(235, 191, 16));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema Sabor e Arte");

        botaoPaginaGestao.setBackground(new java.awt.Color(173, 28, 17));
        botaoPaginaGestao.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        botaoPaginaGestao.setForeground(new java.awt.Color(255, 255, 255));
        botaoPaginaGestao.setText("Gestão");
        botaoPaginaGestao.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        botaoPaginaGestao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPaginaGestaoActionPerformed(evt);
            }
        });

        botaoPaginaCliente.setBackground(new java.awt.Color(173, 28, 17));
        botaoPaginaCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        botaoPaginaCliente.setForeground(new java.awt.Color(255, 255, 255));
        botaoPaginaCliente.setText("Cliente");
        botaoPaginaCliente.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        botaoPaginaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPaginaClienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(173, 28, 17));
        jLabel2.setText("Faça Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(290, 290, 290))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoPaginaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoPaginaGestao, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(260, 260, 260))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(botaoPaginaGestao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(botaoPaginaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPaginaGestaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPaginaGestaoActionPerformed
        carregarNovaPaginaGestao();
       //setVisible(false);
        //dispose();
    }//GEN-LAST:event_botaoPaginaGestaoActionPerformed

    private void botaoPaginaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPaginaClienteActionPerformed
        carregarNovaPaginaCliente();
        //setVisible(false);
        //dispose();
    }//GEN-LAST:event_botaoPaginaClienteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoPaginaCliente;
    private javax.swing.JButton botaoPaginaGestao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void carregarNovaPaginaGestao() {

        if (janela2 == null) {
            janela2 = new cadastroUsuario();
            janela2.setLocationRelativeTo(null);
            janela2.setVisible(true);
            janela2.setResizable(false);
            this.dispose();
        } else {
            janela2.setLocationRelativeTo(null);
            janela2.setVisible(true);
            janela2.setResizable(false);
      }

    }
    
    public void carregarNovaPaginaCliente() {

        
        if (janela3 == null) {
            janela3 = new PaginaClientes();
            janela3.setLocationRelativeTo(null);
            janela3.setVisible(true);
            janela3.setResizable(false);
        } else {
            janela3.setLocationRelativeTo(null);
            janela3.setVisible(true);
            janela3.setResizable(false);
      }

    }

}
