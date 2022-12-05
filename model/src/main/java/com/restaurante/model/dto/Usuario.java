/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.model.dto;

/**
 *
 * @author Aluno
 */
public class Usuario {

    private String senha;
    private String cpf;

    public Usuario(String senha, String cpf) {
        this.senha = senha;
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public String getCpf() {
        return cpf;
    }

}
