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
public class DoubleLinkedListTest {
          
    Date date = new Date();   
    Enrollment e1 = new Enrollment(new Date(), "F", "1_20");
   
    DoublyLinkedList<Course> courseDoubleLinkedList;
    DoublyLinkedList<Enrollment> enrollmentDoubleLinkedList;
    DoublyLinkedList<Student> studentDoubleLinkedList;
    
    @Before
    public void init(){
        courseDoubleLinkedList = new DoublyLinkedList<>();
        enrollmentDoubleLinkedList = new DoublyLinkedList<>();
        studentDoubleLinkedList = new DoublyLinkedList<>();
    }
    
    @Test
    public void addFirstCourseLinkedList(){
        Course c = new Course(1,"Maths",0.0);      
        Course c2 = new Course(2,"Science",0.0);
        
        courseDoubleLinkedList.addFirst(new Node(c2));
        courseDoubleLinkedList.addFirst(new Node(c));
        
        assertEquals(courseDoubleLinkedList.getHead().getValue(), c);
    }
    
    @Test
    public void addLastCourseLinkedList(){
        Course c = new Course(1,"Maths",0.0);      
        Course c2 = new Course(2,"Science",0.0);
        
        courseDoubleLinkedList.addLast(new Node(c2));
        courseDoubleLinkedList.addLast(new Node(c));
        
        assertEquals(courseDoubleLinkedList.getTail().getValue(), c);
    }
    
    @Test
    public void removeFirstCourseLinkedList(){
        Course c = new Course(1,"Maths",0.0);      
        Course c2 = new Course(2,"Science",0.0);
        
        courseDoubleLinkedList.addLast(new Node(c));
        courseDoubleLinkedList.addLast(new Node(c2));
        
        courseDoubleLinkedList.removeFirst();
        
        assertEquals(courseDoubleLinkedList.getHead().getValue(), c2);
    }
    
    @Test
    public void removeLastCourseLinkedList(){
        Course c = new Course(1,"Maths",0.0);      
        Course c2 = new Course(2,"Science",0.0);
        
        courseDoubleLinkedList.addLast(new Node(c2));
        courseDoubleLinkedList.addLast(new Node(c));
        
        courseDoubleLinkedList.removeLast();
        
        assertEquals(courseDoubleLinkedList.getTail().getValue(), c2);
    }
    
    @Test
    public void containsCourseLinkedList(){
        Course c = new Course(1,"Maths",0.0);      
        Course c2 = new Course(2,"Science",0.0);
        
        courseDoubleLinkedList.addLast(new Node(c2));
        courseDoubleLinkedList.addLast(new Node(c));
        
        assertEquals(courseDoubleLinkedList.contains(c), true);
    }
    
    @Test
    public void addAtPosCourse(){
        Course c = new Course(1,"Maths",0.0);      
        Course c2 = new Course(2,"Science",0.0);
        Course c3 = new Course(3,"English",0.0);
        Course c4 = new Course(4,"History",0.0);
        
        courseDoubleLinkedList.addLast(new Node(c2));
        courseDoubleLinkedList.addLast(new Node(c));

        courseDoubleLinkedList.addAtPos(new Node(c3), 1);
        courseDoubleLinkedList.addAtPos(new Node(c4), 0);
        
        assertEquals(courseDoubleLinkedList.contains(c3), true);
        assertEquals(courseDoubleLinkedList.getHead().value, c4);
    }
    
    @Test
    public void removeAtPosCourse(){
        Course c = new Course(1,"Maths",0.0);      
        Course c2 = new Course(2,"Science",0.0);
        Course c3 = new Course(3,"English",0.0);
        Course c4 = new Course(4,"History",0.0);
        
        courseDoubleLinkedList.addLast(new Node(c));
        courseDoubleLinkedList.addLast(new Node(c2));
        courseDoubleLinkedList.addLast(new Node(c3));
        courseDoubleLinkedList.addLast(new Node(c4));
        
        courseDoubleLinkedList.removeAtPos(2);
        assertEquals(courseDoubleLinkedList.contains(c3), false);
    }
    
    @Test
    public void traverseCourseForward(){
        Course c = new Course(1,"Maths",0.0);      
        Course c2 = new Course(2,"Science",0.0);
        
        courseDoubleLinkedList.addLast(new Node(c2));
        courseDoubleLinkedList.addLast(new Node(c));
        
        assertEquals(courseDoubleLinkedList.traverseForward(), courseDoubleLinkedList.getHead());
        assertEquals(courseDoubleLinkedList.traverseForward(), courseDoubleLinkedList.getTail());
    }
    
    @Test
    public void traverseCourseBack(){
        Course c = new Course(1,"Maths",0.0);      
        Course c2 = new Course(2,"Science",0.0);
        Course c3 = new Course(3,"Science",0.0);
        
        courseDoubleLinkedList.addLast(new Node(c));
        courseDoubleLinkedList.addLast(new Node(c2));
        courseDoubleLinkedList.addLast(new Node(c3));
        
        assertEquals(courseDoubleLinkedList.traverseBack().value, c2);
        assertEquals(courseDoubleLinkedList.traverseBack().value, c);
    }
    
    @Test
    public void addFirstEnrollmentLinkedList(){
        Enrollment c = new Enrollment(date, "A", "2_20");
        Enrollment c2 = new Enrollment(date, "B", "1_24");
        
        enrollmentDoubleLinkedList.addFirst(new Node(c2));
        enrollmentDoubleLinkedList.addFirst(new Node(c));
        
        assertEquals(enrollmentDoubleLinkedList.getHead().getValue(), c);
    }    
    @Test
    public void addLastEnrollmentLinkedList(){
        Enrollment c = new Enrollment(date, "A", "2_20");
        Enrollment c2 = new Enrollment(date, "B", "1_24");
        
        enrollmentDoubleLinkedList.addLast(new Node(c2));
        enrollmentDoubleLinkedList.addLast(new Node(c));
        
        assertEquals(enrollmentDoubleLinkedList.getTail().getValue(), c);
    }
    @Test
    public void removeFirstEnrollmentLinkedList(){
        Enrollment c = new Enrollment(date, "A", "2_20");
        Enrollment c2 = new Enrollment(date, "B", "1_24");
        
        enrollmentDoubleLinkedList.addLast(new Node(c));
        enrollmentDoubleLinkedList.addLast(new Node(c2));
        
        enrollmentDoubleLinkedList.removeFirst();
        
        assertEquals(enrollmentDoubleLinkedList.getHead().getValue(), c2);
    }
    @Test
    public void removeLastEnrollmentLinkedList(){
        Enrollment c = new Enrollment(date, "A", "2_20");
        Enrollment c2 = new Enrollment(date, "B", "1_24");
        
        enrollmentDoubleLinkedList.addLast(new Node(c2));
        enrollmentDoubleLinkedList.addLast(new Node(c));
        
        enrollmentDoubleLinkedList.removeLast();
        
        assertEquals(enrollmentDoubleLinkedList.getTail().getValue(), c2);
    }
    @Test
    public void containsEnrollmentLinkedList(){
        Enrollment c = new Enrollment(date, "A", "2_20");
        Enrollment c2 = new Enrollment(date, "B", "1_24");
        
        enrollmentDoubleLinkedList.addLast(new Node(c2));
        enrollmentDoubleLinkedList.addLast(new Node(c));
        
        assertEquals(enrollmentDoubleLinkedList.contains(c), true);
    }
    @Test
    public void addAtPosEnrollment(){
        Enrollment c = new Enrollment(date, "A", "2_20");
        Enrollment c2 = new Enrollment(date, "B", "1_21");
        Enrollment c3 = new Enrollment(date, "C", "2_20");
        Enrollment c4 = new Enrollment(date, "F", "1_20");
        
        enrollmentDoubleLinkedList.addLast(new Node(c2));
        enrollmentDoubleLinkedList.addLast(new Node(c));

        enrollmentDoubleLinkedList.addAtPos(new Node(c3), 1);
        enrollmentDoubleLinkedList.addAtPos(new Node(c4), 0);
        
        assertEquals(enrollmentDoubleLinkedList.contains(c3), true);
        assertEquals(enrollmentDoubleLinkedList.getHead().value, c4);
    }
    
    @Test
    public void removeAtPosEnrollment(){
        Enrollment c = new Enrollment(date, "A", "2_20");
        Enrollment c2 = new Enrollment(date, "B", "1_21");
        Enrollment c3 = new Enrollment(date, "C", "2_20");
        Enrollment c4 = new Enrollment(date, "F", "1_20");
        
        enrollmentDoubleLinkedList.addLast(new Node(c));
        enrollmentDoubleLinkedList.addLast(new Node(c2));
        enrollmentDoubleLinkedList.addLast(new Node(c3));
        enrollmentDoubleLinkedList.addLast(new Node(c4));
        
        enrollmentDoubleLinkedList.removeAtPos(2);
        assertEquals(enrollmentDoubleLinkedList.contains(c3), false);
    }
    
    @Test
    public void traverseEnrollmentForward(){
        Enrollment c = new Enrollment(date, "A", "2_20");
        Enrollment c2 = new Enrollment(date, "B", "1_21");
        
        enrollmentDoubleLinkedList.addLast(new Node(c2));
        enrollmentDoubleLinkedList.addLast(new Node(c));
        
        assertEquals(enrollmentDoubleLinkedList.traverseForward(), enrollmentDoubleLinkedList.getHead());
        assertEquals(enrollmentDoubleLinkedList.traverseForward(), enrollmentDoubleLinkedList.getTail());
    }
    
    @Test
    public void traverseEnrollmentBack(){
        Enrollment c = new Enrollment(date, "A", "2_20");
        Enrollment c2 = new Enrollment(date, "B", "1_21");
        Enrollment c3 = new Enrollment(date, "F", "1_21");

        enrollmentDoubleLinkedList.addLast(new Node(c));
        enrollmentDoubleLinkedList.addLast(new Node(c2));
        enrollmentDoubleLinkedList.addLast(new Node(c3));
        
        assertEquals(enrollmentDoubleLinkedList.traverseBack().value, c2);
        assertEquals(enrollmentDoubleLinkedList.traverseBack().value, c);
    }
    
    @Test
    public void addFirstStudentLinkedList(){
        Student c = new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483");
        Student c2 = new Student("Dance", new Date(), e1, 5, "Joe", new Address(), "00343473483");
        
        studentDoubleLinkedList.addFirst(new Node(c2));
        studentDoubleLinkedList.addFirst(new Node(c));
        
        assertEquals(studentDoubleLinkedList.getHead().getValue(), c);
    }
    @Test
    public void addLastStudentLinkedList(){
        Student c = new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483");
        Student c2 = new Student("Dance", new Date(), e1, 5, "Joe", new Address(), "00343473483");
        
        studentDoubleLinkedList.addLast(new Node(c2));
        studentDoubleLinkedList.addLast(new Node(c));
        
        assertEquals(studentDoubleLinkedList.getTail().getValue(), c);
    }
    @Test
    public void removeFirstStudentLinkedList(){
        Student c = new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483");
        Student c2 = new Student("Dance", new Date(), e1, 5, "Joe", new Address(), "00343473483");
        
        studentDoubleLinkedList.addLast(new Node(c));
        studentDoubleLinkedList.addLast(new Node(c2));
        
        studentDoubleLinkedList.removeFirst();
        
        assertEquals(studentDoubleLinkedList.getHead().getValue(), c2);
    }
    @Test
    public void removeLastStudentLinkedList(){
        Student c = new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483");
        Student c2 = new Student("Dance", new Date(), e1, 5, "Joe", new Address(), "00343473483");
        
        studentDoubleLinkedList.addLast(new Node(c2));
        studentDoubleLinkedList.addLast(new Node(c));
        
        studentDoubleLinkedList.removeLast();
        
        assertEquals(studentDoubleLinkedList.getTail().getValue(), c2);
    }
    @Test
    public void containsStudentLinkedList(){
        Student c = new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483");
        Student c2 = new Student("Dance", new Date(), e1, 5, "Joe", new Address(), "00343473483");
        
        studentDoubleLinkedList.addLast(new Node(c2));
        studentDoubleLinkedList.addLast(new Node(c));
        
        assertEquals(studentDoubleLinkedList.contains(c), true);
    }
    @Test
    public void addAtPosStudent(){
        Student c = new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483");
        Student c2 = new Student("Dance", new Date(), e1, 3, "Joe", new Address(), "00343473483");
        Student c3 = new Student("History", new Date(), e1, 5, "Andy", new Address(), "00343473483");
        Student c4 = new Student("Science", new Date(), e1, 6, "Sue", new Address(), "00343473483");
        
        studentDoubleLinkedList.addLast(new Node(c2));
        studentDoubleLinkedList.addLast(new Node(c));

        studentDoubleLinkedList.addAtPos(new Node(c3), 1);
        studentDoubleLinkedList.addAtPos(new Node(c4), 0);
        
        assertEquals(studentDoubleLinkedList.contains(c3), true);
        assertEquals(studentDoubleLinkedList.getHead().value, c4);
    }
    
    @Test
    public void removeAtPosStudent(){
        Student c = new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483");
        Student c2 = new Student("Dance", new Date(), e1, 3, "Joe", new Address(), "00343473483");
        Student c3 = new Student("History", new Date(), e1, 5, "Andy", new Address(), "00343473483");
        Student c4 = new Student("Science", new Date(), e1, 6, "Sue", new Address(), "00343473483");
        
        studentDoubleLinkedList.addLast(new Node(c));
        studentDoubleLinkedList.addLast(new Node(c2));
        studentDoubleLinkedList.addLast(new Node(c3));
        studentDoubleLinkedList.addLast(new Node(c4));
        
        studentDoubleLinkedList.removeAtPos(2);
        assertEquals(studentDoubleLinkedList.contains(c3), false);
    }
    
    @Test
    public void traverseStudentForward(){
        Student c = new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483");
        Student c2 = new Student("Dance", new Date(), e1, 3, "Joe", new Address(), "00343473483");
        
        studentDoubleLinkedList.addLast(new Node(c2));
        studentDoubleLinkedList.addLast(new Node(c));
        
        assertEquals(studentDoubleLinkedList.traverseForward(), studentDoubleLinkedList.getHead());
        assertEquals(studentDoubleLinkedList.traverseForward(), studentDoubleLinkedList.getTail());
    }
    
    @Test
    public void traverseStudentBack(){
        Student c = new Student("Maths", new Date(), e1, 2, "Craig", new Address(), "00343473483");
        Student c2 = new Student("Dance", new Date(), e1, 3, "Joe", new Address(), "00343473483");
        Student c3 = new Student("Dance", new Date(), e1, 4, "filipo", new Address(), "00343473483");
        
        studentDoubleLinkedList.addLast(new Node(c));
        studentDoubleLinkedList.addLast(new Node(c2));
        studentDoubleLinkedList.addLast(new Node(c3));
        
        assertEquals(studentDoubleLinkedList.traverseBack().value, c2);
        assertEquals(studentDoubleLinkedList.traverseBack().value, c);
    }
}
