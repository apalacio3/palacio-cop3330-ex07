/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Angelica Palacio
 */
package oop.example;
import java.text.DecimalFormat;
import java.util.Scanner;

public class RoomArea
{
    public static void main( String[] args)
    {
        System.out.print("What is the length of the room in feet? ");

        Scanner input = new Scanner(System.in);
        String firstNum = input.nextLine();
        double length = Double.parseDouble(firstNum);

        System.out.print("What is the width of the room in feet? ");

        String secondNum = input.nextLine();
        double width = Double.parseDouble(secondNum);

        double area = length * width;
        double convert = 0.09290304;
        double meters = area * convert;
        DecimalFormat d = new DecimalFormat("#.###");

        String output = "The area is\n"
                + d.format(area) + " square feet\n"
                + d.format(meters) + " square meters";

        System.out.println(output);
    }
}
