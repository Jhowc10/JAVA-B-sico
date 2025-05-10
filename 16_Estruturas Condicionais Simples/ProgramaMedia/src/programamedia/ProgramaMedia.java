/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author tatia
 */
public class ProgramaMedia {

    public static void main(String[] args) {
        
        // Monitora e pega o que o usuário digita
        // System.in é a entrada do sistema
        Scanner teclado = new Scanner(System.in);  
        
        System.out.print("Digite a primeira nota: \n");
        float n1 = teclado.nextFloat();
        
        System.out.print("Digite a segunda nota: \n");
        float n2 = teclado.nextFloat();
        float m  = (n1 + n2) / 2;
        
        System.out.println("Sua média foi " + m);
        
        if(m > 9){
            System.out.println("Parabéns");
        }
    }
}
