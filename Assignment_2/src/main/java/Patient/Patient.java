/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import BasicModel.Person;
import Doctor.Encounter;
import java.util.Date;

/**
 *
 * @author kai
 */
public class Patient extends Person {
    private Integer patientID;
    private Integer age;
    private String gender;
    private vitalSigns ownVital; //have their own vitals 
    private Encounter ownEncounter;// can edit their own encounters

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    
    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
    }


    public vitalSigns getOwnVital() {
        return ownVital;
    }

    public void setOwnVital(vitalSigns ownVital) {
        this.ownVital = ownVital;
    }

    public Encounter getOwnEncounter() {
        return ownEncounter;
    }

    public void setOwnEncounter(Encounter ownEncounter) {
        this.ownEncounter = ownEncounter;
    }
    

    
}
