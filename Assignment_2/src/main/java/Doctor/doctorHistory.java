/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import BasicModel.personProfile;
import java.util.ArrayList;

/**
 *
 * @author kai
 */
public class doctorHistory {
    private ArrayList<doctorProfile> history;
    
    public doctorHistory() {
    this.history=new ArrayList<doctorProfile>();
    
    }

    public ArrayList<doctorProfile> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<doctorProfile> history) {
        this.history = history;
    }
    
     public doctorProfile addnewDoctor(){
        doctorProfile newDoctor= new doctorProfile();
        history.add(newDoctor);
        return newDoctor;
        // instead of add profile manually to Array, use this method to history and return reference 
    }
    
    public void deleteDoctor(doctorProfile selectedDoctor){
        history.remove(selectedDoctor);
    }// create a void to delete profile
    
    public void updateDoctor(int arrayIndex,doctorProfile sd){
        history.set(arrayIndex, sd);
    }
}
