package sonia.ac.za.factory.patientFactory;

import sonia.ac.za.domain.patient.Patient;

public class PatientFactory {

    public static Patient getPatient(String firstName, String lastName, int age, String id) {
        return new Patient.Builder().patientAge(age)
                .patientName(firstName)
                .patientSurname(lastName)
                .patientId(id)
                .build();
    }
}
