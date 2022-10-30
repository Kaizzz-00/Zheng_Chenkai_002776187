/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import Hospital.Hospital;
import Patient.Patient;
import Patient.vitalSigns;
import java.util.Date;

/**
 *
 * @author kai
 */
public class Encounter {

    private Doctor enDoctor; //each encounter has a doctor and a patient 
    private Patient enPatient;
    private vitalSigns enVital;
    private Date enDate;
    private Hospital enHospital;
    private String enDiagnose;
    //private Date enDate;

    public String getEnDiagnose() {
        return enDiagnose;
    }

    public void setEnDiagnose(String enDiagnose) {
        this.enDiagnose = enDiagnose;
    }

  

    public Hospital getEnHospital() {
        return enHospital;
    }

    public void setEnHospital(Hospital enHospital) {
        this.enHospital = enHospital;
    }

    public Doctor getEnDoctor() {
        return enDoctor;
    }

    public void setEnDoctor(Doctor enDoctor) {
        this.enDoctor = enDoctor;
    }

    public Patient getEnPatient() {
        return enPatient;
    }

    public void setEnPatient(Patient enPatient) {
        this.enPatient = enPatient;
    }

    public vitalSigns getEnVital() {
        return enVital;
    }

    public void setEnVital(vitalSigns enVital) {
        this.enVital = enVital;
    }

    public Date getEnDate() {
        return enDate;
    }

    public void setEnDate(Date enDate) {
        this.enDate = enDate;
    }
    
    
}
