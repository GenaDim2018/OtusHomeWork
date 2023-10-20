package ru.otus.homework17;

public class Node<T> {
    T key;
    Node<T> left, right;

    public Node(T key) {
        this.key = key;
        left = right = null;
    }
}
