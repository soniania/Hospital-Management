package sonia.ac.za.factory.patientFactory;

import sonia.ac.za.domain.patient.PatientDiet;

public class PatientDietFactory {

    public static PatientDiet getPatientDiet(String dietType) {
        return new PatientDiet.Builder().patientDietType(dietType)
                .build();
    }
}
