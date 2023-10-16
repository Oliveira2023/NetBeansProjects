/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppCmdMath;

import java.util.Locale;
/**
 *
 * @author lucia
 */
public class testeRunArgs {

    public static void main(String[] args) {
        Locale.setDefault(new Locale.Builder().setLanguage("en").setRegion("US").build());
        float resp = 0;
        float list[] = {2,3,5,2};
        for (float numero:list){
         resp += numero;   
        }
        System.out.println("A soma dos numeros é: " + resp);
            
        
    }
}
    

