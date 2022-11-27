/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.model.dao;

import com.restaurante.common.PersistenciaException;
import com.restaurante.model.dto.Alimentos;
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
public class AlimentosDAO {
    
    //Considerando que haja no banco de dados uma tabela chamada 'alimentos' que possui as colunas 'codigo', 'ingrediente' e 'quantidade'

    private AlimentosDAO() {
    }
    
    /**
     * Insere na tabela 'alimentos' um novo registro.
     * 
     * @param codigo
     * @param ingrediente
     * @param quantidade
     * @return 1 se for bem sucedida, 0 caso contrário 
     * @throws PersistenciaException
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static int inserir(Alimentos alimento) throws PersistenciaException, SQLException, ClassNotFoundException {
        
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
            ps = conexao.prepareStatement("INSERT INTO alimentos VALUES(?, ?)");
            
            ps.setString(1, alimento.getIngrediente()); //Troca o primeiro '?' pela String 'ingrediente'
            ps.setInt(2, alimento.getQuantidade()); //Troca o segundo '?' pelo int 'quantidade'
            
            /*
            * Executa o código SQL recebido por parâmetro na função prepareStatement
            *
            * O código SQL final se assemelha com o seguinte exemplo:
            * INSERT INTO alimentos VALUES('1', 'tomates', '20')
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
     * Exclui da tabela 'alimentos' um registro.
     * 
     * @param alimento
     * @return 1 se for bem sucedida, 0 caso contrário
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static int excluir(Alimentos alimento) throws SQLException, ClassNotFoundException {
        Connection conexao = null;
        
        PreparedStatement ps = null;
        
        int retorno;
        
        try {
            conexao = ConexaoBD.conectar();
            
            ps = conexao.prepareStatement("DELETE FROM alimentos WHERE ingrediente = ?");
            
            ps.setString(1, alimento.getIngrediente());
            
            retorno = ps.executeUpdate();
        } finally {
            ConexaoBD.fecharConexao(conexao, ps);
        }
        
        return retorno;
    }
    
    /**
     * Altera qualquer valor de qualquer registro da tabela 'alimentos'
     * 
     * @param antigoAlimento
     * @param novoAlimento
     * @return 1 se for bem sucedida, 0 caso contrário
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws PersistenciaException 
     */
    public static int alterar(Alimentos antigoAlimento, Alimentos novoAlimento) throws SQLException, ClassNotFoundException, PersistenciaException {
        int resultado = excluir(antigoAlimento);
        
        if(resultado == 1)
            resultado = inserir(novoAlimento);
        
        return resultado;
    }
    
    /**
     * Lista todos os registros ta tabela 'alimentos'.
     * 
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public static HashSet<Alimentos> listar() throws ClassNotFoundException, SQLException {
        HashSet<Alimentos> lista = new HashSet<>();
        Alimentos alimento = null;
        
        Connection conexao = null;
        
        PreparedStatement ps = null;
        
        ResultSet rs = null; //Nos permite percorrer por uma tabela de alguma consulta feita no banco de dados
        
        try {
            conexao = ConexaoBD.conectar();
            
            //Selecionando todos os registros da tabela
            ps = conexao.prepareStatement("SELECT * FROM alimentos");
            
            //O ResultSet armazena todos os registros que obter da consulta para podermos acessá-los
            rs = ps.executeQuery();
            
            //Enquanto houver um registro no ResultSet, nós o adicionaremos em nossa lista
            while(rs.next()) {
                /*
                * Criando um objeto para um registro do ResultSet
                * Para acessar as colunas de um registro, basta utilizar a função get (existem várias, cada uma retornando um tipo diferente)
                * As colunas recebem o mesmo nome das que constam na tabela do banco de dados
                */
                alimento = new Alimentos(rs.getString("ingrediente"),
                        rs.getInt("quantidade"));
                
                lista.add(alimento);
            }
        } finally {
            ConexaoBD.fecharConexao(conexao, ps, rs);
        }
        
        return lista;
    }

    public static Alimentos consultarIngredientes(String ingrediente) throws ClassNotFoundException, SQLException {
        Alimentos alimento = null;
        
        Connection conexao = null;
        
        PreparedStatement ps = null;
        
        ResultSet rs = null;
        
        try {
            conexao = ConexaoBD.conectar();
            
            //Seleciona os registros que atendem aos requisitos
            ps = conexao.prepareStatement("SELECT * FROM alimentos WHERE ingrediente = ?");
            
            ps.setString(1, ingrediente);
            
            rs = ps.executeQuery();
            
            //Se houver um próximo registo no ResultSet, significa que encontramos o registro desejado
            while(rs.next()) {
                alimento = new Alimentos(rs.getString("ingrediente"),
                        rs.getInt("quantidade"));
            }
        } finally {
            ConexaoBD.fecharConexao(conexao, ps, rs);
        }
        
        return alimento;
    }
}
