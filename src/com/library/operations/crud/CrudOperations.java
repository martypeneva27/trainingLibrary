package com.library.operations.crud;

import java.util.LinkedList;
import java.util.List;

import com.library.entities.Book;
import com.library.entities.Creator;
import com.library.entities.Genre;
import com.library.entities.Library;

public class CrudOperations implements ILibrary, ICrudBooks, ICrudArticles {
   private Library library;

   public void setLibrary(Library library) {
      this.library = library;
   }

   @Override
   public Book createBook(String title, String authorName, String genre, int isbn) {
      List<Genre> genres = new LinkedList<>();

      Creator author = new Creator(authorName);
      List<Creator> authors = new LinkedList<>();

      authors.add(author);
      genres.add(new Genre(genre));

      Book newBook = new Book(title, authors, genres, isbn);
      author.getDocuments().add(newBook);
      return newBook;
   }

   @Override public Book readBook(int isbn) {
      return null;
   }

   @Override
   public Book readBook(String title) {
      List<Book> books = library.getBooks();
      for (Book book : books) {
         if (book.getTitle().contains(title)) {
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

   @Override
   public void addNewAuthor(Creator author, String title) {
      Book book = readBook(title);
      if (book != null) {
         book.getAuthors().add(author);
      }
   }
}
