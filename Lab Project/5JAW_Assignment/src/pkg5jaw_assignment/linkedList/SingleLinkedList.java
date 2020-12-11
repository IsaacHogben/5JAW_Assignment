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
public class SingleLinkedList <T>{
    
    Node<T> head;
    Node<T> tail;
    Node<T> traverse;
    int count = 0;
    
    /**
     *
     * @return
     */
    public Node<T> traverse(){
        if(traverse == tail)
        {
            traverse = head;
            return head;
        }
        else
            return traverse.next;
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
    public void addFirst(Node<T> node)
    {
        //Save off the head node so we dont loose it
        Node<T> temp = head;
        //point head to new node
        head = node;
        //Insert the rest of the list behind the head
        head.next = temp;
        count++;
        //if the list was empty then head and Tail should both point to the new node
        if (count == 1)
        {
            tail = head;
            traverse = tail;
        }
    }
    
    /**
     *
     * @param node
     */
    public void addLast(Node<T> node)
    {
        if (count == 0){ // no nodes
            head = node;
        } 
        else {
            tail.next = node;
        }
        tail = node;
        traverse = tail;
        count++;
    }

    /**
     *
     */
    public void removeFirst(){
        if (count != 0)
        {
            //Before: Head -> 3 -> 5
            //After: Head ->3 ->null
            head = head.next;
            count--;
            if (count == 0){
                tail = null;
            }
        }
    }
    
    /**
     *
     * @param item
     * @return
     */
    public boolean contains(T item){
        Node<T> current = head;
        while(current != null)
        {
            //uses the links to check all values for the search term
            if (current.value.equals(item))
            {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    /**
     *
     */
    public void removeLast(){
        if (count != 0)
        {
            if (count == 1)
            {
                head = null;
                tail = null;
            } 
            else 
            {
                Node<T> current = head;
                while (current.next != tail)
                {
                    current = current.next;
                }
                current.next = null;
                tail = current;
            }
            count--;
        }
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
        for (int i = 0; i < index; i++)
        {
            previous = current;
            current = current.next;
        }
        
        previous.setNext(current.getNext());
        count--;
    }
}