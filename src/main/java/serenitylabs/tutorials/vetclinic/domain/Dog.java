package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.stream.DoubleStream;

public class Dog {
    private final String name;
    private final String breed;
    private final LocalDate dateOfBirthday;
    private final String favouriteFood;
    private final String colour;
    private final String favouriteToy;

    /*public Dog(String name, String breed, LocalDateTime dateOfBirthday){
        this(name,breed,dateOfBirthday,null,null);
        }*/

    public Dog(String name, String breed, LocalDate dateOfBirthday, String favouriteFood, String colour, String favouriteToy){
        this.name=name;
        this.breed=breed;
        this.dateOfBirthday=dateOfBirthday;
        this.favouriteFood=favouriteFood;
        this.colour=colour;
        this.favouriteToy=favouriteToy;
    }

    public String getColour(){
        return colour;
    }

    //public void setName(String name){this.name=name;}

    public String getName(){return name;}

    //public void setBreed(String breed){this.breed=breed;}

    public String getBreed(){return breed;}

    //public void setDateOfBirthday(LocalDateTime dateOfBirthday){this.dateOfBirthday=dateOfBirthday;}

    public LocalDate getDateOfBirthday(){return dateOfBirthday;}

    public String getFavouriteFood(){return favouriteFood;}

    public String getFavouriteToy(){return favouriteToy;}
}
