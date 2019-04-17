package sonia.ac.za.factory.staffFactory;

import sonia.ac.za.domain.staff.Nurse;

public class NurseFactory {

    public static Nurse getNurse(String id, String firstName, String lastName) {
        return new Nurse.Builder().nurseId(id)
                .nurseFirstName(firstName)
                .nurseLastname(lastName)
                .build();
    }
}
