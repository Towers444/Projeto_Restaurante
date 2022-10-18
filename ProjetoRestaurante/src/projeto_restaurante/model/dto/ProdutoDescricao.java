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
public class ProdutoDescricao {
    
        private int codigo;
	private String nome;

	public ProdutoDescricao(String nome) {
		this.codigo = 0;
		this.nome = nome;
	}

	public ProdutoDescricao(int codigo, String nome) {
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
