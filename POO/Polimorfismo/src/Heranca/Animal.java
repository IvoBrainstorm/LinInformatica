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
public abstract class Animal {
    private String comida;
    private double peso;

    public Animal() {
    }

    public Animal(String comida, double peso) {
        this.comida = comida;
        this.peso = peso;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animal{" + "comida=" + comida + ", peso=" + peso + '}';
    }
    
    public void dormir(){
        System.out.println("ZZZZZZZZZzzzzzzzzzzz");
    }
    
    public void fazerBarrulho(){
        System.out.println("Fazer BArulho");
    }
}
