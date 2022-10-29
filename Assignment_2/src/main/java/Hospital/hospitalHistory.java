/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import java.util.ArrayList;

/**
 *
 * @author kai
 */
public class hospitalHistory {
    
    private ArrayList<hospitalProfile> history;
        public hospitalHistory()
    {
        this.history=new ArrayList<hospitalProfile>();
    }

    public ArrayList<hospitalProfile> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<hospitalProfile> history) {
        this.history = history;
    }
    
}
