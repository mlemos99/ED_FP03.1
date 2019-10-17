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
public interface StackADT<T> {
    /**
     * Adiciona um elemento ao topo da stack.
     * @param element element que vai ser adicionado na stack
     */
    public void push(T element);
    
    /**
     * 
     * @return 
     */
    public T pop();
    
    public T peek();
    
    public boolean isEmpty();
    
    public int size();

    @Override
    public String toString();
    
    
    
}
