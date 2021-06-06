/*
 *  UCF COP3330 Summer 2021 Assignment 18 Solution
 *  Copyright 2021 Sachin Mishra
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Press 1 if you wish to convert from Fahrenheit to Celsius, Press 0 to convert from Celsius to Fahrenheit");
        int temp = input.nextInt();
        double Fah = 0, Cel = 0;

        System.out.print("Please enter the temperature in ");
        if(temp == 1){
            System.out.print("Fahrenheit. ");
            Fah = input.nextDouble();
            Cel = (Fah - 32) * 5 / 9;
        }
        else if(temp == 0){
            System.out.print("Celsius. ");
            Cel = input.nextDouble();
            Fah = (Cel * 9 / 5) + 32;
        }
        else{
            System.exit(-1);
        }

        System.out.print("The temperature in ");

        if(temp == 1){
            System.out.printf("Celsius is %.2f. ", Cel);
        }
        else {
            System.out.printf("Fahrenheit is %.2f. ", Fah);
        }

    }
}