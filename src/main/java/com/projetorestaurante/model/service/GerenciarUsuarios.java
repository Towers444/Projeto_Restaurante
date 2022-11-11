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
    
    public String cadastrosFile = System.getProperty("user.dir") + "\\" + "cadastros.json";
    
    public JsonObject getCadastros() throws IOException {
        createFileIfNotExist();
        Reader reader = Files.newBufferedReader(Paths.get(cadastrosFile));
            JsonObject jo = (JsonObject)JsonParser.parseReader(reader);
            jo.get("Cadastros");
            return jo;
    }
    
    public void Registrar(String nome, char[] senha) {
        createFileIfNotExist();
        String pass = "";
        for(char C : senha)
            pass += String.valueOf(C);
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonObject cadastros = getCadastros();
            JsonObject cad = (JsonObject)cadastros.get("Cadastros");
            if(!userExist(nome)){
                cad.addProperty(nome, pass);
                FileWriter w = new FileWriter(cadastrosFile);
                w.write(gson.toJson(cadastros));
                w.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void EditarUsuario(String oldName, String nome, char[] pass) {
        createFileIfNotExist();
        String newPass = "";
        for(char P : pass)
            newPass += String.valueOf(P);
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonObject cadastros = getCadastros();
            JsonObject cad = (JsonObject)cadastros.get("Cadastros");
            for(String K : cad.keySet()){
                if(K.equals(oldName)){
                    cad.remove(oldName);
                    cad.addProperty(nome, newPass);
                    FileWriter w = new FileWriter(cadastrosFile);
                    System.out.println("Antigo: " + oldName + " para " + nome + " com " + newPass);
                    w.write(gson.toJson(cadastros));
                    w.close();
                    break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void DeletarUsuario(String nome) {
        createFileIfNotExist();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonObject cadastros;
        try {
            cadastros = getCadastros();
            JsonObject cad = (JsonObject)cadastros.get("Cadastros");
            for(String K : cad.keySet()){
                if(K.equals(nome)){
                    cad.remove(nome);
                    FileWriter w = new FileWriter(cadastrosFile);
                    w.write(gson.toJson(cadastros));
                    w.close();
                    break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String senha(String nome) {
        JsonObject cadastros;
        String senha = "";
        try {
            cadastros = getCadastros();
            JsonObject cad = (JsonObject)cadastros.get("Cadastros");
            for(String K : cad.keySet()){
                if(K.equals(nome)){
                    senha =  cad.get(nome).getAsString();
                    break;
                }
                else
                    senha = null;
            }
            return senha;
        } catch (IOException ex) {
            Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public boolean LoginisCorrect(String nome, String senha) {
        createFileIfNotExist();
        try {
            JsonObject cadastros = getCadastros();
            JsonObject cad = (JsonObject)cadastros.get("Cadastros");
            if(userExist(nome)){
                String password = cad.get(nome).getAsString();
                return senha.equals(password);
            }else
                return false;
        } catch (IOException ex) {
            Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean userExist(String user) {
        createFileIfNotExist();
        boolean exists = false;
        try {
            JsonObject cadastros = getCadastros();
            JsonObject cad = (JsonObject)cadastros.get("Cadastros");
            for(String K : cad.keySet()) {
                if(K.equals(user))
                    exists = true;
            }
            return exists;
        } catch (IOException ex) {
            Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public List<String> getAllUsers() {
        List<String> usuarios = new ArrayList<String>();
        createFileIfNotExist();
        JsonObject cadastros;
        try {
            cadastros = getCadastros();
            JsonObject cad = (JsonObject)cadastros.get("Cadastros");
            for(String K : cad.keySet())
                usuarios.add(K);
            return usuarios;
        } catch (IOException ex) {
            Logger.getLogger(GerenciarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void createFileIfNotExist() {
        File cadastrosF = new File(cadastrosFile);
        if(!cadastrosF.exists()){
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            try{
                cadastrosF.createNewFile();
                FileWriter w = new FileWriter(cadastrosFile);
                JsonObject jo = new JsonObject();
                jo.add("Cadastros", new JsonObject());
                w.write(gson.toJson(jo));
                w.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }
}
