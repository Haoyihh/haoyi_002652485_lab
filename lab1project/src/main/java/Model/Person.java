/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author haohe
 */
public class Person {

    /**
     * @return the lastName
     */
    private  String firstName;
    private String lastName;
    private String NUID;
    private Address address;
    private String name;
    private ContactInfo contactInfo;
    private String collegeName;
    public String getCollegeName(){
       return collegeName; 
    }
    public void setCollegeName(String collegeName){
        this.collegeName=collegeName;
    }
    
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the NUID
     */
    public String getNUID() {
        return NUID;
    }

    /**
     * @param NUID the NUID to set
     */
    public void setNUID(String NUID) {
        this.NUID = NUID;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
   
    
    
    public Person(){
        this.firstName="";
        this.address=new Address();
        this.contactInfo = new ContactInfo();
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public Address getAddress(){
       return address;
    }
    public void setAddress(String Address){
        this.setAddress(Address);
        
    }
    public ContactInfo getContactInfo(){
        return contactInfo;
    }
    public void setContactInfor(String Contactinfo){
        this.setContactInfor(Contactinfo);
    }
   
    public static void main(String args[]){
        Person obj = new Person();
        obj.setFirstName("Haoyi");
      
        Address addr=obj.getAddress();
        addr.setStreetName("iiii");
        System.out.println(obj.getFirstName()+ " "+ obj.getAddress());
    }
    
}
