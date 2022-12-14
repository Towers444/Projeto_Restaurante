/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.restaurante.view;

import com.restaurante.common.PersistenciaException;
import com.restaurante.model.service.ManterFuncionarios;
import com.restaurante.model.service.ManterProduto;
import com.restaurante.model.service.ManterUsuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class editarFuncionarios extends javax.swing.JFrame {

    /**
     * Creates new form editarFuncionarios
     */
    public editarFuncionarios() {
        initComponents();
    }

    private CadastroFuncionarioGestao frame1;
    public String antigoCodigo;
    public String antigoNome;
    public String antigoEspecialidade;
    public String antigoSalario;
    
    public void enviaPalavra(CadastroFuncionarioGestao frame1, String aCodigo, String aNome, String aEspecialidade, String aSalario) {
      
        antigoCodigo = aCodigo;
        antigoNome = aNome;
        antigoEspecialidade = aEspecialidade;
        antigoSalario = aSalario;
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelLogin = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        textoCodigo = new javax.swing.JTextField();
        labelUsuario = new javax.swing.JLabel();
        botaoPaginaGestao = new javax.swing.JButton();
        textoNome = new javax.swing.JTextField();
        botaoPaginaGestao1 = new javax.swing.JButton();
        textoEspecialidade = new javax.swing.JTextField();
        labelSenha2 = new javax.swing.JLabel();
        textoSalario = new javax.swing.JTextField();
        labelSenha3 = new javax.swing.JLabel();
        labelLogin1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(235, 191, 16));

        jPanel1.setBackground(new java.awt.Color(173, 48, 19));

        labelLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(255, 255, 255));
        labelLogin.setText("Editar Funcionário");

        labelSenha.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(255, 255, 255));
        labelSenha.setText("Nome:");

        labelUsuario.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setText("CPF:");

        botaoPaginaGestao.setBackground(new java.awt.Color(173, 28, 17));
        botaoPaginaGestao.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        botaoPaginaGestao.setForeground(new java.awt.Color(255, 255, 255));
        botaoPaginaGestao.setText("Editar Funcionário");
        botaoPaginaGestao.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        botaoPaginaGestao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPaginaGestaoActionPerformed(evt);
            }
        });

        botaoPaginaGestao1.setBackground(new java.awt.Color(173, 28, 17));
        botaoPaginaGestao1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        botaoPaginaGestao1.setForeground(new java.awt.Color(255, 255, 255));
        botaoPaginaGestao1.setText("Cancelar");
        botaoPaginaGestao1.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        botaoPaginaGestao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPaginaGestao1ActionPerformed(evt);
            }
        });

        labelSenha2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        labelSenha2.setForeground(new java.awt.Color(255, 255, 255));
        labelSenha2.setText("Especialidade:");

        labelSenha3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        labelSenha3.setForeground(new java.awt.Color(255, 255, 255));
        labelSenha3.setText("Salário:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelSenha)
                    .addComponent(labelUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelSenha2)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelSenha3)
                        .addGap(29, 29, 29)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoPaginaGestao, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(botaoPaginaGestao1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(54, 54, 54))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(labelLogin)
                            .addGap(77, 77, 77)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelLogin)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsuario))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSenha))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSenha2))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSenha3))
                .addGap(43, 43, 43)
                .addComponent(botaoPaginaGestao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(botaoPaginaGestao1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        labelLogin1.setBackground(new java.awt.Color(255, 255, 255));
        labelLogin1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelLogin1.setText("Sabor e Arte");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(labelLogin1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(labelLogin1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPaginaGestaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPaginaGestaoActionPerformed

        try {
            try {
                editarFuncionarios();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(editarFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (PersistenciaException ex) {
                Logger.getLogger(editarFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(adicionarProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.dispose();
    }//GEN-LAST:event_botaoPaginaGestaoActionPerformed

    private void botaoPaginaGestao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPaginaGestao1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoPaginaGestao1ActionPerformed

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
            java.util.logging.Logger.getLogger(editarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editarFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoPaginaGestao;
    private javax.swing.JButton botaoPaginaGestao1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelLogin1;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelSenha2;
    private javax.swing.JLabel labelSenha3;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JTextField textoCodigo;
    private javax.swing.JTextField textoEspecialidade;
    private javax.swing.JTextField textoNome;
    private javax.swing.JTextField textoSalario;
    // End of variables declaration//GEN-END:variables

public void editarFuncionarios() throws SQLException, ClassNotFoundException, PersistenciaException {


    int cadastros = 0;
    String novoNome = textoNome.getText();
    String novoCodigo = textoCodigo.getText();
    String novoEspecialidade = textoEspecialidade.getText();
    String novoSalario = textoSalario.getText();
    ManterFuncionarios.alterarFuncionario(antigoCodigo, antigoNome, antigoEspecialidade, antigoSalario, novoCodigo, novoNome, novoEspecialidade, novoSalario);
    if(novoNome != null) {
        cadastros++;
    }
    if(novoCodigo != null) {
        cadastros++;
    }
    if(novoEspecialidade != null) {
        cadastros++;
    }
    if(novoSalario != null) {
        cadastros++;
    }
    if (cadastros == 4) {
        String msgDialog = "Todos os campos foram cadastrados com sucesso!";
        JOptionPane.showMessageDialog(jPanel1, msgDialog, "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        CadastroFuncionarioGestao.atualizarTabela();
    }
        
    }

}
