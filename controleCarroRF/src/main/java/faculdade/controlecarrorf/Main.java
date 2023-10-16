/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade.controlecarrorf;

/**
 *
 * @author lucia
 */
public class Main {
    public static void main(String[] args){
        CarroRF carro = new CarroRF();
        carro.agendarMovimentos(Direcao.CIMA, Direcao.DIREITA, Direcao.CIMA, Direcao.ESQUERDA);
        System.out.println(carro);
        carro.run();
        System.out.println(carro);
        carro.agendarMovimentos(Direcao.BAIXO, Direcao.ESQUERDA, Direcao.ESQUERDA);
        System.out.println(carro);
        carro.run();
        System.out.println(carro);
    }
}
