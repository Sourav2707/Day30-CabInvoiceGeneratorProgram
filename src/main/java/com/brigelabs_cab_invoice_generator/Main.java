package com.brigelabs_cab_invoice_generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    static InvoiceGenerator carInvoice = new InvoiceGenerator();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Select an option");
            System.out.println("1.Add a ride details\n2.Search a user ride details\n3.Exit");
            int option = sc.nextInt();
            switch(option){
                case 1:
                    System.out.println("Normal ride or Premium ride??\nEnter '1' for Normal ride and '2' for Premium ride");
                    int rideType = sc.nextInt();
                    List<Integer> allRides = new ArrayList<>();
                    List<Integer> userDetails = new ArrayList<>();
                    System.out.println("Enter how many rides you took");
                    int rides = sc.nextInt();
                    System.out.println("Enter your user ID");
                    int userID = sc.nextInt();
                    for(int i=0; i<rides; i++){
                        System.out.println("Enter total distance covered in one ride");
                        int distance = sc.nextInt();
                        System.out.println("Enter total no.of minutes taken in one ride");
                        int min = sc.nextInt();
                        if(rideType == 1){
                            allRides.add(carInvoice.calculateFare(distance,min));
                        } else if (rideType == 2) {
                            allRides.add(carInvoice.calculatePremiumFare(distance,min));
                        }
                        else{
                            System.out.println("Enter correct option for Normal ride or Premium ride");
                        }
                    }
                    System.out.println("Fares for rides are");
                    for(int i = 0; i < allRides.size(); i++){
                        System.out.println(allRides.get(i));
                    }
                    userDetails = carInvoice.enhancedInvoice(userID,allRides);
                    System.out.println("Total no.of rides is " + userDetails.get(0)
                            + "\nTotal fare is " + userDetails.get(1)
                            + "\nAverage fare per ride is " + userDetails.get(2));
                    System.out.println();
                    break;
                case 2:
                    carInvoice.getUserDetails();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter correct option\n");
                    break;
            }
        }
    }
}