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
    
        private int codigo;
	private String nome;
        private String senha;
        private String especialidade;
        private String salario;
        
        public Funcionarios(String nome, String senha, String especialidade, String salario) {
		this.codigo = 0;
                this.nome = nome;
                this.nome = senha;
                this.nome = especialidade;
                this.nome = salario;
	}
        
	public Funcionarios(int codigo, String nome, String senha, String especialidade, String salario) {
		this.codigo = codigo;
                this.nome = nome;
                this.nome = senha;
                this.nome = especialidade;
                this.nome = salario;
	}

	public String getNome() {
		return nome;
	}
        
        public String getSenha() {
		return senha;
	}
        
        public String getEspecialidade() {
		return especialidade;
	}
        
        public String getSalario() {
		return salario;
	}
    
}
