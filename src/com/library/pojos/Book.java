package com.library.pojos;

import java.util.Date;
import java.util.List;

public class Book extends Document {
   private Integer isbn;
   private Date publishedDate;
   private String publisher;
   private Integer pages;
   private String coverTypes;


   public Book(String title, String author, List<String> genres, int isbn) {
      super.setTitle(title);
      super.setAuthorName(author);
      super.setGenre(genres);

      this.isbn = isbn;
   }

   public Integer getIsbn() {
      return isbn;
   }
}
