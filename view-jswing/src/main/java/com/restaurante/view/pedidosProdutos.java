/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.restaurante.view;

import com.restaurante.common.NegocioException;
import com.restaurante.model.dto.Produto;
import com.restaurante.model.service.ManterPedidos;
import com.restaurante.model.service.ManterPedidosCliente;
import com.restaurante.model.service.ManterProduto;
import java.sql.SQLException;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class pedidosProdutos extends javax.swing.JFrame {

    
    public pedidosProdutos() {
        initComponents();
        
        try {
            carregarTabela(ManterProduto.listarProduto());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(jScrollPane1, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jScrollPane1, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        botaoremProduto = new java.awt.Button();
        LabelTitulo4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        textoLinha = new javax.swing.JTextPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();
        botaoremProduto1 = new java.awt.Button();
        LabelTitulo5 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        textoLinha1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BotaoMostrarCardapio = new javax.swing.JButton();
        botaoInicio = new javax.swing.JButton();
        BotaoPedidos = new javax.swing.JButton();
        BotaoCreditos = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        LabelTitulo6 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        textoLinhaPedido = new javax.swing.JTextPane();
        LabelTitulo7 = new javax.swing.JLabel();
        textoCaracteristica = new javax.swing.JTextField();
        botaoremProduto2 = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela4 = new javax.swing.JTable();
        LabelTitulo1 = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(173, 48, 19));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Imagem", "Nome", "Valor", "Descricao"
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
        LabelTitulo4.setText("Insira  linha que deseja remover:");

        jScrollPane6.setViewportView(textoLinha);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(botaoremProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LabelTitulo4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LabelTitulo4))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoremProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(173, 48, 19));

        tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Imagem", "Nome", "Valor", "Descricao"
            }
        ));
        jScrollPane7.setViewportView(tabela1);

        botaoremProduto1.setActionCommand("Remover Item");
        botaoremProduto1.setBackground(new java.awt.Color(173, 28, 17));
        botaoremProduto1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botaoremProduto1.setForeground(new java.awt.Color(255, 255, 255));
        botaoremProduto1.setLabel("Remover Item");
        botaoremProduto1.setName(""); // NOI18N
        botaoremProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoremProduto1ActionPerformed(evt);
            }
        });

        LabelTitulo5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LabelTitulo5.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo5.setText("Insira  linha que deseja remover:");

        jScrollPane8.setViewportView(textoLinha1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(botaoremProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LabelTitulo5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LabelTitulo5))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoremProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(235, 191, 16));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(176, 48, 39));

        jPanel3.setBackground(new java.awt.Color(173, 28, 17));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ol??, seja bem vindo!");

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
        BotaoMostrarCardapio.setText("Card??pio");
        BotaoMostrarCardapio.setBorder(null);
        BotaoMostrarCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMostrarCardapioActionPerformed(evt);
            }
        });

        botaoInicio.setBackground(new java.awt.Color(176, 48, 39));
        botaoInicio.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        botaoInicio.setForeground(new java.awt.Color(255, 255, 255));
        botaoInicio.setText("In??cio");
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
        BotaoCreditos.setText("Sobre n??s");
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sistema Sabor e Arte");

        jPanel7.setBackground(new java.awt.Color(173, 48, 19));

        LabelTitulo6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LabelTitulo6.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo6.setText("Insira  linha do produto requisitado:");

        jScrollPane9.setViewportView(textoLinhaPedido);

        LabelTitulo7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LabelTitulo7.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo7.setText("Informe suas requisi????es adicionais:");

        textoCaracteristica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCaracteristicaActionPerformed(evt);
            }
        });

        botaoremProduto2.setActionCommand("Fazer Pedido");
        botaoremProduto2.setBackground(new java.awt.Color(173, 28, 17));
        botaoremProduto2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botaoremProduto2.setForeground(new java.awt.Color(255, 255, 255));
        botaoremProduto2.setLabel("Fazer Pedido");
        botaoremProduto2.setName(""); // NOI18N
        botaoremProduto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoremProduto2ActionPerformed(evt);
            }
        });

        tabela4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Nome", "Valor", "Descricao"
            }
        ));
        jScrollPane1.setViewportView(tabela4);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textoCaracteristica, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(botaoremProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(LabelTitulo7)
                        .addGap(63, 63, 63))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(LabelTitulo6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelTitulo6)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LabelTitulo7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoCaracteristica, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoremProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LabelTitulo1.setBackground(new java.awt.Color(255, 255, 255));
        LabelTitulo1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo1.setText("Card??pio do Restaurante. ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(LabelTitulo1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoMostrarCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMostrarCardapioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoMostrarCardapioActionPerformed

    private void botaoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInicioActionPerformed
       this.dispose();
    }//GEN-LAST:event_botaoInicioActionPerformed

    private void BotaoPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoPedidosActionPerformed

    private void BotaoCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCreditosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoCreditosActionPerformed

    private void botaoremProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoremProdutoActionPerformed

    }//GEN-LAST:event_botaoremProdutoActionPerformed

    private void botaoremProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoremProduto1ActionPerformed

    }//GEN-LAST:event_botaoremProduto1ActionPerformed

    private void textoCaracteristicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCaracteristicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCaracteristicaActionPerformed

    private void botaoremProduto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoremProduto2ActionPerformed
       cadastrarPedido();
    }//GEN-LAST:event_botaoremProduto2ActionPerformed

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
            java.util.logging.Logger.getLogger(pedidosProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pedidosProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pedidosProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pedidosProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
 /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pedidosProdutos().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCreditos;
    private javax.swing.JButton BotaoMostrarCardapio;
    private javax.swing.JButton BotaoPedidos;
    private javax.swing.JLabel LabelTitulo1;
    private javax.swing.JLabel LabelTitulo4;
    private javax.swing.JLabel LabelTitulo5;
    private javax.swing.JLabel LabelTitulo6;
    private javax.swing.JLabel LabelTitulo7;
    private javax.swing.JButton botaoInicio;
    private java.awt.Button botaoremProduto;
    private java.awt.Button botaoremProduto1;
    private java.awt.Button botaoremProduto2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable tabela;
    private javax.swing.JTable tabela1;
    private javax.swing.JTable tabela4;
    private javax.swing.JTextField textoCaracteristica;
    private javax.swing.JTextPane textoLinha;
    private javax.swing.JTextPane textoLinha1;
    private javax.swing.JTextPane textoLinhaPedido;
    // End of variables declaration//GEN-END:variables

    public void cadastrarPedido() {

        int cadastros = 0;

        try {
            String stringRemoverLinha = textoLinhaPedido.getText();
            int removerLinha = Integer.parseInt(stringRemoverLinha);
            
            removerLinha--;
            DefaultTableModel modelo = (DefaultTableModel) tabela4.getModel();
            
            String nome = modelo.getValueAt(removerLinha, 0).toString();
            String valor = modelo.getValueAt(removerLinha, 1).toString();
            String caracteristica  = textoCaracteristica.getText();
            System.out.print(valor);
            ManterPedidosCliente.cadastrarPedidosCliente(valor, nome);
            ManterPedidos.cadastrarPedidos(nome, caracteristica);
            if(stringRemoverLinha != null) {
                cadastros++;
            }
        if (cadastros == 1) {
            String msgDialog = "Pedido solicitado com sucesso!";
            JOptionPane.showMessageDialog(jScrollPane1, msgDialog, "Confirma????o", JOptionPane.INFORMATION_MESSAGE);
        }
        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(jScrollPane1, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            textoLinhaPedido.requestFocus();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(jScrollPane1, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jScrollPane1, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void carregarTabela(HashSet<Produto> lista) {
        DefaultTableModel modelo = (DefaultTableModel) tabela4.getModel();
        
        modelo.getDataVector().removeAllElements();
        modelo.fireTableDataChanged();
        
        for(Produto produto : lista) {
            modelo.insertRow(modelo.getRowCount(), new Object[] {produto.getNome(), produto.getValor(), produto.getDescricao()});
        }

    }
}
