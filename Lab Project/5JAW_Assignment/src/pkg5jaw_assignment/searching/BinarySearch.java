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
public class BinarySearch {

    /**
     *
     * @param list
     * @param find
     * @return
     */
    public static int search(Comparable[] list, Comparable find){
        int index = -1;
        
        int min = 0;
        int max = list.length - 1;
        do
        {
            int mid = (min + max) / 2;
            if (find.compareTo(list[mid]) > 0)
                min = mid + 1;
            else
                max = mid - 1;
            
            if (find.compareTo(list[mid]) == 0)
            {
                index = mid;
                break;
            }
            
            if (min > max)
                break;
        } while (min <= max);
        
        return index;
    }
}
