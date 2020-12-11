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
public class JumpSearch {

    /**
     *
     * @param list
     * @param find
     * @return
     */
    public static int search(Comparable[] list, Comparable find){
        int index = -1;
        
        int jump = (int) Math.floor(Math.sqrt(list.length));
        int i = jump;
        
        do {
            if (find.compareTo(list[i]) > 0){
                i += jump;
            } else if (find.compareTo(list[i]) < 0) {
                i -= jump;
                index = LinearSearch.search(list, find, i);
                break;
            } else {
                index = i;
                break;
            }
        } while (i <= (list.length - 1));
        
        return index;
    }
}
