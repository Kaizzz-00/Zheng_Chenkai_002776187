package model;

import java.util.ArrayList;

public class profileHistory {
    private ArrayList<profile> history;
    public profileHistory(){
        this.history=new ArrayList<profile>();
    }

    public ArrayList<profile> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<profile> history) {
        this.history = history;
    }
}
