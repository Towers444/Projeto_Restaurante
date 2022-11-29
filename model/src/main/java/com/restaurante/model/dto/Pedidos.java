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
public class Pedidos {
    
	private String nome;
        private String caracteristica;
        
        public Pedidos(String nome, String caracteristica) {
                this.nome = nome;
                this.caracteristica = caracteristica;
	}
        
	public String getNome() {
		return nome;
	}
        
        public String getCaracteristica() {
		return caracteristica;
	}
    
}
