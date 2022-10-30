/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import BasicModel.Application;
import BasicModel.House;
import BasicModel.Person;
import BasicModel.Users;
import Doctor.Doctor;
import Doctor.Encounter;
import java.util.Date;

/**
 *
 * @author kai
 */
public class Patient extends Person {
    private String patientID;
    private Integer age;
    private String gender;
    private vitalSign ownVital; //have their own vitals 
    private Doctor ownDoctor;
    private Encounter ownEncounter;// can edit their own encounters
    private House ownHouse;
    private Application application;
    private Users meUser;

    public Users getMeUser() {
        return meUser;
    }

    public void setMeUser(Users meUser) {
        this.meUser = meUser;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }
    
    
    public House getOwnHouse() {
        return ownHouse;
    }

    public void setOwnHouse(House ownHouse) {
        this.ownHouse = ownHouse;
    }

    public Doctor getOwnDoctor() {
        return ownDoctor;
    }

    public void setOwnDoctor(Doctor ownDoctor) {
        this.ownDoctor = ownDoctor;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    



    public vitalSign getOwnVital() {
        return ownVital;
    }

    public void setOwnVital(vitalSign ownVital) {
        this.ownVital = ownVital;
    }

    public Encounter getOwnEncounter() {
        return ownEncounter;
    }

    public void setOwnEncounter(Encounter ownEncounter) {
        this.ownEncounter = ownEncounter;
    }
    
    @Override
    public String toString(){
        return super.getName();
    }

    
}
