/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conditionalassign;

import java.util.Scanner;

/**
 *
 * @author lmillard2027
 */
public class ConditionalAssign {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // budget
        final double MAX_BUDGET = 250.00;
        
        // total spent and count of items
        double totalSpent = 0.0;
        int count = 0;
        
        // Make all the items manually
        Item item1 = new Item();
        item1.setStrName("T Shirt");
        item1.setDblPrice(29.99);

        Item item2 = new Item();
        item2.setStrName("Shoes");
        item2.setDblPrice(125.99);

        Item item3 = new Item();
        item3.setStrName("Jeans");
        item3.setDblPrice(60.99);

        Item item4 = new Item();
        item4.setStrName("Jacket");
        item4.setDblPrice(250.00);

        Item item5 = new Item();
        item5.setStrName("Hat");
        item5.setDblPrice(25.99);

        Item item6 = new Item();
        item6.setStrName("Shorts");
        item6.setDblPrice(75.99);

        Item item7 = new Item();
        item7.setStrName("Blouse");
        item7.setDblPrice(88.99);

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("WELCOME TO MY STORE");
        System.out.println(item1.toString());
        System.out.println(item2.toString());
        System.out.println(item3.toString());
        System.out.println(item4.toString());
        System.out.println(item5.toString());
        System.out.println(item6.toString());
        System.out.println(item7.toString());
        System.out.println("Your max budget is: " + MAX_BUDGET);
        System.out.println("------------------------------------");

        while (true) {
            System.out.print("Enter item name (or type stop to quit): ");
            String userInput = inputScanner.nextLine();

            // check if user wants to stop
            if (userInput.equals("stop") || userInput.equals("exit") || userInput.equals("quit")) {
                System.out.println("Done shopping!");
                break;
            }

            // variables to hold item found info
            String foundName = "";
            double foundPrice = 0.0;
            boolean found = false;

            // check each item manually with simple if statements
            if (userInput.equalsIgnoreCase("T Shirt") || userInput.equalsIgnoreCase("TShirt") || userInput.equalsIgnoreCase("T-Shirt")) {
                foundName = item1.getStrName();
                foundPrice = item1.getDblPrice();
                found = true;
            } else if (userInput.equalsIgnoreCase("Shoes")) {
                foundName = item2.getStrName();
                foundPrice = item2.getDblPrice();
                found = true;
            } else if (userInput.equalsIgnoreCase("Jeans")) {
                foundName = item3.getStrName();
                foundPrice = item3.getDblPrice();
                found = true;
            } else if (userInput.equalsIgnoreCase("Jacket")) {
                foundName = item4.getStrName();
                foundPrice = item4.getDblPrice();
                found = true;
            } else if (userInput.equalsIgnoreCase("Hat")) {
                foundName = item5.getStrName();
                foundPrice = item5.getDblPrice();
                found = true;
            } else if (userInput.equalsIgnoreCase("Shorts")) {
                foundName = item6.getStrName();
                foundPrice = item6.getDblPrice();
                found = true;
            } else if (userInput.equalsIgnoreCase("Blouse")) {
                foundName = item7.getStrName();
                foundPrice = item7.getDblPrice();
                found = true;
            } else {
                System.out.println("That item is not real! Try again.");
            }

            // if item was found, check budget
            if (found == true) {
                if (totalSpent + foundPrice > MAX_BUDGET) {
                    System.out.println("WARNING! YOU ARE GOING OVER BUDGET!");
                    System.out.println("Item price: " + foundPrice);
                    System.out.println("Your current total: " + totalSpent);
                    System.out.println("Max budget: " + MAX_BUDGET);
                    System.out.println("Item was NOT added.");
                } else {
                    totalSpent = totalSpent + foundPrice;
                    count = count + 1;
                    System.out.println("You bought: " + foundName);
                    System.out.println("Total items bought: " + count);
                    System.out.println("Total money spent so far: $" + totalSpent);
                }
            }
            
            System.out.println(); // empty line
        }

        System.out.println("FINAL TOTAL:");
        System.out.println("Items count: " + count);
        System.out.println("Spent money: $" + totalSpent);
    }
}

// Item class
class Item {

    public String strName;
    public double dblPrice;

    // empty constructor
    public Item() {
        strName = "";
        dblPrice = 0.0;
    }

    // getters
    public String getStrName() {
        return strName;
    }

    public double getDblPrice() {
        return dblPrice;
    }

    // setters
    public void setStrName(String n) {
        strName = n;
    }

    public void setDblPrice(double p) {
        dblPrice = p;
    }

    // toString method
    public String toString() {
        return "Item: " + strName + ", Price: " + dblPrice;
    }
}