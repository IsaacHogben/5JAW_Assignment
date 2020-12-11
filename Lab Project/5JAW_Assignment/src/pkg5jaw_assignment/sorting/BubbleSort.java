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
public class BubbleSort {
    
    /**
     *
     * @param list
     */
    public static void sort(Comparable[] list){
        Comparable c;
        for (int j = 0; j <= list.length - 2; j++)
        {
            for (int i = 0; i <= list.length - 2; i++)
            {
                if (list[i].compareTo(list[i+1]) > 0)
                {
                    c = list[i + 1];
                    list[i + 1] = list[i];
                    list[i] = c;
                }
            }
        }
    }
}
