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
    private  int numConta;
    private  double saldo;
    private  String historico;

    /**
     * Constructor que inicializa os atributos:
     * @param numConta
     * @param saldo
     * @param historico 
     * 
     * Pertencentes a classe
     */

    public ContaBancaria(int numConta, double saldo, String historico) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.historico = historico;
    }

    public ContaBancaria() {
    }
    
    
    
    

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }
    
    
    
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
    
    
    public void transferir(double valor, ContaBancaria conta){
        
        this.sacar(valor);
        conta.depositar(valor);
        
        
    }
    
    
}
