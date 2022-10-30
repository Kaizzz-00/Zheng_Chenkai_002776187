/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import BasicModel.Person;
import BasicModel.Users;
import Hospital.Hospital;
import Patient.Patient;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kai
 */
public class Doctor extends Person{
    private String doctorID;
    private String Department;

    private Hospital hospital;
    private Users meUser;

    public Users getMeUser() {
        return meUser;
    }

    public void setMeUser(Users meUser) {
        this.meUser = meUser;
    }
    

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

   

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }


    
    @Override
    public String toString(){
        return super.getName();
    }
    
}
