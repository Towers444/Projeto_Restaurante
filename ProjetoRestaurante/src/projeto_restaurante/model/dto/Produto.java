/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_restaurante.model.dto;

/**
 *
 * @author Aluno
 */
public class Produto {
    
        private int codigo;
	private String nome;
        private String valor;
        private String descricao;
        
        public Produto(String nome, String valor, String descricao) {
		this.codigo = 0;
                this.nome = nome;
                this.valor = valor;
                this.descricao = descricao;
	}
        
	public Produto(int codigo, String nome, String valor, String descricao) {
		this.codigo = codigo;
                this.nome = nome;
                this.valor = valor;
                this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}
        
        public String getValor() {
		return valor;
	}
        
        public String getDescricao() {
		return descricao;
	}
    
}
