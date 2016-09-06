package Grocery;

import java.util.Arrays;

/**
 * Created by 3299779 on 25/08/2016.
 */
public class GroceryList<E> {

    private static final int SIZE = 10;
    private Object elementData[]={};
    private int size = 0;

    public GroceryList() {

        elementData = new Object[SIZE];
    }

    public void add(E e) {
        if (size == elementData.length) {
            expand();
        }
            elementData[size++] = e;
    }

    private void expand() {
        int newSize = elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newSize);
    }

    public void print() {
        System.out.println("GroceryList contains: ");
        for(int i = 0; i < size; i++){
            System.out.println(elementData[i]+" ");
        }
    }
}
