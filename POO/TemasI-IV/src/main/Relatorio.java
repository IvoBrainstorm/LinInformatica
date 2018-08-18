/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *Classe que possui apenas um metodo para gerar relatorio
 * que recebe metodo da interface:
 * @see MostrarDados
 * 
 * @author brainstorm
 */
public class Relatorio {
    /**
     * Método que receba um objeto imprimível
     * executa o método mostrarDados do objeto
     * com parametro
     * @param mostrar 
     */
    public static void gerarRelatorio(MostrarDados mostrar){
        mostrar.mostrarDados();
    }
}
