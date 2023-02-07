package com.brigelabs_cab_invoice_generator;

public class InvoiceGenerator {
    final double farePerKm = 10;
    final double minFare = 5;
    public double calculateFare(double distance, double timeInMin){
        double totalFare = (distance * farePerKm) + (timeInMin) + minFare;
        return totalFare;
    }
}
