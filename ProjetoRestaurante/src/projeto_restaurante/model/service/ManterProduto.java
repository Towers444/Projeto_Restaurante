/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_restaurante.model.service;

import projeto_restaurante.model.dto.Produto;
import projeto_restaurante.model.dao.ProdutoDAO;
import projeto_restaurante.common.NegocioException;
import projeto_restaurante.common.PersistenciaException;
import java.util.List;
import projeto_restaurante.common.Persistencia2Exception;

/**
 *
 * @author Aluno
 */
public class ManterProduto {

//public int auxiliar;
    private ManterProduto() {
    }

    public static Produto cadastrarProduto(String nome, String valor, String descricao) throws NegocioException {

        if (nome.isEmpty()) {
            throw new NegocioException(511, "O nome é obrigatório.");
        }

        if (valor.isEmpty()) {
            throw new NegocioException(511, "O valor é obrigatório.");
        }

        if (descricao.isEmpty()) {
            throw new NegocioException(511, "A descrição é obrigatória.");
        }

        try {
            return ProdutoDAO.inserir(nome, valor, descricao);
        } catch (PersistenciaException ex) {
            throw new NegocioException(512, "O produto cadastrado apresenta dados repetidos.");
        }
    }

    public static void excluirProdutoDescricao(String nome) {

    }

    public static void alterarProdutoDescricao(String nomeAnterior, String novoNome) {

    }

    // ao abrir a tela ou alterar/cadastrar/excluir contato
    public static List<Produto> listarProdutos() {

        return null;
    }

}
