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
public class ArrayStack<T> implements StackADT<T>  {

    private final int DEFAULT_CAPACITY = 100;
    
    private int top;
    private T[] stack;

    public ArrayStack() {
        this.top = 0;
        this.stack = (T[])(new Object[DEFAULT_CAPACITY]);
    }
    
      public ArrayStack(int initialCapacity) {
        this.top = 0;
        this.stack = (T[])(new Object[initialCapacity]);
    }
    
    

    @Override
    public void push(T element) {
        if(size()==stack.length){
            expandCapacity();
            
        }
        stack[top]=element;
        top++;
        
    }

    @Override
    public T pop() throws EmptyCollectionException {
       if(isEmpty()){
           throw new EmptyCollectionException("Stack");
       }
           top--;
           T result =stack[top];
           stack[top]=null;
           return result;
       
    }

    @Override
    public T peek() throws EmptyCollectionException {
        if(isEmpty()){
            throw new EmptyCollectionException("Stack");
        }
        return stack[top-1];
    }

    @Override
    public boolean isEmpty() {
        return (top==0);
    }

    @Override
    public int size() {
        return top;
    }

    private void expandCapacity() {
        T[] stack_aux = (T[])(new Object[this.size() + DEFAULT_CAPACITY]);
        int i=0;
        while(i!=size()){
            stack_aux[i]=stack[i];
            i++;
        }
        stack=stack_aux;
    }
    
    
    

    @Override
    public String toString() {
        int i=top-1;   
        String str="[\n";
        while(i>=0){
            str=str+stack[i]+"\n";
            i--;
        }
        return str+"]";
    }

  
    

}
