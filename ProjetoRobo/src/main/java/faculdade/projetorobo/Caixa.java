/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade.projetorobo;

/**
 *Classe que modela a entidade Caixa
 * @author lucia
 */
public class Caixa extends CaixaIdeia {
    
    public String nomeItem;
    public int qtdItem;
    /**
     * Contrutor da caixa
     * @param nomeItem nome do item que está na caixa;
     * @param qtdItem quantidade de itens que está na caixa.
     * @param posX posição x da caixa.
     * @param posY posição y da caixa.
     * @param peso peso da caixa.
     * @param comprimento comprimento da caixa
     * @param largura largura da caixa.
     * @param altura altura da caixa
     */
    public Caixa(String nomeItem, int qtdItem, int posX, int posY, float peso, 
            float comprimento, float largura, float altura){
        super(posX, posY, peso, comprimento, largura, altura);
        this.nomeItem = nomeItem;
        this.qtdItem = qtdItem;
    }
    /**
     * Metodo que imprime o estado do objeto.
     * @return  retorna uma string que representa o estado do objeto.
     */
    @Override
    public String toString(){
        return "Caixa{nomeItem= " + nomeItem + ",qtdItem= " + qtdItem + "}";
    }
}
