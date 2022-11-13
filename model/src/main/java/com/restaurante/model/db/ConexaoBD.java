/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.model.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuário
 */
public class ConexaoBD {
    
  String hostName = "localhost";
  String userName = "portaljava";
  String password = "java rulez!";
  String jdbcDriver = "org.gjt.mm.mysql.Driver";
  String dataBaseName = "meu_bd";
  String dataBasePrefix = "jdbc: mysql:/";
  String dabaBasePort = "3306";
    
  String url = dataBasePrefix + hostName + ":"+dabaBasePort+"/" + dataBaseName + "/";
  
  Connection conexao;

    public ConexaoBD() throws SQLException {
        this.conexao = DriverManager.getConnection(url, userName, password);
    }
  
}
