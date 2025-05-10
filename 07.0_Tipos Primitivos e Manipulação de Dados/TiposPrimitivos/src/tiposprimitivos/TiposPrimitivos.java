/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author tatia
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome: ");
        String nome = teclado.nextLine();
        
        System.out.print("Digite a nota: ");
        float nota = teclado.nextFloat();
        
        System.out.print ("A nota e " + nota);   
        
        System.out.println(" A Nota e " + nota);
        
        System.out.printf("A nota de %s e %.4f \n", nome,  nota);
        
        System.out.format("Sua nota e %.1f \n", nota);
    }
}
