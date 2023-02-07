package com.brigelabs_cab_invoice_generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InvoiceGenerator {
    final double farePerKm = 10;
    final double minFare = 5;
    double totalFare = 0;
    public double calculateFare(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rides");
        int rides = scanner.nextInt();
        for(int i = 0; i < rides; i++) {
            System.out.println("Enter the distance travelled");
            double distance = scanner.nextDouble();
            System.out.println("Enter the time travelled");
            double timeInMin = scanner.nextDouble();
            totalFare = totalFare + (distance * farePerKm) + (timeInMin) + minFare;
        }
        return totalFare;
    }
}
