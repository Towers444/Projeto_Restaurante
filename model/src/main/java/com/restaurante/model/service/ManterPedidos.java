/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.model.service;

import com.restaurante.model.dto.Pedidos;
import com.restaurante.model.dao.PedidosDAO;
import com.restaurante.common.NegocioException;
import com.restaurante.common.PersistenciaException;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ManterPedidos {

//public int auxiliar;
    private ManterPedidos() {
    }

    public static int cadastrarPedidos(String nome, String caracteristica) throws NegocioException, SQLException, ClassNotFoundException {
        
        if (caracteristica.isEmpty()) {
            throw new NegocioException(511, "A caracteristica é obrigatória.");
        }
        
        try {
            Pedidos pedidos = new Pedidos(nome, caracteristica);
            return PedidosDAO.inserir(pedidos);
        } catch (PersistenciaException ex) {
            throw new NegocioException(512, "O pedido cadastrado apresenta itens repetidos.");
        }
    }

    public static int excluirPedidos(String nome, String caracteristica) throws NegocioException, SQLException, ClassNotFoundException {
        Pedidos pedidos = new Pedidos(nome, caracteristica);
        return PedidosDAO.excluir(pedidos);
    }

    public static void alterarPedidosDescricao(String nomeAnterior, String novoNome) {

    }

    // ao abrir a tela ou alterar/cadastrar/excluir contato
    public static HashSet<Pedidos> listarPedidos() throws ClassNotFoundException, SQLException {
        return PedidosDAO.listar();
    }

}
