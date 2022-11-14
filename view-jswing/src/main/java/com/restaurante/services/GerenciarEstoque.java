/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.restaurante.others.InitializeFiles;
import com.restaurante.view.cadastroProdutos;
import com.restaurante.view.pedidosProdutos;
import java.awt.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author namor
 */

public class GerenciarEstoque {
    // Aqui é a classe dos produtos, oque ele tem, que no caso é 
    // N = Nome
    // P = Preço
    // T = Temperatura
    // I = Ingredientes
    // Q = Quantidades
    // D = Descrição
    // V = Validade
    public static class Produto {
        public String N;
        public int P;
        public float T;
        public String I;
        public int Q;
        public String Descr;
        public String V;
        public boolean D;
        
        public Produto(String nome, int Preço, float Temperatura, String ingredientes, int quantidade, String Descrição, String validade, boolean Disponivel) {
            N = nome;
            P = Preço;
            T = Temperatura;
            I = ingredientes;
            Q = quantidade;
            Descr = Descrição;
            V = validade;
            D = Disponivel;
        }
    }
    //Criar arquivo caso não existir
    public void createFile() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        File catalogo = new File(InitializeFiles.estoqueFile);
        if(!catalogo.exists()){ //se o arquivo catalogo (estoque) não existir
            try {
                catalogo.createNewFile(); //criar um novo arquivo
                FileWriter W = new FileWriter(InitializeFiles.estoqueFile); //inicializa o modo de edição de arquivo
                JsonObject json0 = new JsonObject();                //no arquivo cria um novo JsonObject
                json0.add("estoques", new JsonObject());    //dentro deste novo JsonObject vai ser adicionado uma key chamada "estoques" com uma nova JsonObject para os valores
                W.write(gson.toJson(json0)); //escreve no arquivo o que foi mencionado
                W.close(); //fecha o modo esctirura
            } catch (IOException ex) {
                Logger.getLogger(GerenciarEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void estoque() {
        File catalogo = new File(InitializeFiles.estoqueFile);
        Gson gson = new GsonBuilder().setPrettyPrinting().create(); // isso foi explicado no GerenciarUsuarios.java
        if(!catalogo.exists()){ //se o arquivo catalogo (estoque) não existir
            try {
                catalogo.createNewFile(); //criar um novo arquivo
                FileWriter W = new FileWriter(InitializeFiles.estoqueFile); //inicializa o modo de edição de arquivo
                JsonObject json0 = new JsonObject();                //no arquivo cria um novo JsonObject
                json0.add("estoques", new JsonObject());    //dentro deste novo JsonObject vai ser adicionado uma key chamada "estoques" com uma nova JsonObject para os valores
                W.write(gson.toJson(json0)); //escreve no arquivo o que foi mencionado
                W.close(); //fecha o modo esctirura
            } catch (IOException ex) {
                Logger.getLogger(GerenciarEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{ //caso o arquivo existir ele vai carregar TUDO que tem no arquivo de estoque
            Reader reader; // modo leitura
            try {
                reader = Files.newBufferedReader(Paths.get(InitializeFiles.estoqueFile)); //ele vai ler o arquivo estoque.json
                JsonObject jo = (JsonObject) JsonParser.parseReader(reader); //ele converte o arquivo em jsonObject
                JsonObject estoques = (JsonObject)jo.get("estoques"); //tentando obter a Key estoques
                for(String K : estoques.keySet()){ // dentro da Key estoques ele vai tentar obter as novas Keys (produtos)
                    JsonObject prdt = (JsonObject)estoques.get(K); //produto; ele vai tentar obter as keys que tem dentro do produto, ou seja, Preço, quantidade, ingredientes
                    int preço = prdt.get("Preço").getAsInt();               //Keys que tem dentro das keys dos produtos, ou seja, Preço, ingredinetes, quantidade
                    float temp = prdt.get("Temp. Armazenamento").getAsFloat();
                    String ingr = prdt.get("Ingredientes").getAsString();   //Keys que tem dentro das keys dos produtos, ou seja, Preço, ingredinetes, quantidade
                    int quanti = prdt.get("Quantidade").getAsInt();         //Keys que tem dentro das keys dos produtos, ou seja, Preço, ingredinetes, quantidade
                    String Descri = prdt.get("Descrição").getAsString();
                    String vali = prdt.get("Validade").getAsString();
                    boolean disp = prdt.get("Disponivel").getAsBoolean();
                    
                    AdicionarATabela(new Produto(K, preço,temp, ingr, quanti, Descri, vali, disp)); //adiciona os produtos a tablea jTable1
                }
            } catch (IOException ex) {
                Logger.getLogger(GerenciarEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //Adiciona o produto ao estoque (estoque.json)
    public void AdicionarAoEstoque(Produto produto) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create(); // isso foi explicado no GerenciarUsuarios.java
        try {
            Reader reader = Files.newBufferedReader(Paths.get(InitializeFiles.estoqueFile)); //inicia o modo leitura do arquivo
            JsonObject jo = (JsonObject) JsonParser.parseReader(reader); // converte o conteudo do arquivo para JsonObject
            JsonObject estoques = (JsonObject)jo.get("estoques"); //obtem a key estoques
            
            estoques.add(produto.N, new JsonObject()); //adiciona uma nova key a parte "estoques dentro do arquivo estoque.json com o nome do produto
            
            JsonObject produtoObject = (JsonObject)estoques.get(produto.N); //obtem a key "produto"
            produtoObject.addProperty("Preço", produto.P);          //obtem os valores que tem dentro do produto dentro do (estoques.json)
            produtoObject.addProperty("Temp. Armazenamento", produto.T); //obtem os valores que tem dentro do produto dentro do (estoques.json)
            produtoObject.addProperty("Ingredientes", produto.I);   //obtem os valores que tem dentro do produto dentro do (estoques.json)
            produtoObject.addProperty("Quantidade", produto.Q);     //obtem os valores que tem dentro do produto dentro do (estoques.json)
            produtoObject.addProperty("Descrição", produto.Descr);
            produtoObject.addProperty("Validade", produto.V);
            produtoObject.addProperty("Disponivel", produto.D);
            
            FileWriter w = new FileWriter(InitializeFiles.estoqueFile); //inicializa o modo escritura
            w.write(gson.toJson(jo)); //escreve o antigo arquivo junto ao novo produto
            w.close(); //fecha o modo esctitura
            AdicionarATabela(produto); //adiciona o produto na tabela
        } catch (IOException ex) {
            Logger.getLogger(GerenciarEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //adicionar o produto na tabela
    private void AdicionarATabela(Produto produto) {
        DefaultTableModel modelEstoque = (DefaultTableModel)cadastroProdutos.tabela.getModel(); //isso aqui é o modelo para obter e modificar os valores dentro da tabela
        
        Object[] dataEstoque = new Object[7]; // cria um array com 4 colunas
        dataEstoque[0] = (String)produto.N;    //adiciona os valores para o array
        dataEstoque[1] = (int)produto.P;       //adiciona os valores para o array
        dataEstoque[2] = (String)produto.I;    //adiciona os valores para o array
        dataEstoque[3] = (int)produto.Q;       //adiciona os valores para o array
        dataEstoque[4] = (String)produto.Descr;
        dataEstoque[5] = (float)produto.T;
        dataEstoque[6] = (boolean)produto.D;
        modelEstoque.addRow(dataEstoque); //adiciona o array com as informações do produto na tabela dos produtos
    }
    //Aqui é onde acontece a função de adicionar um certo produto na tabela do cliente
    public void AdicionarCliente(Produto produto) {
        Object[] dataCliente = new Object[5]; // cria um array com 4 colunas
        dataCliente[0] = (String)produto.N;    //adiciona os valores para o array
        dataCliente[1] = (int)produto.P;       //adiciona os valores para o array
        dataCliente[2] = (String)produto.I;    //adiciona os valores para o array
        dataCliente[3] = (int)produto.Q;       //adiciona os valores para o array
        dataCliente[4] = (String)produto.Descr;
        dataCliente[5] = (boolean)produto.D;
        
        DefaultTableModel model1 = (DefaultTableModel)pedidosProdutos.tabela4.getModel();
        model1.addRow(dataCliente);
    }
    //obtem todos os produtos e adiciona em uma ArrayList
    public ArrayList<Produto> GetProdutos() {
        ArrayList<Produto> p = new ArrayList<Produto>();
        try {
            Reader reader = Files.newBufferedReader(Paths.get(InitializeFiles.estoqueFile));
            JsonObject jo = (JsonObject) JsonParser.parseReader(reader);
            JsonObject estoques = (JsonObject)jo.get("estoques");
            
            for(String K : estoques.keySet()){ 
                System.out.println(K);
                
                //Variaveis || valores do arquivo estoque.json
                JsonObject prdt = (JsonObject)estoques.get(K); //produto; ele vai tentar obter as keys que tem dentro do produto, ou seja, Preço, quantidade, ingredientes
                int preço = prdt.get("Preço").getAsInt();               //Keys que tem dentro das keys dos produtos, ou seja, Preço, ingredinetes, quantidade
                float temp = prdt.get("Temp. Armazenamento").getAsFloat();
                String ingr = prdt.get("Ingredientes").getAsString();   //Keys que tem dentro das keys dos produtos, ou seja, Preço, ingredinetes, quantidade
                int quanti = prdt.get("Quantidade").getAsInt();         //Keys que tem dentro das keys dos produtos, ou seja, Preço, ingredinetes, quantidade
                String Descri = prdt.get("Descrição").getAsString();
                String vali = prdt.get("Validade").getAsString();
                boolean disp = prdt.get("Disponivel").getAsBoolean();
                //
                
                //adiciona o produto em uma lista
                p.add(new Produto(K, preço, temp, ingr, quanti,Descri,vali, disp));
            }
            
        } catch (IOException ex) {
            Logger.getLogger(GerenciarEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }
    
    //Editar um produto
    @Deprecated
    /*
    faltando argumentos… variaveis
    */
    public void editarproduto(String OldProductName, Produto New) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            Reader reader = Files.newBufferedReader(Paths.get(InitializeFiles.estoqueFile));
            
            JsonObject jo = (JsonObject) JsonParser.parseReader(reader);
            JsonObject estoques = (JsonObject)jo.get("estoques");
            
            JsonObject produto = (JsonObject)estoques.get(OldProductName);
            produto.remove("Preço"); //remove o antigo preço
            produto.addProperty("Preço", New.P); //adiciona o novo preço
            
            produto.remove("Ingredientes"); //remove o antigo ingrediente
            produto.addProperty("Ingredientes", New.I); // adiciona o novo ingrediente
            
            produto.remove("Quantidade"); //remove a quantidade antiga
            produto.addProperty("Quantidade", New.Q); //adiciona a nova quantidade
            
            FileWriter w = new FileWriter(InitializeFiles.estoqueFile); //modo escritura
            w.write(gson.toJson(jo)); //escreve os novos valores para o arquivo
            w.close();//fecha o modo escritura
            
        } catch (IOException ex) {
            Logger.getLogger(GerenciarEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //deleta um produto do arquivo estoque.json
    public void deletarProduto(String nome) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            Reader reader = Files.newBufferedReader(Paths.get(InitializeFiles.estoqueFile));
            JsonObject jo = (JsonObject) JsonParser.parseReader(reader);
            JsonObject estoques = (JsonObject)jo.get("estoques");
            estoques.remove(nome); //simplismente remove a Key que é o nome do produto junto com as keys do preço, ingredientes … 
            FileWriter w = new FileWriter(InitializeFiles.estoqueFile);
            w.write(gson.toJson(jo));
            w.close(); //e escreve e depois fecha
        } catch (IOException ex) {
            Logger.getLogger(GerenciarEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
