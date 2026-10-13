/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task_02;

/**
 *
 * @author 
 */
public class SalesManager extends Employee {

    private final double sales;
    private final double commissionRate;

    public SalesManager(String name, double baseSalary,
            double sales, double commissionRate) {
        super(name, baseSalary);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay() {
        double commission = sales * commissionRate;
        return baseSalary + commission;
    }
}
