/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetorestaurante.model.dto;

/**
 *
 * @author Aluno
 */
public class ProdutoValor {
    
    private int codigo;
	private String nome;

	public ProdutoValor(String nome) {
		this.codigo = 0;
		this.nome = nome;
	}

	public ProdutoValor(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
    
}
