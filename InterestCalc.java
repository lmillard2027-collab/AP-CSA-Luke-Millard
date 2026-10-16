package interestcalc;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class InterestCalc {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt for user input
        System.out.print("Input an amount in dollars: ");
        double amount = scan.nextDouble();

        System.out.print("Input a number of months for repayment: ");
        int months = scan.nextInt();

        // Instantiate the InterestRateCalculator "black box"
        InterestRateCalculator calc = new InterestRateCalculator(amount, months);

        // Execute calculations and print results
        calc.printRepaymentSummary();

        scan.close();
    }
}

/**
 * InterestRateCalculator acts as a black box that handles total interest,
 * monthly payments, and formatted output generation.
 */
class InterestRateCalculator {

    // Public constant for interest rate (e.g., 3.5%)
    public static final double RATE = 0.035;

    // Private instance variables (hidden from outside access)
    private final double amount;
    private final int months;

    /**
     * Constructor to initialize loan amount and term length.
     *
     * @param amount The initial principal dollar amount
     * @param months Total repayment duration in months
     */
    public InterestRateCalculator(double amount, int months) {
        this.amount = amount;
        this.months = months;
    }

    /**
     * Calculates the monthly payment amount including monthly interest.
     * Formula: (Principal / Months) + (Principal * Monthly Interest Rate)
     *
     * @return Calculated monthly payment
     */
    public double calculateMonthlyPayment() {
        if (months <= 0) {
            return 0.0;
        }
        // Base monthly principal repayment
        double basePrincipalPayment = this.amount / this.months;

        // Interest charged per payment based on total principal
        double monthlyInterest = this.amount * (RATE / 12);

        return basePrincipalPayment + monthlyInterest;
    }

    /**
     * Calculates total amount repaid over the full duration of the loan.
     *
     * @return Total dollar amount repaid
     */
    public double calculateTotalRepayment() {
        return calculateMonthlyPayment() * this.months;
    }

    /**
     * Prints a formatted summary displaying payments in currency format
     * and interest in percentage format.
     */
    public void printRepaymentSummary() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat percentFormat = NumberFormat.getPercentInstance(Locale.US);
        percentFormat.setMinimumFractionDigits(1);

        System.out.println("\n--- Repayment Summary ---");
        System.out.println("Loan Amount:           " + currencyFormat.format(this.amount));
        System.out.println("Interest Rate:         " + percentFormat.format(RATE));
        System.out.println("Repayment Period:      " + this.months + " months");
        System.out.println("Monthly Payment:       " + currencyFormat.format(calculateMonthlyPayment()));
        System.out.println("Total Amount Repaid:   " + currencyFormat.format(calculateTotalRepayment()));
    }
}