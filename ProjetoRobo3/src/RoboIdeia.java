/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
    /**
     * Classe abstrata que modela a ideia de robO.
     * @autor Jesimar da Silva Arantes
     * Codigo 3.29
 */
public abstract class RoboIdeia {
    
    protected float posicaoX;
    protected float posicaoY;
    protected Orientacao orientacao;
    protected String nome;
    protected float peso;
    
    /**
     * Assinatura do m´todo que move o robô.
     * @param posX posição x em que o robô será movido.
     * @param posY polsição y em que o robô será movido.
     */
    public abstract void move(float posX, float posY);
    
    /**
     * Assinatura do método que move o robô ao longo do eixo x.
     * @param dist distância a partir da posição atural no eixo x que será movido o robô.
     */
    public abstract void moveX(float dist);
    
    /**
     * Assinatura do método que move o robô ao longo do eixo y.
     * @param dist distância a partir da posição atual no eixo y que será movido o robô.
     */
    public abstract void moveY(float dist);
}
