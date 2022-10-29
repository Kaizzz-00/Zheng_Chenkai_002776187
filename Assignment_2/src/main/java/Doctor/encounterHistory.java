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
    private ArrayList<encounterRecord> history;
    
    public encounterHistory() {
    this.history=new ArrayList<encounterRecord>();
    }

    public ArrayList<encounterRecord> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<encounterRecord> history) {
        this.history = history;
    }
    
    
}
