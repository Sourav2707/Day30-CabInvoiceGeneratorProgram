package com.brigelabs_cab_invoice_generator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceGeneratorTest {
    InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
    @Test
    void calculateFare() {
            double distance = 15;
            double timeInMin = 30;
            double actual = invoiceGenerator.calculateFare(distance, timeInMin);
        Assertions.assertEquals(185, actual);
    }
}