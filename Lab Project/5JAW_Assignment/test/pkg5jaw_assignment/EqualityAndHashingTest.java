/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg5jaw_assignment;

import pkg5jaw_assignment.models.Student;
import pkg5jaw_assignment.models.Address;
import pkg5jaw_assignment.models.Course;
import pkg5jaw_assignment.models.Enrollment;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Isaac
 */
public class EqualityAndHashingTest {
    
    Enrollment e1;
    Enrollment e2;
    Enrollment e3;
    
    Course c1;
    Course c2;
    Course c3;
    Course c4;
    
    Student s1;
    Student s2;
    Student s3;
    Student s4;
    
    @Before
    public void setUp() {
        e1 = new Enrollment(new Date(), "A", "1_20");
        e2 = new Enrollment(new Date(2019,5,12), "B", "2_20");
        e3 = new Enrollment(new Date(), "B", "1_24");
        
        c1 = new Course(1, "Physics", 350.0);
        c2 = new Course(2, "math", 330.0);
        c3 = new Course(1, "Sport", 250.0);
        c4 = c1;

        //String program, Date dateRegistered, Enrollment enrollment, int idNumber, String name, Address address, String telNum
        s1 = new Student("Science", new Date(), e1, 1, "John", new Address(), "00343473483");
        s2 = new Student("Science", new Date(), e1, 2, "John", new Address(), "00343473483");
        s3 = new Student("Science", new Date(), e1, 1, "John", new Address(), "00343473483");
        s4 = s1;
    }

    @Test
    public void testEnrollmentEquals1() {
        assertEquals(e1, e1);
    }
    
    @Test
    public void testEnrollmentEquals2() {
        assertNotEquals(e1, e2);
    }
    
    @Test
    public void testEnrollmentEquals3() {
        assertEquals(e1, e3);
    }

    
    @Test
    public void testEnrollmentHashCode() {
        assertEquals(e1.hashCode(), e1.hashCode());
    }
    
    @Test
    public void testEnrollmentHashCode2() {
        assertNotEquals(e1.hashCode(), e2.hashCode());
    }
    
    @Test
    public void testEnrollmentHashCode3() {
        assertNotEquals(e1.hashCode(), e3.hashCode());
    }
    
    @Test
    public void testCourseEquals() {
        assertNotEquals(c1, c2);
    }
    
    @Test
    public void testCourseEquals2() {
        assertEquals(c1, c3);
    }
    
    @Test
    public void testCourseEquals3() {
        assertEquals(c1, c4);
    }
    
    @Test
    public void testCourseHashEquals() {
        assertNotEquals(c1.hashCode(), c2.hashCode());
    }
    
    @Test
    public void testCourseHashEquals2() {
        assertEquals(c1.hashCode(), c3.hashCode());
    }
    
    @Test
    public void testCourseHashEquals3() {
        assertEquals(c1.hashCode(), c4.hashCode());
    }

    @Test
    public void testStudentEquals() {
        assertNotEquals(s1, s2);
    }
    
    @Test
    public void testStudentEquals2() {
        assertEquals(s1, s3);
    }
    
    @Test
    public void testStudentEquals3() {
        assertEquals(s1.hashCode(), s4.hashCode());
    }
    
    @Test
    public void testStudentHashEquals() {
        assertNotEquals(s1.hashCode(), s2.hashCode());
    }
    
    @Test
    public void testStudentHashEquals2() {
        assertEquals(s1.hashCode(), s3.hashCode());
    }
    
    @Test
    public void testStudentHashEquals3() {
        assertEquals(s1.hashCode(), s4.hashCode());
    }
}
