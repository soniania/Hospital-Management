package sonia.ac.za.factory.patientFactory;

import sonia.ac.za.domain.patient.PatientNextOfKin;

public class PatientNextOfKinFactory {

    public static PatientNextOfKin getPatientNextOfKin(String nOKId, String nOKname,
                                                       String nOKLastName,String nOKRelation, int contact) {
        return new PatientNextOfKin.Builder()
                .patientNOKId(nOKId)
                .patientNOKName(nOKname)
                .patientNOKSurname(nOKLastName)
                .relation(nOKRelation)
                .patientNOKContact(contact)
                .build();
    }
}
