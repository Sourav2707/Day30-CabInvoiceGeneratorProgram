package com.brigelabs_cab_invoice_generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InvoiceGenerator {
    final double farePerKm = 10;
    final double minFare = 5;
    double totalFare = 0;
    double averagefare = 0;
    public String calculateFare(double distance, double timeInMin, int rides){
        totalFare = totalFare + (distance * farePerKm) + (timeInMin) + minFare;
        averagefare = totalFare / (double) rides;
        return "Total number of rides: "+rides+" Total fare: "+totalFare+" Average Fare Per Ride: "+averagefare;
    }
}
