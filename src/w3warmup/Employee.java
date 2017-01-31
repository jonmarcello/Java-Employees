/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3warmup;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Jon
 */


public abstract class Employee {
    private final String first_name, last_name;
    private LocalDate date_of_birth;
    private final int SIN, employee_number;
    private static int next_employee_number = 10001;
    
    public Employee(String FN, String LN, LocalDate DOB, int E_SIN) {
        first_name = FN;
        last_name = LN;
        date_of_birth = DOB;
        SIN = E_SIN;
        employee_number = next_employee_number;
        next_employee_number++;
    }
    
    @Override
    public String toString() {
        return first_name + " " + last_name;
    }
    
    public void setBirthday(LocalDate DOB) {
        Period p = Period.between(DOB, LocalDate.now());
        int age = p.getYears();

        if(age >= 15 && age <= 90) {
            date_of_birth = DOB;
        } else {
            throw new IllegalArgumentException("Your age of (" + age + ") is not between 15 and 90"); 
        }
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public int getSIN() {
        return SIN;
    }

    public int getEmployee_number() {
        return employee_number;
    }
    
    public abstract PayCheque getPayCheque();

}