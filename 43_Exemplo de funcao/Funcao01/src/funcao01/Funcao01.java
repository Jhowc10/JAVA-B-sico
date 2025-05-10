package funcao01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author tatia
 */
public class Funcao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Chamando a classe fatorial, crianmos o objeto para chama-la
        
        Fatorial f = new Fatorial();
        
        f.setValor(5);
        
        System.out.print(f.getFormula());
        System.out.println(f.getFatorial());
        
        
    }
    
}
