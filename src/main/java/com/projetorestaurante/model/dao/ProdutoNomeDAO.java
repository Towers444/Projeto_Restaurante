/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetorestaurante.model.dao;
import com.projetorestaurante.common.PersistenciaException;
import com.projetorestaurante.model.dto.ProdutoNome;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ProdutoNomeDAO {
    
    private static List<ProdutoNome> produtoNomeList;
	private static int chave;
	static {
		produtoNomeList = new ArrayList<>();
		chave = 1;
	}

	private ProdutoNomeDAO() {
	}

	public static ProdutoNome consultarPorNome(String nome) {

		for (ProdutoNome r : produtoNomeList)
			if (r.getNome().equals(nome))
				return r;

		return null; // não encontrou
	}

	public static ProdutoNome inserir(String nome) throws PersistenciaException {

		if (consultarPorNome(nome) == null) {
			ProdutoNome r = new ProdutoNome(chave, nome);
			produtoNomeList.add(r);
			chave++;
			return r;
		}
		throw new PersistenciaException("Violação de campo unico: nome");
	}
        
        public static void excluirProdutoNome(String nome) {
            System.out.println("CHEGOU NOME");
		for (ProdutoNome r : produtoNomeList)
			if (r.getNome().equals(nome)) {
				produtoNomeList.clear();
			}
	}
    
}
