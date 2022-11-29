/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.model.dto;

/**
 *
 * @author Usuário
 */
public class Alimentos {

    private String codigo;
    private String ingrediente;
    private int quantidade;

    public Alimentos(String ingrediente, int quantidade) {
        this.codigo = "0";
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
    }

    public Alimentos(String codigo, String ingrediente, int quantidade) {
        this.codigo = codigo;
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

}
