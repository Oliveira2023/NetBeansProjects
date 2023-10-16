/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package portifolio.gerenciagui;

/**
 *
 * @author lucia
 */
public class Cliente {
    
    private String nome;
    private String sobrenome;
    private String cpf;
    
    
    /*public GerenciaBanco(String nome,String sobrenome,String cpf, float saldoInicial){;;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.saldo = saldoInicial;
    }*/
    
    public String getNome(){
        return nome;
    }
    public String setName(String nome){
        this.nome = nome;
        return this.nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public String setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
        return this.sobrenome;
    }
    public String getCPF(){
        return cpf;
    }
    public String setCPF(String cpf){
       this.cpf = cpf;
       return this.cpf;
    }
    
}
