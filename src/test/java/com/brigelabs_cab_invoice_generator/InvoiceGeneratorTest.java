package com.brigelabs_cab_invoice_generator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceGeneratorTest {
    InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
    String actual = "";
    @Test
    void calculateFare() {
            double[] distance = {10, 15};
            double[] timeInMin = {20, 30};
            int rides = 2;
            for(int i = 0; i < rides; i++) {
                actual = invoiceGenerator.calculateFare(distance[i], timeInMin[i], rides);
            }
            String expected = "Total number of rides: 2 Total fare: 310.0 Average Fare Per Ride: 155.0";
        Assertions.assertEquals(expected, actual);
    }
}