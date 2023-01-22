/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author haohe
 */
public class Address {
     private String streetName;
    private String apt;
    private String city;
    private String state;
    private String zipCode;
    

    /**
     * @return the apt
     */
    public Address(){
        this.streetName="";
        this.apt="";
        this.city="";
        this.state="";
        this.zipCode="";
       
    }
    public String getApt() {
        return apt;
    }

    /**
     * @param apt the apt to set
     */
    public void setApt(String apt) {
        this.apt = apt;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
   
    
    
    public String getStreetName(){
        return streetName;
    }
     public void setStreetName(String streetName){
        this.streetName=streetName;
    }
}
