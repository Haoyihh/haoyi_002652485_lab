/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author haohe
 */
public class Observation {

    /**
     * @return the observationId
     */
    private int observationId;
    private double bloodPressure;
    private double temperature;
    private Medicine medication;
     public Observation(){
         this.medication = new Medicine();
        
    }
    
    public int getObservationId() {
        return observationId;
    }

    /**
     * @param observationId the observationId to set
     */
    public void setObservationId(int observationId) {
        this.observationId = observationId;
    }

    /**
     * @return the bloodPressure
     */
    public double getBloodPressure() {
        return bloodPressure;
    }

    /**
     * @param bloodPressure the bloodPressure to set
     */
    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    /**
     * @return the tempetrature
     */
   
    
    
    
   
    @Override
    public String toString(){
        return String.valueOf(this.observationId);
    }

    /**
     * @return the medication
     */
    public Medicine getMedication() {
        return medication;
    }

    /**
     * @param medication the medication to set
     */
    public void setMedication(Medicine medication) {
        this.medication = medication;
    }

    /**
     * @return the temperature
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    
}
