/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao;

/**
 *
 * @author tatia
 */
public class TesteFuncao {
    
    // Criando um METODO
    static void soma(int a, int b){
        int s = a + b;
        
        System.out.println("A soma e " + s);
    }
    
    
    public static void main(String[] args) {
        /*Chamando o metodo
        *
        *   Sempre chamamos dentro do "MAIN", pois ele é a classe principal do JAVA
        *
        *
        *   Ao chamar irá da erro, porque o metodo "STATIC", método stático serve para clase e não para instancia, por isso o erro
        *   Não se chama um procedimento dentro do stático sem ele ser estático também 
        *   Para isso, tornamos o nosso método "STATIC" também, basta ir lá no metodo e colocar na frente do "VOID" O "STATIC"
        *
        *   Porem ao transforma-lo em static, ele se torna funcional apenas dentro da classe, ou seja, não faz parte de um instanciamento de um objeto
        */
        System.out.println("Comecou o programa");
        soma(5, 2);
    }
    
}
