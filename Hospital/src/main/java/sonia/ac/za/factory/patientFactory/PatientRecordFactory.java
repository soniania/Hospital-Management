package sonia.ac.za.factory.patientFactory;

import sonia.ac.za.domain.patient.PatientRecord;

public class PatientRecordFactory {

    public static PatientRecord getPatientRecord(String recordNumber, String id, String appo, String descri) {
        return new PatientRecord.Builder().patientRecNumber(recordNumber)
                .patientId(id)
                .appointment(appo)
                .description(descri)
                .build();
    }
}
