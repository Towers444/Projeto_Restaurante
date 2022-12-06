/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.model.service;

import com.restaurante.model.dto.Produto;
import com.restaurante.model.dao.ProdutoDAO;
import com.restaurante.common.NegocioException;
import com.restaurante.common.PersistenciaException;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ManterProduto {

//public int auxiliar;
    private ManterProduto() {
    }

    public static int cadastrarProduto(String nome, String valor, String descricao) throws NegocioException, SQLException, ClassNotFoundException {

        if (nome.isEmpty()) {
            throw new NegocioException(511, "O nome é obrigatório.");
        }

        if (valor.isEmpty()) {
            throw new NegocioException(511, "A valor é obrigatória.");
        }
        
        if (descricao.isEmpty()) {
            throw new NegocioException(511, "A descricao é obrigatória.");
        }
        
        try {
            Produto produto = new Produto(nome, Double.parseDouble(valor.replace(',', '.')), descricao);
            
            return ProdutoDAO.inserir(produto);
        } catch (PersistenciaException ex) {
            throw new NegocioException(512, "O produto cadastrado apresenta itens repetidos.");
        }
    }

    public static int excluirProduto(String nome, String valor, String descricao) throws NegocioException, SQLException, ClassNotFoundException {
        Produto produto = new Produto(nome, Integer.parseInt(valor), descricao);
        return ProdutoDAO.excluir(produto);
    }

    public static int alterarProduto(String nomeAnterior, String valorAnterior, String descricaoAnterior, String nomeNovo, String valorNovo, String descricaoNovo) throws SQLException, ClassNotFoundException, PersistenciaException {
        
       Produto antigoProduto = new Produto(nomeAnterior, Integer.parseInt(valorAnterior), descricaoAnterior);
       Produto novoProduto = new Produto(nomeNovo, Integer.parseInt(valorNovo), descricaoNovo);
       return ProdutoDAO.alterar(antigoProduto, novoProduto);
       
    }

    // ao abrir a tela ou alterar/cadastrar/excluir contato
    public static HashSet<Produto> listarProduto() throws ClassNotFoundException, SQLException {
        return ProdutoDAO.listar();
    }

}
