package randomphone;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lmillard2027
 */
public class RandomPhone {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        boolean running = true;

        while (running) {
            System.out.println("\nType 'p' for phone number, 'r' to roll dice, or 'q' to quit:");
            String inputnum = scan.next();

            // Phone generator block (runs once if input is "p")
            while (inputnum.equalsIgnoreCase("p")) {
                int num1 = generator.nextInt(8);
                int num2 = generator.nextInt(8);
                int num3 = generator.nextInt(8);

                int num4 = generator.nextInt(656);
                String MiddleSec = String.format("%03d", num4);

                int num5 = generator.nextInt(10);
                int num6 = generator.nextInt(10);
                int num7 = generator.nextInt(10);
                int num8 = generator.nextInt(10);

                System.out.println(num1 + "" + num2 + "" + num3 + "-" + MiddleSec + "-" + num5 + "" + num6 + "" + num7 + "" + num8);
                break; // Exit this specific block so it acts like a conditional check
            }

            // Dice generator block (runs once if input is "r")
            while (inputnum.equalsIgnoreCase("r")) {
                int num1000 = generator.nextInt(6) + 1; // 1 to 6
                System.out.println("You rolled: " + num1000);
                break; // Exit this specific block
            }

            // Exit block (runs once if input is "q")
            while (inputnum.equalsIgnoreCase("q")) {
                System.out.println("Goodbye!");
                running = false; // Stops the outer loop
                break;
            }
        }
        
        scan.close();
    }
}