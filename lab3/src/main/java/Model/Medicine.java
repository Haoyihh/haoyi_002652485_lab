/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author haohe
 */
public class Medicine {

    /**
     * @return the medicineName
     */
    private String medicineName;
    private Double dosage;
    
     public Medicine(){
        
    }
    public String getMedicineName() {
        return medicineName;
    }

    /**
     * @param medicineName the medicineName to set
     */
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    /**
     * @return the dosage
     */
    public Double getDosage() {
        return dosage;
    }

    /**
     * @param dosage the dosage to set
     */
    public void setDosage(Double dosage) {
        this.dosage = dosage;
    }
    
    
    
   @Override
   public String toString(){
       return this.medicineName;
   }
   
}
