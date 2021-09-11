/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 18
 *  Copyright 2021 Mayank Goyal
 */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Press C to convert from Fahrenheit to Celsius. ");

    System.out.println("Press F to convert from Celsius to Fahrenheit. ");

    String convert_to = scanner.nextLine(); 

    String cel = "C";
    String fahr = "F";

    if (cel.equalsIgnoreCase(convert_to))
    {
      System.out.println("Your Choice: " + convert_to);

      System.out.println("Please enter the temperature in Fahrenheit: ");
      int fTemp = scanner.nextInt();

      int Ctemp = (fTemp - 32) * 5/9;

      System.out.print("The temperature in Celsius is " + Ctemp );
    }
    
    if(fahr.equalsIgnoreCase(convert_to))
    {
      System.out.println("Your Choice: " + convert_to);

      System.out.println("Please enter the temperature in Celsius: ");
      int cTemp = scanner.nextInt();

      int fTemp = (cTemp * 9/5) + 32;

      System.out.print("The temperature in Fahrenheit is " + fTemp);
    }
    
  }
}