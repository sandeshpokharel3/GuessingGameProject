package com.sandesh.guessinggame;

import java.util.Scanner;  //scanner is used to take input from user which was import from java standard library!

public class Main {
//defines a public class main
    
    public static void main(String[] args) {
        // This is a entry point means java start executing code from here
        // mini project for guessing random number
        
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        int userNumber = 0;

        do { //do-while loop runs at least once no matter what we write in code
            
            System.out.println("Guess my number(0-100) :");
            userNumber = sc.nextInt(); //Reads an integer typed by user

            if (userNumber == myNumber) {
                System.out.println("wow....That's correct!");
                break; //Exits the loop immediately, game ends!
                
            } else if (userNumber > myNumber) {
                System.out.println("your number is too large");

            } else {
                System.out.println("your number is too small");
            }


        } while (userNumber >= 0); //loop continues if user enter non- negative number

        System.out.println("my number was : ");
        System.out.println(myNumber);
        
    } //This closes main method
}//This closes main class
