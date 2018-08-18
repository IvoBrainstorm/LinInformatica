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
public class ContaPoupanca extends ContaBancaria implements MostrarDados {
    /**
     * metodos associaods a conta poupanca
     * dá credito a mais para o correntista caso ele precise
     * levantar mais que o saldo
     * 
     * o saldo pode ficar negativo desde que não ultrapasse o limite
     */
    private double limite;

    /**
     * Constructor que inializa os atributos da classe e da classe herdada
     * @param limite
     * @param numConta
     * @param saldo
     * @param historico 
     */
    public ContaPoupanca(double limite, int numConta, double saldo, String historico) {
        super(numConta, saldo, historico);
        this.limite = limite;
    }

    public ContaPoupanca() {
    }

    
    public double getLimite() {
        return -limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
    /**
     * metodo que realiza o levantamento
     * com paramentro: 
     * @param saque 
     */
    @Override
    public void sacar(double saque) {
        double limite = getSaldo()-saque;
        
        if(limite >= getLimite()){
            super.setSaldo(getSaldo()-saque);
        }
    }
    
    
    /**
     * metodo que realiza o deposito
     * com paramentro: 
     * @param deposito 
     */

    @Override
    public void depositar(double deposito) {
        super.setSaldo(getSaldo() + deposito);

    }

    @Override
    public void mostrarDados() {
        System.out.println("O numero de conta eh: "+getNumConta()
            +"\n O Saldo actual eh de: "+getSaldo());
    }
    
}
