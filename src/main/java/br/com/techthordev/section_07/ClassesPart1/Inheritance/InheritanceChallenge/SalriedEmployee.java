package br.com.techthordev.section_07.ClassesPart1.Inheritance.InheritanceChallenge;

public class SalriedEmployee extends Employee {

    double annualSalary;
    boolean isRetired;

    public SalriedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {

        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;
        return (int) adjustedPay;
    }

    public void retire() {

        terminate("12/12/2026");
        isRetired = true;
    }
}
