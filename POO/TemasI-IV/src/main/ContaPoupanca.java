/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *Classe que herda atributos e metodos da classe:
 * @see ContaBancaria
 * E implementa a interface:
 * @see MostrarDados
 * 
 * @author brainstorm
 */
public class ContaPoupanca extends ContaBancaria {
    /**
     * metodos associaods a conta poupanca
     * dá credito a mais para o correntista caso ele precise
     * levantar mais que o saldo
     * 
     * o saldo pode ficar negativo desde que não ultrapasse o limite
     */
    private double limite;

    
    /**
     * metodo que realiza o levantamento
     * com paramentro: 
     * @param saque 
     */
    @Override
    public void sacar(double saque) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    /**
     * metodo que realiza o deposito
     * com paramentro: 
     * @param deposito 
     */

    @Override
    public void depositar(double deposito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
