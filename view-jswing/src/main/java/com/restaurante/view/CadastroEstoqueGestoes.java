/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.restaurante.view;

import com.restaurante.common.NegocioException;
import com.restaurante.model.dto.Alimentos;
import com.restaurante.model.service.ManterAlimentos;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class CadastroEstoqueGestoes extends javax.swing.JFrame {

    public CadastroEstoqueGestoes() {
        initComponents();
        
        try {
            carregarTabela(ManterAlimentos.listarAlimentos());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(jPanel45, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jPanel45, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public int contador;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel45 = new javax.swing.JPanel();
        LabelTitulo23 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        labelNome20 = new javax.swing.JLabel();
        jScrollPane43 = new javax.swing.JScrollPane();
        textoIngrediente = new javax.swing.JTextPane();
        labelValor20 = new javax.swing.JLabel();
        jScrollPane44 = new javax.swing.JScrollPane();
        textoQuantidade = new javax.swing.JTextPane();
        botaoAddProdutos = new java.awt.Button();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        botaoremProduto = new java.awt.Button();
        LabelTitulo4 = new javax.swing.JLabel();
        textoLinha = new javax.swing.JTextField();
        LabelTitulo1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        botaoEstoque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel45.setBackground(new java.awt.Color(235, 191, 16));

        LabelTitulo23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabelTitulo23.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo23.setText("Cadastro de Estoque");

        jPanel44.setBackground(new java.awt.Color(173, 48, 19));

        labelNome20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelNome20.setForeground(new java.awt.Color(255, 255, 255));
        labelNome20.setText("Nome do Ingrediente:");

        textoIngrediente.setText("-nome produto-");
        jScrollPane43.setViewportView(textoIngrediente);

        labelValor20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelValor20.setForeground(new java.awt.Color(255, 255, 255));
        labelValor20.setText("Quantidade do Ingrediente:");

        textoQuantidade.setText("R$ 00,00");
        jScrollPane44.setViewportView(textoQuantidade);

        botaoAddProdutos.setActionCommand("Adicionar Produto");
        botaoAddProdutos.setBackground(new java.awt.Color(173, 28, 17));
        botaoAddProdutos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botaoAddProdutos.setForeground(new java.awt.Color(255, 255, 255));
        botaoAddProdutos.setLabel("Adicionar Produto");
        botaoAddProdutos.setName(""); // NOI18N
        botaoAddProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddProdutosbotaoAddProdutos1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(labelNome20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addComponent(labelValor20)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAddProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome20))
                .addGap(41, 41, 41)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelValor20)
                    .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(botaoAddProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(173, 48, 19));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Ingredientes", "Quantidades"
            }
        ));
        jScrollPane5.setViewportView(tabela);

        botaoremProduto.setActionCommand("Remover Item");
        botaoremProduto.setBackground(new java.awt.Color(173, 28, 17));
        botaoremProduto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botaoremProduto.setForeground(new java.awt.Color(255, 255, 255));
        botaoremProduto.setLabel("Remover Item");
        botaoremProduto.setName(""); // NOI18N
        botaoremProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoremProdutoActionPerformed(evt);
            }
        });

        LabelTitulo4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LabelTitulo4.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo4.setText("Insira a linha que deseja remover:");

        textoLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoLinhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelTitulo4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(botaoremProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTitulo4)
                    .addComponent(textoLinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoremProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LabelTitulo1.setBackground(new java.awt.Color(255, 255, 255));
        LabelTitulo1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo1.setText("Estoque do Restaurante. ");

        jPanel7.setBackground(new java.awt.Color(173, 28, 17));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ol??, seja bem vindo!");

        jPanel10.setBackground(new java.awt.Color(176, 48, 39));

        jButton11.setBackground(new java.awt.Color(176, 48, 39));
        jButton11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Gerenciar Card??pio");
        jButton11.setBorder(null);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(176, 48, 39));
        jButton12.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("In??cio");
        jButton12.setBorder(null);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(176, 48, 39));
        jButton13.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Consultar Pedidos");
        jButton13.setBorder(null);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(176, 48, 39));
        jButton14.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Sobre n??s");
        jButton14.setBorder(null);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(176, 48, 39));
        jButton15.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Gerenciar Funcion??rio");
        jButton15.setBorder(null);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton15)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jButton14))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jButton12))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jButton11))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botaoEstoque)
                                    .addComponent(jButton13))))
                        .addGap(46, 46, 46)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jButton12)
                .addGap(42, 42, 42)
                .addComponent(jButton11)
                .addGap(28, 28, 28)
                .addComponent(jButton15)
                .addGap(29, 29, 29)
                .addComponent(jButton13)
                .addGap(35, 35, 35)
                .addComponent(botaoEstoque)
                .addGap(40, 40, 40)
                .addComponent(jButton14)
                .addGap(0, 93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(47, 47, 47)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(LabelTitulo1)
                        .addGap(263, 263, 263)
                        .addComponent(LabelTitulo23)
                        .addGap(154, 154, 154))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelTitulo23)
                            .addComponent(LabelTitulo1))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel45Layout.createSequentialGroup()
                                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAddProdutosbotaoAddProdutos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAddProdutosbotaoAddProdutos1ActionPerformed
            cadastrarEstoque();
    }//GEN-LAST:event_botaoAddProdutosbotaoAddProdutos1ActionPerformed

    private void botaoremProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoremProdutoActionPerformed
        String stringRemoverLinha = textoLinha.getText();
        int removerLinha = Integer.parseInt(stringRemoverLinha);
        removerLinha--;
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            
            String valorNumeroIngrediente = modelo.getValueAt(removerLinha, 0).toString();
            String valorNumeroQuantidade = modelo.getValueAt(removerLinha, 1).toString();
            try {
              ManterAlimentos.excluirAlimentos(valorNumeroIngrediente, valorNumeroQuantidade);
            } catch (NegocioException ex) {
                Logger.getLogger(CadastroEstoqueGestoes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroEstoqueGestoes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CadastroEstoqueGestoes.class.getName()).log(Level.SEVERE, null, ex);
            }
            ((DefaultTableModel) tabela.getModel()).removeRow(removerLinha); tabela.repaint(); tabela.validate();
    }//GEN-LAST:event_botaoremProdutoActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void botaoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoEstoqueActionPerformed

    private void textoLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoLinhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoLinhaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroEstoqueGestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEstoqueGestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEstoqueGestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEstoqueGestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroEstoqueGestoes().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTitulo1;
    private javax.swing.JLabel LabelTitulo23;
    private javax.swing.JLabel LabelTitulo4;
    private java.awt.Button botaoAddProdutos;
    private javax.swing.JButton botaoEstoque;
    private java.awt.Button botaoremProduto;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane44;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel labelNome20;
    private javax.swing.JLabel labelValor20;
    private javax.swing.JTable tabela;
    private javax.swing.JTextPane textoIngrediente;
    private javax.swing.JTextField textoLinha;
    private javax.swing.JTextPane textoQuantidade;
    // End of variables declaration//GEN-END:variables

    public void cadastrarEstoque() {

        int cadastros = 0;
        try {
            String ingrediente = textoIngrediente.getText();
            String quantidade = textoQuantidade.getText();
            ManterAlimentos.cadastrarAlimentos(ingrediente, quantidade);
            if (ingrediente != null) {
                cadastros++;
            }
            if (quantidade != null) {
                cadastros++;
            }
        

            if (cadastros == 2) {
                String msgDialog = "Todos os campos foram cadastrados com sucesso!";
                JOptionPane.showMessageDialog(jPanel45, msgDialog, "Confirma????o", JOptionPane.INFORMATION_MESSAGE);
                carregarTabela(ManterAlimentos.listarAlimentos());
            }
        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(jPanel45, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            textoIngrediente.requestFocus();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(jPanel45, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jPanel45, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void carregarTabela(HashSet<Alimentos> lista) {
        contador++;
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        modelo.getDataVector().removeAllElements();
        modelo.fireTableDataChanged();
        
        for(Alimentos alimento : lista) {
            modelo.insertRow(modelo.getRowCount(), new Object[] {alimento.getIngrediente(), alimento.getQuantidade()});
        }

    }

    public void carregarTabelaMomentanea() {
        contador++;
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.getDataVector().removeAllElements();
        modelo.fireTableDataChanged();
        
        Object[] dados = {textoIngrediente.getText(), textoQuantidade.getText()};
        modelo.addRow(dados);
    }
}
