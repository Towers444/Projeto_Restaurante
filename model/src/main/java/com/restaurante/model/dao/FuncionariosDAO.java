/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.model.dao;

import com.restaurante.common.PersistenciaException;
import com.restaurante.model.dto.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ProdutoDAO {

    private static List<Produto> produtoList;
    private static int chave;

    static {
        produtoList = new ArrayList<>();
        chave = 1;
    }

    private ProdutoDAO() {
    }

    public static Produto consultarPorNome(String nome, String valor, String descricao) {

        for (Produto r : produtoList) {
            if (r.getNome().equals(nome)) {
                return r;
            }
        }

        return null; // não encontrou
    }

    public static Produto consultarPorDescricao(String nome, String valor, String descricao) {

        for (Produto r : produtoList) {
            if (r.getDescricao().equals(descricao)) {
                return r;
            }
        }

        return null; // não encontrou
    }

    public static Produto inserir(String nome, String valor, String descricao) throws PersistenciaException {

        if (consultarPorNome(nome, valor, descricao) != null) {
            System.out.print("Faltou nome");
            throw new PersistenciaException("Violação de campo unico: nome");
        }
        if (consultarPorDescricao(nome, valor, descricao) != null) {
            System.out.print("Faltou descricao");
            throw new PersistenciaException("Violação de campo unico: descricao");
        }
        if (consultarPorNome(nome, valor, descricao) == null && consultarPorDescricao(nome, valor, descricao) == null) {
            
            Produto r = new Produto(chave, nome, valor, descricao);
            produtoList.add(r);
            chave++;
            return r;
        }
        
    

        /*
            
            if (consultarPorNome(nome, valor, descricao) == null) {
			Produto r = new Produto(chave, nome, valor, descricao);
			produtoList.add(r);
			chave++;
			return r;
		}
		throw new PersistenciaException("Violação de campo unico: nome");
	}*/
 /*public static void excluirProdutoDescricao(String nome) {
            System.out.println("CHEGOU DESCRICAO");
		for (Produto r : produtoList)
			if (r.getNome().equals(nome)) {
				produtoList.clear();
			}
	}*/
        return null;
    }
}

