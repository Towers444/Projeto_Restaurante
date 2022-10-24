/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_restaurante.model.dao;
import projeto_restaurante.common.PersistenciaException;
import projeto_restaurante.model.dto.ProdutoDescricao;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Aluno
 */
public class ProdutoDescricaoDAO {
    
    private static List<ProdutoDescricao> produtoDescricaoList;
	private static int chave;
	static {
		produtoDescricaoList = new ArrayList<>();
		chave = 1;
	}

	private ProdutoDescricaoDAO() {
	}

	public static ProdutoDescricao consultarPorNome(String nome) {

		for (ProdutoDescricao r : produtoDescricaoList)
			if (r.getNome().equals(nome))
				return r;

		return null; // não encontrou
	}

	public static ProdutoDescricao inserir(String nome) throws PersistenciaException {

		if (consultarPorNome(nome) == null) {
			ProdutoDescricao r = new ProdutoDescricao(chave, nome);
			produtoDescricaoList.add(r);
			chave++;
			return r;
		}
		throw new PersistenciaException("Violação de campo unico: nome");
	}
        
        public static void excluirProdutoDescricao(String nome) {
            System.out.println("CHEGOU DESCRICAO");
		for (ProdutoDescricao r : produtoDescricaoList)
			if (r.getNome().equals(nome)) {
				produtoDescricaoList.clear();
			}
	}
    
}
