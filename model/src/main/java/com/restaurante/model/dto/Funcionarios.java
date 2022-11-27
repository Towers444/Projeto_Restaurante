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
        private String especialidade;
        private int salario;
        
        public Funcionarios(String nome, String senha, String especialidade, int salario) {
		this.codigo = 0;
                this.nome = nome;
                this.especialidade = especialidade;
                this.salario = salario;
	}
        
	public Funcionarios(int codigo, String nome, String especialidade, int salario) {
		this.codigo = codigo;
                this.nome = nome;
                this.especialidade = especialidade;
                this.salario = salario;
	}

	public int getCogigo() {
		return codigo;
	}
        
        public String getNome() {
		return nome;
	}
        
        public String getEspecialidade() {
		return especialidade;
	}
        
        public int getSalario() {
		return salario;
	}

    public int getCodigo() {
        return codigo;
    }
    
}
