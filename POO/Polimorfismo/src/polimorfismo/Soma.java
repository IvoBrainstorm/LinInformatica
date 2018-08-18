/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Ivo Brainstorm
 */
public class Soma extends OperacaoMatematica{
    
    /**
     *
     * @param x
     * @param y
     * @return a soma de x e y
     */
    @Override
     public double calcular(double x, double y){
        return x+y;
    }
    
}
