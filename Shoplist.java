package shoplist;

import java.util.ArrayList;
import java.util.Scanner;

public class Shoplist {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 1. Move ArrayList declaration OUTSIDE the loop so items persist
        ArrayList<ShoppingListItem> list = new ArrayList<ShoppingListItem>();
        String another = "y";

        // Step 1: Collect items from the user
        while (another.equalsIgnoreCase("y")) {
            System.out.print("Enter the name of the item to add to the list: ");
            String itemName = scan.next();

            System.out.print("Enter the price of the item to add to the list: ");
            double itemPrice = scan.nextDouble();

            System.out.print("Enter item quantity: ");
            int itemQuantity = scan.nextInt();

            // Create item and add to list
            ShoppingListItem item = new ShoppingListItem(itemName, itemPrice, itemQuantity);
            list.add(item);

            System.out.print("Do you want to add another item? (y/n): ");
            another = scan.next();
            System.out.println();
        }

        // Step 2: Display initial list and total cost
        displayList(list);

        // Step 3: Allow user to remove an item
        if (!list.isEmpty()) {
            System.out.print("Do you want to remove an item? (y/n): ");
            String removeChoice = scan.next();

            if (removeChoice.equalsIgnoreCase("y")) {
                System.out.print("Enter the number of the item to remove: ");
                int itemNumber = scan.nextInt();

                // Convert 1-based user input to 0-based ArrayList index
                int index = itemNumber - 1;
                if (index >= 0 && index < list.size()) {
                    ShoppingListItem removedItem = list.remove(index);
                    System.out.println("Removed: " + removedItem.getItemName() + "\n");
                } else {
                    System.out.println("Invalid item number.\n");
                }

                // Step 4: Redisplay updated list and recalculated total cost
                displayList(list);
            }
        }
        
        scan.close();
    }

    /**
     * Helper method to display numbered items and calculate total cost
     */
    public static void displayList(ArrayList<ShoppingListItem> list) {
        System.out.println("=== Shopping List ===");
        if (list.isEmpty()) {
            System.out.println("Your shopping list is empty.");
            return;
        }

        double totalCost = 0.0;
        for (int i = 0; i < list.size(); i++) {
            ShoppingListItem item = list.get(i);
            double itemTotal = item.getItemPrice() * item.getItemQuantity();
            totalCost += itemTotal;

            // Display 1-based numbered list with item details
            System.out.printf("%d. %s - %d x $%.2f = $%.2f%n", 
                (i + 1), 
                item.getItemName(), 
                item.getItemQuantity(), 
                item.getItemPrice(), 
                itemTotal
            );
        }
        System.out.printf("TOTAL COST: $%.2f%n%n", totalCost);
    }
}

class ShoppingListItem {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;

    // Fixed constructor parameter assignment
    public ShoppingListItem(String itemName, double itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }
}