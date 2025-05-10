/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author tatia
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);  // Lê o teclado
        
        String tipo;
        
        System.out.println("Quantas pernas?");
        int perna = teclado.nextInt();
        
        System.out.print("Isso e um(a) ");
        
        switch(perna){
            case 1:
                tipo = "Saci";
                break;
                
            case 2:
                tipo = "Bipede";
                break;
                
            case 3:
                tipo = "Tripe";
                break;
                
            case 4:
                tipo = "Quadrupede";
                break;
                
            case 6:
                tipo = "Aranha";
                break;
                
            default:
                tipo = "ET";
                break;
        }
        
        System.out.println(tipo);
    }
}
