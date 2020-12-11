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
public class InsertionSort {
    
    /**
     *
     * @param list
     */
    public static void sort(Comparable[] list){

        // Start at position 1 in array
        for (int i = 1; i < list.length; ++i){
            // Store value at current pointer
            Comparable temp = list[i];
            // Check the value before current pointer
            int j = i - 1;
            // If the value before current position is greater than the current position
            // shift all previous values up one until we are at the correct position for the current object.
            while (j >= 0 && list[j].compareTo(temp) > 0){
                list[j + 1] = list[j];
                j--;
            }
            // return the temp value in place
            list[j + 1] = temp;
        }
    }
}
