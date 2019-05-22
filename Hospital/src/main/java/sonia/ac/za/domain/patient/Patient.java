package sonia.ac.za.domain.patient;

public class Patient {

    private String patientId, patientName, patientSurname;
    private int patientAge, patientContact;

    private Patient(){}

    private Patient(Builder builder) {
        this.patientId = builder.patientId;
        this.patientAge = builder.patientAge;
        this.patientName = builder.patientName;
        this.patientSurname = builder.patientSurname;
        this.patientContact = builder.patientContact;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientLastName() {
        return patientSurname;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public int getPatientContact()
    {
        return patientContact;
    }

    public static class Builder {

        private String patientId, patientName, patientSurname;
        private int patientAge, patientContact;


        public Builder patientId( String patientId) {
            this.patientId = patientId;
            return this;
        }

        public Builder patientName( String patientName) {
            this.patientName = patientName;
            return this;
        }

        public Builder patientSurname( String patientSurname) {
            this.patientSurname = patientSurname;
            return this;
        }

        public Builder patientAge( int patientAge) {
            this.patientAge = patientAge;
            return this;
        }

        public Builder patientContact( int patientContact) {
            this.patientContact = patientContact;
            return this;
        }

        public Patient build() {
            return new Patient(this);
        }

    }

    @Override
    public String toString() {
        return "Patient{" +
                " patientId='" + patientId + '\'' +
                ", PatientFirstName='" + patientName + '\'' +
                ", PatientLastName='" + patientSurname + '\'' +
                ", patientAge=" + patientAge +'\'' +
                ", patientContact=" + patientContact +

                '}';
    }
}
