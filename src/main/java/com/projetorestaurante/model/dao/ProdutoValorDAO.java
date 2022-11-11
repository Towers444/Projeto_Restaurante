/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetorestaurante.model.dao;
import com.projetorestaurante.common.PersistenciaException;
import com.projetorestaurante.model.dto.ProdutoValor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ProdutoValorDAO {
    
    private static List<ProdutoValor> produtoValorList;
	private static int chave;
	static {
		produtoValorList = new ArrayList<>();
		chave = 1;
	}

	private ProdutoValorDAO() {
	}

	public static ProdutoValor consultarPorNome(String nome) {

		for (ProdutoValor r : produtoValorList)
			if (r.getNome().equals(nome))
				return r;

		return null; // não encontrou
	}

	public static ProdutoValor inserir(String nome) throws PersistenciaException {

		if (consultarPorNome(nome) == null || consultarPorNome(nome) != null) {
			ProdutoValor r = new ProdutoValor(chave, nome);
			produtoValorList.add(r);
			chave++;
			return r;
		}
		throw new PersistenciaException("Violação de campo unico: nome");
	}
    
}
