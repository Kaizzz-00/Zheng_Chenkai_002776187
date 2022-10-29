/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import Hospital.hospitalProfile;
import Patient.patientProfile;
import Patient.vitalSigns;
import java.util.Date;

/**
 *
 * @author kai
 */
public class encounterRecord {
    private doctorProfile enDoctor; //each encounter has a doctor and a patient 
    private patientProfile enPatient;
    private vitalSigns enVital;
    private Date enDate;
    private hospitalProfile enHospital;
    //private Date enDate;

    public hospitalProfile getEnHospital() {
        return enHospital;
    }

    public void setEnHospital(hospitalProfile enHospital) {
        this.enHospital = enHospital;
    }

    public doctorProfile getEnDoctor() {
        return enDoctor;
    }

    public void setEnDoctor(doctorProfile enDoctor) {
        this.enDoctor = enDoctor;
    }

    public patientProfile getEnPatient() {
        return enPatient;
    }

    public void setEnPatient(patientProfile enPatient) {
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
