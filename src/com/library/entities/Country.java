package com.library.entities;

import java.util.List;

public class Country {
   private List<Language> oficialLangs;
   private String name;
   private String continent;

   public List<Language> getOficialLangs() {
      return oficialLangs;
   }

   public void setOficialLangs(List<Language> oficialLangs) {
      this.oficialLangs = oficialLangs;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getContinent() {
      return continent;
   }

   public void setContinent(String continent) {
      this.continent = continent;
   }
}
