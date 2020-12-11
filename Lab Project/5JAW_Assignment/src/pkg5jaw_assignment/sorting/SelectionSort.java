/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg5jaw_assignment.sorting;

/**
 *
 * @author Isaac
 */
public class SelectionSort {
    
    /**
     *
     * @param list
     */
    public static void sort(Comparable[] list){
        
        for (int i = 0; i < list.length - 1; i++){
            // Set last sorted index
            int lastSorted = i;
            // Loop through list from last sorted index to find next smallest number
            for (int j = i+1; j < list.length; j++){
                if (list[j].compareTo(list[lastSorted]) < 0)
                    lastSorted = j;
            }
            
            // Swap the values found in those indexes
            Comparable temp = list[lastSorted];
            list[lastSorted] = list[i];
            list[i] = temp;
        }    }
}
