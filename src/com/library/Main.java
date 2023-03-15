package com.library;

import java.util.List;
import java.util.Scanner;

import com.library.operations.crud.CrudOperations;
import com.library.entities.Book;
import com.library.entities.Library;

public class Main {

    public static void main(String[] args) {
        Library myLibrary = new Library();
        CrudOperations crudService = new CrudOperations();
        crudService.setLibrary(myLibrary);

        crudService.addBook(crudService.createBook("Mistborn", "Brandon Sanderson", "Fantasy", 123456789));
        crudService.addBook(crudService.createBook("Title1", "Author1", "Chick Lit", 987654321));
        crudService.addBook(crudService.createBook("Title2", "Author2", "Biography", 234567891));
        crudService.addBook(crudService.createBook("Title3", "Author3", "Historical", 198765432));

        boolean terminateProgram = false;
        Scanner in= new Scanner(System.in);
        for (;;) {
            System.out.println("Choose from the following options: 1 - create new book, 2 - update an existing book, 3 - find a book, 4 - list all books, 5 - exit the program");
            String option = in.nextLine();
            switch (option) {
                case "1":
                    System.out.println("Enter title:");
                    String bookTitle = in.nextLine();

                    System.out.println("Enter author name:");
                    String authorName = in.nextLine();

                    System.out.println("Enter genre:");
                    String genre = in.nextLine();

                    System.out.println("Enter isbn:");
                    String isbn = in.nextLine();

                    crudService.addBook(crudService.createBook(bookTitle, authorName, genre, Integer.parseInt(isbn)));
                    System.out.println("New book was added to library!");
                    break;
                case "2":
                    System.out.println("Enter title:");
                    String bookOldTitle = in.nextLine();

                    System.out.println("Enter new title:");
                    String bookNewTitle = in.nextLine();

                    crudService.updateBookTitle(bookNewTitle, bookOldTitle);
                    System.out.println("Book with title " + bookOldTitle + " was updated");
                    break;
                case "3":
                    System.out.println("Enter title:");
                    String title = in.nextLine();

                    Book book = crudService.readBook(title);
                    System.out.println("You asked for the following book: ");
                    System.out.println("Title: " + book.getTitle());
                    System.out.println("Author: " + book.getAuthors().iterator().next());
                    System.out.println("ISBN: ISBN" + book.getIsbn() );
                    break;
                case "4":
                    List<Book> books = crudService.readAllBooks();
                    for (Book currentBook : books) {
                        System.out.println(currentBook.getTitle());
                    }
                    break;
                case "5":
                    terminateProgram = true;
                    break;
            }
            if (terminateProgram) {
                break;
            }
        }
    }


}
