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
public class W3Warmup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HourlyEmployee e1 = new HourlyEmployee("Stanley", "Marsh", LocalDate.now(), 123, 12);
        System.out.println(e1);        
        System.out.println(e1.getEmployee_number());
        e1.addHoursWorked(10);
        System.out.println(e1.getPayCheque());
        
        CommissionEmployee e2 = new CommissionEmployee("Stanley", "Marsh", LocalDate.now(), 123, 10);
        System.out.println(e2);        
        System.out.println(e2.getEmployee_number());
        e2.recordSales(10);
        System.out.println(e2.getPayCheque());
        
        BasePlusCommissionEmployee be = new BasePlusCommissionEmployee("Stanley", "Marsh", LocalDate.now(), 123, 10, 10);
        System.out.println(be);        
        System.out.println(be.getEmployee_number());
        be.recordSales(10);
        System.out.println(be.getPayCheque());
        
    }
    
}
