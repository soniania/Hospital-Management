package sonia.ac.za.factory.staffFactory;

import sonia.ac.za.domain.staff.Clinician;

public class ClinicianFactory {

    public static Clinician getClinician(String id, String firstName, String lastName) {
        return new Clinician.Builder().clinicianId(id)
                .clinicianFirstName(firstName)
                .clinicianLastname(lastName)
                .build();
    }
}
