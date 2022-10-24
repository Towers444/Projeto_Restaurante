/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_restaurante.model.service;

import projeto_restaurante.model.dto.Senha;
import projeto_restaurante.model.dao.SenhaDAO;
import projeto_restaurante.common.NegocioException;
import projeto_restaurante.common.PersistenciaException;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ManterSenha {

    private ManterSenha() {
    }

    public static Senha cadastrarSenha(String nome) throws NegocioException {

        if (nome.isEmpty()) {
            throw new NegocioException(511, "A senha é obrigatório.");
        }

        try {
            return SenhaDAO.inserir(nome);
        } catch (PersistenciaException ex) {
            throw new NegocioException(512, "O senha '" + nome + "' já está cadastrado.");
        }
    }

    public static void excluirSenha(String nome) {

    }

    public static void alterarSenha(String nomeAnterior, String novoNome) {

    }

    // ao abrir a tela ou alterar/cadastrar/excluir contato
    public static List<Senha> listarSenhas() {

        return null;
    }

}
