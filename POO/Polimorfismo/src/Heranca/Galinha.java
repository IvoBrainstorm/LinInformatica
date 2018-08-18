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
public final class Galinha extends Animal{
    private String nome;

    public Galinha() {
    }
    
    public Galinha(String nome, String comida, double peso) {
        super(comida, peso);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Galinha{" + "nome=" + nome + '}';
    }

    public void fazerBarrulho(){
        System.out.println("Có Có Có!!");
    }
    
    
}
