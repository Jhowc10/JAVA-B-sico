/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaofor;

/**
 *
 * @author tatia
 */
public class RepeticaoFOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int cc = 0; cc <= 3; cc++){
            System.out.println("Cambalhota");
        }
    
    
        // A estrutura for é a mesma do While
        // Veja o mesmo codigo, mas feito no while
    
        /**
        *   int cc = 0;
        *
        *   while(cc < 4){
        *       System.out.println("Cambalhota");
        *       cc++;
        *   }
        */
        
        System.out.println("");
    
    
        // Usando o FOR para exibir a contagem, no caso de arrays, contará os indices
            for(int cc = 0; cc <= 3; cc++){
                System.out.println(cc);
            }
        
            System.out.println("");
        
        // Pulando de dois em dois
        for(int cc = 5; cc <= 20; cc += 2){
            System.out.println(cc);
        }
    
        System.out.println("");
    
        // Exibindo em ordem decrescente
        for(int cc = 20; cc >= 5; cc -= 2){
            System.out.println(cc);
        }
    }
}
