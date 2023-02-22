package com.library.pojos;

import java.util.List;

public abstract class Document {
   private String title;
   private String authorName;
   private List<String> genre;
   private List<String> reviews;
   private Double rating;

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getAuthorName() {
      return authorName;
   }

   public void setAuthorName(String authorName) {
      this.authorName = authorName;
   }

   public List<String> getGenre() {
      return genre;
   }

   public void setGenre(List<String> genre) {
      this.genre = genre;
   }
}
