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
public class houseDirectory {
    private ArrayList<House> Directory;
    
    public houseDirectory(){
    this.Directory=new ArrayList<House>();
    }

    public ArrayList<House> getDirectory() {
        return Directory;
    }

    public void setDirectory(ArrayList<House> Directory) {
        this.Directory = Directory;
    }
    
    public House addnewHouse(){
        House newHouse= new House();
        Directory.add(newHouse);
        return newHouse;
        // instead of add profile manually to Array, use this method to history and return reference 
    }
    
    public void deleteHouse(House selectedHouse){
        Directory.remove(selectedHouse);
    }// create a void to delete profile
    
}
