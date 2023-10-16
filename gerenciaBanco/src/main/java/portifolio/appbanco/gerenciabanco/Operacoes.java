/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portifolio.appbanco.gerenciabanco;

/**
 * Classe que executa as operações basicas do caixa eletrônico.
 * @author lucia
 */
public class Operacoes {
    
    private float saldo;
    
    public float getSaldo(){
        return saldo;
    }
    /**
     * Método que executa o saque
     * @param valor - valor definido pelo cliente para o saque
     * @return retorna o valor do saldo atual após o saque, se possível.
     */
    public float saque(float valor){
        if (valor <= this.saldo){
            saldo -= valor;
            return this.saldo;
        }else{
            throw new IllegalArgumentException("saldo insuficiente");
        }
    }
    /**
     * Método que efetua depositos.
     * @param valor - valor definido para depósito.
     * @return retorna o valor do saldo após o incremento do depósito.
     */
    public float deposito(float valor){
        this.saldo += valor;
        return this.saldo;
    }
    /**
     * Metodo que consulta o saldo
     * @return retorna o valor do saldo do cliente.
     */
    public float consultaSaldo(){
        return this.saldo;
    }

}
