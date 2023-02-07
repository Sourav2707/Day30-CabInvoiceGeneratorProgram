package com.brigelabs_cab_invoice_generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InvoiceGenerator {
    final double farePerKm = 10;
    final double minFare = 5;
    double totalFare = 0;
    public double calculateFare(double distance, double timeInMin){
        totalFare = totalFare + (distance * farePerKm) + (timeInMin) + minFare;
        return totalFare;
    }
}
