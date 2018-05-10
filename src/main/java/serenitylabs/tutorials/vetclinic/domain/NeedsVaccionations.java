package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;

public interface NeedsVaccionations {
    void wasVaccionatedOn(LocalDate lastVaccionationDate);

    LocalDate nextVaccinationDue();
}
