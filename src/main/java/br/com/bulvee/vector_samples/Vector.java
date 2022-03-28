package br.com.bulvee.vector_samples;

import java.util.Arrays;

public class Vector<T> {

    private T[] objects = (T[]) new Object[1000];
    private int totalObjects = 0;


    public int add(T obj) {
        this.keepSizeForArray();
        objects[totalObjects] = obj;

        return totalObjects++;
    }

    public int size(){
        return totalObjects;
    }

    public boolean contains(Object object) {
        if (object == null) throw new IllegalArgumentException();
        for (int i = 0; i < totalObjects; i++) {
            if (object.equals(objects[i])) {
                return true;
            }
        }
        return false;
    }

    public T get(int index){
        if(!isExistingPosition(index)){
            throw new IllegalArgumentException("Invalid vector position");
        }
       return objects[index];
    }

    private boolean isExistingPosition(int index){
        return index >=0 && index < totalObjects;
    }

    private boolean isValidIndexForAddBetween(int index){
        return index >=0 && index <= totalObjects;
    }

    private void keepSizeForArray() {
        if (totalObjects == objects.length) {
            T[] newArrayOfObjects = (T[]) new Object[totalObjects * 2];
            for (int i = 0; i < objects.length; i++) {
                newArrayOfObjects[i] = objects[i];
            }
            this.objects = newArrayOfObjects;
        }
    }

    public void add(int index, T object) {
        this.keepSizeForArray();
        if (!isValidIndexForAddBetween(index)) {
            throw new IllegalArgumentException("Invalid index.");
        }

        for(int i = totalObjects -1; i >= index; i-=1){
            objects[i+ 1] = objects[i];
        }
        objects[index]  = object;
        totalObjects ++;
    }

    public void remove(int index){
        for(int i = index; i < totalObjects; i++){
            objects[i] = objects[i+1];
        }
     totalObjects --;
     this.objects[totalObjects] = null;
    }

    @Override
    public String toString() {
        return Arrays.toString(objects);
    }
}
