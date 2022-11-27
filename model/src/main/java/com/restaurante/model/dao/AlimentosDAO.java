package com.restaurante.model.dao;

import com.restaurante.common.PersistenciaException;
import com.restaurante.model.dto.Alimentos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuário
 */
public class AlimentosDAO {
    
    private static List<Alimentos> alimentosList;
    private static int chave;

    static {
        alimentosList = new ArrayList<>();
        chave = 1;
    }

    private AlimentosDAO() {
    }

    public static Alimentos consultarIngredientes(String ingrediente, String quantidade) {

        for (Alimentos r : alimentosList) {
            if (r.getIngrediente().equals(ingrediente)) {
                return r;
            }
        }

        return null; // não encontrou
    }

    public static Alimentos inserir(String ingrediente, String quantidade) throws PersistenciaException {

        if (consultarIngredientes(ingrediente, quantidade) != null) {
            throw new PersistenciaException("Violação de campo unico: nome");
        }
        if (consultarIngredientes(ingrediente, quantidade) == null) {
            
            Alimentos r = new Alimentos(chave, ingrediente, quantidade);
            alimentosList.add(r);
            chave++;
            return r;
        }
        return null;
    }   
}
