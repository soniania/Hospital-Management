package sonia.ac.za.domain.patient;

public class PatientNextOfKin {

    private String patientNOKId, patientNOKName, patientNOKSurname, relation;
    private int patientNOKContact;

    private PatientNextOfKin(){}

    private PatientNextOfKin(Builder builder) {
        this.patientNOKId = builder.patientNOKId;
        this.patientNOKName = builder.patientNOKName;
        this.patientNOKSurname = builder.patientNOKSurname;
        this.patientNOKContact = builder.patientNOKContact;
        this.relation = builder.relation;
    }

    public String getPatientNOKId() {
        return patientNOKId;
    }

    public String getPatientNOKName() {
        return patientNOKName;
    }

    public String getPatientNOKLastName() {
        return patientNOKSurname;
    }

    public int getPatientNOKContact(){ return patientNOKContact; }

    public String getRelation() {return relation;}

    public static class Builder {

        private String patientNOKId, patientNOKName, patientNOKSurname, relation;
        private int  patientNOKContact;


        public Builder patientNOKId( String patientNOKId) {
            this.patientNOKId = patientNOKId;
            return this;
        }

        public Builder patientNOKName( String patientNOKName) {
            this.patientNOKName = patientNOKName;
            return this;
        }

        public Builder patientNOKSurname( String patientNOKSurname) {
            this.patientNOKSurname = patientNOKSurname;
            return this;
        }

        public Builder patientNOKContact( int patientNOKContact) {
            this.patientNOKContact = patientNOKContact;
            return this;
        }

        public Builder relation ( String relation){
            this.relation = relation;
            return this;
        }

        public PatientNextOfKin build() {
            return new PatientNextOfKin(this);
        }

    }

    @Override
    public String toString() {
        return "PatientNextOfKin{" +
                " patientNOKId='" + patientNOKId + '\'' +
                ", PatientFirstNOKName='" + patientNOKName + '\'' +
                ", PatientLastNOKName='" + patientNOKSurname + '\'' +
                ", patientNOKContact=" + patientNOKContact + '\'' +
                ", relation=" + relation+

                '}';
    }
}
