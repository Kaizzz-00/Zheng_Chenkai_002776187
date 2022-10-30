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
public class communityDirectory {
    private ArrayList<Community> history;
    
    public communityDirectory(){
    this.history=new ArrayList<Community>();
    }

    public ArrayList<Community> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Community> history) {
        this.history = history;
    }
    
}
