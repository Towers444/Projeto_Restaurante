/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

*/
package com.restaurante.model.dao;

import com.restaurante.common.PersistenciaException;
import com.restaurante.model.dto.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class UsuarioDAO {

    private static List<Usuario> usuarioList;
    private static int chave;

    static {
        usuarioList = new ArrayList<>();
        chave = 1;
    }

    private UsuarioDAO() {
    }

    public static Usuario consultarPorNome(String nome) {

        for (Usuario r : usuarioList) {
            if (r.getNome().equals(nome)) {
                return r;
            }
        }

        return null; // não encontrou
    }

    public static Usuario inserir(String nome) throws PersistenciaException {

        if (consultarPorNome(nome) == null || consultarPorNome(nome) != null) {
            Usuario r = new Usuario(chave, nome);
            usuarioList.add(r);
            chave++;
            return r;
        }
        throw new PersistenciaException("Violação de campo unico: nome");
    }

}


