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
public class hospitalDirectory {
        private ArrayList<Hospital> directory;
        
        public hospitalDirectory()
    {
        this.directory=new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<Hospital> directory) {
        this.directory = directory;
    }

    
}
