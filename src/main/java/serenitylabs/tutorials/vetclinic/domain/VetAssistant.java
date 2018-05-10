package serenitylabs.tutorials.vetclinic.domain;

public class VetAssistant {
    private ComplainRegister complainRegister;

    public VetAssistant(ComplainRegister complainRegister) {

        this.complainRegister = complainRegister;
    }

    public void recordComplainFrom(Animal someAnimal) {
        //complainRegister.recordComplaint(someAnimal.complaint());
    }
}
