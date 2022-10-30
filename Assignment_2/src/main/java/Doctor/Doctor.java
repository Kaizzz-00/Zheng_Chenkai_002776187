/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import BasicModel.Person;
import Patient.Patient;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kai
 */
public class Doctor extends Person{
    private int doctorID;
    private String Department;
    private String photo;
    
    private ArrayList<Patient> dctPatient; //one doctor should have multiple patients
    private ArrayList<Encounter> dctEncounter; //one doctor should have multiple encounters

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

    public ArrayList<Patient> getDctPatient() {
        return dctPatient;
    }

    public void setDctPatient(ArrayList<Patient> dctPatient) {
        this.dctPatient = dctPatient;
    }

    public ArrayList<Encounter> getDctEncounter() {
        return dctEncounter;
    }

    public void setDctEncounter(ArrayList<Encounter> dctEncounter) {
        this.dctEncounter = dctEncounter;
    }
    
}
