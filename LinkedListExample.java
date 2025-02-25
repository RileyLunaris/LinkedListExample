import java.util.Scanner;
/**
 * CSC 6301 - Module 4:
 * The Main Class of Linked List Used to demonstrate the functionality of linked
 * list insertion.
 *
 * @author Dustin McDaniel aka (Riley Lunaris)
 * @since 2025/02/11 | CSC6301 - Week 4
 */
public class LinkedListExample {
    /**
     * Main Method of the class
     *
     * Continuously grabs integer only inputs from the user and inserts them
     * into a Linked List Structure.  Linked List is displayed after each
     * insertion.  Program exists on non-integer inputs from the user.
     *
     * @param args default parameter for a main method - not used.
     * @since CSC6301 Week 4 :: 2025-02-10
     */
    public static void main(String[] args) {
        // I used a home-brew version of linked list here for simplicity
        LinkedList newList = new LinkedList();

        // user instructions
        System.out.println("Insertable Linked List");
        System.out.print("Enter Integers (non-integers to stop): ");

        // opens the scanner and closes automatically
        try (Scanner scanner = new Scanner(System.in);) {

            // main loop for user input
            while (true) {
                // parse and sends input to linked list
                try {newList.insert(Integer.parseInt(scanner.nextLine()));}
                // exists on non-integers
                catch (NumberFormatException e) {break;}
                // user list visualization
                newList.display();
            }
        }
    }
}