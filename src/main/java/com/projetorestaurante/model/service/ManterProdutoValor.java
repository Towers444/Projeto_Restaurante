/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetorestaurante.model.service;
import com.projetorestaurante.model.dto.ProdutoValor;
import com.projetorestaurante.model.dao.ProdutoValorDAO;
import com.projetorestaurante.common.NegocioException;
import com.projetorestaurante.common.PersistenciaException;
import java.util.List;


/**
 *
 * @author Aluno
 */
public class ManterProdutoValor {
    
     private ManterProdutoValor() {
	}

	public static ProdutoValor cadastrarProdutoValor(String nome) throws NegocioException {

		if (nome.isEmpty())
			throw new NegocioException(511, "O valor é obrigatório.");

		try {
			return ProdutoValorDAO.inserir(nome);
		} catch (PersistenciaException ex) {
			throw new NegocioException(512, "O valor '" + nome + "' já está cadastrado.");
		}
	}

	public static void excluirProdutoValor(String nome) {

	}

	public static void alterarProdutoValor(String nomeAnterior, String novoNome) {

	}

	// ao abrir a tela ou alterar/cadastrar/excluir contato
	public static List<ProdutoValor> listarProdutoValors() {

		return null;
	}
    
}
