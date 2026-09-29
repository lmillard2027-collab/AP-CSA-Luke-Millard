package math;

import java.util.Random;
import java.util.Scanner;

/**
 * @author lmillard2027
 */
public class Math {

    // Assignment required method for rounding numbers
    public static double roundAvoid(double value, int places) {
        double scale = java.lang.Math.pow(10, places);
        return java.lang.Math.round(value * scale) / scale;
    }

    public static void main(String[] args) {
        Random generator = new Random();
        Scanner scanner = new Scanner(System.in);

        // ==========================================
        // PART 1: Sine, Cosine, Tangent (0-90 degrees)
        // ==========================================
        int angle = generator.nextInt(91); // Generates 0 to 90 inclusive

        // Java's Math trigonometric methods require radians, not degrees
        double radians = java.lang.Math.toRadians(angle);

        double sAngle = roundAvoid(java.lang.Math.sin(radians), 3);
        double cAngle = roundAvoid(java.lang.Math.cos(radians), 3);
        double tAngle = roundAvoid(java.lang.Math.tan(radians), 3);

        System.out.println("Number: " + angle + " Sine: " + sAngle + " Cosine: " + cAngle + " Tangent: " + tAngle);
        System.out.println();

        // ==========================================
        // PART 2: Radius (1.0 to 20.0), Area, and Volume
        // ==========================================
        double radius = 1.0 + (generator.nextDouble() * (20.0 - 1.0));

        double area = java.lang.Math.PI * java.lang.Math.pow(radius, 2);
        double volume = (4.0 / 3.0) * java.lang.Math.PI * java.lang.Math.pow(radius, 3);

        System.out.println("Radius: " + roundAvoid(radius, 3));
        System.out.println("Circle Area: " + roundAvoid(area, 3));
        System.out.println("Sphere Volume: " + roundAvoid(volume, 3));
        System.out.println();

        // ==========================================
        // PART 3: High Real Number, Sqrt, Natural Log, Log10
        // ==========================================
        double minLarge = 100000000.0;
        double maxLarge = 100000000000.0;
        double largeNum = minLarge + (generator.nextDouble() * (maxLarge - minLarge));

        double sqrtVal = java.lang.Math.sqrt(largeNum);
        double lnVal = java.lang.Math.log(largeNum);
        double log10Val = java.lang.Math.log10(largeNum);

        System.out.println("Large Number: " + roundAvoid(largeNum, 5));
        System.out.println("Square Root: " + roundAvoid(sqrtVal, 5));
        System.out.println("Natural Log (ln): " + roundAvoid(lnVal, 5));
        System.out.println("Log10: " + roundAvoid(log10Val, 5));
        System.out.println();

        // ==========================================
        // PART 4: Mass Required in Grams (E = mc^2)
        // ==========================================
        // Speed of light c = 299,792,458 m/s
        double c = 299792458.0;

        // E = m * c^2  =>  m (kg) = E / c^2
        double massKg = largeNum / java.lang.Math.pow(c, 2);
        double massGrams = massKg * 1000.0; // Convert kg to grams

        System.out.print("Enter desired decimal places for Mass (Grams): ");
        int massDecimals = scanner.nextInt();
        System.out.println("Mass required (Grams): " + roundAvoid(massGrams, massDecimals));
        System.out.println();

        // ==========================================
        // PART 5: User Input for Base and Exponent
        // ==========================================
        System.out.print("Enter a real number base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter an integer exponent: ");
        int exponent = scanner.nextInt();

        System.out.print("Enter desired decimal places for result: ");
        int powerDecimals = scanner.nextInt();

        double powerResult = java.lang.Math.pow(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + roundAvoid(powerResult, powerDecimals));

        scanner.close();
    }
}