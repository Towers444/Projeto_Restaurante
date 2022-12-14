/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.restaurante.view;

import com.restaurante.model.service.ManterSenha;
import com.restaurante.model.service.ManterUsuario;
import com.restaurante.common.NegocioException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class cadastroUsuario extends javax.swing.JFrame {

    public cadastroUsuario() {
        initComponents();
    }

    PaginaGestaos janela4 = new PaginaGestaos();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelValor1 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelLogin = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JTextField();
        labelUsuario = new javax.swing.JLabel();
        textoSenha = new javax.swing.JPasswordField();
        botaoPaginaGestao = new javax.swing.JButton();
        labelLogin1 = new javax.swing.JLabel();

        labelValor1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelValor1.setText("Descrição do Produto:");

        button1.setLabel("button1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(235, 191, 16));

        jPanel1.setBackground(new java.awt.Color(173, 48, 19));

        labelLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(255, 255, 255));
        labelLogin.setText("Login do Usuário ");

        labelSenha.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(255, 255, 255));
        labelSenha.setText("Senha:");

        labelUsuario.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setText("Usuário:");

        textoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoSenhaActionPerformed(evt);
            }
        });

        botaoPaginaGestao.setBackground(new java.awt.Color(173, 28, 17));
        botaoPaginaGestao.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        botaoPaginaGestao.setForeground(new java.awt.Color(255, 255, 255));
        botaoPaginaGestao.setText("Fazer Login");
        botaoPaginaGestao.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        botaoPaginaGestao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPaginaGestaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 74, Short.MAX_VALUE)
                                .addComponent(botaoPaginaGestao, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(85, 85, 85)
                                                .addComponent(labelLogin))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(24, 24, 24)
                                                                .addComponent(labelUsuario))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(26, 26, 26)
                                                                .addComponent(labelSenha)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(textoUsuario)
                                                        .addComponent(textoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(labelLogin)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelUsuario))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelSenha)
                                        .addComponent(textoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addComponent(botaoPaginaGestao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(63, Short.MAX_VALUE))
        );

        labelLogin1.setBackground(new java.awt.Color(255, 255, 255));
        labelLogin1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelLogin1.setForeground(new java.awt.Color(255, 255, 255));
        labelLogin1.setText("Sabor e Arte");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(172, 172, 172)
                                                .addComponent(labelLogin1)))
                                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(labelLogin1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoSenhaActionPerformed

    private void botaoPaginaGestaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPaginaGestaoActionPerformed
        loginUsuario();
    }//GEN-LAST:event_botaoPaginaGestaoActionPerformed

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
            java.util.logging.Logger.getLogger(cadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
 /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroUsuario().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoPaginaGestao;
    private java.awt.Button button1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelLogin1;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel labelValor1;
    private javax.swing.JPasswordField textoSenha;
    private javax.swing.JTextField textoUsuario;
    // End of variables declaration//GEN-END:variables

    public void loginUsuario() {

        int cadastros = 0;
        try {
            String codigo = textoUsuario.getText();
            String senha = String.valueOf(textoSenha.getPassword());
            int retorno = ManterUsuario.consultarUsuario(codigo, senha);

            if (retorno == 1) {
                carregarNovaPagina();
            } else {
                JOptionPane.showMessageDialog(jPanel1, "Login ou senha incorretos", "Erro", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(jPanel1, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            textoUsuario.requestFocus();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(jPanel1, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jPanel1, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void carregarNovaPagina() {

        if (janela4 == null) {
            janela4 = new PaginaGestaos();
            janela4.setLocationRelativeTo(null);
            janela4.setVisible(true);
            janela4.setResizable(false);
            this.dispose();
        } else {
            janela4.setLocationRelativeTo(null);
            janela4.setVisible(true);
            janela4.setResizable(false);
            this.dispose();
        }

    }
}
