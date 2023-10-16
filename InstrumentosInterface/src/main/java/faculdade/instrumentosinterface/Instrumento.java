package faculdade.instrumentosinterface;


import faculdade.instrumentosinterface.Melodia;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucia
 */
public interface Instrumento {
    public void tocar(Melodia melodia);
    public void setVolume(int volume);
}
