package serenitylabs.tutorials.vetclinic.model;

import com.google.common.collect.Maps;
import serenitylabs.tutorials.vetclinic.Breed;
import serenitylabs.tutorials.vetclinic.Meal;
import serenitylabs.tutorials.vetclinic.Pet;
import serenitylabs.tutorials.vetclinic.collections.katas.PetFood;

import java.util.HashMap;
import java.util.Map;

public class FoodDispenser {

    /*public void feed(Pet pet) {
        if (pet.getBreed() == Breed.Cat) {
            feedCat(pet);
        } else if (pet.getBreed() == Breed.Dog) {
            feedDog(pet);
        }
    }

    private void feedDog(Pet pet) {
        pet.feed(20 * pet.getWeightInKilos(), PetFood.FidosFood);
    }

    private void feedCat(Pet pet) {

        pet.feed(10 * pet.getWeightInKilos(), PetFood.KittyKat);
    }*/

    private static final Map<Breed, PetFood> BRAND_FOR_BREED = Maps.newHashMap();
    private static final Map<Breed, Integer> GRAMS_PER_KILO_BY_PET = new HashMap<>();
    static {
        BRAND_FOR_BREED.put(Breed.Cat, PetFood.KittyKat);
        BRAND_FOR_BREED.put(Breed.Dog, PetFood.FidosFood);

        GRAMS_PER_KILO_BY_PET.put(Breed.Dog,20);
        GRAMS_PER_KILO_BY_PET.put(Breed.Cat,10);
    }

    private PetFood rightFoodFor(Pet pet) {
        return BRAND_FOR_BREED.get(pet.getBreed());
    }

    public Meal prepareMealFor(Pet pet) {
        return new Meal(rightAmountOfFoodFor(pet), rightFoodFor(pet));
    }

    private double rightAmountOfFoodFor(Pet pet) {
        return pet.getWeightInKilos() * GRAMS_PER_KILO_BY_PET.get(pet.getBreed());
    }
}
