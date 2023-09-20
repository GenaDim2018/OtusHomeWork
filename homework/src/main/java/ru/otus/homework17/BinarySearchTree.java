package ru.otus.homework17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    Node insert(Node node, int key) {
        // If the tree is empty, return a new node
        if (node == null) {
            node = new Node(key);
            return node;
        }
        // Otherwise, recur down the tree
        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);

        // Return the (unchanged) node pointer
        return node;
    }


    public Node find(Node root, int key) {
        if (root == null || (root.key == key))
            return root;

        // Key is greater than root's key
        if (root.key < key)
            return find(root.right, key);

        // Key is smaller than root's key
        return find(root.left, key);
    }


    public List getSortedList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add((int) (Math.random() * 31));
        }
        Collections.sort(list);
        return list;
    }

    public static void run() {
        /*
            5
         2     8
        1 3   6 9
        0 4   7 10
         */
        BinarySearchTree tree = new BinarySearchTree();
        List list = tree.getSortedList();
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
