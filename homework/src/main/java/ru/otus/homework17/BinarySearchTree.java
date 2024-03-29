package ru.otus.homework17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTree<T> implements SearchTree<T> {
    Node<T> root;

    BinarySearchTree() {
        root = null;
    }

    Node<T> insert(Node<T> node, T key) {
        // If the tree is empty, return a new node
        if (node == null) {
            node = new Node<>(key);
            return node;
        }
        // Otherwise, recur down the tree
        if (key.toString().compareTo(node.key.toString()) < 0)
            node.left = insert(node.left, key);
        else if (key.toString().compareTo(node.key.toString()) > 0)
            node.right = insert(node.right, key);

        // Return the (unchanged) node pointer
        return node;
    }


    @Override
    public T find(Node<T> root, T key) {
        if (root == null || (root.key.equals(key)))
            return key;

        // Key is greater than root's key
        if (key.toString().compareTo(root.key.toString()) > 0)
            return find(root.right, key);

        // Key is smaller than root's key
        return find(root.left, key);
    }


    public List<T> getSortedList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add((int) (Math.random() * 31));
        }
        Collections.sort(list);
        return (List<T>) list;
    }

    public static void run() {
        /*
            5
         2     8
        1 3   6 9
        0 4   7 10
         */
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        List<Integer> list = tree.getSortedList();
        System.out.println(list);
        tree.root = tree.insert(tree.root, (int) list.get(5));
        tree.insert(tree.root, (int) list.get(2));
        tree.insert(tree.root, (int) list.get(8));
        tree.insert(tree.root, (int) list.get(1));
        tree.insert(tree.root, (int) list.get(0));
        tree.insert(tree.root, (int) list.get(3));
        tree.insert(tree.root, (int) list.get(4));
        tree.insert(tree.root, (int) list.get(6));
        tree.insert(tree.root, (int) list.get(7));
        tree.insert(tree.root, (int) list.get(9));
        tree.insert(tree.root, (int) list.get(10));
        int key = 10;
        if (tree.find(tree.root, 10) == null)
            System.out.println(key + " не найдено");
        else
            System.out.println(key + " найдено");
    }
}
