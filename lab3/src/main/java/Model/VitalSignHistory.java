/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author haohe
 */
public class VitalSignHistory {

    /**
     * @return the vitalSignHistory
     */
    private ArrayList<Observation>vitalSignHistory;
    public ArrayList<Observation> getVitalSignHistory() {
        return vitalSignHistory;
    }

    /**
     * @param vitalSignHistory the vitalSignHistory to set
     */
    public void setVitalSignHistory(ArrayList<Observation> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
        
        // fetch or find an observation based on ID
    }
    public Observation findObservation(int id){
        for(Observation o: this.vitalSignHistory){
            if(o.getObservationId()==id){
                return o;
            }
        }
        return null;
    }
    
    
    
    public VitalSignHistory(){
        this.vitalSignHistory = new ArrayList<Observation>();
    }
    public Observation createObservation(int observationId, double bloodPressure, double temperature){
        Observation observation = new Observation();
        
        observation.setObservationId(observationId);
        observation.setTemperature(temperature);
        observation.setBloodPressure(bloodPressure);
        
        // add the observation object into the arrayList
        this.vitalSignHistory.add(observation);
        
        return observation;
        
    }
    public Boolean checkObservationIDUnique(int id){
        for(Observation o:this.vitalSignHistory){
            if(o.getObservationId() ==id){
                return false;
                
            }
        }
        return true;
    }
}
