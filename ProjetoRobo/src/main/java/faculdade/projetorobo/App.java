/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade.projetorobo;

import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class App {
    
        public static void main(String[] args) {
            Robo robo = new Robo();
            String tecla = "";
            Scanner scan = new Scanner(System.in);
            boolean ok = false;
            do {
                try {
                    tecla = scan.next();
                    robo.setOrientacao(tecla.charAt(0));
                    robo.printPos();
                }catch (IllegalArgumentException ex){
                    if (tecla.charAt(0) == '0'){
                        ok = true;
                    }else {
                       System.out.println("Valor errado");
                       scan.nextLine();
                       ok =  false;
                    }
                }
            }while(!ok);
            robo.printPos();
            
        if (args.length !=0){
            args[0] = args[0].toLowerCase();
                switch (args[0]) {
                    case "--author" -> System.out.println("Autor: Jesimar Sl Arantes");
                    case "--version" -> System.out.println("Versão: 1.0.0");
                    case "--help" -> {
                        System.out.println("Exec. Movimentos Agendados:");
                        System.out.println("\t--move w a w w s d d a");
                    }
                    case "--commands" -> {
                        System.out.println("Comandos suportados:");
                        System.out.println("\tw: move para cima;");
                        System.out.println("\ta: move para esquerda");
                        System.out.println("\ts: move para baixo");
                        System.out.println("\td: move para direita");
                        System.out.println("\t0: sair da aplicação");
                    }
                    case "--move" -> robo.movimentosAgendados(args);
                    default -> System.out.println("Argumento não válido");
                }
            System.exit(0);
        }
    }
}
