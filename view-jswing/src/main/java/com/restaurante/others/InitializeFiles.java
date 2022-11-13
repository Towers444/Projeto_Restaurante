/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.others;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author namor
 */
public class InitializeFiles {
    public static String cadastrosFile = System.getProperty("user.dir") + "\\" + "cadastros.json"; //Local do arquivo onde tem as informações dos usuarios
    
    public void initCadastros() {
        File cadastrosF = new File(cadastrosFile);
        if(!cadastrosF.exists()){ //se o arquivo não existir
            Gson gson = new GsonBuilder().setPrettyPrinting().create(); // um construtor JSON (.setPrettyPrinting() == é uma forma para melhor visualização para humanos)
            try{
                cadastrosF.createNewFile(); // Criar arquivo
                try (FileWriter w = new FileWriter(cadastrosFile)) { //inicializa o modo de escritura de arquivos
                    JsonObject jo = new JsonObject(); //Cria um JsonObject
                    jo.add("Cadastros", new JsonObject()); //Adiciona a parte "Cadastros junto com um novo JsonObject
                    w.write(gson.toJson(jo)); //escreve linha por linha a variavel jo
                    //w.close(); finaliza o modo de escritura (não precisa já que está em try ele fecha autoamticamente
                }
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }
    
    
    public static String estoqueFile = System.getProperty("user.dir") + "\\" + "estoque.json"; //local do arquivo estoque.json
    public void initEstoque() {
        File catalogo = new File(estoqueFile);
        Gson gson = new GsonBuilder().setPrettyPrinting().create(); // isso foi explicado no GerenciarUsuarios.java
        if(!catalogo.exists()){ //se o arquivo catalogo (estoque) não existir
            try {
                catalogo.createNewFile(); //criar um novo arquivo
                FileWriter W = new FileWriter(estoqueFile); //inicializa o modo de edição de arquivo
                JsonObject json0 = new JsonObject();                //no arquivo cria um novo JsonObject
                json0.add("estoques", new JsonObject());    //dentro deste novo JsonObject vai ser adicionado uma key chamada "estoques" com uma nova JsonObject para os valores
                W.write(gson.toJson(json0)); //escreve no arquivo o que foi mencionado
                W.close(); //fecha o modo esctirura
            } catch (IOException ex) {
                Logger.getLogger(InitializeFiles.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{ //caso o arquivo existir ele vai carregar TUDO que tem no arquivo de estoque
            Reader reader; // modo leitura
            try {
                reader = Files.newBufferedReader(Paths.get(estoqueFile)); //ele vai ler o arquivo estoque.json
                JsonObject jo = (JsonObject) JsonParser.parseReader(reader); //ele converte o arquivo em jsonObject
                JsonObject estoques = (JsonObject)jo.get("estoques"); //tentando obter a Key estoques
                for(String K : estoques.keySet()){ // dentro da Key estoques ele vai tentar obter as novas Keys (produtos)
                    JsonObject prdt = (JsonObject)estoques.get(K); //produto; ele vai tentar obter as keys que tem dentro do produto, ou seja, Preço, quantidade, ingredientes
                    int preço = prdt.get("Preço").getAsInt();               //Keys que tem dentro das keys dos produtos, ou seja, Preço, ingredinetes, quantidade
                    String ingr = prdt.get("Ingredientes").getAsString();   //Keys que tem dentro das keys dos produtos, ou seja, Preço, ingredinetes, quantidade
                    int quanti = prdt.get("Quantidade").getAsInt();         //Keys que tem dentro das keys dos produtos, ou seja, Preço, ingredinetes, quantidade
                    //AdicionarATabela(new Produto(K, preço, ingr, quanti)); //adiciona os produtos a tablea jTable1
                }
            } catch (IOException ex) {
                Logger.getLogger(InitializeFiles.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
