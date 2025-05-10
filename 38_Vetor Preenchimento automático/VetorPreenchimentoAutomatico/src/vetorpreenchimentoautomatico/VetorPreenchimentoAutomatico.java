/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetorpreenchimentoautomatico;

import java.util.Arrays;

/**
 *
 * @author tatia
 */
public class VetorPreenchimentoAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v[] = new int[20];
        
        // Arrays.fill(); serve para preenchet o array sozinho
        
        Arrays.fill(v, 0);
        
        for(int valor: v){
            System.out.print(valor + " ");
        }
    }
    
}
