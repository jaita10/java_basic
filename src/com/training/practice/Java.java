package com.training.practice;

import java.util.*;
public class Java {
 static String name;
 static String place;
 static int days;
 static int numberOfTickets;
 static double price=0.00;
 static double total=0.00;
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Passenger Name");
 System.out.println();
 String name=sc.nextLine();
 System.out.println();
 System.out.println("Enter the Place");
 System.out.println();
 String place=sc.nextLine();
 System.out.println();
 
if(!(place.equalsIgnoreCase("Beach")||place.equalsIgnoreCase("Pilgrimage")||place.equalsIgnoreCase("Heritage")
||
 
place.equalsIgnoreCase("Hills")||place.equalsIgnoreCase("Falls")||place.equalsIgnoreCase("Adventures")))
 {
 System.out.println();
 System.out.println(place+" is invalid place");
 System.out.println();
 System.exit(0);
 }
 System.out.println("Enter the no of Days");
 System.out.println();
 int days=sc.nextInt();
 if(days<=0)
{
 System.out.println();
 System.out.println(days+" is invalid days");
 System.out.println();
 System.exit(0);
 }
 System.out.println();
 System.out.println("Enter the no of Tickets");
 System.out.println();
 int numberOfTickets=sc.nextInt();
 if(numberOfTickets<=0)
 {
 System.out.println(numberOfTickets+" is invalid tickets");
 System.exit(0);
 }
 double totalAmount=0.0;
 if(place.equalsIgnoreCase("Beach"))
 {
 totalAmount=270.0*numberOfTickets*days;
 }
 if(place.equalsIgnoreCase("Pilgrimage"))
 {
 totalAmount=350.0*numberOfTickets*days;
 }
 if(place.equalsIgnoreCase("Heritage"))
 {
 totalAmount=430.0*numberOfTickets*days;
 }
 if(place.equalsIgnoreCase("Hills"))
 {
 totalAmount=780.0*numberOfTickets*days;
 }
 if(place.equalsIgnoreCase("Falls"))
 {
 totalAmount=1200.0*numberOfTickets*days;
}
 if(place.equalsIgnoreCase("Adventures"))
 {
 totalAmount=4500.0*numberOfTickets*days;
 }
 if(totalAmount>=1000)
 {
 double discount=totalAmount*0.15;
 totalAmount=totalAmount-discount;
 }
 System.out.println();
 System.out.printf("Bill Amount is %.2f",totalAmount);
 System.out.println();
 }
}