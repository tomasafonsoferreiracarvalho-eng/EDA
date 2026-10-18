/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha3;

/**
 *
 * @author tomas
 */
public class LinkedDupleList implements LinkedList {

    private Item head;

    private Item tail;

    public LinkedDupleList() {
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
        if (isEmpty()) {
            head = item;
            tail = item;
        } else {
            item.next = head;
            head.previous = item;
            head = item;
        }
    }

    @Override
    public void addLast(Object data) {
        Item item = new Item();
        item.data = data;
        item.next = null;
        item.previous = null;
        if (isEmpty()) {
            head = item;
            tail = item;
        } else {
            item.previous = tail;
            tail.next = item;
            tail = item;
        }
    }

    @Override
    public boolean contains(Object data) {
        Item i = head;
        while (i != null && !i.data.equals(data)) {
            i = i.next;
        }
        if (i == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean remove(Object data) {
        if (head == null) {
            return false;
        } else {
            if (data.equals(head.data)) {
                if (head == tail) {
                    head = null;
                    tail = null;
                } else {
                    head = head.next;
                    head.previous = null;
                }
                return true;
            }
            Item i = head.next;
            while (i != null && !data.equals(i.data)) {
                i = i.next;
            }
            if (i == tail) {
                tail = tail.previous;
                tail.next = null;
                return true;
            } else {
                if (i != null) {
                    i.previous.next = i.next;
                    i.next.previous = i.previous;
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    public Object peekFirst() {
        if (isEmpty()) {
            return null;
        } else {
            return head.data;
        }
    }

    @Override
    public Object peekLast() {
        if (isEmpty()) {
            return null;
        } else {
            return tail.data;
        }
    }

    @Override
    public int count(Object data) {
        Item aux = head;
        int count = 0;
        while (aux != null) {
            if (aux.data.equals(data)) {
                count++;
            }
            aux = aux.next;
        }
        return count;
    }

    private class Item {

        Object data;
        Item next;
        Item previous;
    }

    // mostra a lista na consola
    public void show() {
        Item aux = head;
        while (aux != null) {
            System.out.println(aux.data);
            aux = aux.next;
        }
    }

    // mostra todos os elementos da lista ligada dependendo da variavel dir, se for positiva começa da
    // esquerda para a direita e se dir for negativa é da direita para a esquerda
    public void show(int dir) {
        if (dir > 0) {
            Item aux = head;
            while (aux != null) {
                System.out.println(aux.data);
                aux = aux.next;
            }
        } else {
            Item aux = tail;
            while (aux != null) {
                System.out.println(aux.data);
                aux = aux.previous;
            }
        }
    }

    // é tipo o count de size
    public int size() {
        Item inicio = head;
        int c = 0;
        while (inicio != null) {
            c++;
            inicio = inicio.next;
        }
        return c;
    }

    // substitui todas as ocorrências de o1 por o2, o metodo retorna o numero de substituições que efetuou
    public int replaceAll(Object o1, Object o2) {
        int c = 0;
        Item aux = head;
        while (aux != null) {
            if (o1.equals(aux.data)) {
                aux.data = o2;
                c++;
            }
            aux = aux.next;
        }
        return c;
    }

    // insere de forma ordenada   1 2 3 4 5 6 9 o = 7; 1 2 3 4 5 6 7 9 
    public void insertSort(Comparable o) {
        if (isEmpty()) {
            addFirst(o);
            return;
        }
        if (!isEmpty()) {
            if (o.compareTo(peekLast()) >= 0) {
                addLast(o);
                return;
            }
            if (o.compareTo(peekFirst()) < 0) {
                addFirst(o);
                return;
            }
            Item aux = head;
            while (o.compareTo(aux.data) >= 0) {
                aux = aux.next;
            }
            Item novo = new Item();
            novo.data = o;
            novo.previous = aux.previous;
            novo.next = aux;
            aux.previous.next = novo;
            aux.previous = novo;
        }
    }

    // add a seguir a posição i
    public void addNext(int i, Object o) {
        if (!isEmpty()) {
            int count = 0;
            Item aux = head;
            while (count < i && aux.next != null) {
                aux = aux.next;
                count++;
            }
            if (aux == tail) {
                addLast(o);
                return;
            }
            Item novo = new Item();
            novo.data = o;
            novo.previous = aux;
            novo.next = aux.next;
            aux.next.previous = novo;
            aux.next = novo;
        } else {
            addFirst(o);
        }
    }

    // insere a seguir antes do i
    public void addPrevious(int i, Object o) {
        if (!isEmpty()) {
            int count = 0;
            Item aux = head;
            while (count < i && aux.next != null) {
                aux = aux.next;
                count++;
            }
            if (aux == head) {
                addFirst(o);
                return;
            }
            Item novo = new Item();
            novo.data = o;
            novo.previous = aux.previous;
            novo.next = aux;
            aux.previous.next = novo;
            aux.previous = novo;

        } else {
            addFirst(o);
        }
    }

    // remove o último elemento e diz qual é ele, se estiver vazia devolve null
    public Object removeLast() {
        if (isEmpty()) {
            return null;
        }
        Object data = tail.data;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.previous;
            tail.next = null;
        }
        return data;
    }

    // inverte a lista 1 -> 2 -> 7 -> 9 para 9 -> 7 -> 3 -> 1
    public void invertlist() {
        if (isEmpty()) {
            System.out.println("A lista está vazia");
        }
        Item aux = head;
        while (aux != null) {
            Item temp = aux.next; // gaurdar o proximo
            aux.next = aux.previous;
            aux.previous = temp;
            aux = temp;     // avança para o que era o próximo
        }
        Item t = head;   // por fim, troca head e tail
        head = tail;
        tail = t;
    }

    // remover itens duplicados
    public void removeDuplicates() {
        if (isEmpty()) {
            return;
        }
        Item aux = head;
        while (aux != null) {
            Item outro = aux.next;      // guarda ANTES de desligar o nó
            while (outro != null) {
                Item prox = outro.next;
                if (aux.data.equals(outro.data)) {
                    outro.previous.next = prox;      // desligar o nó "outro"
                    if (outro == tail) {
                        tail = outro.previous;
                    } else {
                        prox.previous = outro.previous;
                    }
                }
                outro = prox;
            }
            aux = aux.next;
        }
    }
    
    //remover tudo
    public void removeAll(LinkedDupleList l1) {
        Item aux = head;
        while (aux != null) {
            Item prox = aux.next;
            if (l1.contains(aux.data)) {
                if (aux.previous == null) {    // desligar o nó aux
                    head = prox;
                } else {
                    aux.previous.next = prox;
                }
                if (prox == null) {
                    tail = aux.previous;
                 } else {
                    prox.previous = aux.previous;
                 }
            }
            aux = prox;
        }
    }
}
