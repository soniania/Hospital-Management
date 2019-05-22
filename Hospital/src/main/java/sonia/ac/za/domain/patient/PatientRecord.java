package sonia.ac.za.domain.patient;

public class PatientRecord {

    private String patientRecNumber, patientId;
    private String appointment, description;

    private PatientRecord(){}

    private PatientRecord(Builder builder){
        this.patientRecNumber = builder.patientRecNumber;
        this.patientId = builder.patientId;
        this.appointment = builder.appointment;
        this.description = builder.description;
    }

    public String getPatientRecNumber() {
        return patientRecNumber;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getAppointment() {
        return appointment;
    }

    public String getDescription() {
        return description;
    }

    public static class Builder{

        private String patientRecNumber, patientId;
        private String appointment, description;

        public Builder patientRecNumber(String patientRecNumber){
            this.patientRecNumber = patientRecNumber;
            return this;
        }

        public Builder patientId(String patientId){
            this.patientId = patientId;
            return this;
        }

        public Builder appointment(String appointment){
            this.appointment = appointment;
            return this;
        }

        public Builder description(String description){
            this.description = description;
            return this;
        }

        public PatientRecord build(){
            return new PatientRecord();}
    }

    @Override
    public String toString() {
        return "PatientRecord{" +
                " patientRecNumber='" + patientRecNumber + '\'' +
                ", PatientId='" + patientId + '\'' +
                ", appointment='" + appointment + '\'' +
                ", description=" + description +
                '}';
    }
}
