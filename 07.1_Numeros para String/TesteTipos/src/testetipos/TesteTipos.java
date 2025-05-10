/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetipos;

/**
 *
 * @author tatia
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int idade = 30;
        
        String valor = Integer.toString(idade);
        System.out.println(valor);
        
        String val = "40";
        int idad = Integer.parseInt(val);
        System.out.println(val);
        
        String v = "50.5";
        float i = Float.parseFloat(v);
        System.out.printf("%.3f \n", i);
    }
}
