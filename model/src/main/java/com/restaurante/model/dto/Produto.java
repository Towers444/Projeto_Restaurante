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
public class Produto {
    
        private int codigo;
	private String nome;
        private double valor;
        private String descricao;
        
        public Produto(String nome, double valor, String descricao) {
		this.codigo = 0;
                this.nome = nome;
                this.valor = valor;
                this.descricao = descricao;
	}
        
	public Produto(int codigo, String nome, double valor, String descricao) {
		this.codigo = codigo;
                this.nome = nome;
                this.valor = valor;
                this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}
        
        public double getValor() {
		return valor;
	}
        
        public String getDescricao() {
		return descricao;
	}
    
}
