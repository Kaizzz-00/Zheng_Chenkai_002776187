/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;
import java.util.Date;
/**
 *
 * @author kai
 */
public class vitalSign {
    private double temperature;
    private double bloodPressure;
    private int pulseRate;
    private int respirationRate;
    //private Date date; still need the date and the time
    

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(int pulseRate) {
        this.pulseRate = pulseRate;
    }

    public int getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(int respirationRate) {
        this.respirationRate = respirationRate;
    }
    
    
    
}
