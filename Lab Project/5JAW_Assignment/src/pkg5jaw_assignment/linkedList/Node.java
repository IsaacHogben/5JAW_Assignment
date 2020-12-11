/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg5jaw_assignment.linkedList;

/**
 *
 * @author Isaac
 * @param <T>
 */
public class Node<T> {

    /**
     *
     */
    public T value;

    /**
     *
     */
    public Node next;

    /**
     *
     */
    public Node previous;
    
    /**
     *
     * @param value
     */
    public Node(T value){
        this.value = value;
    }

    /**
     *
     * @return
     */
    public T getValue() {
        return value;
    }

    /**
     *
     * @param value
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     *
     * @return
     */
    public Node getNext() {
        return next;
    }

    /**
     *
     * @param next
     */
    public void setNext(Node next) {
        this.next = next;
    }
    
    /**
     *
     * @return
     */
    public Node getPrevious() {
        return previous;
    }

    /**
     *
     * @param previous
     */
    public void setPrevious(Node previous) {
        this.previous = previous;
    }
    
}
