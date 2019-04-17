package sonia.ac.za.domain.staff;

public class Clinician {

    private String clinicianId, clinicianFirstName, clinicianLastname;

    public Clinician() {
    }

    public Clinician(Builder builder) {
        this.clinicianId = builder.clinicianId;
        this.clinicianFirstName = builder.clinicianFirstName;
        this.clinicianLastname = builder.clinicianLastname;
    }

    public String getClinicianId() {
        return clinicianId;
    }

    public String getClinicianFirstName() {
        return clinicianFirstName;
    }

    public String getClinicianLastname() {
        return clinicianLastname;
    }


    public static class Builder {

        private String clinicianId, clinicianFirstName, clinicianLastname;

        public Builder clinicianId(String clinicianId) {
            this.clinicianId = clinicianId;
            return this;
        }

        public Builder clinicianFirstName(String clinicianFirstName) {
            this.clinicianFirstName = clinicianFirstName;
            return this;
        }

        public Builder clinicianLastname(String clinicianLastname) {
            this.clinicianLastname = clinicianLastname;
            return this;
        }


        public Clinician build() {
            return new Clinician(this);
        }

    }

    @Override
    public String toString() {
        return "Clinician{" +
                " clinicianId='" + clinicianId + '\'' +
                ", clinicianFirstName='" + clinicianFirstName + '\'' +
                ", clinicianLastName='" + clinicianLastname +


                '}';
    }
}
