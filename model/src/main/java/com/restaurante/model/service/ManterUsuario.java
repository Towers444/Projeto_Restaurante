/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.model.service;

import com.restaurante.model.dto.Usuario;
import com.restaurante.model.dao.UsuarioDAO;
import com.restaurante.common.NegocioException;
import com.restaurante.common.PersistenciaException;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ManterUsuario {

    private ManterUsuario() {
    }

    public static Usuario cadastrarUsuario(String nome) throws NegocioException {

        if (nome.isEmpty()) {
            throw new NegocioException(511, "O nome do usuário é obrigatório.");
        }

        try {
            return UsuarioDAO.inserir(nome);
        } catch (PersistenciaException ex) {
            throw new NegocioException(512, "O produto de nome '" + nome + "' já está cadastrado.");
        }
    }

    public static void excluirUsuario(String nome) {

    }

    public static void alterarUsuario(String nomeAnterior, String novoNome) {

    }

    // ao abrir a tela ou alterar/cadastrar/excluir contato
    public static List<Usuario> listarUsuarios() {

        return null;
    }

}