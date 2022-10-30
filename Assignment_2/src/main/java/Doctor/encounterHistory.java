/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import java.util.ArrayList;

/**
 *
 * @author kai
 */
public class encounterHistory {
    private ArrayList<Encounter> history;
    
    public encounterHistory() {
    this.history=new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Encounter> history) {
        this.history = history;
    }
    
    public Encounter addnewEncounter(){
        Encounter newEncounter= new Encounter();
        history.add(newEncounter);
        return newEncounter;
        // instead of add profile manually to Array, use this method to history and return reference 
    }
    
    public void deleteEncounter(Encounter selectedEncounter){
        history.remove(selectedEncounter);
    }// create a void to delete profile
    
    
}
