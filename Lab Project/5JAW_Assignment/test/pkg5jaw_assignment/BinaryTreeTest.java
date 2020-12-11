/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg5jaw_assignment;

import org.junit.*;
import static org.junit.Assert.*;
import pkg5jaw_assignment.binaryTree.BinaryTree;
/**
 *
 * @author Isaac
 */
public class BinaryTreeTest {
    BinaryTree bt;
    
    @Before
    public void init(){
        bt = new BinaryTree();
        
        bt.add(1);
        bt.add(4);
        bt.add(7);
        bt.add(10);
        bt.add(3);
        bt.add(5);
        bt.add(9);
    }
    
    @Test
    public void findNode(){
        assertTrue(bt.findNode(7) != null);
    }
    
    @Test
    public void addNode(){
        bt.add(2);
        assertTrue(bt.findNode(2) != null);
    }
    
    @Test
    public void deleteNode(){
        bt.delete(10);
        assertTrue(bt.findNode(10) == null);
    }
    
    @Test
    public void traversePreOrder(){
        System.out.println("traversePreOrderl: expecting 1 4 3 7 5 10 9");
        bt.traversePreOrder(bt.getRoot());
        System.out.println();
    }
    
    @Test
    public void traverseInOrder(){
        System.out.println("traverseInOrder: expecting 1 3 4 5 7 9 10");
        bt.traverseInOrder(bt.getRoot());
        System.out.println();
    }
    
    @Test
    public void traversePostOrder(){
        System.out.println("traversePostOrder: expecting 6 5 9 10 7 4 1");
        bt.traversePostOrder(bt.getRoot());
        System.out.println();
    }
}
