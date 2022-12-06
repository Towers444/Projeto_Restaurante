/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.model.dto;

/**
 *
 * @author Aluno
 */
public class Funcionarios {

    private String codigo;
    private String nome;
    private String especialidade;
    private double salario;

    public Funcionarios(String codigo, String nome, String especialidade, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.especialidade = especialidade;
        this.salario = salario;
    }
    
    
    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public String getCodigo() {
        return codigo;
    }

}
