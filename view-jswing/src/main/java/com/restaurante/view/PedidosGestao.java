/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.restaurante.view;

import com.restaurante.common.NegocioException;
import com.restaurante.model.dto.Pedidos;
import com.restaurante.model.service.ManterPedidos;
import com.restaurante.model.service.ManterProduto;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PedidosGestao extends javax.swing.JFrame {

  
    public PedidosGestao() {
        initComponents();
        
        try {
            carregarTabela(ManterPedidos.listarPedidos());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(jScrollPane6, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jScrollPane6, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTitulo2 = new javax.swing.JLabel();
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
        jLabel9 = new javax.swing.JLabel();
        LabelTitulo3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        botaoremProduto7 = new java.awt.Button();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabela9 = new javax.swing.JTable();
        LabelTitulo14 = new javax.swing.JLabel();
        textoLinha = new javax.swing.JTextField();
        botaoremProduto = new java.awt.Button();

        LabelTitulo2.setBackground(new java.awt.Color(255, 255, 255));
        LabelTitulo2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabelTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo2.setText("Pedidos Requisitados. ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(235, 191, 16));

        jPanel4.setBackground(new java.awt.Color(176, 48, 39));

        jPanel5.setBackground(new java.awt.Color(173, 28, 17));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ol??, seja bem vindo!");

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
        botaoCadastroCardapio.setText("Gerenciar Card??pio");
        botaoCadastroCardapio.setBorder(null);
        botaoCadastroCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroCardapioActionPerformed(evt);
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
        botaoCreditos.setText("Sobre n??s");
        botaoCreditos.setBorder(null);
        botaoCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCreditosActionPerformed(evt);
            }
        });

        botaoCadastroFuncionario.setBackground(new java.awt.Color(176, 48, 39));
        botaoCadastroFuncionario.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        botaoCadastroFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        botaoCadastroFuncionario.setText("Gerenciar Funcion??rio");
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
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoEstoque)
                    .addComponent(botaoPedidos)))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(botaoCreditos))
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
                .addGap(29, 29, 29)
                .addComponent(botaoCreditos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sistema Sabor e Arte");

        LabelTitulo3.setBackground(new java.awt.Color(255, 255, 255));
        LabelTitulo3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabelTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo3.setText("Pedidos do Cliente. ");

        jPanel12.setBackground(new java.awt.Color(173, 48, 19));

        botaoremProduto7.setActionCommand("Fazer Pedido");
        botaoremProduto7.setBackground(new java.awt.Color(173, 28, 17));
        botaoremProduto7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botaoremProduto7.setForeground(new java.awt.Color(255, 255, 255));
        botaoremProduto7.setLabel("Fazer Pedido");
        botaoremProduto7.setName(""); // NOI18N
        botaoremProduto7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoremProduto7ActionPerformed(evt);
            }
        });

        tabela9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", ""},
            },
            new String [] {
                "Nome", "Caracter??sticas"
            }
        ));
        jScrollPane6.setViewportView(tabela9);

        LabelTitulo14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LabelTitulo14.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo14.setText("Insira a linha do produto finalizado:");

        textoLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoLinhaActionPerformed(evt);
            }
        });

        botaoremProduto.setActionCommand("Remover Item");
        botaoremProduto.setBackground(new java.awt.Color(173, 28, 17));
        botaoremProduto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botaoremProduto.setForeground(new java.awt.Color(255, 255, 255));
        botaoremProduto.setLabel("Finalizar");
        botaoremProduto.setName(""); // NOI18N
        botaoremProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoremProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoremProduto7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(LabelTitulo14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(97, 97, 97))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(botaoremProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTitulo14)
                    .addComponent(textoLinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoremProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(botaoremProduto7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel9)
                        .addGap(0, 193, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(LabelTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(206, 206, 206))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastroCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroCardapioActionPerformed
        
    }//GEN-LAST:event_botaoCadastroCardapioActionPerformed

    private void botaoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInicioActionPerformed
       this.dispose();
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

    private void botaoremProduto7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoremProduto7ActionPerformed
        //
    }//GEN-LAST:event_botaoremProduto7ActionPerformed

    private void textoLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoLinhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoLinhaActionPerformed

    private void botaoremProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoremProdutoActionPerformed
        String stringRemoverLinha = textoLinha.getText();
        int removerLinha = Integer.parseInt(stringRemoverLinha);
        removerLinha--;
            DefaultTableModel modelo = (DefaultTableModel) tabela9.getModel();
            String valorNumeroIngrediente = modelo.getValueAt(removerLinha, 0).toString();
            String valorNumeroQuantidade = modelo.getValueAt(removerLinha, 1).toString();
            System.out.print("Chegou");
            try {
              ManterPedidos.excluirPedidos(valorNumeroIngrediente, valorNumeroQuantidade);
            } catch (NegocioException ex) {
                Logger.getLogger(PedidosGestao.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(PedidosGestao.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PedidosGestao.class.getName()).log(Level.SEVERE, null, ex);
            }
            ((DefaultTableModel) tabela9.getModel()).removeRow(removerLinha); tabela9.repaint(); tabela9.validate();

    }//GEN-LAST:event_botaoremProdutoActionPerformed

    
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
    private javax.swing.JLabel LabelTitulo14;
    private javax.swing.JLabel LabelTitulo2;
    private javax.swing.JLabel LabelTitulo3;
    private javax.swing.JButton botaoCadastroCardapio;
    private javax.swing.JButton botaoCadastroFuncionario;
    private javax.swing.JButton botaoCreditos;
    private javax.swing.JButton botaoEstoque;
    private javax.swing.JButton botaoInicio;
    private javax.swing.JButton botaoPedidos;
    private java.awt.Button botaoremProduto;
    private java.awt.Button botaoremProduto7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tabela9;
    private javax.swing.JTextField textoLinha;
    // End of variables declaration//GEN-END:variables

public void carregarTabela(HashSet<Pedidos> lista) {
        DefaultTableModel modelo = (DefaultTableModel) tabela9.getModel();
        
        modelo.getDataVector().removeAllElements();
        modelo.fireTableDataChanged();
        
        for(Pedidos pedidos : lista) {
            modelo.insertRow(modelo.getRowCount(), new Object[] {pedidos.getNome(), pedidos.getCaracteristica()});
        }

    }
}
