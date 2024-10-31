import java.util.LinkedList;
import java.util.Scanner;

class Book {
    private long ISBN_no;
    private String name;
    private int edition;
    private String author;
    private String publisher;
    private int status; // 0: Available, 1: Issued, 2: Reserved

    public Book(long ISBN_no, String name, int edition, String author, String publisher) {
        if (ISBN_no < 0 || ISBN_no > 9999999999999L) {
            throw new IllegalArgumentException("Invalid ISBN number");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (edition < 1) {
            throw new IllegalArgumentException("Edition must be a positive integer");
        }
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Author cannot be empty");
        }
        if (publisher == null || publisher.isEmpty()) {
            throw new IllegalArgumentException("Publisher cannot be empty");
        }
        this.ISBN_no = ISBN_no;
        this.name = name;
        this.edition = edition;
        this.author = author;
        this.publisher = publisher;
        this.status = 0; // Initially available
    }

    public int check_Status() {
        return status;
    }

    public void change_Status(int newStatus) {
        if (newStatus < 0 || newStatus > 2) {
            throw new IllegalArgumentException("Invalid status value");
        }
        this.status = newStatus;
    }

    public void display() {
        System.out.println("ISBN: " + ISBN_no);
        System.out.println("Name: " + name);
        System.out.println("Edition: " + edition);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Status: " + getStatusString());
        System.out.println();
    }

    private String getStatusString() {
        switch (status) {
            case 0:
                return "Available";
            case 1:
                return "Issued";
            case 2:
                return "Reserved";
            default:
                return "Unknown";
        }
    }

    // New method to get the ISBN number
    public long getISBN() {
        return ISBN_no;
    }
}

public class BookTester {
    public static void main(String[] args) {
        LinkedList<Book> books = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        do {
            System.out.print("Enter ISBN number: ");
            long isbn = scanner.nextLong();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter book name: ");
            String name = scanner.nextLine();

            System.out.print("Enter edition: ");
            int edition = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter author name: ");
            String author = scanner.nextLine();

            System.out.print("Enter publisher name: ");
            String publisher = scanner.nextLine();

            // Create a new book object and add it to the list
            Book newBook = new Book(isbn, name, edition, author, publisher);
            books.add(newBook);

            System.out.print("Do you want to add another book? (yes/no): ");
            continueInput = scanner.nextLine();
        } while (continueInput.equalsIgnoreCase("yes"));

        // Displaying all books in the list
        System.out.println("All books in the list:");
        for (Book book : books) {
            book.display();
        }

        // Option to change the status of a book
        System.out.print("Do you want to change the status of a book? (yes/no): ");
        String changeStatus = scanner.nextLine();
        if (changeStatus.equalsIgnoreCase("yes")) {
            System.out.print("Enter the ISBN of the book to change status: ");
            long isbnToChange = scanner.nextLong();
            for (Book book : books) {
                if (book.getISBN() == isbnToChange) { // Use getISBN() method
                    System.out.print("Enter new status (0: Available, 1: Issued, 2: Reserved): ");
                    int newStatus = scanner.nextInt();
                    book.change_Status(newStatus);
                    System.out.println("Status updated.");
                    break;
                }
            }
        }

        // Displaying all books after status change
        System.out.println("All books in the list after status change:");
        for (Book book : books) {
            book.display();
        }
    }
}