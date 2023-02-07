package com.brigelabs_cab_invoice_generator;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to day 30 cab invoice generator program");
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance travelled");
        double distance = scanner.nextDouble();
        System.out.println("Enter the time travelled");
        double timeInMin = scanner.nextDouble();
        double totalFare = invoiceGenerator.calculateFare(distance, timeInMin);
        System.out.println("Total fare is "+totalFare);
    }
}