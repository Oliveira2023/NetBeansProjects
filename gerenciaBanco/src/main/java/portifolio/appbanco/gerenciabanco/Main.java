/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portifolio.appbanco.gerenciabanco;

import java.util.Scanner;

/**
 * Aplicação que simula operações basicas de um caixa eletrônico
 * @author luciano
 */


public class Main {
    
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        Operacoes operacao = new Operacoes();
        
        String entrada;
        boolean saida = false;
        System.out.println(operacao.consultaSaldo());
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        entrada = scanner.next();
        cliente.setName(entrada);


        System.out.println("Digite seu sobrenome:");
        entrada = scanner.next();
        cliente.setSobrenome(entrada);
        System.out.println(cliente.getNome() + " " + cliente.getSobrenome());

        System.out.println("Digite seu CPF:");
        entrada = scanner.next();
        cliente.setCPF(entrada);
        System.out.println(cliente.getCPF());
        
        do{
            System.out.println("Digite a opção desejada:");
            System.out.println("\t1-Consultar saldo.");
            System.out.println("\t2-Realizar um deposito.");
            System.out.println("\t3-Realizar um saque.");
            System.out.println("\t4-Sair do sistema.");
            
            entrada = scanner.next();
            switch (entrada){
                case "1" -> System.out.println("Seu saldo é: " + operacao.getSaldo() +"\n");
                case "2" -> {
                    System.out.println("Digite o valor a depositar:");
                    entrada = scanner.next();
                    try{
                    operacao.deposito(Float.parseFloat(entrada));
                    }catch(NumberFormatException ex){
                        System.out.println("Não foi possivel efetuar o deposito");
                        System.out.println("Exception: " + ex);
                    }
                }
                case "3" -> {
                    System.out.println("Digite o valor do saque:");
                    entrada = scanner.next();
                    float saque = Float.parseFloat(entrada);
                    float saldo = operacao.consultaSaldo();
                    try {
                        operacao.saque(saque);
                        System.out.println("Seu saldo atual é R$ " + operacao.getSaldo());
                    }catch(Exception ex){
                        System.out.println("Não foi possivel efetuar o saque.");
                        System.out.println(ex);
                    }
                }
                case "4" -> {
                    System.out.println("Obrigado por utilizar nossos serviços!");
                    saida = true;
                }
            }       

        }while (!saida);
        
    }
    
}
