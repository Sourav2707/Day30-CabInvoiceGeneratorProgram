package com.brigelabs_cab_invoice_generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    static String result;
    public static void main(String[] args) {

        System.out.println("Welcome to day 30 cab invoice generator program");
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rides");
        int rides = scanner.nextInt();
        for(int i = 0; i < rides; i++) {
            System.out.println("Enter the distance travelled");
            double distance = scanner.nextDouble();
            System.out.println("Enter the time travelled");
            double timeInMin = scanner.nextDouble();
            result = invoiceGenerator.calculateFare(distance, timeInMin, rides);
        }
        System.out.println(result);
    }
}