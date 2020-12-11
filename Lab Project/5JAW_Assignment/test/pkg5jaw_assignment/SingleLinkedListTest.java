/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg5jaw_assignment;

import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;
import pkg5jaw_assignment.linkedList.*;
import pkg5jaw_assignment.models.*;

/**
 *
 * @author Isaac
 */
public class SingleLinkedListTest {
          
    Date date = new Date();   
    Enrollment e1 = new Enrollment(new Date(), "F", "1_20");
   
    SingleLinkedList<Course> courseLinkedList;
    SingleLinkedList<Enrollment> enrollmentLinkedList;
    SingleLinkedList<Student> studentLinkedList;

    @Before
    public void init(){
        courseLinkedList = new SingleLinkedList<>();
        enrollmentLinkedList = new SingleLinkedList<>();
        studentLinkedList = new SingleLinkedList<>();
    }
    
    @Test
    public void addFirstCourseLinkedList(){
        Course c = new Course(1,"Maths",0.0);      
        Course c2 = new Course(2,"Science",0.0);
        
        courseLinkedList.addFirst(new Node(c2));
        courseLinkedList.addFirst(new Node(c));
        
        assertEquals(courseLinkedList.getHead().getValue(), c);
    }
    
    @Test
    public void addLastCourseLinkedList(){
        Course c = new Course(1,"Maths",0.0);      
        Course c2 = new Course(2,"Science",0.0);
        
        courseLinkedList.addLast(new Node(c2));
        courseLinkedList.addLast(new Node(c));
        
        assertEquals(courseLinkedList.getTail().getValue(), c);
    }
    
    @Test
    public void removeFirstCourseLinkedList(){
        Course c = new Course(1,"Maths",0.0);      
        Course c2 = new Course(2,"Science",0.0);
        
        courseLinkedList.addLast(new Node(c));
        courseLinkedList.addLast(new Node(c2));
        
        courseLinkedList.removeFirst();
        
        assertEquals(courseLinkedList.getHead().getValue(), c2);
    }
    
    @Test
    public void removeLastCourseLinkedList(){
        Course c = new Course(1,"Maths",0.0);      
        Course c2 = new Course(2,"Science",0.0);
        
        courseLinkedList.addLast(new Node(c2));
        courseLinkedList.addLast(new Node(c));
        
        courseLinkedList.removeLast();
        
        assertEquals(courseLinkedList.getTail().getValue(), c2);
    }
    
    @Test
    public void containsCourseLinkedList(){
        Course c = new Course(1,"Maths",0.0);      
        Course c2 = new Course(2,"Science",0.0);
        
        courseLinkedList.addLast(new Node(c2));
        courseLinkedList.addLast(new Node(c));
        
        assertEquals(courseLinkedList.contains(c), true);
    }
    
    @Test
    public void addAtPosCourse(){
        Course c = new Course(1,"Maths",0.0);      
        Course c2 = new Course(2,"Science",0.0);
        Course c3 = new Course(3,"English",0.0);
        Course c4 = new Course(4,"History",0.0);
        
        courseLinkedList.addLast(new Node(c2));
        courseLinkedList.addLast(new Node(c));

        courseLinkedList.addAtPos(new Node(c3), 1);
        courseLinkedList.addAtPos(new Node(c4), 0);
        
        assertEquals(courseLinkedList.contains(c3), true);
        assertEquals(courseLinkedList.getHead().value, c4);
    }
    
    @Test
    public void removeAtPosCourse(){
        Course c = new Course(1,"Maths",0.0);      
        Course c2 = new Course(2,"Science",0.0);
        Course c3 = new Course(3,"English",0.0);
        Course c4 = new Course(4,"History",0.0);
        
        courseLinkedList.addLast(new Node(c));
        courseLinkedList.addLast(new Node(c2));
        courseLinkedList.addLast(new Node(c3));
        courseLinkedList.addLast(new Node(c4));
        
        courseLinkedList.removeAtPos(2);
        assertEquals(courseLinkedList.contains(c3), false);
    }
    
    @Test
    public void traverseCourse(){
        Course c = new Course(1,"Maths",0.0);      
        Course c2 = new Course(2,"Science",0.0);
        
        courseLinkedList.addLast(new Node(c2));
        courseLinkedList.addLast(new Node(c));
        
        assertEquals(courseLinkedList.traverse(), courseLinkedList.getHead());
        assertEquals(courseLinkedList.traverse(), courseLinkedList.getTail());
    }
    
    @Test
    public void addFirstEnrollmentLinkedList(){
        Enrollment c = new Enrollment(date, "A", "2_20");
        Enrollment c2 = new Enrollment(date, "B", "1_24");
        
        enrollmentLinkedList.addFirst(new Node(c2));
        enrollmentLinkedList.addFirst(new Node(c));
        
        assertEquals(enrollmentLinkedList.getHead().getValue(), c);
    }    
    @Test
    public void addLastEnrollmentLinkedList(){
        Enrollment c = new Enrollment(date, "A", "2_20");
        Enrollment c2 = new Enrollment(date, "B", "1_24");
        
        enrollmentLinkedList.addLast(new Node(c2));
        enrollmentLinkedList.addLast(new Node(c));
        
        assertEquals(enrollmentLinkedList.getTail().getValue(), c);
    }
    @Test
    public void removeFirstEnrollmentLinkedList(){
        Enrollment c = new Enrollment(date, "A", "2_20");
        Enrollment c2 = new Enrollment(date, "B", "1_24");
        
        enrollmentLinkedList.addLast(new Node(c));
        enrollmentLinkedList.addLast(new Node(c2));
        
        enrollmentLinkedList.removeFirst();
        
        assertEquals(enrollmentLinkedList.getHead().getValue(), c2);
    }
    @Test
    public void removeLastEnrollmentLinkedList(){
        Enrollment c = new Enrollment(date, "A", "2_20");
        Enrollment c2 = new Enrollment(date, "B", "1_24");
        
        enrollmentLinkedList.addLast(new Node(c2));
        enrollmentLinkedList.addLast(new Node(c));
        
        enrollmentLinkedList.removeLast();
        
        assertEquals(enrollmentLinkedList.getTail().getValue(), c2);
    }
    @Test
    public void containsEnrollmentLinkedList(){
        Enrollment c = new Enrollment(date, "A", "2_20");
        Enrollment c2 = new Enrollment(date, "B", "1_24");
        
        enrollmentLinkedList.addLast(new Node(c2));
        enrollmentLinkedList.addLast(new Node(c));
        
        assertEquals(enrollmentLinkedList.contains(c), true);
    }
    @Test
    public void addAtPosEnrollment(){
        Enrollment c = new Enrollment(date, "A", "2_20");
        Enrollment c2 = new Enrollment(date, "B", "1_21");
        Enrollment c3 = new Enrollment(date, "C", "2_20");
        Enrollment c4 = new Enrollment(date, "F", "1_20");
        
        enrollmentLinkedList.addLast(new Node(c2));
        enrollmentLinkedList.addLast(new Node(c));

        enrollmentLinkedList.addAtPos(new Node(c3), 1);
        enrollmentLinkedList.addAtPos(new Node(c4), 0);
        
        assertEquals(enrollmentLinkedList.contains(c3), true);
        assertEquals(enrollmentLinkedList.getHead().value, c4);
    }
    
    @Test
    public void removeAtPosEnrollment(){
        Enrollment c = new Enrollment(date, "A", "2_20");
        Enrollment c2 = new Enrollment(date, "B", "1_21");
        Enrollment c3 = new Enrollment(date, "C", "2_20");
        Enrollment c4 = new Enrollment(date, "F", "1_20");
        
        enrollmentLinkedList.addLast(new Node(c));
        enrollmentLinkedList.addLast(new Node(c2));
        enrollmentLinkedList.addLast(new Node(c3));
        enrollmentLinkedList.addLast(new Node(c4));
        
        enrollmentLinkedList.removeAtPos(2);
        assertEquals(enrollmentLinkedList.contains(c3), true);
    }
    
    @Test
    public void traverseEnrollment(){
        Enrollment c = new Enrollment(date, "A", "2_20");
        Enrollment c2 = new Enrollment(date, "B", "1_21");
        
        enrollmentLinkedList.addLast(new Node(c2));
        enrollmentLinkedList.addLast(new Node(c));
        
        assertEquals(enrollmentLinkedList.traverse(), enrollmentLinkedList.getHead());
        assertEquals(enrollmentLinkedList.traverse(), enrollmentLinkedList.getTail());
    }
    
    @Test
    public void addFirstStudentLinkedList(){
        Student c = new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483");
        Student c2 = new Student("Dance", new Date(), e1, 5, "Joe", new Address(), "00343473483");
        
        studentLinkedList.addFirst(new Node(c2));
        studentLinkedList.addFirst(new Node(c));
        
        assertEquals(studentLinkedList.getHead().getValue(), c);
    }
    @Test
    public void addLastStudentLinkedList(){
        Student c = new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483");
        Student c2 = new Student("Dance", new Date(), e1, 5, "Joe", new Address(), "00343473483");
        
        studentLinkedList.addLast(new Node(c2));
        studentLinkedList.addLast(new Node(c));
        
        assertEquals(studentLinkedList.getTail().getValue(), c);
    }
    @Test
    public void removeFirstStudentLinkedList(){
        Student c = new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483");
        Student c2 = new Student("Dance", new Date(), e1, 5, "Joe", new Address(), "00343473483");
        
        studentLinkedList.addLast(new Node(c));
        studentLinkedList.addLast(new Node(c2));
        
        studentLinkedList.removeFirst();
        
        assertEquals(studentLinkedList.getHead().getValue(), c2);
    }
    @Test
    public void removeLastStudentLinkedList(){
        Student c = new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483");
        Student c2 = new Student("Dance", new Date(), e1, 5, "Joe", new Address(), "00343473483");
        
        studentLinkedList.addLast(new Node(c2));
        studentLinkedList.addLast(new Node(c));
        
        studentLinkedList.removeLast();
        
        assertEquals(studentLinkedList.getTail().getValue(), c2);
    }
    @Test
    public void containsStudentLinkedList(){
        Student c = new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483");
        Student c2 = new Student("Dance", new Date(), e1, 5, "Joe", new Address(), "00343473483");
        
        studentLinkedList.addLast(new Node(c2));
        studentLinkedList.addLast(new Node(c));
        
        assertEquals(studentLinkedList.contains(c), true);
    }
    @Test
    public void addAtPosStudent(){
        Student c = new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483");
        Student c2 = new Student("Dance", new Date(), e1, 3, "Joe", new Address(), "00343473483");
        Student c3 = new Student("History", new Date(), e1, 5, "Andy", new Address(), "00343473483");
        Student c4 = new Student("Science", new Date(), e1, 6, "Sue", new Address(), "00343473483");
        
        studentLinkedList.addLast(new Node(c2));
        studentLinkedList.addLast(new Node(c));

        studentLinkedList.addAtPos(new Node(c3), 1);
        studentLinkedList.addAtPos(new Node(c4), 0);
        
        assertEquals(studentLinkedList.contains(c3), true);
        assertEquals(studentLinkedList.getHead().value, c4);
    }
    
    @Test
    public void removeAtPosStudent(){
        Student c = new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483");
        Student c2 = new Student("Dance", new Date(), e1, 3, "Joe", new Address(), "00343473483");
        Student c3 = new Student("History", new Date(), e1, 5, "Andy", new Address(), "00343473483");
        Student c4 = new Student("Science", new Date(), e1, 6, "Sue", new Address(), "00343473483");
        
        studentLinkedList.addLast(new Node(c));
        studentLinkedList.addLast(new Node(c2));
        studentLinkedList.addLast(new Node(c3));
        studentLinkedList.addLast(new Node(c4));
        
        studentLinkedList.removeAtPos(2);
        assertEquals(studentLinkedList.contains(c3), false);
    }
    
    @Test
    public void traverseStudent(){
        Student c = new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483");
        Student c2 = new Student("Dance", new Date(), e1, 3, "Joe", new Address(), "00343473483");
        
        studentLinkedList.addLast(new Node(c2));
        studentLinkedList.addLast(new Node(c));
        
        assertEquals(studentLinkedList.traverse(), studentLinkedList.getHead());
        assertEquals(studentLinkedList.traverse(), studentLinkedList.getTail());
    }
}
