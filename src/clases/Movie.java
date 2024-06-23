package clases;

import java.io.IOException;

public class Movie {
    //tenemos 4 modificadores de acceso: public, private, protected y default

   private String name;
   private int year;


   public Movie(String name, int year){ //constructor
      this.name=name;
      this.year=year;

   }

}
