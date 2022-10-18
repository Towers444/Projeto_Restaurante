/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_restaurante.model.service;
import projeto_restaurante.model.dto.ProdutoDescricao;
import projeto_restaurante.model.dao.ProdutoDescricaoDAO;
import projeto_restaurante.common.NegocioException;
import projeto_restaurante.common.PersistenciaException;
import java.util.List;


/**
 *
 * @author Aluno
 */
public class ManterProdutoDescricao {
    
    private ManterProdutoDescricao() {
	}

	public static ProdutoDescricao cadastrarProdutoDescricao(String nome) throws NegocioException {

		if (nome.isEmpty())
			throw new NegocioException(511, "A descrição é obrigatório.");

		try {
			return ProdutoDescricaoDAO.inserir(nome);
		} catch (PersistenciaException ex) {
			throw new NegocioException(512, "A descrição de nome '" + nome + "' já está cadastrado.");
		}
	}

	public static void excluirProdutoDescricao(String nome) {

	}

	public static void alterarProdutoDescricao(String nomeAnterior, String novoNome) {

	}

	// ao abrir a tela ou alterar/cadastrar/excluir contato
	public static List<ProdutoDescricao> listarProdutoDescricaos() {

		return null;
	}
    
}
