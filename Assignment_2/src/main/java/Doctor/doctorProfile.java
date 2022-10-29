/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import BasicModel.personProfile;
import Patient.patientProfile;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kai
 */
public class doctorProfile extends personProfile{
    private int doctorID;
    private String Department;
    private String photo;
    
    private ArrayList<patientProfile> dctPatient; //one doctor should have multiple patients
    private ArrayList<encounterRecord> dctEncounter; //one doctor should have multiple encounters

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public ArrayList<patientProfile> getDctPatient() {
        return dctPatient;
    }

    public void setDctPatient(ArrayList<patientProfile> dctPatient) {
        this.dctPatient = dctPatient;
    }

    public ArrayList<encounterRecord> getDctEncounter() {
        return dctEncounter;
    }

    public void setDctEncounter(ArrayList<encounterRecord> dctEncounter) {
        this.dctEncounter = dctEncounter;
    }
    
}
