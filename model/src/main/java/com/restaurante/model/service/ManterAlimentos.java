/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.model.service;

import com.restaurante.model.dto.Alimentos;
import com.restaurante.model.dao.AlimentosDAO;
import com.restaurante.common.NegocioException;
import com.restaurante.common.PersistenciaException;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ManterAlimentos {

//public int auxiliar;
    private ManterAlimentos() {
    }

    public static Alimentos cadastrarAlimentos(String ingrediente, String quantidade) throws NegocioException {

        if (ingrediente.isEmpty()) {
            throw new NegocioException(511, "O ingrediente é obrigatório.");
        }

        if (quantidade.isEmpty()) {
            throw new NegocioException(511, "A quantidade é obrigatória.");
        }
        
        try {
            return AlimentosDAO.inserir(ingrediente, quantidade);
        } catch (PersistenciaException ex) {
            throw new NegocioException(512, "O alimentos cadastrado apresenta ingredientes repetidos.");
        }
    }

    public static void excluirAlimentosDescricao(String ingrediente) {

    }

    public static void alterarAlimentosDescricao(String nomeAnterior, String novoNome) {

    }

    // ao abrir a tela ou alterar/cadastrar/excluir contato
    public static List<Alimentos> listarAlimentoss() {

        return null;
    }

}
