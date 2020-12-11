/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg5jaw_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;
import pkg5jaw_assignment.comparators.*;
import pkg5jaw_assignment.models.Address;
import pkg5jaw_assignment.models.Course;
import pkg5jaw_assignment.models.Enrollment;
import pkg5jaw_assignment.models.Student;

/**
 *
 * @author Isaac
 */
public class ComparatorsTest {
    
    @Test
    public void courseComparator(){
        List<Course> unsorted = new ArrayList<>();
            unsorted.add(new Course(1,"Maths",0.0));
            unsorted.add(new Course(2,"Science",0.0));
            unsorted.add(new Course(1,"Maths 2",0.0));
            unsorted.add(new Course(4,"English",0.0));
            unsorted.add(new Course(3,"Comp",0.0));
            
        List<Course> expected = new ArrayList<>();
            expected.add(new Course(1,"Maths",0.0));
            expected.add(new Course(1,"Maths 2",0.0));
            expected.add(new Course(2,"Science",0.0));
            expected.add(new Course(3,"Comp",0.0));
            expected.add(new Course(4,"English",0.0));
            
        Collections.sort(unsorted, new SortCourseByCode());
        assertEquals(unsorted, expected);
    }
    
    @Test
    public void enrollmentComparator(){
        Date date = new Date();
        
        List<Enrollment> unsorted = new ArrayList<>();
            unsorted.add(new Enrollment(date, "F", "1_20"));
            unsorted.add(new Enrollment(date, "A", "2_20"));
            unsorted.add(new Enrollment(date, "B", "1_24"));
            unsorted.add(new Enrollment(date, "C", "1_24"));
            unsorted.add(new Enrollment(date, "B", "1_24"));
            
        List<Enrollment> expected = new ArrayList<>();            
            expected.add(new Enrollment(date, "A", "2_20"));
            expected.add(new Enrollment(date, "B", "1_24"));
            expected.add(new Enrollment(date, "B", "2_24"));
            expected.add(new Enrollment(date, "C", "1_24"));
            expected.add(new Enrollment(date, "F", "1_20"));
            
        Collections.sort(unsorted, new SortEnrollmentByGrade());
        assertEquals(unsorted, expected);
    }
    
    @Test
    public void studentComparator(){
        
        Enrollment e1 = new Enrollment(new Date(), "F", "1_20");
        
        List<Student> unsorted = new ArrayList<>();
            unsorted.add(new Student("Science", new Date(), e1, 7, "John", new Address(), "00343473483"));
            unsorted.add(new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483"));
            unsorted.add(new Student("Dance", new Date(), e1, 5, "Joe", new Address(), "00343473483"));
            unsorted.add(new Student("Comp", new Date(), e1, 1, "Fred", new Address(), "00343473483"));
            unsorted.add(new Student("Smith", new Date(), e1, 2, "Joe", new Address(), "00343473483"));
            
        List<Student> expected = new ArrayList<>();
            expected.add(new Student("Comp", new Date(), e1, 1, "Fred", new Address(), "00343473483"));
            expected.add(new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483"));
            expected.add(new Student("Smith", new Date(), e1, 2, "Joe", new Address(), "00343473483"));
            expected.add(new Student("Dance", new Date(), e1, 5, "Joe", new Address(), "00343473483"));
            expected.add(new Student("Science", new Date(), e1, 7, "John", new Address(), "00343473483"));
            
        Collections.sort(unsorted, new SortStudentByID());
        assertEquals(unsorted, expected);
    }
}
