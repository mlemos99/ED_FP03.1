/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio234;

/**
 *
 * @author Utilizador
 */
public class Ex234 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      LinkedStack<Integer> lista = new LinkedStack<>();
      lista.push(10);
      lista.push(11);
      lista.push(12);
      lista.push(13);
        System.out.println(lista.toString());
        System.out.println("------------");    
        System.out.println(lista.peek());
            
            
            
    }
    
}
