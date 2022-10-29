/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BasicModel;

import java.util.ArrayList;

/**
 *
 * @author kai
 */
public class personHistory {
    private ArrayList<personProfile> history;
    
    public personHistory() {
    this.history=new ArrayList<personProfile>();
    }

    public ArrayList<personProfile> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<personProfile> history) {
        this.history = history;
    }
    
    public personProfile addnewPerson(){
        personProfile newPerson= new personProfile();
        history.add(newPerson);
        return newPerson;
        // instead of add profile manually to Array, use this method to history and return reference 
    }
    
    public void deletePerson(personProfile selectedPerson){
        history.remove(selectedPerson);
    }// create a void to delete profile
    
    public void updatePerson(int arrayIndex,personProfile sp){
        history.set(arrayIndex, sp);
    }
}
