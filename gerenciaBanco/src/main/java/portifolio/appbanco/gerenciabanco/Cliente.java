/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package portifolio.appbanco.gerenciabanco;

/**
 * Classe que modela o cadastro do cliente
 * @author lucia
 */
public class Cliente {
/**
 * Declaração das variáveis do cliente.
 */
    private String nome;
    private String sobrenome;
    private String cpf;
    
/**
 * Metodos gets e sets das variavéis privadas.
 * @return 
 */
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
