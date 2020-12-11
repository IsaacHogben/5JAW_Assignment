/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg5jaw_assignment.models;

import java.util.Objects;

/**
 *
 * @author Isaac
 */
public class Person {
    int id;
    String name, telNum;
    Address address;

    /**
     *
     * @param idNumber
     * @param name
     * @param address
     * @param telNum
     */
    public Person(int idNumber, String name, Address address, String telNum) {
        this.id = idNumber;
        this.name = name;
        this.address = address;
        this.telNum = telNum;
    }

    /**
     *
     */
    public Person() {
        this.id = 0;
        this.name = "DEF_NAME";
        this.address = address;
        this.telNum = "DEF_TEL";
    }
    
    /**
     *
     * @param obj
     * @return
     */
    @Override
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
        final Person other = (Person) obj;
        return Objects.equals(this.telNum, other.telNum);
    }
    
    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
         return this.telNum.hashCode();
    }
     
    
}


