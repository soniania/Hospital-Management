package sonia.ac.za.domain.patient;

public class PatientDiet {

    private String patientDietType;

    private PatientDiet(){}

    private PatientDiet(Builder builder) {
        this.patientDietType = builder.patientDietType;
    }

    public String getPatientDietType() {
        return patientDietType;
    }


    public static class Builder {

        private String patientDietType;


        public Builder patientDietType( String patientDietType) {
            this.patientDietType = patientDietType;
            return this;
        }



        public PatientDiet build() {
            return new PatientDiet(this);
        }

    }

    @Override
    public String toString() {
        return "PatientDiet{" +
                " patientDietType='" + patientDietType +
                '}';
    }
}
