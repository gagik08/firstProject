package com.collections.arraylist;

public interface CustomList<T>{
    void add(T element);
    void add(int index,T i);
    T get(int index);
    boolean cointains(T checkedElement);
    void clear();
    boolean remove(int index);
    int size();
}
