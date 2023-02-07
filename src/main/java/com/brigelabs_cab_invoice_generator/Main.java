package com.brigelabs_cab_invoice_generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    static  double totalFare;
    public static void main(String[] args) {

        System.out.println("Welcome to day 30 cab invoice generator program");
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        System.out.println(invoiceGenerator.calculateFare());
    }
}