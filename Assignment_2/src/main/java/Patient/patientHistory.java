/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import java.util.ArrayList;

/**
 *
 * @author kai
 */
public class patientHistory {
    private ArrayList<patientProfile> history;
    
    public patientHistory()
    {
        this.history=new ArrayList<patientProfile>();
    }

    public ArrayList<patientProfile> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<patientProfile> history) {
        this.history = history;
    }
    
      public patientProfile addnewPatient(){
        patientProfile newPatient= new patientProfile();
        history.add(newPatient);
        return newPatient;
        // instead of add profile manually to Array, use this method to history and return reference 
    }
    
    public void deletePatient(patientProfile selectedPatient){
        history.remove(selectedPatient);
    }// create a void to delete profile
    
    public void updatePatient(int arrayIndex,patientProfile sp){
        history.set(arrayIndex, sp);
    }
}
