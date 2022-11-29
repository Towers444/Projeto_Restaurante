/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.model.service;

import com.restaurante.model.dto.PedidosCliente;
import com.restaurante.model.dao.PedidosClienteDAO;
import com.restaurante.common.NegocioException;
import com.restaurante.common.PersistenciaException;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ManterPedidosCliente {

//public int auxiliar;
    private ManterPedidosCliente() {
    }

    public static int cadastrarPedidosCliente(String nome, String valor) throws NegocioException, SQLException, ClassNotFoundException {
        
        try {
            PedidosCliente pedidosCliente = new PedidosCliente(nome, Integer.parseInt(valor));
            return PedidosClienteDAO.inserir(pedidosCliente);
        } catch (PersistenciaException ex) {
            throw new NegocioException(512, "O pedido cadastrado apresenta itens repetidos.");
        }
    }

    public static int excluirPedidosCliente(String nome, String valor) throws NegocioException, SQLException, ClassNotFoundException {
        PedidosCliente pedidosCliente = new PedidosCliente(nome, Integer.parseInt(valor));
        return PedidosClienteDAO.excluir(pedidosCliente);
    }

    public static void alterarPedidosClienteDescricao(String nomeAnterior, String novoNome) {

    }

    // ao abrir a tela ou alterar/cadastrar/excluir contato
    public static HashSet<PedidosCliente> listarPedidosCliente() throws ClassNotFoundException, SQLException {
        return PedidosClienteDAO.listar();
    }

}