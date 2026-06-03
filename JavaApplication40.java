Package javaapplication40;
import java.util.Scanner;
/**
 *
 * @author 7500
 */
public class JavaApplication40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO XYZ LIRABRAY");
        System.out.println("-----------------------------");
        String[] books = {"Java Programming", "Data Structures", "Operating Systems", "Algorithms", "Database Systems"};
        boolean[] isAvailable = {true, true, true, true, true};

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. View Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: 
                    System.out.println("\nAvailable Books:");
                    for (int i = 0; i < books.length; i++) {
                        if (isAvailable[i]) {
                            System.out.println((i + 1) + ". " + books[i]);
                        }
                    }
                    break;

                case 2: 
                    System.out.print("\nEnter the number of the book you want to borrow: ");
                    int borrowIndex = scanner.nextInt() - 1;

                    if (borrowIndex >= 0 && borrowIndex < books.length) {
                        if (isAvailable[borrowIndex]) {
                            isAvailable[borrowIndex] = false;
                            System.out.println("You have successfully borrowed: " + books[borrowIndex]);
                        } else {
                            System.out.println("Sorry, the book is currently unavailable.");
                        }
                    } else {
                        System.out.println("Invalid book number.");
                    }
                    break;

                case 3: 
                    System.out.print("\nEnter the number of the book you want to return: ");
                    int returnIndex = scanner.nextInt() - 1;

                    if (returnIndex >= 0 && returnIndex < books.length) {
                        if (!isAvailable[returnIndex]) {
                            isAvailable[returnIndex] = true;
                            System.out.println("You have successfully returned: " + books[returnIndex]);
                        } else {
                            System.out.println("This book was not borrowed.");
                        }
                    } else {
                        System.out.println("Invalid book number.");
                    }
                    break;

                case 4: 
                    System.out.println("Exiting the Library Management System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
    
}

