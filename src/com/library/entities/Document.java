package com.library.entities;

import java.util.Date;
import java.util.List;

public abstract class Document {
   private String title;
   private List<Creator> authors;
   private List<Creator> narrators;
   private List<Genre> genre;
   private Date publishedDate;
   private List<String> reviews;
   private Double rating;
   private Language lang;
   private String fileType;

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public List<Creator> getAuthors() {
      return authors;
   }

   public void setAuthors(List<Creator> authors) {
      this.authors = authors;
   }

   public List<Genre> getGenre() {
      return genre;
   }

   public void setGenre(List<Genre> genre) {
      this.genre = genre;
   }
}
