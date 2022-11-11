/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetorestaurante.model.dto;

/**
 *
 * @author Joao Pedro Torres
 */
public class ProdutoNome {
    
	private int codigo;
	private String nome;

	public ProdutoNome(String nome) {
		this.codigo = 0;
		this.nome = nome;
	}

	public ProdutoNome(int codigo, String nome) {
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

