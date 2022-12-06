/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.restaurante.view;

import com.restaurante.common.NegocioException;
import com.restaurante.model.dto.Funcionarios;
import com.restaurante.model.service.ManterAlimentos;
import com.restaurante.model.service.ManterFuncionarios;
import com.restaurante.model.service.ManterUsuario;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CadastroUsuarioGestao extends javax.swing.JFrame {


    public CadastroUsuarioGestao() {
        initComponents();
        
        try {
            carregarTabela(ManterFuncionarios.listarFuncionarios());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(jScrollPane1, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jScrollPane1, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public int contador = 0; 


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelTitulo2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoNome = new javax.swing.JTextPane();
        labelValor = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoCodigo = new javax.swing.JTextPane();
        botaoAddFuncionario = new java.awt.Button();
        labelSalario = new javax.swing.JLabel();
        labelEspecialidade = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textoSalario = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        textoEspecialidade = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        textoSenha = new javax.swing.JTextPane();
        labelSenha = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        botaoremProduto = new java.awt.Button();
        LabelTitulo4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        textoLinha = new javax.swing.JTextPane();
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

        jPanel1.setBackground(new java.awt.Color(235, 191, 16));

        LabelTitulo2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabelTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo2.setText("Cadastro de Usuário");

        jPanel2.setBackground(new java.awt.Color(173, 48, 19));

        labelNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelNome.setForeground(new java.awt.Color(255, 255, 255));
        labelNome.setText("Nome:");

        textoNome.setText("-nome funcionario-");
        jScrollPane1.setViewportView(textoNome);

        labelValor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelValor.setForeground(new java.awt.Color(255, 255, 255));
        labelValor.setText("CPF:");

        textoCodigo.setText("-CPF funcionario-");
        jScrollPane2.setViewportView(textoCodigo);

        botaoAddFuncionario.setActionCommand("Adicionar Produto");
        botaoAddFuncionario.setBackground(new java.awt.Color(173, 28, 17));
        botaoAddFuncionario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botaoAddFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        botaoAddFuncionario.setLabel("Adicionar Funcionário");
        botaoAddFuncionario.setName(""); // NOI18N
        botaoAddFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddFuncionarioActionPerformed(evt);
            }
        });

        labelSalario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelSalario.setForeground(new java.awt.Color(255, 255, 255));
        labelSalario.setText("Salário:");

        labelEspecialidade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelEspecialidade.setForeground(new java.awt.Color(255, 255, 255));
        labelEspecialidade.setText("Especialidade:");

        textoSalario.setText("-salario-");
        jScrollPane3.setViewportView(textoSalario);

        textoEspecialidade.setText("-especialidade-");
        jScrollPane4.setViewportView(textoEspecialidade);

        textoSenha.setText("-Senha funcionario-");
        jScrollPane7.setViewportView(textoSenha);

        labelSenha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(255, 255, 255));
        labelSenha.setText("Senha:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelNome)
                                    .addComponent(labelValor))
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEspecialidade, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelSalario, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelSenha, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(botaoAddFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelValor)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEspecialidade))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSalario))
                .addGap(34, 34, 34)
                .addComponent(botaoAddFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanel3.setBackground(new java.awt.Color(173, 48, 19));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "CPF", "Funcionario", "Especialização", "Salário"
            }
        ));
        jScrollPane5.setViewportView(tabela);

        botaoremProduto.setActionCommand("Remover Funcionário");
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

        jScrollPane6.setViewportView(textoLinha);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(botaoremProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelTitulo4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelTitulo4)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoremProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        LabelTitulo1.setBackground(new java.awt.Color(255, 255, 255));
        LabelTitulo1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo1.setText("Usuários Cadastrados. ");

        jPanel7.setBackground(new java.awt.Color(173, 28, 17));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Olá, seja bem vindo!");

        jPanel10.setBackground(new java.awt.Color(176, 48, 39));

        jButton11.setBackground(new java.awt.Color(176, 48, 39));
        jButton11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Gerenciar Cardápio");
        jButton11.setBorder(null);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(176, 48, 39));
        jButton12.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Início");
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
        jButton14.setText("Sobre nós");
        jButton14.setBorder(null);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(176, 48, 39));
        jButton15.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Gerenciar Funcionário");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(LabelTitulo1)
                        .addGap(251, 251, 251)
                        .addComponent(LabelTitulo2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelTitulo2)
                            .addComponent(LabelTitulo1))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAddFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAddFuncionarioActionPerformed
        cadastrarEstoque();
    }//GEN-LAST:event_botaoAddFuncionarioActionPerformed

    private void botaoremProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoremProdutoActionPerformed
      String stringRemoverLinha = textoLinha.getText();
        int removerLinha = Integer.parseInt(stringRemoverLinha);
        removerLinha--;
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            String valorNumeroCpf = modelo.getValueAt(removerLinha, 0).toString();
            String valorNumeroNome = modelo.getValueAt(removerLinha, 1).toString();
            String valorNumeroEspecialidade = modelo.getValueAt(removerLinha, 2).toString();
            String valorNumeroSalario = modelo.getValueAt(removerLinha, 3).toString();
            try {
              ManterFuncionarios.excluirFuncionarios(valorNumeroCpf, valorNumeroNome, valorNumeroEspecialidade, valorNumeroSalario);
            } catch (NegocioException ex) {
                Logger.getLogger(CadastroUsuarioGestao.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroUsuarioGestao.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CadastroUsuarioGestao.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(CadastroUsuarioGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarioGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarioGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarioGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuarioGestao().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTitulo1;
    private javax.swing.JLabel LabelTitulo2;
    private javax.swing.JLabel LabelTitulo4;
    private java.awt.Button botaoAddFuncionario;
    private javax.swing.JButton botaoEstoque;
    private java.awt.Button botaoremProduto;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel labelEspecialidade;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSalario;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelValor;
    private javax.swing.JTable tabela;
    private javax.swing.JTextPane textoCodigo;
    private javax.swing.JTextPane textoEspecialidade;
    private javax.swing.JTextPane textoLinha;
    private javax.swing.JTextPane textoNome;
    private javax.swing.JTextPane textoSalario;
    private javax.swing.JTextPane textoSenha;
    // End of variables declaration//GEN-END:variables

    public void cadastrarEstoque() {    
    
    int cadastros = 0;

        try {
            String nome = textoNome.getText();
            String codigo = textoCodigo.getText();
            String senha = textoSenha.getText();
            String especialidade = textoEspecialidade.getText();
            String salario = textoSalario.getText();
            ManterFuncionarios.cadastrarFuncionarios(codigo, nome, especialidade, salario);
            ManterUsuario.cadastrarUsuario(codigo, senha);
            if(nome != null) {
                cadastros++;
            }
            if(codigo != null) {
                cadastros++;
            }
            if(especialidade != null) {
                cadastros++;
            }
            if(salario != null) {
                cadastros++;
            }
            
            if (cadastros == 4) {
            String msgDialog = "Todos os campos foram cadastrados com sucesso!";
            JOptionPane.showMessageDialog(jScrollPane1, msgDialog, "Confirmação", JOptionPane.INFORMATION_MESSAGE);
            carregarTabela(ManterFuncionarios.listarFuncionarios());
        }
        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(jScrollPane1, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            textoNome.requestFocus();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(jScrollPane1, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jScrollPane1, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void carregarTabela(HashSet<Funcionarios> lista) {

        contador++;
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.getDataVector().removeAllElements();
        modelo.fireTableDataChanged();
        
        for(Funcionarios funcionario : lista) {
            modelo.insertRow(modelo.getRowCount(), new Object[] {funcionario.getCodigo(), funcionario.getNome(), funcionario.getEspecialidade(), funcionario.getSalario()});
        }
    }
    
    public void carregarTabelaMomentanea() {
        contador++;
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.getDataVector().removeAllElements();
        modelo.fireTableDataChanged();
        
        Object[] dados = {textoCodigo.getText(), textoNome.getText(), textoEspecialidade.getText(), textoSalario.getText()};
        modelo.addRow(dados);
    }
    }
