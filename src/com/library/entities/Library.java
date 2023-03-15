package com.library.entities;

import java.util.ArrayList;
import java.util.List;

public class Library { // this is my DB
   private List<Book> books;
   private List<Magazine> magazines;
   private List<Newspaper> newspapers;
   private List<Document> articles;

   public Library() {
      this.books = new ArrayList<>();
   }
   public List<Book> getBooks() {
      return books;
   }
}
