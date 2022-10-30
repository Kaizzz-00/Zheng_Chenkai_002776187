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
    public Hospital addnewHospital(){
        Hospital newHospital= new Hospital();
        directory.add(newHospital);
        return newHospital;
        // instead of add profile manually to Array, use this method to history and return reference 
    }
    
    public void deleteHospital(Hospital selectedHospital){
        directory.remove(selectedHospital);
    }// create a void to delete profile
    
    public void updateHospital(int arrayIndex,Hospital sh){
        directory.set(arrayIndex, sh);
    }
    
}
