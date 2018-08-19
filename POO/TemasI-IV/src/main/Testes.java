/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author brainstorm
 */
public class Testes {
        public static void criarConta(Banco banco){

            boolean cond = true;
            int tipo = 0;

            while (cond){
                tipo = Integer.parseInt(JOptionPane.showInputDialog("Introduza o tipo de conta: "
                        + "\n[1]  Para conta Corrente"
                        + "\n[2]  Para conta Poupanca"));

                if (tipo == 1 || tipo == 2 ){
                    cond = false;
                }
            }


            if (tipo == 1){
                ContaCorrente corrente = new ContaCorrente();

                corrente.setNumConta(Integer.parseInt(JOptionPane.showInputDialog("Introduza o numero da conta: ")));
                corrente.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Introduza o valor inical a depositar")));

                banco.inserir(corrente);
            }else{
                ContaPoupanca poupanca = new ContaPoupanca();
                
                poupanca.setNumConta(Integer.parseInt(JOptionPane.showInputDialog("Introduza o numero da conta: ")));
                poupanca.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Introduza o valor inical a depositar")));
                
            }
        }
        
        public static void selecionarConta(Banco banco){
            
            int numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta: "));
            
            if(banco.procurarConta(numConta)==null){
                JOptionPane.showMessageDialog(null, "Conta Inezistente!!");
            }else{
                menu();
            }
        }
        
        public static int menu(){
            boolean cond = true;
            int op = 0;
            while(cond){
                op = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opcao: "
                        + "\n[1] Depositar"
                        + "\n[2] Sacar"
                        + "\n[3] Transferir"
                        + "\n[4] Gerar Relatorio"
                        + "\n[5] Retornar ao menu anterior"));
            }
            return op;
        }
        
        public static void removerConta(Banco banco){
            int numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta: "));
            
            if(banco.procurarConta(numConta)==null){
                JOptionPane.showMessageDialog(null, "Conta Inezistente!!");
            }else{
                banco.remover(banco.procurarConta(numConta));
            }
        }
        
        public static void gerarRealatorio(Banco banco){
            
        }
        public static void finalizar(){
            int num = Integer.parseInt(JOptionPane.showInputDialog("[1] Para sair \n [2] Menu"));
            if (num == 1){
                System.exit(0);
            } else if(num == 2){
                menu();
            }
        }
      
    public static void main(String[] args) {
        Banco banco = new Banco();
        
        boolean inteiro = true;
        int menu = 0;
        
        while(inteiro){
            menu = Integer.parseInt(JOptionPane.showInputDialog("BEM VINDO AO BANCO IMATAVELE"
                    + "\n [1] Criar Conta"
                    + "\n [2] Selecionar Conta"
                    + "\n [3] Remover Conta"
                    + "\n [4] Gerar Relatorio"
                    + "\n [5] Finalizar"));
            if ((menu > 0) && (menu <= 5)){
                inteiro = false;
            }
        }
            switch (menu) {
                case 1:
                    criarConta(banco);
                    break;
                case 2:
                    selecionarConta(banco);
                    break;
                case 3:
                    removerConta(banco);
                    break;
                case 4:
                    gerarRealatorio(banco);
                    break;
                default:
                    break;
            }
            
        
    }
}
