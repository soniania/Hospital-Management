package sonia.ac.za.factory.patientFactory;

import sonia.ac.za.domain.patient.PatientAddress;

public class PatientAddressFactory {

    public static PatientAddress getPatientAddress(String residence, String postal) {
        return new PatientAddress.Builder()
                .residentialAddress(residence)
                .postalAddress(postal)
                .build();
    }

}
