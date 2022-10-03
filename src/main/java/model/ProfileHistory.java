/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author kai
 */
public class ProfileHistory {
    private ArrayList<Profile> history;
    public ProfileHistory() {
    this.history=new ArrayList<Profile>();
    }

    public ArrayList<Profile> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Profile> history) {
        this.history = history;
    }
    
    public Profile addnewProfile(){
        Profile newProfile= new Profile();
        history.add(newProfile);
        return newProfile;
        // instead of add profile manually to Array, use this method to history and return reference 
    }
    
    public void deleteProfile(Profile selectedProfile){
        history.remove(selectedProfile);
    }// create a void to delete profile
    
    public void updateProfile(int arrayIndex,Profile sp){
        history.set(arrayIndex, sp);
    }
}
