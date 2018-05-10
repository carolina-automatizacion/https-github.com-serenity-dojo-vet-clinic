package serenitylabs.tutorials.vetclinic.domain;

import com.google.common.collect.ImmutableList;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal implements NeedsVaccionations{
    private final String name;
    private final String breed;
    private final List<String> colour;
    private LocalDate lastVaccionationDate;

    public Cat(String name, String breed, List<String> colour) {
        this.name = name;
        this.breed = breed;
        this.colour = colour;
    }

    public static CatBuilder called(String name) {
        return new CatBuilder(name);
    }

    @Override
    public String complaint() {
        return "Meow";
    }

    public void wasVaccionatedOn(LocalDate vaccionationDate) {
        this.lastVaccionationDate = vaccionationDate;
    }

    public LocalDate nextVaccinationDue() {
        return lastVaccionationDate.plusYears(1);
    }

    public static class CatBuilder {
        private final String name;
        private String breed;

        public CatBuilder(String name) {
            this.name = name;
        }

        public CatBuilder ofBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public Cat andOfColour(String... colour) {
            return new Cat(name, breed, ImmutableList.copyOf(colour));
        }
    }
}
