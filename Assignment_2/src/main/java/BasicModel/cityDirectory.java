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
public class cityDirectory {
    
    private ArrayList<City> history;
    
    public cityDirectory(){
    this.history=new ArrayList<City>();
    }

    public ArrayList<City> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<City> history) {
        this.history = history;
    }
    
}
