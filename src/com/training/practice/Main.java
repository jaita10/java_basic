package com.training.practice;

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your Name");
String name=sc.nextLine();
boolean d=name.matches("[a-zA-Z ]+");
if(d==false)
{
System.out.println("Invalid Name");
}
else
{
System.out.println("Enter the time duration");
int dur=sc.nextInt();
if(dur>=1 && dur<=24)
{
System.out.println("List of payment options");
System.out.println("1) Visa card");
System.out.println("2) Rupay card");
System.out.println("3) Master card");
System.out.println("Choose an option");
int ch=sc.nextInt();
while(ch>3||ch<=0)
{
System.out.println("Try again");
ch=sc.nextInt();
}
if(dur>=5 && ch==1)
{
double p=(dur*20)*0.80;
System.out.printf("Dear "+ name+" your bill amount is %.2f",p);
}
else if (dur>=5 && ch==2)
{
double p=(dur*20)*0.85;
System.out.printf("Dear "+ name+" your bill amount is %.2f",p);
}
else
{
double p=(dur*20);
System.out.printf("Dear "+ name+" your bill amount is %.2f",p);
}
}
else
{
System.out.println("Invalid Time Duration");
}
}
}
}
