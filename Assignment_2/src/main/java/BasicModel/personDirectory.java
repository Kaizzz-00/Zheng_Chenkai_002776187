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
public class personDirectory {
    private ArrayList<Person> history;
    
    public personDirectory() {
    this.history=new ArrayList<Person>();
    }

    public ArrayList<Person> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Person> history) {
        this.history = history;
    }
    
    public Person addnewPerson(){
        Person newPerson= new Person();
        history.add(newPerson);
        return newPerson;
        // instead of add profile manually to Array, use this method to history and return reference 
    }
    
    public void deletePerson(Person selectedPerson){
        history.remove(selectedPerson);
    }// create a void to delete profile
    
    public void updatePerson(int arrayIndex,Person sp){
        history.set(arrayIndex, sp);
    }
}
