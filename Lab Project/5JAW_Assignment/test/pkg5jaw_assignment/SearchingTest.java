/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg5jaw_assignment;

import pkg5jaw_assignment.searching.JumpSearch;
import pkg5jaw_assignment.searching.BinarySearch;
import pkg5jaw_assignment.searching.LinearSearch;
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
public class SearchingTest {
    
    @Test
    public void linearSearchCourse(){
        
        List<Course> list = new ArrayList<>();
            list.add(new Course(1,"Maths",0.0));
            list.add(new Course(2,"Science",0.0));
            list.add(new Course(1,"Maths 2",0.0));
            list.add(new Course(4,"English",0.0));
            list.add(new Course(3,"Comp",0.0));

        Course expected = new Course(1,"Maths 2",0.0);
            
        Course actual = list.get(LinearSearch.search(list.toArray(), expected));
        assertEquals(actual, expected);
    }
    
    @Test
    public void BinarySearchCourse(){
        
        List<Course> list = new ArrayList<>();
            list.add(new Course(1,"Maths",0.0));
            list.add(new Course(2,"Science",0.0));
            list.add(new Course(1,"Maths 2",0.0));
            list.add(new Course(4,"English",0.0));
            list.add(new Course(3,"Comp",0.0));

        Course expected = new Course(1,"Maths 2",0.0);
        
        Course actual = list.get(BinarySearch.search(list.toArray(new Course[0]), expected));
        assertEquals(actual, expected);
    }
    
        
    @Test
    public void JumpSearchCourse(){
        
        List<Course> list = new ArrayList<>();
            list.add(new Course(1,"Maths",0.0));
            list.add(new Course(2,"Science",0.0));
            list.add(new Course(1,"Maths 2",0.0));
            list.add(new Course(4,"English",0.0));
            list.add(new Course(3,"Comp",0.0));

        Course expected = new Course(1,"Maths 2",0.0);
            
        Course actual = list.get(JumpSearch.search(list.toArray(new Course[0]), expected));
        assertEquals(actual, expected);
    }
    
    
    @Test
    public void linearSearchEnrollment(){
        
        List<Enrollment> list = new ArrayList<>();
            list.add(new Enrollment(new Date(), "F", "1_20"));
            list.add(new Enrollment(new Date(), "A", "2_20"));
            list.add(new Enrollment(new Date(), "B", "1_24"));
            list.add(new Enrollment(new Date(), "C", "1_24"));
            list.add(new Enrollment(new Date(), "B", "1_24"));

        Enrollment expected = new Enrollment(new Date(), "B", "1_24");
            
        Enrollment actual = list.get(LinearSearch.search(list.toArray(), expected));
        assertEquals(actual, expected);
    }
    
    @Test
    public void BinarySearchEnrollment(){
        
        List<Enrollment> list = new ArrayList<>();
            list.add(new Enrollment(new Date(), "F", "1_20"));
            list.add(new Enrollment(new Date(), "A", "2_20"));
            list.add(new Enrollment(new Date(), "B", "1_24"));
            list.add(new Enrollment(new Date(), "C", "1_24"));
            list.add(new Enrollment(new Date(), "B", "1_24"));

        Enrollment expected = new Enrollment(new Date(), "B", "1_24");
            
        Enrollment actual = list.get(BinarySearch.search(list.toArray(new Enrollment[0]), expected));
        assertEquals(actual, expected);
    }
    
    @Test
    public void jumpSearchEnrollment(){
        
        List<Enrollment> list = new ArrayList<>();
            list.add(new Enrollment(new Date(), "F", "1_20"));
            list.add(new Enrollment(new Date(), "A", "2_20"));
            list.add(new Enrollment(new Date(), "B", "1_24"));
            list.add(new Enrollment(new Date(), "C", "1_24"));
            list.add(new Enrollment(new Date(), "B", "1_24"));

        Enrollment expected = new Enrollment(new Date(), "B", "1_24");
            
        Enrollment actual = list.get(JumpSearch.search(list.toArray(new Enrollment[0]), expected));
        assertEquals(actual, expected);
    }

    
    
    @Test
    public void linearSearchStudent(){
        Enrollment e1 = new Enrollment(new Date(), "F", "1_20");
        
        List<Student> list = new ArrayList<>();
            list.add(new Student("Science", new Date(), e1, 7, "John", new Address(), "00343473483"));
            list.add(new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483"));
            list.add(new Student("Dance", new Date(), e1, 5, "Joe", new Address(), "00343473483"));
            list.add(new Student("Comp", new Date(), e1, 1, "Fred", new Address(), "00343473483"));
            list.add(new Student("Smith", new Date(), e1, 2, "Joe", new Address(), "00343473483"));

        Student expected = new Student("Dance", new Date(), e1, 5, "Joe", new Address(), "00343473483");
            
        Student actual = list.get(LinearSearch.search(list.toArray(), expected));
        assertEquals(actual, expected);
    }
    
    @Test
    public void BinarySearchStudent(){
        
        Enrollment e1 = new Enrollment(new Date(), "F", "1_20");
        
        List<Student> list = new ArrayList<>();
            list.add(new Student("Science", new Date(), e1, 7, "John", new Address(), "00343473483"));
            list.add(new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483"));
            list.add(new Student("Dance", new Date(), e1, 5, "Joe", new Address(), "00343473483"));
            list.add(new Student("Comp", new Date(), e1, 1, "Fred", new Address(), "00343473483"));
            list.add(new Student("Smith", new Date(), e1, 2, "Joe", new Address(), "00343473483"));

        Student expected = new Student("Dance", new Date(), e1, 5, "Joe", new Address(), "00343473483");
            
        Student actual = list.get(BinarySearch.search(list.toArray(new Student[0]), expected));
        assertEquals(actual, expected);
    }
    
    @Test
    public void jumpSearchStudent(){
        
        Enrollment e1 = new Enrollment(new Date(), "F", "1_20");
        
        List<Student> list = new ArrayList<>();
            list.add(new Student("Science", new Date(), e1, 7, "John", new Address(), "00343473483"));
            list.add(new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483"));
            list.add(new Student("Dance", new Date(), e1, 5, "Joe", new Address(), "00343473483"));
            list.add(new Student("Comp", new Date(), e1, 1, "Fred", new Address(), "00343473483"));
            list.add(new Student("Smith", new Date(), e1, 2, "Joe", new Address(), "00343473483"));

        Student expected = new Student("Dance", new Date(), e1, 5, "Joe", new Address(), "00343473483");
            
        Student actual = list.get(JumpSearch.search(list.toArray(new Student[0]), expected));
        assertEquals(actual, expected);
    }
}
