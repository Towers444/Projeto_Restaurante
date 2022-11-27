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
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ManterAlimentos {

//public int auxiliar;
    private ManterAlimentos() {
    }

    public static int cadastrarAlimentos(String ingrediente, String quantidade) throws NegocioException, SQLException, ClassNotFoundException {

        if (ingrediente.isEmpty()) {
            throw new NegocioException(511, "O ingrediente é obrigatório.");
        }

        if (quantidade.isEmpty()) {
            throw new NegocioException(511, "A quantidade é obrigatória.");
        }
        
        try {
            Alimentos alimento = new Alimentos(ingrediente, Integer.parseInt(quantidade));
            
            return AlimentosDAO.inserir(alimento);
        } catch (PersistenciaException ex) {
            throw new NegocioException(512, "O alimentos cadastrado apresenta ingredientes repetidos.");
        }
    }

    public static int excluirAlimentos(String ingrediente, String quantidade) throws NegocioException, SQLException, ClassNotFoundException {
        Alimentos alimento = new Alimentos(ingrediente, Integer.parseInt(quantidade));
        return AlimentosDAO.excluir(alimento);
    }

    public static void alterarAlimentosDescricao(String nomeAnterior, String novoNome) {

    }

    // ao abrir a tela ou alterar/cadastrar/excluir contato
    public static HashSet<Alimentos> listarAlimentos() throws ClassNotFoundException, SQLException {
        return AlimentosDAO.listar();
    }

}
