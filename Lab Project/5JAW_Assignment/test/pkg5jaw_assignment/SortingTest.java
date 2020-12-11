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
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import pkg5jaw_assignment.models.Address;
import pkg5jaw_assignment.models.Course;
import pkg5jaw_assignment.models.Enrollment;
import pkg5jaw_assignment.models.Student;
import pkg5jaw_assignment.sorting.*;

/**
 *
 * @author Isaac
 */
public class SortingTest {
    
    Course[] actualCourseArray = new Course[]{new Course(1,"Maths",0.0),
            new Course(2,"Science",0.0),
            new Course(1,"Maths 2",0.0),
            new Course(4,"English",0.0),
            new Course(3,"Comp",0.0)};
            
    Course[] expectedCourseArray = new Course[]{new Course(1,"Maths",0.0),
            new Course(1,"Maths 2",0.0),
            new Course(2,"Science",0.0),
            new Course(3,"Comp",0.0),
            new Course(4,"English",0.0)};
            
    Date date = new Date();
    Enrollment[] actualEnrollmentArray = new Enrollment[]{new Enrollment(date, "F", "1_20"),
            new Enrollment(date, "A", "2_20"),
            new Enrollment(date, "B", "1_24"),
            new Enrollment(date, "C", "1_24"),
            new Enrollment(date, "B", "1_24")};
    
    Enrollment[] expectedEnrollmentArray = new Enrollment[]{new Enrollment(date, "A", "2_20"),
            new Enrollment(date, "B", "1_24"),
            new Enrollment(date, "B", "2_24"),
            new Enrollment(date, "C", "1_24"),
            new Enrollment(date, "F", "1_20")};
    
    Enrollment e1 = new Enrollment(new Date(), "F", "1_20");
    Student[] actualStudentArray = new Student[]{new Student("Science", new Date(), e1, 7, "John", new Address(), "00343473483"),
            new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483"),
            new Student("Dance", new Date(), e1, 5, "Joe", new Address(), "00343473483"),
            new Student("Comp", new Date(), e1, 1, "Fred", new Address(), "00343473483"),
            new Student("Smith", new Date(), e1, 2, "Joe", new Address(), "00343473483")};
            
    Student[] expectedStudentArray = new Student[]{new Student("Comp", new Date(), e1, 1, "Fred", new Address(), "00343473483"),
            new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483"),
            new Student("Smith", new Date(), e1, 2, "Joe", new Address(), "00343473483"),
            new Student("Dance", new Date(), e1, 5, "Joe", new Address(), "00343473483"),
            new Student("Science", new Date(), e1, 7, "John", new Address(), "00343473483")};        
    
    @Test
    public void bubbleSortCourse(){
        BubbleSort.sort(actualCourseArray);
        assertArrayEquals(expectedCourseArray, actualCourseArray);
    }
    @Test
    public void insertionSortCourses(){
        InsertionSort.sort(actualCourseArray);
        assertArrayEquals(expectedCourseArray, actualCourseArray);
    }
    @Test
    public void selectionSortCourses(){
        SelectionSort.sort(actualCourseArray);
        assertArrayEquals(expectedCourseArray, actualCourseArray);
    }
    
    @Test
    public void bubbleSortEnrollments(){
        BubbleSort.sort(actualEnrollmentArray);
        assertArrayEquals(expectedEnrollmentArray, actualEnrollmentArray);
    }
    @Test
    public void insertionSortEnrollments(){
        InsertionSort.sort(actualEnrollmentArray);
        assertArrayEquals(expectedEnrollmentArray, actualEnrollmentArray);
    }
    @Test
    public void selectionSortEnrollments(){
        SelectionSort.sort(actualEnrollmentArray);
        assertArrayEquals(expectedEnrollmentArray, actualEnrollmentArray);
    }
    
    @Test
    public void bubbleSortStudents(){
        BubbleSort.sort(actualStudentArray);
        assertArrayEquals(expectedStudentArray, actualStudentArray);
    }
    @Test
    public void insertionSortStudents(){
        InsertionSort.sort(actualStudentArray);
        assertArrayEquals(expectedStudentArray, actualStudentArray);
    }
    @Test
    public void selectionSortStudents(){
        SelectionSort.sort(actualStudentArray);
        assertArrayEquals(expectedStudentArray, actualStudentArray);
    }
}
