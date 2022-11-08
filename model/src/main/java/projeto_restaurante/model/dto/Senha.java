/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_restaurante.model.dto;

/**
 *
 * @author Aluno
 */
public class Senha {

    private int codigo;
    private String nome;

    public Senha(String nome) {
        this.codigo = 0;
        this.nome = nome;
    }

    public Senha(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

}
