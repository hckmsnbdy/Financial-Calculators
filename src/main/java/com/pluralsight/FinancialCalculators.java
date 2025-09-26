package com.pluralsight;

import java.util.Scanner;

public class FinancialCalculators {

    // A mortgage calculator
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Greetings/Opening Message and Information
        System.out.println("=====Welcome To the Financial Calculator=====");
        System.out.println("Please enter required information:");
        System.out.println("1. Mortgage amount");
        System.out.println("2. Interest Rate");
        System.out.println("3. Term in years");
        
        // Mortgage amount input
        System.out.print("Enter the Mortgage amount: ");
        double amountMortgage = input.nextDouble();

        // Interest Rate input
        System.out.print("Enter the Interest Rate: ");
        double rateInterest = input.nextDouble();

        // Term in years input
        System.out.print("Enter the Term in years: ");
        double yearsTerm = input.nextDouble();
        // Variables
        double interestMonthly = (rateInterest/100)/12 ;
        double numOfMonthlyPayment = yearsTerm*12;
        double monthlyPayment = amountMortgage * (interestMonthly * Math.pow(1 + interestMonthly, numOfMonthlyPayment) / (Math.pow(1 + interestMonthly, numOfMonthlyPayment) - 1));
        double interestTotal =  (monthlyPayment* numOfMonthlyPayment) - amountMortgage;

        // Printing Results
        System.out.printf("Your monthly payment is : %.2f%n", monthlyPayment);
        System.out.printf("Your Loan amount is: %.2f%n", amountMortgage);
        System.out.printf("Your Term is: %.0f months%n", numOfMonthlyPayment);
        System.out.printf("Interest rate is: %.3f%%%n", rateInterest);
        System.out.printf("Your Total interest payment is: %.2f%n", interestTotal);
    }
}
