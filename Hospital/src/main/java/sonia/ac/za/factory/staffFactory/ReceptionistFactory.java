package sonia.ac.za.factory.staffFactory;

import sonia.ac.za.domain.staff.Receptionist;

public class ReceptionistFactory {

    public static Receptionist getReceptionist(String id, String firstName, String lastName) {
        return new Receptionist.Builder().receptionistId(id)
                .receptionistFirstName(firstName)
                .receptionistLastname(lastName)
                .build();
    }
}
