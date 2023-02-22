package com.library.operations.crud;

import java.util.LinkedList;
import java.util.List;

import com.library.pojos.Book;
import com.library.pojos.Library;

public class CrudOperations implements ILibrary, ICrudBooks {
   private Library library;

   public void setLibrary(Library library) {
      this.library = library;
   }

   @Override
   public Book createBook(String title, String authorName, String genre, int isbn) {
      List<String> genres = new LinkedList<>();
      genres.add(genre);
      return new Book(title, authorName, genres, isbn);
   }

   @Override public Book readBook(int isbn) {
      return null;
   }

   @Override
   public Book readBook(String title) {
      List<Book> books = library.getBooks();
      for (Book book : books) {
         if (book.getTitle().equals(title)) {
            return book;
         }
      }
      return null;
   }

   @Override
   public List<Book> readAllBooks() {
      return library.getBooks();
   }

   @Override
   public void updateBookTitle(String newTitle, String oldTitle) {
      Book book = readBook(oldTitle);
      if (book != null) {
         book.setTitle(newTitle);
      } else {
         System.out.println("We couldn't find book with title: " + oldTitle);
      }
   }

   @Override
   public void addBook(Book book) {
      library.getBooks().add(book);
   }
}
