/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

/**
 *
 * @author Ivo Brainstorm
 */
public class TesteAnimal {
    
    public static void barrulho(Animal animal){
        animal.fazerBarrulho();
    }
    
    public static void main(String[] args) {

       // Animal animal = new Animal();
        //Animal toto = new Cao();
        Animal carijo = new Galinha();
        
        
       // toto.setPeso(0);
        
        barrulho(carijo);

        
    }
}
