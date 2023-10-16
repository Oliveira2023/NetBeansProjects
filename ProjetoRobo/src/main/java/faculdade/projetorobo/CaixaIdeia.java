/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade.projetorobo;

/**
 *Classe abstrata que modela a ideia de caixa.
 * @author lucia
 */
public abstract class CaixaIdeia {
    
    protected int posX;
    protected int posY;
    protected float peso;
    protected final float comprimento;
    protected final float largura;
    protected final float altura;
    
    /**
     * Construtor da caixa Ideia
     * @param posX coodenada X da caixa.
     * @param posY coodenada Y da caixa.
     * @param peso valor do peso da caixa.
     * @param comprimento Valor do comprimento da caixa
     * @param largura
     * @param altura 
     */
    public CaixaIdeia(int posX, int posY, float peso, float comprimento, float largura, float altura){
        this.posX = posX;
        this.posY = posY;
        this.peso = peso;
        this.comprimento =  comprimento;
        this.largura = largura;
        this.altura = altura;
    }
    /**
     * Obtém a posição x da caixa
     * @return retorna a posiçção x da caixa
     */
    public int getPosX(){
        return posX;
    }
    /**
     * Define o valor da posição no eixo x da caixa
     * @param posX valor da posiçao x da caixa
     */
    public void setPosX(int posX){
        this.posX =  posX;
    }
    /**
     * Obtém a posição y da caixa
     * @return retorna o valor da posição y da caixa.
     */
    public int getPosY(){
        return posY;
    }
    /**
     * Define o alor da posição no eixo y da caixa
     * @param posY valor da posição y da caixa
     */
    public void setPosY(int posY){
        this.posY = posY;
    }
    /**
     * Obtém o peso da caixa
     * @return retorna o peso da caixa.
     */
    public float getPeso(){
        return peso;
    }
    /**
     * Define o peso da caixa.
     * @param peso valor do peso da caixa.
     */
    public void setPeso(float peso){
        this.peso = peso;
    }
}
