/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.restaurante;

//import projeto_restaurante.view.TelaInicial;
import com.restaurante.view.TelaInicial2;

/**
 *
 * @author Aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       java.awt.EventQueue.invokeLater(() -> {
           new TelaInicial2().setVisible(true);
       });
        
    }
    
}
