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

    private int senha;
    private int cpf;

    public Usuario(int senha, int cpf) {
        this.senha = senha;
        this.cpf = cpf;
    }

    public int getSenha() {
        return senha;
    }

    public int getCpf() {
        return cpf;
    }

}
