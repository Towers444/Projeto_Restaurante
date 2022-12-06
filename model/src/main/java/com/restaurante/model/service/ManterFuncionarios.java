/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.model.service;

import com.restaurante.model.dto.Funcionarios;
import com.restaurante.model.dao.FuncionariosDAO;
import com.restaurante.common.NegocioException;
import com.restaurante.common.PersistenciaException;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ManterFuncionarios {

//public int auxiliar;
    private ManterFuncionarios() {
    }

    public static int cadastrarFuncionarios(String codigo, String nome, String especialidade, String salario) throws NegocioException, SQLException, ClassNotFoundException {

        if (codigo.isEmpty()) {
            throw new NegocioException(511, "O codigo é obrigatório.");
        }

        if (nome.isEmpty()) {
            throw new NegocioException(511, "O nome é obrigatório.");
        }
        
        if (especialidade.isEmpty()) {
            throw new NegocioException(511, "A especialidade é obrigatória.");
        }
        
        if (salario.isEmpty()) {
            throw new NegocioException(511, "O salario é obrigatório.");
        }
        
        salario = salario.replace(',', '.');
        
        try {
            Funcionarios funcionario = new Funcionarios(codigo, nome, especialidade, Double.parseDouble(salario));
            
            return FuncionariosDAO.inserir(funcionario);
        } catch (PersistenciaException ex) {
            throw new NegocioException(512, "O funcionarios cadastrado apresenta itens repetidos.");
        }
    }

    public static int excluirFuncionarios(String codigo, String nome, String especialidade, String salario) throws NegocioException, SQLException, ClassNotFoundException {
        salario = salario.replace(',', '.');
        
        Funcionarios funcionario = new Funcionarios(codigo, nome, especialidade, Double.parseDouble(salario));
        return FuncionariosDAO.excluir(funcionario);
    }

    public static int alterarFuncionario(String codigoAnterior, String nomeAnterior, String especialidadeAnterior, String salarioAnterior, String codigoNovo, String nomeNovo, String especialidadeNovo, String salarioNovo) throws SQLException, ClassNotFoundException, PersistenciaException {
        
       Funcionarios antigoFuncionario = new Funcionarios(codigoAnterior, nomeAnterior, especialidadeAnterior, Double.parseDouble(salarioAnterior.replace(',', '.')));
       Funcionarios novoFuncionario = new Funcionarios(codigoNovo, nomeNovo, especialidadeNovo, Double.parseDouble(salarioNovo.replace(',', '.')));
       return FuncionariosDAO.alterar(antigoFuncionario, novoFuncionario);
    }

    // ao abrir a tela ou alterar/cadastrar/excluir contato
    public static HashSet<Funcionarios> listarFuncionarios() throws ClassNotFoundException, SQLException {
        return FuncionariosDAO.listar();
    }

}
