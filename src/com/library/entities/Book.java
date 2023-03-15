package com.library.entities;

import java.util.List;

import com.library.enums.BookType;

public class Book extends Document {
   private Integer isbn;
   private String publisher;
   private Integer pages;
   private String coverTypes;
   private BookType type;

   public Book(String title, List<Creator> author, List<Genre> genres, int isbn) {
      super.setTitle(title);
      super.setAuthors(author);
      super.setGenre(genres);

      this.type = BookType.BOOK;
      this.isbn = isbn;
   }

   public Integer getIsbn() {
      return isbn;
   }
}
