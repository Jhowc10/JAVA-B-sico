/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matharredondamento;

/**
 *
 * @author tatia
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float v = 8.5f;
        int ar = (int) Math.floor(v);   // Arredonda para baixa
        int ci = (int) Math.ceil(v);    // Arredonda para cima
        int no = (int) Math.round(v);   // Arredonda para o mais proximo
        
        System.out.println(ar);
        System.out.println(ci);
        System.out.println(no);
        
        //  ARREDONDAMENTO
        // O numero é um doble, ele vai de o a 1
        double ale = Math.random();
        int n = (int) (10 + ale * (100-10));
        System.out.println(n);
    }
    
}
