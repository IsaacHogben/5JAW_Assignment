/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg5jaw_assignment.models;
import java.util.Date;

/**
 *
 * @author Isaac
 */
public class Student extends Person implements Comparable<Student>{
    String program;
    Date dateRegistered;
    Enrollment enrollment;

    /**
     *
     * @return
     */
    public String getProgram() {
        return program;
    }

    /**
     *
     * @param program
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     *
     * @return
     */
    public Date getDateRegistered() {
        return dateRegistered;
    }

    /**
     *
     * @param dateRegistered
     */
    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    /**
     *
     * @return
     */
    public Enrollment getEnrollment() {
        return enrollment;
    }

    /**
     *
     * @param enrollment
     */
    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getTelNum() {
        return telNum;
    }

    /**
     *
     * @param telNum
     */
    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    /**
     *
     * @return
     */
    public Address getAddress() {
        return address;
    }

    /**
     *
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     *
     * @param program
     * @param dateRegistered
     * @param enrollment
     * @param idNumber
     * @param name
     * @param address
     * @param telNum
     */
    public Student(String program, Date dateRegistered, Enrollment enrollment, int idNumber, String name, Address address, String telNum) {
        super(idNumber, name, address, telNum);
        this.program = program;
        this.dateRegistered = dateRegistered;
        this.enrollment = enrollment;
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
        final Student other = (Student) obj;
        if (this.id != other.id ) {
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
        return this.id;
    }
    
    /**
     *
     * @param s
     * @return
     */
    @Override
    public int compareTo(Student s) {
        
        int compareID = this.getId() - s.getId();
        
        return compareID;
    }
}
