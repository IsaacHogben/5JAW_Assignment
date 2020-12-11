/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg5jaw_assignment.models;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Isaac
 */
public class Enrollment implements Comparable<Enrollment>{
    String grade, semester;
    Course course = null;
    Date dateEnrolled;

    /**
     *
     * @return
     */
    public Date getDateEnrolled() {
        return dateEnrolled;
    }

    /**
     *
     * @param dateEnrolled
     */
    public void setDateEnrolled(Date dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }

    /**
     *
     * @return
     */
    public String getGrade() {
        return grade;
    }

    /**
     *
     * @param grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     *
     * @return
     */
    public String getSemester() {
        return semester;
    }

    /**
     *
     * @param semester
     */
    public void setSemester(String semester) {
        this.semester = semester;
    }

    /**
     *
     * @return
     */
    public Course getCourse() {
        return course;
    }

    /**
     *
     * @param course
     */
    public void setCourse(Course course) {
        this.course = course;
    }

    /**
     *
     * @param dateEnrolled
     * @param grade
     * @param semester
     */
    public Enrollment(Date dateEnrolled, String grade, String semester) {
        this.dateEnrolled = dateEnrolled;
        this.grade = grade;
        this.semester = semester;
    }
    
    /**
     *
     */
    public Enrollment() {
        this.dateEnrolled = new Date();
        this.grade = "DEF_GRADE";
        this.semester = "DEF_SEMESTER";
    }
    
    //Enrollment has no unique identifiers so comparing them wouldnt ensure equality
    //similarly not overriding the getHash method would work better

    /**
     *
     * @param obj
     * @return
     */
        public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Enrollment other = (Enrollment) obj;
        if (!Objects.equals(this.dateEnrolled, other.dateEnrolled)) {
            return false;
        }
        
        return true;
    }
    
    /**
     *
     * @param e
     * @return
     */
    @Override
    public int compareTo(Enrollment e) {   

        int nameCompare = this.getGrade().compareToIgnoreCase(e.getGrade()); 
  
        // Compares grade
        return nameCompare;
    }
}
