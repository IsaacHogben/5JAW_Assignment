/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg5jaw_assignment.comparators;

import pkg5jaw_assignment.models.Student;
import java.util.Comparator;

/**
 *
 * @author Isaac
 */
public class SortStudentByID implements Comparator<Student>
{

    /**
     *
     * @param s1
     * @param s2
     * @return
     */
    public int compare(Student s1, Student s2)
    {
        return s1.getId() - s2.getId();
    } 
}
