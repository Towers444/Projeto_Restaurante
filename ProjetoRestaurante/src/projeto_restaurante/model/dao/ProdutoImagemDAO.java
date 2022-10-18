/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_restaurante.model.dao;
import projeto_restaurante.common.PersistenciaException;
import projeto_restaurante.model.dto.ProdutoImagem;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Aluno
 */
public class ProdutoImagemDAO {
    
    private static List<ProdutoImagem> produtoImagemList;
	private static int chave;
	static {
		produtoImagemList = new ArrayList<>();
		chave = 1;
	}

	private ProdutoImagemDAO() {
	}

	public static ProdutoImagem consultarPorNome(String nome) {

		for (ProdutoImagem r : produtoImagemList)
			if (r.getNome().equals(nome))
				return r;

		return null; // não encontrou
	}

	public static ProdutoImagem inserir(String nome) throws PersistenciaException {

		if (consultarPorNome(nome) == null || consultarPorNome(nome) != null) {
			ProdutoImagem r = new ProdutoImagem(chave, nome);
			produtoImagemList.add(r);
			chave++;
			return r;
		}
		throw new PersistenciaException("Violação de campo unico: nome");
	}
    
}
