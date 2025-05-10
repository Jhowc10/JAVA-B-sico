/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

/**
 *
 * @author tatia
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Jeito 1
        *
        *   int n[] = new int[2];
        *   n[0] = 1;
        *   n[1] = 3;
        *   n[2] = 5;
        */
        
        /* Jeito 2
        *
        *   int[] n = {2, 4, 8};
        */
        
        /* Jeito 3 - Mais usual */
        int n[] = {2, 5, 9, 10, 15, 20, 69};
        
        /* Mostrando um array */
        for(int c = 0; c <= n.length; c++){
            //System.out.print(n[c] + " ");
            
            System.out.println("Na posicao " + c + " temos o valor " + n[c]);
        }
        
        // Para ver todas as propriedades do arrey, colocamos o objeto e o ., logo aparecerá todos os atributos, Ex.: n.
        //System.out.println("Total de casas de n e " + n.length);
    }
    
}
