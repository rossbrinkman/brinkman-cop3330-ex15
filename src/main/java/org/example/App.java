package org.example;
import java.util.Objects;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        final String username = "ObjectOrientedGrader", password = "abc$123";
        String userInput, passInput;

        System.out.println( "Enter your username: " );
        userInput = scanner.nextLine();

        if(Objects.equals(userInput, username))
        {
            System.out.println( "Hey " + username + "! What's your password? " );
            passInput = scanner.nextLine();
            if(Objects.equals(passInput, password))
                System.out.println( "Welcome!" );
            else
                System.out.println( "Invalid Password! Get Out!" );
        }
        else
        {
            System.out.println( "I don't know you." );
        }
    }
}
