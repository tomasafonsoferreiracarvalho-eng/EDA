package ficha3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tomas
 */
public interface LinkedList {
    public boolean isEmpty();
    // verifica se está vazio
    
    void addFirst(Object data);
    // adiciona ao ínicio
    
    void addLast(Object data);
    // adiciona ao fim
    
    public boolean contains(Object data);
    // se contem um objecto
    
    public boolean remove(Object data);
    // remove um objeto 
    
    public Object peekFirst();
    // devolve o primeiro objeto da lista
    
    public Object peekLast();
    // devolve o último objeto da lista
    
    public int count(Object data);
}
