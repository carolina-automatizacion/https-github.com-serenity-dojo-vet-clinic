package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class WhenCreatingANewDog {
    /*@Test
    public void it_should_have_a_name() throws Exception {
        LocalDateTime birthday =  LocalDateTime.now();
        //Dog fido = new Dog("Fido", "Poodle", birthday);
        Dog fido = Dog.called("Fido")
                .ofBreed("Poodle")
                .ofColour("black")
                .withFavouriteFood("pizza")
                .bornOn(birthday);

        //fido.setName("Fido");
        //fido.setBreed("Poodle");
        //fido.setDateOfBirthday(birthday);

        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Poodle", fido.getBreed());
        Assert.assertEquals(birthday, fido.getDateOfBirthday());
        Assert.assertEquals("pizza", fido.getFavouriteFood());
        Assert.assertEquals("black", fido.getColour());
    }*/

    /*@Test
    public void it_should_have_an_optional_favourite_food() throws Exception {
        LocalDateTime birthday =  LocalDateTime.now();
        Dog fido = new Dog("Fido", "Poodle", birthday, "pizza");

        Assert.assertEquals("pizza", fido.getFavouriteFood());
    }*/
}
