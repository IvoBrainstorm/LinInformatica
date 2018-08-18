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
public final class Rafeiro extends Cao{
    private String nome;

    public Rafeiro() {
    }
    
    public Rafeiro(String nome, double altura, boolean cauda, String comida, double peso) {
        super(altura, cauda, comida, peso);
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
        return "Rafeiro{" + "nome=" + nome + '}';
    }
    
    
    
    
}
