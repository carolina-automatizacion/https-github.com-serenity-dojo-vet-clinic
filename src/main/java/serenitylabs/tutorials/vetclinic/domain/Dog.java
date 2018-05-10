package serenitylabs.tutorials.vetclinic.domain;

import com.google.common.collect.ImmutableList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal implements NeedsVaccionations {
    private final String name;
    private final String breed;
    private final List<String> colour;
    private LocalDate lastVaccionationDate;

    public Dog(String name, String breed, List<String> colour) {

        this.name = name;
        this.breed = breed;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return name + " the " + (colour + " " + breed).toLowerCase();
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public List<String> getColour() {
        return new ArrayList(colour);
    }

    public static DogBuilder called(String name) {
        return new DogBuilder(name);
    }

    public String complaint(){
     return "Grrrr";
    }

    @Override
    public void wasVaccionatedOn(LocalDate lastVaccionationDate) {
        this.lastVaccionationDate=lastVaccionationDate;
    }

    @Override
    public LocalDate nextVaccinationDue() {
        return lastVaccionationDate.plusMonths(6);
    }

    public static class DogBuilder {
        private final String name;
        private String breed;

        public DogBuilder(String name) {
            this.name = name;
        }

        public DogBuilder ofBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public Dog andOfColour(String... colour) {
            return new Dog(name, breed, ImmutableList.copyOf(colour));
        }
    }
}
