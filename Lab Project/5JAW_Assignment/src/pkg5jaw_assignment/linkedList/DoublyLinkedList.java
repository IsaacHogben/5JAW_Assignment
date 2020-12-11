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
public class DoublyLinkedList<T> {
    
    Node<T> head;
    Node<T> tail;
    Node<T> traverse;
    int count = 0;
    
    /**
     *
     * @return
     */
    public int getCount() {
        return this.count;
    }

    /**
     *
     * @return
     */
    public Node<T> getHead() {
        return head;
    }

    /**
     *
     * @param head
     */
    public void setHead(Node<T> head) {
        this.head = head;
    }

    /**
     *
     * @return
     */
    public Node<T> getTail() {
        return tail;
    }

    /**
     *
     * @param tail
     */
    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    /**
     *
     * @param node
     */
    public void addFirst(Node<T> node) {
        Node<T> temp = head;
        head = node;
        head.next = temp;
        if (count == 0) 
        {
            //if the list is empty, the head and tail should both point to the new node
            tail = head;
            traverse = tail;
        } 
        else 
        {           
            temp.previous = head;
        }
        count++;
    }

    /**
     *
     * @param node
     */
    public void addLast(Node<T> node) {
        if (count == 0) //no nodes
        {
            head = node; //if count = 0 then node = head
        } 
        else 
        {
            tail.next = node;
            node.previous = tail;
        }
        tail = node;
        traverse = tail;
        traverse.next = head;
        count++;
    }

    /**
     *
     */
    public void removeFirst() {
        //check for empty list
        if (count != 0){
            head = head.next;
            count--;
            
            if (count == 0){
                tail = null;
            } 
            else 
            {
                head.previous = null;
            }
        }
    }

    /**
     *
     */
    public void removeLast() {
        if (count != 0){
            if (count == 1){
                head = null;
                tail = null;
            } else {
                tail.previous.next = null;
                tail = tail.previous;
            }
            count--;
        }
    }

    /**
     *
     * @param item
     * @return
     */
    public boolean contains(T item) {
        Node<T> current = head;
        while (current != null){
            if (current.value.equals(item)){
                return true;
            }
            current = current.next;
        }
        return false;
    } 

    /**
     *
     * @param node
     * @param index
     */
    public void addAtPos(Node<T> node, int index)
    {
        //if the index is 0 or less use addFirst
        if(index <= 0 )
        {
            addFirst(node);
            return;
        }
        //if the index is higher that the current count use addLast
        else if(index > count + 1 || index == count +1)
        {
            addLast(node);
            return;
        }
        //add the node as the next of the previous and adds the node already at that index as its next node.
        Node current = this.getHead();
        Node previous = this.getHead();
        for (int i = 0; i < index; i++)
        {
            previous = current;
            current = current.next;
        }
        
        previous.setNext(node);
        current.setPrevious(node);
        node.setNext(current);
    }
    
    /**
     *
     * @param index
     */
    public void removeAtPos(int index)
    {
        //if the index is 0 or less use removeFirst
        if(index <= 0 )
        {
            removeFirst();
            return;
        }
        //if the index is higher that the current count use removeLast
        else if(index >= count)
        {
            removeLast();
            return;
        }
        //removes the node from the chain
        Node current = this.getHead();
        Node previous = this.getHead();
        Node next = this.getHead();
        for (int i = 0; i < index; i++)
        {
            current = current.next;           
        }
        
        current.previous.next = current.next;
        current.next.previous = current.previous;
        //adjust count
        count--;
    }

    /**
     *
     * @return
     */
    public Node<T> traverseForward(){
        //loops the traverse
        if(traverse == tail)
        {
            traverse = head;
            return head;
        }
        else
        {
            traverse = traverse.next;
            return traverse;
        }
    }

    /**
     *
     * @return
     */
    public Node<T> traverseBack(){
        //loops the traverse
        if(traverse == head)
        {
            traverse = tail;
            return tail;
        }
        else
        {
            traverse = traverse.previous;
            return traverse;
        }
           
    }
}
