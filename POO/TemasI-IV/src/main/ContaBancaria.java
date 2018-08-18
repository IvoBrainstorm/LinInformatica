/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *Clasee abstracta Conta bancaria que sera herdada por
 * @see ContaCorrente
 * @see ContaPoupanca
 * 
 * @author brainstorm
 * 
 */
public abstract class ContaBancaria {
    /**
     * Atributos associados as dados da conta bancaria
     */
    private int numConta;
    private double saldo;
    private String historico;
    
    /**
     * metodo para realizar levantamento com paramentros: 
     * @param saque 
     */
    public abstract void sacar(double saque);
    
    /**
     * metodo para efectuar o deposito com parametros: 
     * @param deposito 
     */
    public abstract void depositar(double deposito);
    
    
}
