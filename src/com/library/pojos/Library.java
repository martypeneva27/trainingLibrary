package com.library.pojos;

import java.util.ArrayList;
import java.util.List;

public class Library { // this is my DB
   private List<Book> books;
   private List<Magazine> magazines;
   private List<Article> articles;

   public Library() {
      this.books = new ArrayList<>();
   }
   public List<Book> getBooks() {
      return books;
   }
}
