/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetorforit;

import java.util.Arrays;

/**
 *
 * @author tatia
 */
public class VetorForIt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double v[] = {3.5, 2.75, 9, -4.6};
        
        for(double valor: v){
            System.out.println(valor + " ");
        }
        
        System.out.println(" ");
        
        // Colocando um VETOR em ordem
        // A classe Arrays.sort(); já faz isso
        for(double valor: v){
            Arrays.sort(v);
            System.out.println(valor + " ");
        }
    }
    
    
    
}
