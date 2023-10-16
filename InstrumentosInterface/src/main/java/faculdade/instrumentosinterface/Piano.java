/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade.instrumentosinterface;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.MidiChannel;
/**
 *
 * @author lucia
 */
public class Piano implements Instrumento {
    private int volume;
    private final Synthesizer sintetizador;
    
    public Piano() throws MidiUnavailableException {
        sintetizador = MidiSystem.getSynthesizer();
    }
    @Override
    public void tocar(Melodia melodia){
        try{
            sintetizador.open();
            MidiChannel canal = sintetizador.getChannels()[0];
            canal.programChange(1);
            melodia.musica(canal, volume);
            sintetizador.close();
        }catch(MidiUnavailableException | InterruptedException ex){
            System.out.println(ex);
            sintetizador.close();
        }
    }
    @Override
    public void setVolume(int volume){
    this.volume = volume;
    }
    
}
