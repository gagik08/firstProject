package com.collections.linkedList;

public interface CustomLinkList<T>{
    void add(T element);
    void addFirst(T elem);
    void addLast(T elem);
    void remove(int index);
    void removeFirst();
    void removeLast();
    T getFirst();
    T getLast();
    int size();
}
