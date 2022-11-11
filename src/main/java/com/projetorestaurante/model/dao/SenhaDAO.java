/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetorestaurante.model.dao;

import com.projetorestaurante.common.PersistenciaException;
import com.projetorestaurante.model.dto.Senha;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class SenhaDAO {

    private static List<Senha> senhaList;
    private static int chave;

    static {
        senhaList = new ArrayList<>();
        chave = 1;
    }

    private SenhaDAO() {
    }

    public static Senha consultarPorNome(String nome) {

        for (Senha r : senhaList) {
            if (r.getNome().equals(nome)) {
                return r;
            }
        }

        return null; // não encontrou
    }

    public static Senha inserir(String nome) throws PersistenciaException {

        if (consultarPorNome(nome) == null || consultarPorNome(nome) != null) {
            Senha r = new Senha(chave, nome);
            senhaList.add(r);
            chave++;
            return r;
        }
        throw new PersistenciaException("Violação de campo unico: nome");
    }

}
