/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.model.dao;

import com.restaurante.common.PersistenciaException;
import com.restaurante.model.dto.Funcionarios;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuário
 */
public class FuncionariosDAO {
    
    private static List<Funcionarios> funcionariosList;
    private static int chave;

    static {
        funcionariosList = new ArrayList<>();
        chave = 1;
    }

    private FuncionariosDAO() {
    }

    public static Funcionarios consultarNome(String nome, String senha, String especialidade, String salario) {

        for (Funcionarios r : funcionariosList) {
            if (r.getNome().equals(nome)) {
                return r;
            }
        }


        return null; // não encontrou
    }

    public static Funcionarios inserir(String nome, String senha, String especialidade, String salario) throws PersistenciaException {

        if (consultarNome(nome, senha, especialidade, salario) != null) {
            throw new PersistenciaException("Violação de campo unico: nome");
        } 
        if (consultarNome(nome, senha, especialidade, salario) == null) {
            
            Funcionarios r = new Funcionarios(chave, nome, senha, especialidade, salario);
            funcionariosList.add(r);
            chave++;
            return r;
        }
        return null;
    }   
}
