/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg5jaw_assignment.models;

/**
 *
 * @author Isaac
 */
public class Address {
    String number, street, suburb, postcode, state;

    /**
     *
     * @return
     */
    public String getNumber() {
        return number;
    }

    /**
     *
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     *
     * @return
     */
    public String getStreet() {
        return street;
    }

    /**
     *
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     *
     * @return
     */
    public String getSuburb() {
        return suburb;
    }

    /**
     *
     * @param suburb
     */
    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    /**
     *
     * @return
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     *
     * @param postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     *
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     *
     * @param number
     * @param street
     * @param suburb
     * @param postcode
     * @param state
     */
    public Address(String number, String street, String suburb, String postcode, String state) {
        this.number = number;
        this.street = street;
        this.suburb = suburb;
        this.postcode = postcode;
        this.state = state;
    }
    
    /**
     *
     */
    public Address(){
        this.number = "DEF_NUM";
        this.street = "DEF_STREET";
        this.suburb = "DEF_SUBURB";
        this.postcode = "DEF_POSTCODE";
        this.state = "DEF_STATE";
    }
    
    
}
