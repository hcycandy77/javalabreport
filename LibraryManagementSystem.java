

package com.mycompany.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private final String title;
    private final String author;
    private int quantity;

    public Book(String title, String author, int quantity) {
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Library {
    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Library Books:");
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Quantity: " + book.getQuantity());
                System.out.println("--------------------");
            }
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.getQuantity() > 0) {
                    book.setQuantity(book.getQuantity() - 1);
                    System.out.println("Book borrowed successfully.");
                    return;
                } else {
                    System.out.println("Book is out of stock.");
                    return;
                }
            }
        }
        System.out.println("Book not found in the library.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.setQuantity(book.getQuantity() + 1);
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter book title: ");
                    scanner.nextLine();
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book quantity: ");
                    int quantity = scanner.nextInt();
                    Book book = new Book(title, author, quantity);
                    library.addBook(book);
                    System.out.println("Book added successfully.");
                }
                case 2 -> library.displayBooks();
                case 3 -> {
                    System.out.print("Enter the title of the book to borrow: ");
                    scanner.nextLine();
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle);
                }
                case 4 -> {
                    System.out.print("Enter the title of the book to return: ");
                    scanner.nextLine();
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                }
            }
        }}}
      

