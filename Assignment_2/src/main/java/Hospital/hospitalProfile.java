/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import BasicModel.cityProfile;
import BasicModel.communityProfile;

/**
 *
 * @author kai
 */
public class hospitalProfile {
    private String hosName;
    private String hosAddress;
    private cityProfile city;
    private communityProfile community;

    public String getHosName() {
        return hosName;
    }

    public void setHosName(String hosName) {
        this.hosName = hosName;
    }

    public String getHosAddress() {
        return hosAddress;
    }

    public void setHosAddress(String hosAddress) {
        this.hosAddress = hosAddress;
    }

    public cityProfile getCity() {
        return city;
    }

    public void setCity(cityProfile city) {
        this.city = city;
    }

    public communityProfile getCommunity() {
        return community;
    }

    public void setCommunity(communityProfile community) {
        this.community = community;
    }
    
}
