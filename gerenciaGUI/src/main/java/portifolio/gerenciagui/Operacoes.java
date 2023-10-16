/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portifolio.gerenciagui;

/**
 *
 * @author lucia
 */
public class Operacoes {
    
    private float saldo;
    
    public float getSaldo(){
        return saldo;
    }
    public float saque(float valor){
        if (valor <= this.saldo){
            saldo -= valor;
            return this.saldo;
        }else{
            throw new IllegalArgumentException("saldo insuficiente");
        }
    }
    public float deposito(float valor){
        this.saldo += valor;
        return this.saldo;
    }
    public float consultaSaldo(){
        return this.saldo;
    }
    private void Alert(String saldo_insuficiente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
