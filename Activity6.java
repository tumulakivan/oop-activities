/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaactivity;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author L15Y13W03
 */
public class Activity6 {
    private static final DecimalFormat ft = new DecimalFormat("0.00");
    
    public static float grossPay(int hours, int overtime, float ratePerHour, float overtimeRate){
        return (hours * ratePerHour) + (overtime * overtimeRate);
    }
    
    public static float netPay(float gross, float deductions){
        return gross - deductions;
    }
    
    public static void main(String[] args){
        int hours, overtime;
        float ratePerHour, overtimeRate, gross, deductions, pay;
        Scanner eeban = new Scanner(System.in);
        
        System.out.print("Hours worked: ");
        hours = eeban.nextInt();
        System.out.print("Rate per hour: ");
        ratePerHour = eeban.nextFloat();
        System.out.print("Overtime hours: ");
        overtime = eeban.nextInt();
        System.out.print("Overtime rate: ");
        overtimeRate = eeban.nextFloat();
        System.out.print("Deductions: ");
        deductions = eeban.nextFloat();
        
        gross = grossPay(hours, overtime, ratePerHour, overtimeRate);
        pay = netPay(gross, deductions);
        
        System.out.println("\n\n");
        System.out.println("Gross Pay: " + ft.format(gross));
        System.out.println("Net Pay: " + ft.format(pay));
        
        eeban.close();
    }
}
