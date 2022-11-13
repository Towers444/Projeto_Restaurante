/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetorestaurante.model.service;

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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author namor
 */
public class GerenciarUsuarios {
    
    public String cadastrosFile = System.getProperty("user.dir") + "\\" + "cadastros.json"; //Local do arquivo onde tem as informações dos usuarios
    
    //Aqui é uma função rapida para chegar aos "Cadastros" que tem no arquivo Cadastros.json
    public JsonObject getCadastros() throws IOException {
        createFileIfNotExist();//Cria um arquivo caso não existe
        Reader reader = Files.newBufferedReader(Paths.get(cadastrosFile)); //Inicializa o modo ler
            JsonObject jo = (JsonObject)JsonParser.parseReader(reader); // boto ele pra ler o arquivo cadastrosFile e formato ele em modo JsonObject
            jo.get("Cadastros"); //Tento obter o JsonObject "Cadastros" do arquivo
            return jo;
    }
    //Registrar um novo usuario
    public void Registrar(String nome, char[] senha) {
        createFileIfNotExist(); //Cria um arquivo Cadastros.json caso não existir
        String pass = "";
        for(char C : senha)
            pass += String.valueOf(C);//o jPassword é formado por char[], então precisamos transformar ela em string, e aí está pega cada caractere transforma em string e adiciona na newPass
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create(); // um construtor JSON (.setPrettyPrinting() == é uma forma para melhor visualização para humanos)
            JsonObject cadastros = getCadastros();
            JsonObject cad = (JsonObject)cadastros.get("Cadastros"); //obtenho a parte dos cadastros que tem no arquivo
            if(!userExist(nome)){ // caso o usuario não existir 
                cad.addProperty(nome, pass); //adiciono um usuario com nome e senha
                FileWriter w = new FileWriter(cadastrosFile); //inicializa o modo escritura
                w.write(gson.toJson(cadastros)); //escreve todo o arquivo antigo junto ao novo usuario
                w.close();// finaliza o modo escritura
            }
        } catch (IOException ex) {
            Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Editar usuario
    public void EditarUsuario(String oldName, String nome, char[] pass) {
        createFileIfNotExist();
        String newPass = "";
        for(char P : pass)
            newPass += String.valueOf(P);//o jPassword é formado por char[], então precisamos transformar ela em string, e aí está pega cada caractere transforma em string e adiciona na newPass
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();// um construtor JSON (.setPrettyPrinting() == é uma forma para melhor visualização para humanos)
            JsonObject cadastros = getCadastros();
            JsonObject cad = (JsonObject)cadastros.get("Cadastros");
            for(String K : cad.keySet()){ //obtem todos os usuarios cadastrados (K) que tem no arquivo
                if(K.equals(oldName)){ //verifica se os usuarios cadastrados e igual ao antigo nome
                    cad.remove(oldName); //remove o antigo nome junto com a senha (JsonObject)
                    cad.addProperty(nome, newPass); //adiciona o novo nome junto com a nova senha
                    FileWriter w = new FileWriter(cadastrosFile); //inicializa o modo escritura
                    //System.out.println("Antigo: " + oldName + " para " + nome + " com " + newPass);
                    w.write(gson.toJson(cadastros)); //Escreve o novo arquivo com o usuario editado
                    w.close();//finaliza o modo escritura
                    break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //deletar usuario do arquivo
    public void DeletarUsuario(String nome) {
        createFileIfNotExist();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonObject cadastros;
        try {
            cadastros = getCadastros();
            JsonObject cad = (JsonObject)cadastros.get("Cadastros");
            for(String K : cad.keySet()){ //obtem todos os usuarios cadastrados
                if(K.equals(nome)){ //verifica se o usuario cadastrado e igual ao usuario que queremos
                    cad.remove(nome); //remove o JsonObject (usuario com a senha)
                    FileWriter w = new FileWriter(cadastrosFile); // modo escritura
                    w.write(gson.toJson(cadastros)); //escreve o novo arquivo sem o usuario
                    w.close(); //finalizao modo escritura
                    break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Obter a senha
    public String senha(String nome) {
        JsonObject cadastros;
        String senha = "";
        try {
            cadastros = getCadastros();
            JsonObject cad = (JsonObject)cadastros.get("Cadastros");
            for(String K : cad.keySet()){
                if(K.equals(nome)){
                    senha =  cad.get(nome).getAsString(); //aqui ele consegue o valor do usuario (nome)
                    break;// caso conseguir ele vai dar break e retornar a senha
                }
                else
                    senha = null; // caso o nome não existir no arquivo retorna um null
            }
            return senha;
        } catch (IOException ex) {
            Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    //verifica se o login esta correto
    public boolean LoginisCorrect(String nome, String senha) {
        createFileIfNotExist(); // cria um arquivo se não existe
        try {
            JsonObject cadastros = getCadastros();
            JsonObject cad = (JsonObject)cadastros.get("Cadastros");
            if(userExist(nome)){ //chama a função se o usuario existe
                String password = cad.get(nome).getAsString(); // Aqui se o usuario existir no arquivo ele vai pegar o valor que está dentro do usuario (a senha)
                return senha.equals(password);// e vai retornar se a senha e igual a password
            }else
                return false; //caso não existir usuario, vai retornar false
        } catch (IOException ex) {
            Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //Função para verificar se o usuario existe
    public boolean userExist(String user) {
        createFileIfNotExist();
        boolean exists = false;
        try {
            JsonObject cadastros = getCadastros();
            
            // Aqui ele tenta obter o Objeto em json chamado "Cadastros"
            JsonObject cad = (JsonObject)cadastros.get("Cadastros");
            for(String K : cad.keySet()) {
                if(K.equals(user)) //Se a Key que esta registrada for igual a string user que é o usuário que queremos
                    exists = true;
            }
            return exists;
        } catch (IOException ex) {
            Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //Aqui você consegue a lista inteira dos usuarios cadastrados
    public List<String> getAllUsers() {
        List<String> usuarios = new ArrayList<String>();
        createFileIfNotExist();
        JsonObject cadastros;
        try {
            cadastros = getCadastros();
            JsonObject cad = (JsonObject)cadastros.get("Cadastros"); // Mencionado na linha 144
            for(String K : cad.keySet())
                usuarios.add(K);
            return usuarios;
        } catch (IOException ex) {
            Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    //Aqui se o arquivo cadastrosFile não existir, ele será criado
    public void createFileIfNotExist() {
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
}
