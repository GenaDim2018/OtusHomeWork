package ru.otus.homework17;

import java.util.List;

public interface SearchTree<T> {

    public T find(Node<T> node, T key);

    List<T> getSortedList();
}