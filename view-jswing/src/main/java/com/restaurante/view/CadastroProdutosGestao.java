/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.restaurante.view;

import com.restaurante.common.NegocioException;
import com.restaurante.model.dto.Produto;
import com.restaurante.model.service.ManterProduto;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuário
 */
public class CadastroProdutosGestao extends javax.swing.JFrame {

    /**
     * Creates new form CadastroProdutosGestao
     */
    public CadastroProdutosGestao() {
        initComponents();
        
        try {
            carregarTabela(ManterProduto.listarProduto());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(jScrollPane5, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jScrollPane5, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    adicionarProdutos janela1 = new adicionarProdutos();
    editarProdutos janela2 = new editarProdutos();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        LabelTitulo1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        TelaInicial = new javax.swing.JButton();
        LabelTitulo3 = new javax.swing.JLabel();
        botaoremProduto = new java.awt.Button();
        botaoEditarProdutos = new java.awt.Button();
        botaoAddProdutos2 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(235, 191, 16));

        jPanel3.setBackground(new java.awt.Color(173, 48, 19));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Valor", "Descrição"
            }
        ));
        jScrollPane5.setViewportView(tabela);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        LabelTitulo1.setBackground(new java.awt.Color(255, 255, 255));
        LabelTitulo1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        LabelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo1.setText("Cardápio do Restaurante. ");

        jPanel7.setBackground(new java.awt.Color(173, 28, 17));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Olá, seja bem vindo!");

        jPanel10.setBackground(new java.awt.Color(176, 48, 39));

        TelaInicial.setBackground(new java.awt.Color(176, 48, 39));
        TelaInicial.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        TelaInicial.setForeground(new java.awt.Color(255, 255, 255));
        TelaInicial.setText("Início");
        TelaInicial.setBorder(null);
        TelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaInicialActionPerformed(evt);
            }
        });

        LabelTitulo3.setBackground(new java.awt.Color(255, 255, 255));
        LabelTitulo3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabelTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo3.setText("Recursos Disponíveis.");

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

        botaoEditarProdutos.setActionCommand("Editar Produto");
        botaoEditarProdutos.setBackground(new java.awt.Color(173, 28, 17));
        botaoEditarProdutos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botaoEditarProdutos.setForeground(new java.awt.Color(255, 255, 255));
        botaoEditarProdutos.setLabel("Editar Produto");
        botaoEditarProdutos.setName(""); // NOI18N
        botaoEditarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarProdutosActionPerformed(evt);
            }
        });

        botaoAddProdutos2.setActionCommand("Adicionar Produto");
        botaoAddProdutos2.setBackground(new java.awt.Color(173, 28, 17));
        botaoAddProdutos2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botaoAddProdutos2.setForeground(new java.awt.Color(255, 255, 255));
        botaoAddProdutos2.setLabel("Adicionar Produto");
        botaoAddProdutos2.setName(""); // NOI18N
        botaoAddProdutos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddProdutos2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTitulo3)
                .addGap(50, 50, 50))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoAddProdutos2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEditarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGap(102, 102, 102)
                            .addComponent(TelaInicial))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(botaoremProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(68, 68, 68))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(TelaInicial)
                .addGap(29, 29, 29)
                .addComponent(LabelTitulo3)
                .addGap(38, 38, 38)
                .addComponent(botaoAddProdutos2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(botaoEditarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(botaoremProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 171, Short.MAX_VALUE))
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
                        .addGap(42, 42, 42)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(51, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelTitulo1)
                        .addGap(153, 153, 153))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(LabelTitulo1)
                        .addGap(29, 29, 29)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEditarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarProdutosActionPerformed
        int removerLinha = tabela.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        String antigoNome = modelo.getValueAt(removerLinha, 0).toString();
        String antigoValor = modelo.getValueAt(removerLinha, 1).toString();
        String antigoDescricao = modelo.getValueAt(removerLinha, 2).toString();
        
        if (janela2 == null) {
            janela2 = new editarProdutos();
            janela2.setLocationRelativeTo(null);
            janela2.setVisible(true);
            janela2.setResizable(false);
        } else {
            janela2.setLocationRelativeTo(null);
            janela2.setVisible(true);
            janela2.setResizable(false);
      }
        janela2.enviaPalavra(this, antigoNome, antigoValor, antigoDescricao);
    }//GEN-LAST:event_botaoEditarProdutosActionPerformed

    private void botaoremProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoremProdutoActionPerformed
        int removerLinha = tabela.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        String valorNumeroNome = modelo.getValueAt(removerLinha, 0).toString();
        String valorNumeroValor = modelo.getValueAt(removerLinha, 1).toString();
        String valorNumeroDescricao = modelo.getValueAt(removerLinha, 2).toString();
        try {
            ManterProduto.excluirProduto(valorNumeroNome, valorNumeroValor, valorNumeroDescricao);
        } catch (NegocioException ex) {
            Logger.getLogger(CadastroProdutosGestao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroProdutosGestao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastroProdutosGestao.class.getName()).log(Level.SEVERE, null, ex);
        }
        ((DefaultTableModel) tabela.getModel()).removeRow(removerLinha); tabela.repaint(); tabela.validate();
    }//GEN-LAST:event_botaoremProdutoActionPerformed

    private void TelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelaInicialActionPerformed
        this.dispose();
    }//GEN-LAST:event_TelaInicialActionPerformed

    private void botaoAddProdutos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAddProdutos2ActionPerformed
        if (janela1 == null) {
            janela1 = new adicionarProdutos();
            janela1.setLocationRelativeTo(null);
            janela1.setVisible(true);
            janela1.setResizable(false);
        } else {
            janela1.setLocationRelativeTo(null);
            janela1.setVisible(true);
            janela1.setResizable(false);
      }
    }//GEN-LAST:event_botaoAddProdutos2ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProdutosGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutosGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutosGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutosGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProdutosGestao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTitulo1;
    private javax.swing.JLabel LabelTitulo3;
    private javax.swing.JButton TelaInicial;
    private java.awt.Button botaoAddProdutos2;
    private java.awt.Button botaoEditarProdutos;
    private java.awt.Button botaoremProduto;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    public void carregarTabela(HashSet<Produto> lista) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        modelo.getDataVector().removeAllElements();
        modelo.fireTableDataChanged();
        
        for(Produto produto : lista) {
            modelo.insertRow(modelo.getRowCount(), new Object[] {produto.getNome(), produto.getValor(), produto.getDescricao()});
        }
       
    }

}
