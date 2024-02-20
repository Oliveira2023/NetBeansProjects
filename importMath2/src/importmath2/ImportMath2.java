/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package importmath2;
import org.apache.commons.math3.primes.Primes;
/**
 *
 * @author lucia
 */
public class ImportMath2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i= 0; i <100; i++){
            if (Primes.isPrime(i)){
                System.out.println("i = " + i);
            }
        }
    }
    
}
