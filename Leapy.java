/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leapy;

import java.util.Scanner;

public class Leapy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        boolean isLeapYear = false;

        if (year < 1582) {
            System.out.println("Error: The year must be 1582 or later.");
        } else {
            if (year % 4 == 0) {
                if (year % 100 != 0 || year % 400 == 0) {
                    isLeapYear = true;
                }
            }

            if (isLeapYear) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }

        input.close();
    }
}
