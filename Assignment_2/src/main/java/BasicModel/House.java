/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BasicModel;

/**
 *
 * @author kai
 */
public class House {
    private String Address;
    private String Aptnum;
    private String Name;
    private Community Com;

    public Community getCom() {
        return Com;
    }

    public void setCom(Community Com) {
        this.Com = Com;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getAptnum() {
        return Aptnum;
    }

    public void setAptnum(String Aptnum) {
        this.Aptnum = Aptnum;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

   
    @Override 
    public String toString(){
        return Name;
    }

    
}
