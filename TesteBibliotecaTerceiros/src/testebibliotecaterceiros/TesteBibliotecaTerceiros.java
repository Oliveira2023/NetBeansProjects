/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testebibliotecaterceiros;

/**
 *
 * @author lucia
 */
import org.apache.commons.math3.primes.Primes;
public class TesteBibliotecaTerceiros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            if (Primes.isPrime(i)){
                System.out.println("i = " + i);
            }
        }
    }
    
}

