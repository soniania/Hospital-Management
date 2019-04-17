package sonia.ac.za.factory.staffFactory;

import sonia.ac.za.domain.staff.Doctor;

public class DoctorFactory {

    public static Doctor getDoctor(String id, String firstName, String lastName, String spec) {
        return new Doctor.Builder().doctorId(id)
                .doctorFirstName(firstName)
                .doctorLastname(lastName)
                .speciality(spec)
                .build();
    }
}
