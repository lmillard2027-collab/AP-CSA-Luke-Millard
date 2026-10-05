/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberformating;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lmillard2027
 */
public class Numberformating {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double totalStudents, numB, numG, DnumG, DnumB;
       
        Scanner scan = new Scanner(System.in);
       
        // User inputs number of students and number of girls and number of boys is calculated from that
        System.out.println("Enter total number of students at the school ");
        totalStudents = scan.nextInt();
        System.out.println("Enter the number of girls at the school ");
        numG = scan.nextInt();      
        numB = totalStudents - numG;
       
        // This calculates the percent of boys and girls as a decimal
        DnumG = numG / totalStudents;
        DnumB = numB / totalStudents;
       
        NumberFormat fmt1 = NumberFormat.getPercentInstance();
       
        // Prints out percents of boys and girls formatted as a percent
        System.out.println("Percent of girls " + fmt1.format(DnumG));
        System.out.println("Percent of boys " + fmt1.format(DnumB));
        System.out.println();
       
        // =========================================================================
        // PART 2: Currency Conversion (Pounds & Euros)
        // =========================================================================
        double dMoneyInput, bMoneyOutput, eMoneyOutput;
        
        System.out.println("Enter an amount of money in dollars and cents:");
        dMoneyInput = scan.nextDouble();
       
        // Exchange rates: 0.75 GBP to $1, 0.86 EUR to $1
        double gbpRate = 0.75;
        double eurRate = 0.86;
       
        // British Pound Conversion
        Locale ukLocale = Locale.UK;
        NumberFormat fmt2 = NumberFormat.getCurrencyInstance(ukLocale);
        fmt2.setMinimumFractionDigits(2);
       
        bMoneyOutput = dMoneyInput * gbpRate;
        System.out.println("\nExchange rate: " + gbpRate + " pence per $1 USD");
        System.out.println("Amount in pounds: " + fmt2.format(bMoneyOutput));
       
        // Euro Conversion (Using European German locale for standard Euro formatting)
        NumberFormat fmtEUR = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        fmtEUR.setMinimumFractionDigits(2);
        
        eMoneyOutput = dMoneyInput * eurRate;
        System.out.println("Exchange rate: " + eurRate + " eCents per $1 USD");
        System.out.println("Amount in Euros: " + fmtEUR.format(eMoneyOutput));
        System.out.println();

        // =========================================================================
        // PART 3: Dynamic Pi Precision
        // =========================================================================
        System.out.println("Enter an integer from 0 to 15 to set decimal precision for Pi:");
        int precision = scan.nextInt();

        // Range check validation
        if (precision < 0 || precision > 15) {
            System.out.println("Invalid entry. Defaulting precision to 2 decimal places.");
            precision = 2;
        }

        // Configure NumberFormat instance dynamically to the chosen number of decimal places
        NumberFormat piFmt = NumberFormat.getNumberInstance();
        piFmt.setMinimumFractionDigits(precision);
        piFmt.setMaximumFractionDigits(precision);

        System.out.println("Pi formatted to " + precision + " decimal place(s): " + piFmt.format(Math.PI));
        System.out.println();

        // =========================================================================
        // PART 4: Large Random Number Generation (100,000,000 to 999e18)
        // =========================================================================
        // Upper bound: 999e18 = 999 * 10^18 (requires BigInteger/BigDecimal for high magnitude)
        BigInteger min = new BigInteger("100000000");
        BigInteger max = new BigDecimal("999e18").toBigInteger();

        // Compute range interval: (max - min) + 1
        BigInteger range = max.subtract(min).add(BigInteger.ONE);
        Random rand = new Random();
        BigInteger randomBigInt;

        // Rejection sampling guarantees standard uniform random distribution in range
        do {
            randomBigInt = new BigInteger(range.bitLength(), rand);
        } while (randomBigInt.compareTo(range) >= 0);

        BigInteger result = min.add(randomBigInt);

        // Convert to BigDecimal and format as plain decimal without scientific notation
        BigDecimal plainOutput = new BigDecimal(result);

        System.out.println("Generated Random Decimal Number (No Scientific Notation):");
        System.out.println(plainOutput.toPlainString());

        scan.close();
    }
}