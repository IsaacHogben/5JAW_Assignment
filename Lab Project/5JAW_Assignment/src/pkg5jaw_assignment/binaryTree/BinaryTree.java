/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg5jaw_assignment.binaryTree;

/**
 *
 * @author Isaac
 */
public class BinaryTree {
    private Node root;

    /**
     *
     * @return
     */
    public Node getRoot() {
        return root;
    }
    
    /**
     *
     * @param value
     */
    public void add(int value){
        this.root = addRecursive(this.root, value);
    }
    
    /**
     * 
     * @param current
     * @param value
     * @return 
     */
    private Node addRecursive(Node current, int value){ 
        //if current node is null, we are at the spot we want, add new node
        if (current == null)
            return new Node(value);
        
        //traverse down the tree, left if the value is less then our current
        //position, and right if it's greater.
        if (value < current.getValue())
            current.setLeft(addRecursive(current.getLeft(), value));
        else if (value >= current.getValue())
            current.setRight(addRecursive(current.getRight(), value));
        
        return current;
    }
    
    /**
     * 
     * @param current
     * @param value
     * @return 
     */
    private Node deleteRecursive(Node current, int value) {
        //if current is null, value doesnt exist, return null
        if (current == null) {
            return null;
        }

        if (value == current.getValue()) {
            //if node has no children, delete node
            if (current.getLeft() == null && current.getRight() == null) {
                return null;
            }
            //if node has no right child, promote left child
            if (current.getRight() == null) {
                return current.getLeft();
            }
            //if node has right child but no left child, promote right child
            if (current.getLeft() == null) {
                return current.getRight();
            }

            //removed right child has left child, find right's left-most child and promote
            int smallestValue = findLeftMostValue(current.getRight());
            current.setValue(smallestValue);
            current.setRight(deleteRecursive(current.getRight(), smallestValue));
            return current;
        }
        
        //traverse through list to find value
        if (value < current.getValue()) {
            current.setLeft(deleteRecursive(current.getLeft(), value));
            return current;
        } else {
            current.setRight(deleteRecursive(current.getRight(), value));
            return current;
        }
    }
    
    /**
     * 
     * @param node
     * @return 
     */
    private int findLeftMostValue(Node node) {
        int result = 0;
        if (node.getLeft() == null){
            result = node.getValue();
        } else {
            findLeftMostValue(node.getLeft());
        }
        return result;
    }
    
    /**
     *
     * @param value
     */
    public void delete(int value) {
        this.root = deleteRecursive(this.root, value);
    }

    /**
     *
     * @param node
     */
    public void traversePreOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.getValue());
        traversePreOrder(node.getLeft());
        traversePreOrder(node.getRight());
        
    }

    /**
     *
     * @param node
     */
    public void traverseInOrder(Node node) {
        if (node == null) {
            return;
        }
        traverseInOrder(node.getLeft());
        System.out.println(node.getValue());
        traverseInOrder(node.getRight());
    }
    
    /**
     *
     * @param node
     */
    public void traversePostOrder(Node node) {
        if (node == null) {
            return;
        }
        traversePostOrder(node.getLeft());
        traversePostOrder(node.getRight());
        System.out.println(node.getValue());
        
    }

    /**
     * 
     * @param current
     * @param value
     * @return 
     */
    private Node findNodeRecursive(Node current, int value) {
        //if node at expected position is null, there is no value, return null
        if (current == null) {
            return null;
        }
        //if value is equal to current node's value, node has been found.
        if (value == current.getValue()) {
            return current;
        }
        
        //Traverse down tree, left if value is smaller, right if value is larger.
        if (value < current.getValue()){
            return findNodeRecursive(current.getLeft(), value);
        } else {
            return findNodeRecursive(current.getRight(), value);
        }
    }
    
    /**
     *
     * @param value
     * @return
     */
    public Node findNode(int value) {
        return findNodeRecursive(this.root, value);
    }
}
