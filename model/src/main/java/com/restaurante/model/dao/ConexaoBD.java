package com.restaurante.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/*
* Como manipular bancos de dados usando JDBC:
* https://www.devmedia.com.br/aprendendo-java-com-jdbc/29116
*/

public class ConexaoBD {
    //Essa classe não deve ser instanciada
    private ConexaoBD() {}
    
    //TODO completar as strings vazias com as informações do banco de dados
    private static final String URL = "jdbc:mysql://saborearte.chwxs6wwh47k.us-east-1.rds.amazonaws.com/sys";
    private static final String USUARIO = "admin";
    private static final String SENHA = "saborearteC*1";
    
    /**
     * Tenta estabelecer uma conexão com o bando de dados.
     * 
     * @return A conexão com o banco de dados.
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public static Connection conectar() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
    
    
    /**
     * Fecha a conexão com o banco de dados imediatamente ao invés de esperar o conector realizar a tarefa.
     * Liberar os recursos da conexão assim que a função não for mais dependente desta é uma boa prática para melhorar o desempenho.
     * 
     * @param conexao
     * @param comando
     * @throws SQLException 
     */
    public static void fecharConexao(Connection conexao, PreparedStatement comando) throws SQLException {
        if(comando != null)
            comando.close();
        
        if(conexao != null)
            conexao.close();
    }
    
    /**
     * Fecha a conexão com o banco de dados imediatamente ao invés de esperar o conector realizar a tarefa.
     * Liberar os recursos da conexão assim que a função não for mais dependente desta é uma boa prática para melhorar o desempenho.
     * 
     * @param conexao
     * @param comando
     * @param resultSet
     * @throws SQLException 
     */
    public static void fecharConexao(Connection conexao, PreparedStatement comando, ResultSet resultSet) throws SQLException {
        if(resultSet != null)
            resultSet.close();
        
        fecharConexao(conexao, comando);
    }
}

