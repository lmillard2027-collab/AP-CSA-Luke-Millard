/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doforloop;

/**
 *
 * @author lmillard2027
 */
public class Doforloop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Pattern A:");
        // Pattern A: Left-aligned inverted triangle
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("\nPattern B:");
        // Pattern B: Right-aligned upright triangle
        for (int i = 1; i <= 10; i++) {
            // Print leading spaces
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(' ');
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("\nPattern C:");
        // Pattern C: Right-aligned inverted triangle
        for (int i = 10; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(' ');
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("\nPattern D:");
        // Pattern D: Diamond pattern (Top Half)
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(' ');
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print('*');
            }
            System.out.println();
        }
        // Pattern D: Diamond pattern (Bottom Half)
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(' ');
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print('*');
            }
            System.out.println();
        }
        
    }
    
}