package com.library.entities;

import java.util.List;
import java.util.Set;

import com.library.enums.Roles;

public class Creator {
   private String name;
   private List<Document> documents;
   private Set<Roles> roles;

   public Creator(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public List<Document> getDocuments() {
      return documents;
   }

   public void setDocuments(List<Document> documents) {
      this.documents = documents;
   }
}
