/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg5jaw_assignment.comparators;

import pkg5jaw_assignment.models.Enrollment;
import java.util.Comparator;

/**
 *
 * @author Isaac
 */
public class SortEnrollmentByGrade implements Comparator<Enrollment>{
    
    /**
     *
     * @param e1
     * @param e2
     * @return
     */
    public int compare(Enrollment e1, Enrollment e2)
    {
        return e1.getGrade().compareTo(e1.getGrade());
    }
}
