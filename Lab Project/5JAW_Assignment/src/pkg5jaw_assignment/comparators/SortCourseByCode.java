/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg5jaw_assignment.comparators;

import pkg5jaw_assignment.models.Course;
import java.util.Comparator;

/**
 *
 * @author Isaac
 */
public class SortCourseByCode implements Comparator<Course>{
    
    /**
     *
     * @param c1
     * @param c2
     * @return
     */
    public int compare(Course c1, Course c2)
    {
        return c1.getCourseCode() - c2.getCourseCode();
    }
}
