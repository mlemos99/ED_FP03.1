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
public class LinearNode<T> {
    private LinearNode next; // referencia para o proximo elemento da lista
    private T elemento; // elemento a adicionar

    public LinearNode() {
        this.next=null;
        this.elemento=null;
    }

    
    
    public LinearNode(T elemento) {
        this.next=null;
        this.elemento = elemento;
    }

    public LinearNode getNext() {
        return next;
    }

    public void setNext(LinearNode next) {
        this.next = next;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    
    
}
