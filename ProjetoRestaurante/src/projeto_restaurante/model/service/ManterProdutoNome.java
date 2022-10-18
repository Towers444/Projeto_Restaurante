/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_restaurante.model.service;
import projeto_restaurante.model.dto.ProdutoNome;
import projeto_restaurante.model.dao.ProdutoNomeDAO;
import projeto_restaurante.common.NegocioException;
import projeto_restaurante.common.PersistenciaException;
import java.util.List;


/**
 *
 * @author Aluno
 */
public class ManterProdutoNome {
    
    private ManterProdutoNome() {
	}

	public static ProdutoNome cadastrarProdutoNome(String nome) throws NegocioException {

		if (nome.isEmpty())
			throw new NegocioException(511, "O nome do produto é obrigatório.");

		try {
			return ProdutoNomeDAO.inserir(nome);
		} catch (PersistenciaException ex) {
			throw new NegocioException(512, "O produto de nome '" + nome + "' já está cadastrado.");
		}
	}

	public static void excluirProdutoNome(String nome) {

	}

	public static void alterarProdutoNome(String nomeAnterior, String novoNome) {

	}

	// ao abrir a tela ou alterar/cadastrar/excluir contato
	public static List<ProdutoNome> listarProdutoNomes() {

		return null;
	}
    
}
