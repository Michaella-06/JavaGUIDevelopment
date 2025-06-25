/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.SalaryComputation;

/**
 *
 * @author Michaella Eroles
 */
public class SalaryComp {
    public double netSalary(double h, double r, double t) {
        double gross = h * r;
        double taxAmount = gross * t;
        double netSalary = gross - taxAmount;
        return netSalary;
    }
    public int netSalary(int h, int r, int t) {
        int gross = h * r;
        int taxAmount = (gross * t)/100;
        int netSalary = gross - taxAmount;
        return netSalary;
    }
}
