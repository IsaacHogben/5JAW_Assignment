/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg5jaw_assignment.models;
import pkg5jaw_assignment.comparators.*;

/**
 *
 * @author Isaac
 */
public class Course implements Comparable<Course>{
    int courseCode;
    String  courseName;
    Double cost;

    /**
     *
     * @return
     */
    public int getCourseCode() {
        return courseCode;
    }

    /**
     *
     * @param courseCode
     */
    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    /**
     *
     * @return
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     *
     * @param courseName
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     *
     * @return
     */
    public Double getCost() {
        return cost;
    }

    /**
     *
     * @param cost
     */
    public void setCost(Double cost) {
        this.cost = cost;
    }

    /**
     *
     * @param courseCode
     * @param courseName
     * @param cost
     */
    public Course(int courseCode, String courseName, Double cost) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.cost = cost;
    }
    
    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if(this == obj){
            return true;
        }
        final Course other = (Course) obj;
        if (this.courseCode != other.courseCode ) {
            return false;
        }
        
        return true;
    }
    
    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        return this.courseCode;
    }
    
    /**
     *
     * @param c
     * @return
     */
    @Override
    public int compareTo(Course c) {   

        int courseCompare = this.getCourseCode() - c.getCourseCode();
        int nameCompare = this.getCourseName().compareToIgnoreCase(c.getCourseName()); 
  
        // Compares both course code and name
        if (courseCompare == 0) { 
            return ((nameCompare == 0) ? courseCompare : nameCompare); 
        } else { 
            return courseCompare; 
        }
    }
}
