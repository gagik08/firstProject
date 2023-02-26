package com.collections.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T>{
    final int NEW_ARRAY_CAPACITY = 10;
    int arrayListSize = 0;
    Object[] arrayList;


    public CustomArrayList() {
        arrayList = new Object[NEW_ARRAY_CAPACITY];
    }

    public CustomArrayList(int arrayListSize) {
        arrayList = new Object[arrayListSize];
    }

    @Override
    public int size() {
        int count = 0;
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] != null) count++;
        }
        return count;
    }

    @Override
    public void add(T newElement) {
        if (arrayListSize+1 < arrayList.length){
            arrayList[arrayListSize++] = newElement;
        }
        else {
            this.arrayList = Arrays.copyOf(arrayList, (int) (arrayList.length * 1.5));
            arrayList[arrayListSize++] = newElement;
        }
    }

    @Override
    public void add(int index, T newElement) {
            while((index+1) > this.arrayList.length){
                this.arrayList = Arrays.copyOf(this.arrayList, (int) (arrayList.length * 1.5));
            }
            this.arrayList[index] = newElement;
            arrayListSize++;
    }

    @Override
    public T get(int index) {
        T ans = null;
        if(index+1 < arrayList.length){
            ans = (T) arrayList[index];
        }
        return ans;
    }

    @Override
    public boolean cointains(T checkedElement) {
        for (Object checkElement : arrayList) {
            if (checkElement != null && checkElement.equals(checkedElement)) return true;
        }
        return false;
    }

    @Override
    public void clear() {
        arrayList = new Object[0];
    }

    @Override
    public boolean remove(int index) {
        if (index+1 < arrayList.length) {
            for (int i = index; i < arrayList.length - 1; i++) {
                arrayList[i] = arrayList[i + 1];
            }
            return true;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public String toString() {
        return Arrays.toString(arrayList);
    }
}
