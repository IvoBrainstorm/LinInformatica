/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author brainstorm
 */
public class Banco implements MostrarDados{
    
    ArrayList<ContaBancaria> contas = new ArrayList<>();
    
    public void inserir(ContaBancaria conta){
        contas.add(conta);
    }
    
    public void remover(ContaBancaria conta){
        contas.remove(conta);
    }
    
    public ContaBancaria procurarConta(int numeroConta){
        
        if (contas.contains(numeroConta)){
            return contas.get(numeroConta);
        }
        else 
            return null;
    }

    @Override
    public void mostrarDados() {
        contas.toString();
    }
    
    
    
}
