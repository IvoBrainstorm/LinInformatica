/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author brainstorm
 */
public class ClasseExecutavel {
    public static void main(String[] args) {
        
        ContaCorrente corrente = new ContaCorrente();
        ContaPoupanca poupanca = new ContaPoupanca();
        
        Relatorio relatorio = new Relatorio();
        
        poupanca.depositar(1000);
        poupanca.setLimite(200);
        
        poupanca.sacar(1210);
        
        corrente.depositar(4500);
        corrente.sacar(456);
        
        relatorio.gerarRelatorio(poupanca);
        
    }
}
