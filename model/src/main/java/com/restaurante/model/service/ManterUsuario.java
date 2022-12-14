/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.model.service;

import com.restaurante.model.dto.Usuario;
import com.restaurante.model.dao.UsuarioDAO;
import com.restaurante.common.NegocioException;
import com.restaurante.common.PersistenciaException;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ManterUsuario {

//public int auxiliar;
    private ManterUsuario() {
    }

    public static int cadastrarUsuario(String cpf, String senha) throws NegocioException, SQLException, ClassNotFoundException {

        if (cpf.isEmpty()) {
            throw new NegocioException(511, "O CPF é obrigatório.");
        }

        if (senha.isEmpty()) {
            throw new NegocioException(511, "A senha é obrigatória.");
        }
        
        try {
            Usuario usuario = new Usuario(senha, cpf);
            
            return UsuarioDAO.inserir(usuario);
        } catch (PersistenciaException ex) {
            throw new NegocioException(512, "O usuario cadastrado apresenta ingredientes repetidos.");
        }
    }

    public static int consultarUsuario(String cpf, String senha) throws NegocioException, SQLException, ClassNotFoundException {

        if (cpf.isEmpty()) {
            throw new NegocioException(511, "O CPF é obrigatório.");
        }

        if (senha.isEmpty()) {
            throw new NegocioException(511, "A quantidade é obrigatória.");
        }
        
        Usuario usuario = new Usuario(senha, cpf);
        return UsuarioDAO.consultarUsuarios(usuario);
    }
    
    public static int excluirUsuario(String codigo) throws NegocioException, SQLException, ClassNotFoundException {
        Usuario usuario = new Usuario("", codigo);
        return UsuarioDAO.excluir(usuario);
    }

    public static int alterarUsuario(String codigoAnterior,  String senhaAnterior, String codigoNovo, String senhaNovo) throws SQLException, ClassNotFoundException, PersistenciaException {

        Usuario antigoFuncionario = new Usuario(codigoAnterior, senhaAnterior);
       Usuario novoFuncionario = new Usuario(codigoNovo, senhaNovo);
       return UsuarioDAO.alterar(antigoFuncionario, novoFuncionario);
        
    }

    // ao abrir a tela ou alterar/cadastrar/excluir contato
    public static HashSet<Usuario> listarUsuario() throws ClassNotFoundException, SQLException {
        return UsuarioDAO.listar();
    }

}
