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
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ManterFuncionarios {

//public int auxiliar;
    private ManterFuncionarios() {
    }

    public static Funcionarios cadastrarFuncionarios(String nome, String senha, String especialidade, String salario) throws NegocioException {

        if (nome.isEmpty()) {
            throw new NegocioException(511, "O nome é obrigatório.");
        }

        if (senha.isEmpty()) {
            throw new NegocioException(511, "A senha é obrigatória.");
        }
        
        if (especialidade.isEmpty()) {
            throw new NegocioException(511, "A especialidade é obrigatória.");
        }
        
        if (salario.isEmpty()) {
            throw new NegocioException(511, "O salário é obrigatório.");
        }
        
        try {
            return FuncionariosDAO.inserir(nome, senha, especialidade, salario);
        } catch (PersistenciaException ex) {
            throw new NegocioException(512, "O funcionarios ja foi cadastrado.");
        }
    }

    public static void excluirFuncionariosDescricao(String ingrediente) {

    }

    public static void alterarFuncionariosDescricao(String nomeAnterior, String novoNome) {

    }

    // ao abrir a tela ou alterar/cadastrar/excluir contato
    public static List<Funcionarios> listarFuncionarioss() {

        return null;
    }

}
