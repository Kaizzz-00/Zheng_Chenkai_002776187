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
public class patientDirectory {
    private ArrayList<Patient> history;
    
    public patientDirectory()
    {
        this.history=new ArrayList<Patient>();
    }

    public ArrayList<Patient> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Patient> history) {
        this.history = history;
    }
    
      public Patient addnewPatient(){
        Patient newPatient= new Patient();
        history.add(newPatient);
        return newPatient;
        // instead of add profile manually to Array, use this method to history and return reference 
    }
    
    public void deletePatient(Patient selectedPatient){
        history.remove(selectedPatient);
    }// create a void to delete profile
    
    public void updatePatient(int arrayIndex,Patient sp){
        history.set(arrayIndex, sp);
    }
}
