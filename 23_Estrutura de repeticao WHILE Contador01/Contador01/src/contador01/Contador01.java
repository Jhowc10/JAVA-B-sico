/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador01;

/**
 *
 * @author tatia
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Para saber o numero de cambalhotas (que é o indice) imprimimos a variavel "cc", ela é o contador
        // Ao fazer (cc + 1) estamos fazendo o indice começar do 1 ao invés do 0, caso contrário seria só System.out.println("Dando cambalhota... " + cc);
        
        int cc = 0;
        
        while(cc < 20){
            System.out.println("Dando cambalhota... " + (cc + 1));
            cc++;
        }
    }
}
