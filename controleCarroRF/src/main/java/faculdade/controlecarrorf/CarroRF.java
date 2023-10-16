/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade.controlecarrorf;

/**
 *
 * @author lucia
 */
import java.util.Arrays;

public class CarroRF implements Runnable{

    private int nivelBateria;
    private int numMovimentos;
    
    public CarroRF(){
        this.nivelBateria = 100;
        this.numMovimentos = 0;
    }
    public int getNivelBateria(){
        return nivelBateria;
    }
    public int getNumMovim(){
        return numMovimentos;
    }
    
    public void agendarMovimentos(Direcao... direcoesMovimentos){
        String msg = String.format("lista movimentos agendados: %s", Arrays.toString(direcoesMovimentos));
        System.out.println(msg);
        numMovimentos += direcoesMovimentos.length;
    }
    @Override
    public void run() {
        System.out.println("Executando movimentos ...");
        //execução da movimentoação do carro (abstrair)
        nivelBateria -= numMovimentos;
        numMovimentos = 0;
    }
    @Override
    public String toString(){
        return String.format("Nível de bateria: %d%n" + "Movimentos a Executar: %d", nivelBateria, numMovimentos);
    }
}
