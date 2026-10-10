/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha3;
import java.util.Objects;

/**
 *
 * @author tomas
 */
public class LinkedSingleList implements LinkedList{
    
    private Item head;
    
    private Item tail;
    
    public LinkedSingleList() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void addFirst(Object data) {
        Item item = new Item();
        item.data = data;
        item.next = null;
        if (head == null) {
            head = item;
            tail = item;
        } else {
            item.next = head;
            head = item;
        }
        
    }

    @Override
    public void addLast(Object data) {
        Item item = new Item();
        item.data = data;
        item.next = null;
        if (head == null) {
            head = item;
            tail = item;
        } else {
            tail.next = item;
            tail = item;  
        }
    }

    @Override
    public boolean contains(Object data) {
        Item i = head;
        while (i != null && !Objects.equals(i.data, data)) {
            i = i.next;
        }
        if (i == null)
            return false;
        else 
            return true;
        
        /* ou 
        return i!=null; it's the same thing
        */
    }

    @Override
    public boolean remove(Object data) {
        if (head == null) {                         // situacao 1
            return false;
        } else {
            Item i = head;
            if (Objects.equals(i.data, data)) {
                if (head == tail) {                 // situacao 2
                    head = null;
                    tail = null;
                } else {                            // situacao 3
                    head = head.next;
                }
                return true;
            }
            while (i.next != null && !Objects.equals(i.next.data, data)) {
                i = i.next;
            }
            if (i.next != null) {
                if (i.next == tail) {               // situacao 4
                    tail = i;
                }
                i.next = i.next.next;               // situacao 5
                return true;
            }
        }
        return false;                               // situacao 6
    }

    @Override
    public Object peekFirst() {
       if (isEmpty()) 
           return null;
       return head.data;
    }

    @Override
    public Object peekLast() {
        if (isEmpty())
            return null;
        return tail.data;
    }
    
    @Override
    public int count(Object data) {
        Item aux = head;
        int count = 0;
        while(aux != null) {
            if (aux.data.equals(data))
                count++;
            aux=aux.next;
        }
        return count;
    }
    

    private class Item{
        Object data;
        Item next;
    }
}
