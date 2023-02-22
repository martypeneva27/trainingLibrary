package com.library.operations.crud;

import java.util.List;

import com.library.pojos.Book;
import com.library.pojos.Document;

public interface ICrudBooks {
   Book createBook(String title, String authorName, String genre, int isbn);
   void updateBookTitle(String newTitle, String oldTitle);
   Book readBook(int isbn);
   Book readBook(String title);
   List<Book> readAllBooks();
}
