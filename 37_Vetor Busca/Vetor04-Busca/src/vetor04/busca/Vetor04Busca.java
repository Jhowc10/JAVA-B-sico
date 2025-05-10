/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04.busca;

// Precisa desta biblioteca para funcionar
import java.util.Arrays;

/**
 *
 * @author tatia
 */
public class Vetor04Busca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        
        for(int v: vet){
            System.out.print(v + " ");
        }
        
        System.out.println(" ");
        // Busca em vetor
        int p = Arrays.binarySearch(vet, 1);
        System.out.println("Encontrei o valor na posicao " + p);
    }
    
}
