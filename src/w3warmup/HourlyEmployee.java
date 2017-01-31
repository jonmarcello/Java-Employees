/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3warmup;

import java.time.LocalDate;

/**
 *
 * @author Jon
 */
public class HourlyEmployee extends Employee {
    private int hourlyRate;
    private float hoursWorked;
    private double payRate;
    private double minimumWage = 11.25;

    public HourlyEmployee(String FN, String LN, LocalDate DOB, int E_SIN, double payRate) {
        super(FN, LN, DOB, E_SIN);
        hoursWorked = 0;
        setPayRate(payRate);
    }
    
    private void setPayRate(double payRate) {
        if(payRate >= minimumWage) {
            this.payRate = payRate;
        } else {
            throw new IllegalArgumentException("Payrate must be larger than " + minimumWage);
        }
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
    public void addHoursWorked(float hours) {
        if(hours >= 0 && hours <= 14) {
            this.hoursWorked += hours;
        } else {
            throw new IllegalArgumentException("Working hours must be between 0 and 14");
        }
    }

    @Override
    public PayCheque getPayCheque() {
        PayCheque p = new PayCheque(this.getFirst_name() + " " + this.getLast_name(), getHoursWorked() * getPayRate());
        hoursWorked = 0;
        return p;
    }
    
    
}
