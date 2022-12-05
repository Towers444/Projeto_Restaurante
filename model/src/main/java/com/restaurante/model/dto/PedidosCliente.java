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
public class PedidosCliente {
    
	private String nome;
        private int valor;
        
	public PedidosCliente(int valor, String nome) {
		this.valor = valor;
                this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
        
        public int getValor() {
		return valor;
	}
    
}
