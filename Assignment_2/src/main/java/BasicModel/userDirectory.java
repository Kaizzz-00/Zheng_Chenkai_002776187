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
public class userDirectory {
    private ArrayList<Users> directory;
    
    public userDirectory(){
    this.directory=new ArrayList<Users>();
    }

    public ArrayList<Users> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<Users> directory) {
        this.directory = directory;
    }
    
    public Users addnewUser(){
        Users newUser= new Users();
        directory.add(newUser);
        return newUser;
        // instead of add profile manually to Array, use this method to history and return reference 
    }
    
    public void deleteUser(Users selectedUser){
        directory.remove(selectedUser);
    }// create a void to delete profile
    
}
