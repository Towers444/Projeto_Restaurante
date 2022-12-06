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
        private Double valor;
        
	public PedidosCliente(Double valor, String nome) {
		this.valor = valor;
                this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
        
        public Double getValor() {
		return valor;
	}
    
}
