/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.projetorestaurante.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author namor
 */

public class ModificarEstoque extends javax.swing.JFrame {

    public class Produto {
        public String N;
        public int P;
        public String I;
        public int Q;
        
        public Produto(String nome, int Preço, String ingredientes, int quantidade) {
            N = nome;
            P = Preço;
            I = ingredientes;
            Q = quantidade;
        }
    }
    /**
     * Creates new form ModificarEstoque
     */
    public ModificarEstoque() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setToolTipText("");

        jTable1.setBackground(new java.awt.Color(255, 51, 51));
        jTable1.setForeground(new java.awt.Color(204, 204, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Preço", "Ingredientes", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        addBtn.setText("+");
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(340, Short.MAX_VALUE)
                .addComponent(addBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        estoque();
        jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(e.getClickCount() == 2 && jTable1.getSelectedRow() != -1) {
                    EditarProduto EP = new EditarProduto();
                    int selectedRow = jTable1.getSelectedRow();
                    String rowName = (String)jTable1.getModel().getValueAt(selectedRow, 0);
                    int rowpreço = (int)jTable1.getModel().getValueAt(selectedRow, 1);
                    String ingred = (String)jTable1.getModel().getValueAt(selectedRow, 2);
                    int quanti = (int)jTable1.getModel().getValueAt(selectedRow, 3);
                    //Esses são os antigos valores antes de modificar
                    
                    EP.npreco.setText(String.valueOf(rowpreço));
                    EP.nIngredi.setText(ingred);
                    EP.nQuanti.setText(String.valueOf(quanti));
                    
                    EP.setVisible(true);
                    EP.ok.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e1) {
                            editarproduto(rowName, new Produto(rowName,Integer.parseInt(EP.npreco.getText()), EP.nIngredi.getText(), Integer.parseInt(EP.nQuanti.getText())));
                            EP.dispose();
                            DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
                            for(int i = dm.getRowCount() - 1; i >=0; i--)
                                dm.removeRow(i);
                            estoque();
                        }
                    });
                    EP.deleteBt.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e1) {
                            deletarProduto(rowName);
                            EP.dispose();
                            DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
                            for(int i = dm.getRowCount() - 1; i >=0; i--)
                                dm.removeRow(i);
                            estoque();
                        }
                    });
                }
            }
        });
    }//GEN-LAST:event_formWindowOpened

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        NovoProduto NP = new NovoProduto();
        NP.setVisible(true);
        NP.jButton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AdicionarAoEstoque(new Produto(
                        NP.produto.getText(),
                        Integer.parseInt(NP.preco.getText()),
                        NP.nIngredi.getText(),
                        Integer.parseInt(NP.quantidade.getText()))
                );
                NP.dispose();
            }
        });
    }//GEN-LAST:event_addBtnMouseClicked

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
            java.util.logging.Logger.getLogger(ModificarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    String estoqueFile = System.getProperty("user.dir") + "\\" + "estoque.json";
    private void estoque() {
        
        File catalogo = new File(estoqueFile);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        if(!catalogo.exists()){
            try {
                catalogo.createNewFile();
                FileWriter W = new FileWriter(estoqueFile);
                JsonObject json0 = new JsonObject();
                json0.add("estoques", new JsonObject());
                W.write(gson.toJson(json0));
                W.close();
            } catch (IOException ex) {
                Logger.getLogger(ModificarEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            Reader reader;
            try {
                reader = Files.newBufferedReader(Paths.get(estoqueFile));
                JsonObject jo = (JsonObject) JsonParser.parseReader(reader);
                JsonObject estoques = (JsonObject)jo.get("estoques");
                for(String K : estoques.keySet()){
                    JsonObject prdt = (JsonObject)estoques.get(K);
                    int preço = prdt.get("Preço").getAsInt();
                    String ingr = prdt.get("Ingredientes").getAsString();
                    int quanti = prdt.get("Quantidade").getAsInt();
                    AdicionarAoEstoque(new Produto(K, preço, ingr, quanti));
                }
            } catch (IOException ex) {
                Logger.getLogger(ModificarEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void AdicionarAoEstoque(Produto produto) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            Reader reader = Files.newBufferedReader(Paths.get(estoqueFile));
            JsonObject jo = (JsonObject) JsonParser.parseReader(reader);
            JsonObject estoques = (JsonObject)jo.get("estoques");
            
            estoques.add(produto.N, new JsonObject());
            
            JsonObject produtoObject = (JsonObject)estoques.get(produto.N);
            produtoObject.addProperty("Preço", produto.P);
            produtoObject.addProperty("Ingredientes", produto.I);
            produtoObject.addProperty("Quantidade", produto.Q);
            
            FileWriter w = new FileWriter(estoqueFile);
            w.write(gson.toJson(jo));
            w.close();
            AdicionarATabela(produto);
        } catch (IOException ex) {
            Logger.getLogger(ModificarEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void AdicionarATabela(Produto produto) {
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[] data = new Object[4];
        data[0] = (String)produto.N;
        data[1] = (int)produto.P;
        data[2] = (String)produto.I;
        data[3] = (int)produto.Q;
        model.addRow(data);
    }
    
    private void editarproduto(String OldProductName, Produto New) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        try {
            Reader reader = Files.newBufferedReader(Paths.get(estoqueFile));
            
            JsonObject jo = (JsonObject) JsonParser.parseReader(reader);
            JsonObject estoques = (JsonObject)jo.get("estoques");
            
            JsonObject produto = (JsonObject)estoques.get(OldProductName);
            produto.remove("Preço");
            produto.addProperty("Preço", New.P);
            
            produto.remove("Ingredientes");
            produto.addProperty("Ingredientes", New.I);
            
            produto.remove("Quantidade");
            produto.addProperty("Quantidade", New.Q);
            
            FileWriter w = new FileWriter(estoqueFile);
            w.write(gson.toJson(jo));
            w.close();
            
        } catch (IOException ex) {
            Logger.getLogger(ModificarEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void deletarProduto(String nome) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            Reader reader = Files.newBufferedReader(Paths.get(estoqueFile));
            JsonObject jo = (JsonObject) JsonParser.parseReader(reader);
            JsonObject estoques = (JsonObject)jo.get("estoques");
            estoques.remove(nome);
            FileWriter w = new FileWriter(estoqueFile);
            w.write(gson.toJson(jo));
            w.close();
        } catch (IOException ex) {
            Logger.getLogger(ModificarEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
