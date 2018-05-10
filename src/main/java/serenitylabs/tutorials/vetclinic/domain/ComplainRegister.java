package serenitylabs.tutorials.vetclinic.domain;

import java.util.ArrayList;
import java.util.List;

public class ComplainRegister {
    private List<String> complain;
    public List<String> getComplaints() {
        return new ArrayList(complain);
    }

}
