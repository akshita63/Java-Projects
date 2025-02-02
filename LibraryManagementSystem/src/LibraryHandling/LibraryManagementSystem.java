package LibraryHandling;
import java.util.Scanner;

public class LibraryManagementSystem {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Library library = new Library();

	        while (true) {
	            System.out.println("1. Add Book");
	            System.out.println("2. Remove Book");
	            System.out.println("3. Display Books");
	            System.out.println("4. Exit");

	            int choice = scanner.nextInt();

	            if (choice == 1) {
	                scanner.nextLine(); // to consume the newline character
	                System.out.print("Enter title: ");
	                String title = scanner.nextLine();
	                System.out.print("Enter author: ");
	                String author = scanner.nextLine();
	                System.out.print("Enter ISBN: ");
	                String ISBN = scanner.nextLine();
	                
	                library.addBook(new books(title, author, ISBN));
	            } else if (choice == 2) {
	                scanner.nextLine(); // to consume the newline character
	                System.out.print("Enter ISBN: ");
	                String ISBN = scanner.nextLine();
	                library.removeBook(ISBN);
	            } else if (choice == 3) {
	                library.displayBook();
	            } else if (choice == 4) {
	                break;
	            }
	        }

	        scanner.close();
	    }

}
