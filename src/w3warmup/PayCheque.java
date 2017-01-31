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
public class PayCheque {
    private double amount;
    private LocalDate dateIssued;
    private int chequeNum;
    private static int nextChequeNum;
    private String employeeName, notes;
    
    public PayCheque(String employee, double amount) {
        employeeName = employee;
        chequeNum = nextChequeNum;
        nextChequeNum++;
        dateIssued = LocalDate.now();
        
        notes = "";
        setChequeAmount(amount);
        
    }

    private void setChequeAmount(double amount) {
        if(amount > 0) {
            this.amount = amount;
        } else {
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDateIssued() {
        return dateIssued;
    }

    public int getChequeNum() {
        return chequeNum;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getNotes() {
        return notes;
    }
    
    @Override
    public String toString() {
        return "Cheque #" + getChequeNum() + " for " + getAmount() + " made out to " + getEmployeeName();
    }
}
