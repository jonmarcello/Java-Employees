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
public class CommissionEmployee extends Employee {
    
    private double commissionRate, monthlySales;

    public CommissionEmployee(String FN, String LN, LocalDate DOB, int E_SIN, double comRate) {
        super(FN, LN, DOB, E_SIN);
        
        monthlySales = 0;
        setCommissionRate(comRate);
    }

    private void setCommissionRate(double comRate) {
        if(comRate > 0 && comRate < 100) {
            this.commissionRate = comRate;
        } else {
            throw new IllegalArgumentException("The commission must be 0-99");
        }
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getMonthlySales() {
        return monthlySales;
    }
    
    public void recordSales(double salesAmount) {
        if(salesAmount > 0) {
            this.monthlySales += salesAmount;
        } else {
            throw new IllegalArgumentException("Sales amount must be breater than 0");
        }
    }
    
    @Override
    public PayCheque getPayCheque() {
        double amount = (commissionRate / 100) * monthlySales;
        
        PayCheque p = new PayCheque(super.toString(), amount);
        
        monthlySales = 0;
        
        return p;
    }
    
}
