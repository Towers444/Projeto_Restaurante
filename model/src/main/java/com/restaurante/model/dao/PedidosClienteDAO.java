/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.model.dao;

import com.restaurante.common.PersistenciaException;
import com.restaurante.model.dto.PedidosCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Usuário
 */
public class PedidosClienteDAO {
    
    //Considerando que haja no banco de dados uma tabela chamada 'pedidosCliente' que possui as colunas 'codigo', 'ingrediente' e 'quantidade'

    private PedidosClienteDAO() {
    }
    
    /**
     * Insere na tabela 'pedidosClientes' um novo registro.
     * 
     * @param pedidosCliente
     * @param nome
     * @param valor
     * @return 1 se for bem sucedida, 0 caso contrário 
     * @throws PersistenciaException
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static int inserir(PedidosCliente pedidosCliente) throws PersistenciaException, SQLException, ClassNotFoundException {
        
        Connection conexao = null; //Conexão com o banco de dados
        
        PreparedStatement ps = null; //Interage com o banco de dados a partir de comandos SQL
        
        int retorno; //Retorna o resultado da interação com o banco de dados
        
        try {
            conexao = ConexaoBD.conectar();
            
            /*
            * ps vira a instância de uma PreparedStatement que se relaciona com o banco de dados já conectado
            * A função para conseguir o PreparedStatement recebe como parâmetro um código SQL que será executado
            * Cada '?' é um campo que será substituído por um valor
            */
            ps = conexao.prepareStatement("INSERT INTO pedidosCliente VALUES(?, ?)");
            
            ps.setString(1, pedidosCliente.getNome()); //Troca o primeiro '?' pela String 'nome'
            ps.setInt(2, pedidosCliente.getValor()); //Troca o segundo '?' pela String 'valor'
            
            /*
            * Executa o código SQL recebido por parâmetro na função prepareStatement
            *
            * O código SQL final se assemelha com o seguinte exemplo:
            * INSERT INTO pedidosCliente VALUES('1', 'tomates', '20')
            * considerando que id = 1, ingrediente = "tomate" e quantidade = 20
            *
            * A função retorna 1 se for bem sucedida, 0 caso contrário
            */
            retorno = ps.executeUpdate();
        } finally {
            ConexaoBD.fecharConexao(conexao, ps); //A função fecha o banco de dados no final, dando erro ou não
        }

        return retorno;
    }
    
    /**
     * Exclui da tabela 'pedidosClientes' um registro.
     * 
     * @param pedidosCliente
     * @return 1 se for bem sucedida, 0 caso contrário
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static int excluir(PedidosCliente pedidosCliente) throws SQLException, ClassNotFoundException {
        Connection conexao = null;
        
        PreparedStatement ps = null;
        
        int retorno;
        
        try {
            conexao = ConexaoBD.conectar();
            
            ps = conexao.prepareStatement("DELETE FROM pedidosCliente WHERE nome, valor, descricao = ?");
            
            ps.setString(1, pedidosCliente.getNome());
            
            retorno = ps.executeUpdate();
        } finally {
            ConexaoBD.fecharConexao(conexao, ps);
        }
        
        return retorno;
    }
    
    /**
     * Altera qualquer valor de qualquer registro da tabela 'pedidosCliente'
     * 
     * @param antigoPedidosCliente
     * @param novoPedidosCliente
     * @return 1 se for bem sucedida, 0 caso contrário
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws PersistenciaException 
     */
    public static int alterar(PedidosCliente antigoPedidosCliente, PedidosCliente novoPedidosCliente) throws SQLException, ClassNotFoundException, PersistenciaException {
        int resultado = excluir(antigoPedidosCliente);
        
        if(resultado == 1)
            resultado = inserir(novoPedidosCliente);
        
        return resultado;
    }
    
    /**
     * Lista todos os registros ta tabela 'pedidosCliente'.
     * 
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public static HashSet<PedidosCliente> listar() throws ClassNotFoundException, SQLException {
        HashSet<PedidosCliente> lista = new HashSet<>();
        PedidosCliente pedidosCliente = null;
        
        Connection conexao = null;
        
        PreparedStatement ps = null;
        
        ResultSet rs = null; //Nos permite percorrer por uma tabela de alguma consulta feita no banco de dados
        
        try {
            conexao = ConexaoBD.conectar();
            
            //Selecionando todos os registros da tabela
            ps = conexao.prepareStatement("SELECT * FROM pedidosCliente");
            
            //O ResultSet armazena todos os registros que obter da consulta para podermos acessá-los
            rs = ps.executeQuery();
            
            //Enquanto houver um registro no ResultSet, nós o adicionaremos em nossa lista
            while(rs.next()) {
                /*
                * Criando um objeto para um registro do ResultSet
                * Para acessar as colunas de um registro, basta utilizar a função get (existem várias, cada uma retornando um tipo diferente)
                * As colunas recebem o mesmo nome das que constam na tabela do banco de dados
                */
                pedidosCliente = new PedidosCliente(rs.getString("nome"),
                        rs.getInt("valor"));
                
                lista.add(pedidosCliente);
            }
        } finally {
            ConexaoBD.fecharConexao(conexao, ps, rs);
        }
        
        return lista;
    }

    public static PedidosCliente consultarIngredientes(String nome) throws ClassNotFoundException, SQLException {
        PedidosCliente pedidosCliente = null;
        
        Connection conexao = null;
        
        PreparedStatement ps = null;
        
        ResultSet rs = null;
        
        try {
            conexao = ConexaoBD.conectar();
            
            //Seleciona os registros que atendem aos requisitos
            ps = conexao.prepareStatement("SELECT * FROM pedidosCliente WHERE nome = ?");
            
            ps.setString(1, nome);
            
            rs = ps.executeQuery();
            
            //Se houver um próximo registo no ResultSet, significa que encontramos o registro desejado
            while(rs.next()) {
                pedidosCliente = new PedidosCliente(rs.getString("nome"),
                        rs.getInt("valor"));
            }
        } finally {
            ConexaoBD.fecharConexao(conexao, ps, rs);
        }
        
        return pedidosCliente;
    }
}
