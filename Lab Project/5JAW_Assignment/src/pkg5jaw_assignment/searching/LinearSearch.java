/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg5jaw_assignment.searching;

/**
 *
 * @author Isaac
 */
public class LinearSearch {

    /**
     *
     * @param list
     * @param find
     * @param startingIndex
     * @return
     */
    public static int search(Object[] list, Object find, int startingIndex){
        int index = -1;
        
        if (startingIndex > list.length - 1)
            throw new ArrayIndexOutOfBoundsException();
        
        for (int i = startingIndex; i < list.length; i++){
            if (list[i].equals(find)){
                index = i;
                break;
            }
        }
        
        return index;
    }
    
    /**
     *
     * @param list
     * @param find
     * @return
     */
    public static int search(Object[] list, Object find){
        return search(list,find,0);
    }
}
