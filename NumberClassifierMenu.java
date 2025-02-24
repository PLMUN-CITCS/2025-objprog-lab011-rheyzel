import java.util.Scanner;

public class NumberClassifierMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object
        char userChoice; // To store the user's choice for continuing or exiting
        
        do {
            // Display the menu options
            System.out.println("\n=== Number Classifier Menu ===");
            System.out.println("1. Classify a number as positive, negative, or zero");
            System.out.println("2. Print a multiplication table for a given number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            
            int choice = input.nextInt(); // Read user choice
            
            switch (choice) {
                case 1: // Option 1: Classify number
                    System.out.print("Enter a number to classify: ");
                    int number = input.nextInt();
                    
                    // Classify the number as positive, negative, or zero
                    if (number > 0) {
                        System.out.println("The number " + number + " is positive.");
                    } else if (number < 0) {
                        System.out.println("The number " + number + " is negative.");
                    } else {
                        System.out.println("The number is zero.");
                    }
                    
                    // Check if the number is even or odd
                    if (number % 2 == 0) {
                        System.out.println("It is an even number.");
                    } else {
                        System.out.println("It is an odd number.");
                    }
                    break;

                case 2: // Option 2: Print multiplication table
                    System.out.print("Enter a number to display its multiplication table: ");
                    int tableNumber = input.nextInt();
                    
                    System.out.println("Multiplication Table for " + tableNumber + ":");
                    // Print multiplication table from 1 to 10
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tableNumber + " x " + i + " = " + (tableNumber * i));
                    }
                    break;

                case 3: // Option 3: Exit
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default: // Invalid input
                    System.out.println("Invalid option. Please choose between 1 and 3.");
            }
            
            // Ask if the user wants to return to the menu
            System.out.print("Do you want to return to the menu? (Y/N): ");
            input.nextLine(); // Consume the newline character
            userChoice = input.nextLine().toUpperCase().charAt(0);
            
        } while (userChoice == 'Y'); // Continue if the user enters 'Y'
        
        input.close(); // Close the Scanner object
    }
}

