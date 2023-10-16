package faculdade.instrumentosinterface;

import javax.sound.midi.MidiUnavailableException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucia
 */
public class Main {
    public static void main(String[] args) throws MidiUnavailableException {
        
        System.out.println("tocando melodia piano vel. normal");
        Melodia melodiaNormal = new Melodia(1.00);
        Piano piano = new Piano();
        piano.setVolume(75);
        piano.tocar(melodiaNormal);
        
        System.out.println("Tocando melodia celo vel. rápida");
        Melodia melodiaRapida = new Melodia(1.25);
        Violoncelo violoncelo = new Violoncelo();
        violoncelo.setVolume(100);
        violoncelo.tocar(melodiaRapida);
        
        System.out.println("Tocando melodia violão vel. lenta");
        Melodia melodiaLenta = new Melodia(0.75);
        Violao violao = new Violao();
        violao.setVolume(50);
        violao.tocar(melodiaLenta);
    }

}
