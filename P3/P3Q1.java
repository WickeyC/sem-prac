package P3;

import java.util.Scanner;

// Test Data
// 48000
// Total tax to pay is 1250.0

public class P3Q1 {

    public static void main(String[] args) {
        double income_tax = 0.0, income;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your yearly gross income ");

        income = sc.nextDouble();
        sc.close();

        if (income <= 39999) {
            income_tax = 0;
        } else if (income <= 59999) {
            income_tax = getTax(income, 40000, 0.03, 5000, 0.01);
        } else if (income <= 89999) {
            income_tax = getTax(income, 60000, 0.04, 5000, 0.01);
        } else if (income <= 119999) {
            income_tax = getTax(income, 90000, 0.03, 5000, 0.0125);
        } else {
            income_tax = getTax(income, 120000, 0.03, 5000, 0.013);
        }
        System.out.println("Total tax to pay is " + income_tax);
    }

    public static double getTax(double income, double firstValue, double firstRate, double subValue, double subRate) {
        double subsequentIncome = income - firstValue;
        return firstValue * firstRate + (subValue * subRate * Math.floor((subsequentIncome) / subValue));
    }
}