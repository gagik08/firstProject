package com.collections.linkedList;

import java.util.NoSuchElementException;

public class CustomLinkedList<T> implements CustomLinkList {
    private Node head;
    private int size;

    private class Node {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public CustomLinkedList() {
        this.head = null;
        this.size = 0;

    }

    @Override
    public void add(Object element) {
        if(head == null){
            head = new Node((T) element);
        }
        else{
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = new Node((T) element);
        }
        size++;
    }

    @Override
    public void addFirst(Object elem) {
        Node newHead = new Node((T) elem);
        newHead.next = head;
        head = newHead;
        size++;
    }

    @Override
    public void addLast(Object elem) {
        add(elem);
    }

    @Override
    public void remove(int index) {
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = head.next;
        }
        else{
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }



    @Override
    public void removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        head = head.next;
        size--;
    }

    @Override
    public void removeLast() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }

    @Override
    public Object getFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        return head.data;
    }

    @Override
    public T getLast() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node current = head;
        while (current.next != null) {
            sb.append(current.data.toString());
            sb.append(", ");
            current = current.next;
        }
        sb.append(current.data.toString());
        sb.append("]");
        return sb.toString();
    }
}
