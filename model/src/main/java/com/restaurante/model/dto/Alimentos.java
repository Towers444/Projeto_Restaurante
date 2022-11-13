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
    
        private int codigo;
	private String ingrediente;
        private String quantidade;
        
        public Alimentos(String nome, String ingrediente, String quantidade) {
		this.codigo = 0;
                this.ingrediente = ingrediente;
                this.quantidade = quantidade;
	}
        
	public Alimentos(int codigo, String ingrediente, String quantidade) {
		this.codigo = codigo;
                this.ingrediente = ingrediente;
                this.quantidade = quantidade;
	}

	public String getIngrediente() {
		return ingrediente;
	}
        
        public String getQuantidade() {
		return quantidade;
	}    
}
