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
public class ContaCorrente extends ContaBancaria {
    /**
     * metodos associaods a conta corrente
     * é descontado sempre que um levantamento e um
     * depósito são feitos
     */
    private double taxaDeOperacao;
    
    /**
     * Constructor que inicializa os atrbutos da classe e da superclasse
     * @param taxaDeOperacao
     * @param numConta
     * @param saldo
     * @param historico 
     */

    public ContaCorrente(double taxaDeOperacao, int numConta, double saldo, String historico) {
        super(numConta, saldo, historico);
        this.taxaDeOperacao = taxaDeOperacao;
    }

    public ContaCorrente() {
    }
    
    
    public double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }

    public void setTaxaDeOperacao(double taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }
    
    /**
     * metodo que realiza o levantamento
     * com paramentro: 
     * @param saque 
     */
    @Override
    public void sacar(double saque) {
       double limite = getSaldo()-(saque+getTaxaDeOperacao());
       if(limite >= 0){
           super.setSaldo(limite);
       }
       
    }

    /**
     * metodo que realiza o deposito
     * com paramentro: 
     * @param deposito 
     * 
     */
    @Override
    public void depositar(double deposito) {
        super.setSaldo(getSaldo() + deposito - getTaxaDeOperacao());
    }
    
}
