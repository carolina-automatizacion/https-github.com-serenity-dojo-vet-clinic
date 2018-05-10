package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class WhenVisitingTheClinic {

    @Test
    public void cats_and_dogs_complain_to_the_assistant() {
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");
        Cat felix = Cat.called("Felix").ofBreed("Siamese").andOfColour("White");

        ComplainRegister complainRegister = new ComplainRegister();
        VetAssistant assistant = new VetAssistant(complainRegister);

        assistant.recordComplainFrom(fido);
        assistant.recordComplainFrom(felix);

        assertThat(complainRegister.getComplaints(), hasItems("Grrrr", "Meow"));
    }

    @Test
    public void the_vet_should_know_when_a_pet_vaccination_is_due() {
        NeedsVaccionations felix = Cat.called("Felix").ofBreed("Siamese").andOfColour("White");
        LocalDate today= LocalDate.now();
        LocalDate nextYear=today.plusYears(1);

        felix.wasVaccionatedOn(today);
        assertThat(felix.nextVaccinationDue(), is(equalTo(nextYear)));

    }

    @Test
    public void dogs_need_vaccinations_every_six_months() {
        NeedsVaccionations fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");
        LocalDate today= LocalDate.now();
        LocalDate inSixMonths=today.plusMonths(6);

        fido.wasVaccionatedOn(today);
        assertThat(fido.nextVaccinationDue(), is(equalTo(inSixMonths)));

    }
}
