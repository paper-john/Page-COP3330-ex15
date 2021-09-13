package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Page
 */

import java.util.Scanner;

public class PassValidation
{
    public static void main( String[] args )
    {
        //define variable
        Scanner input = new Scanner(System.in);

        String pass1, pass2;

        //User inputs password
        pass1 = "abc$123";
        System.out.print("What is the password: ");
        pass2 = input.nextLine();

        if (pass1.equals(pass2))
        {
            System.out.print("Welcome!");
        }
        else
        {
            System.out.print("I don't know you.");
        }
    }
}
