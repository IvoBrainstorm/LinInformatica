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
public abstract class Cao extends Animal{
    private double altura;
    private boolean cauda;

    public Cao() {
    }
    
    public Cao(double altura, boolean cauda, String comida, double peso) {
        super(comida, peso);
        this.altura = altura;
        this.cauda = cauda;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isCauda() {
        return cauda;
    }

    public void setCauda(boolean cauda) {
        this.cauda = cauda;
    }

    @Override
    public String toString() {
        return "Cao{" + "altura=" + altura + ", cauda=" + cauda + '}';
    }

    @Override
    public void fazerBarrulho(){
        System.out.println("AU AU AU!!");
    }
    
    
    
}
