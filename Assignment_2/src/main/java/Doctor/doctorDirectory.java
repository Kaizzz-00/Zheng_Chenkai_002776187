/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import BasicModel.Person;
import java.util.ArrayList;

/**
 *
 * @author kai
 */
public class doctorDirectory {
    private ArrayList<Doctor> history;
    
    public doctorDirectory() {
    this.history=new ArrayList<Doctor>();
    
    }

    public ArrayList<Doctor> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Doctor> history) {
        this.history = history;
    }
    
     public Doctor addnewDoctor(){
        Doctor newDoctor= new Doctor();
        history.add(newDoctor);
        return newDoctor;
        // instead of add profile manually to Array, use this method to history and return reference 
    }
    
    public void deleteDoctor(Doctor selectedDoctor){
        history.remove(selectedDoctor);
    }// create a void to delete profile
    
    public void updateDoctor(int arrayIndex,Doctor sd){
        history.set(arrayIndex, sd);
    }
}
