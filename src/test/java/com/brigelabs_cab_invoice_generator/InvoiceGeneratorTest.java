package com.brigelabs_cab_invoice_generator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceGeneratorTest {
    InvoiceGenerator carInvoice = new InvoiceGenerator();

    @Test
    public void fareOneRide(){
        int distance = 5;
        int timeInMin = 13;
        int totalFare = carInvoice.calculateFare(distance, timeInMin);
        Assertions.assertEquals(68, totalFare);
    }
    @Test
    public void enhancedInvoice(){
        List<Integer> list = Arrays.asList(carInvoice.calculateFare(5,13),
                carInvoice.calculateFare(7,16),
                carInvoice.calculateFare(3,9));
        Assertions.assertEquals(3,carInvoice.enhancedInvoice(list).get(0));
        Assertions.assertEquals(203,carInvoice.enhancedInvoice(list).get(1));
        Assertions.assertEquals(67,carInvoice.enhancedInvoice(list).get(2));
    }
}