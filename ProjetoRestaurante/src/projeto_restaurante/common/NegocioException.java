/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_restaurante.common;

/**
 *
 * @author Aluno
 */
public class NegocioException extends Exception {

    private int codigoErr;

    public NegocioException(String str) {
        super(str);
        codigoErr = 0;
    }

    public NegocioException(int codigo, String str) {
        super(str);
        codigoErr = codigo;
    }

    public int getCodigoErr() {
        return codigoErr;
    }

}
