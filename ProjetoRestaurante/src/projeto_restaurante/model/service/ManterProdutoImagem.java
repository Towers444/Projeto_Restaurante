/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_restaurante.model.service;
import projeto_restaurante.model.dto.ProdutoImagem;
import projeto_restaurante.model.dao.ProdutoImagemDAO;
import projeto_restaurante.common.NegocioException;
import projeto_restaurante.common.PersistenciaException;
import java.util.List;


/**
 *
 * @author Aluno
 */
public class ManterProdutoImagem {
    
    private ManterProdutoImagem() {
	}

	public static ProdutoImagem cadastrarProdutoImagem(String nome) throws NegocioException {

		if (nome.isEmpty())
			throw new NegocioException(511, "A imagem é obrigatório.");

		try {
			return ProdutoImagemDAO.inserir(nome);
		} catch (PersistenciaException ex) {
			throw new NegocioException(512, "A imagem '" + nome + "' já está cadastrado.");
		}
	}

	public static void excluirProdutoImagem(String nome) {

	}

	public static void alterarProdutoImagem(String nomeAnterior, String novoNome) {

	}

	// ao abrir a tela ou alterar/cadastrar/excluir contato
	public static List<ProdutoImagem> listarProdutoImagems() {

		return null;
	}
    
}
