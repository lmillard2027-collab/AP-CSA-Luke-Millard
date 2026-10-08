import java.util.Scanner;

public class Enumweek2 {

    // 1a Enum: Days of the Week (1-7)
    enum Day {
        SUNDAY(1),
        MONDAY(2),
        TUESDAY(3),
        WEDNESDAY(4),
        THURSDAY(5),
        FRIDAY(6),
        SATURDAY(7);

        private final int dayNumber;

        Day(int dayNumber) {
            this.dayNumber = dayNumber;
        }

        public int getDayNumber() {
            return dayNumber;
        }
    }

    // 1b Enum: Months of the Year (1-12)
    enum Month {
        JANUARY(1),
        FEBRUARY(2),
        MARCH(3),
        APRIL(4),
        MAY(5),
        JUNE(6),
        JULY(7),
        AUGUST(8),
        SEPTEMBER(9),
        OCTOBER(10),
        NOVEMBER(11),
        DECEMBER(12);

        private final int monthNumber;

        Month(int monthNumber) {
            this.monthNumber = monthNumber;
        }

        public int getMonthNumber() {
            return monthNumber;
        }
    }

    public static void main(String[] args) {
        // ==========================================
        // PART 1a: Days of the Week
        // ==========================================
        System.out.println("=== PART 1a: DAYS OF THE WEEK ===");
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getDayNumber());
        }

        System.out.println();

        // ==========================================
        // PART 1b: Months of the Year
        // ==========================================
        System.out.println("=== PART 1b: MONTHS OF THE YEAR ===");
        for (Month month : Month.values()) {
            System.out.println(month + ": " + month.getMonthNumber());
        }

        System.out.println();

        // ==========================================
        // PART 2: CCHS Username & Graduation Year
        // ==========================================
        System.out.println("=== PART 2: USERNAME & GRADUATION YEAR ===");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your CCHS username (e.g., lmillard2027): ");
        String username = scanner.nextLine();

        // Extract the last 4 characters for the graduation year string
        String yearString = username.substring(username.length() - 4);

        // Parse string to int
        int gradYear = Integer.parseInt(yearString);
        int nextYear = gradYear + 1;

        // Convert graduation year to binary string
        String binaryGradYear = Integer.toBinaryString(gradYear);

        System.out.println("Your graduation year is: " + gradYear);
        System.out.println("The year after your graduation will be: " + nextYear);
        System.out.println("In computer language, you graduate in: " + binaryGradYear);

        scanner.close();
    }
}