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
        private int valor;
        private String descricao;
        
        public Produto(String nome, int valor, String descricao) {
		this.codigo = 0;
                this.nome = nome;
                this.valor = valor;
                this.descricao = descricao;
	}
        
	public Produto(int codigo, String nome, int valor, String descricao) {
		this.codigo = codigo;
                this.nome = nome;
                this.valor = valor;
                this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}
        
        public int getValor() {
		return valor;
	}
        
        public String getDescricao() {
		return descricao;
	}
    
}
