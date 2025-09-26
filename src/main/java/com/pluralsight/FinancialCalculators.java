package com.pluralsight;

import java.util.Scanner;

public class FinancialCalculators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====Welcome To the Financial Calculator=====");
        //System.out.println("Please Choose a Calculator:");
        System.out.println("1. Mortgage Calculator");
        System.out.println("2. CD Calculator");

        System.out.print("Please Choose a Calculator: ");
        int calculatorSelection = input.nextInt();


        if (calculatorSelection == 1) {
            mortgageCalculator();}

        else if (calculatorSelection == 2) {
                cdCalculator();}
        else {
                System.out.println("Invalid Selection");}
    }

    // A mortgage calculator
    public static void mortgageCalculator() {
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

    public static void cdCalculator(){
    Scanner input = new Scanner(System.in);
    System.out.println("=====Welcome To the CD Calculator=====");
    System.out.println("Please enter required information:");
    System.out.println("1. Deposit amount");
    System.out.println("2. Interest Rate");
    System.out.println("3. Term in years");

    // Deposit amount input
    System.out.print("Enter the Deposit amount: ");
    double amountDeposit = input.nextDouble();


    // Interest Rate input
    System.out.print("Enter the Interest Rate: ");
    double rateInterest = input.nextDouble();


    // Term in years input
    System.out.print("Enter the Term in years: ");
    double yearsTerm = input.nextDouble();
    double totalDays = yearsTerm*365;

    double futureValue = amountDeposit * Math.pow(1 + (rateInterest / 365), totalDays);
    double totalInterest = futureValue - amountDeposit;

    //Result Printings
        System.out.println("Future Value is: " + futureValue);
        System.out.println("Total Interest Earned is: " + totalInterest);

    }
}
