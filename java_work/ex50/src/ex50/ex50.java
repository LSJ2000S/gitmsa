package ex50;

import java.util.Scanner;

public class ex50 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Welcome to the Simple Text Adventure Game! =====");
        System.out.println("You have entered a forest. What would you like to do?");
        
        while (true) {
            System.out.println("\n1. Move forward.");
            System.out.println("2. Turn right.");
            System.out.println("3. Go back.");
            System.out.println("4. Quit the game.");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear input buffer
            
            switch (choice) {
                case 1:
                    System.out.println("As you move forward, you trip over a large stone. Ouch!");
                    break;
                case 2:
                    System.out.println("You turn right and see a small lake. A cool breeze blows.");
                    break;
                case 3:
                    System.out.println("As you go back, you bump into a large tree. Watch out!");
                    break;
                case 4:
                    System.out.println("Exiting the game. Thank you for playing!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }
    }
}
