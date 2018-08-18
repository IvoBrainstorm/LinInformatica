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
public class OpercaoTeste {
    
    public static void calcular(OperacaoMatematica o, double x, double y){
        System.out.println(o.calcular(x, y));
    }
    
    public static void main(String[] args) {
        calcular(new Producto(), 6, 7);
        calcular(new Soma(), 6, 7);
    }
}
