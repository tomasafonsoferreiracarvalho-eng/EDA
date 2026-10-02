package ficha2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tomas
 */
public class LimitedStack implements Stack{
    
    private Object array[];
    private int top;
    
    public LimitedStack (int maxSize) {
        array = new Object[maxSize];
        top = -1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public void push(Object item) {
        try {
            top ++;
            array[top] = item;
        } catch (ArrayIndexOutOfBoundsException e) {
            top --;
            throw new StackFullException();
        }
    }

    @Override
    public Object pop() {
        if (isEmpty())
            return null;
        else 
            return array[top--];
    }

    @Override
    public Object peek() {
    if (isEmpty())
            return null;
        else 
            return array[top];
    }
}
