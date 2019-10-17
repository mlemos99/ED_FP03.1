/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

/**
 *
 * @author Utilizador
 */
public class ED_FP_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayStack<Integer> nova = new ArrayStack<>();
        nova.push(10);
        nova.push(11);
        nova.push(14);
        nova.push(20);
        System.out.println(nova.toString());
        System.out.println("-------------------------");
        //nova.pop();
        System.out.println(nova.toString());
    }

}
