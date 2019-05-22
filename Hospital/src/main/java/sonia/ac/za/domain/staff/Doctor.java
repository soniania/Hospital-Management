package sonia.ac.za.domain.staff;

public class Doctor {

    private String doctorId, doctorFirstName, doctorLastname, speciality;

    public Doctor(){}

    public Doctor(Builder builder) {
        this.doctorId = builder.doctorId;
        this.speciality = builder.speciality;
        this.doctorFirstName = builder.doctorFirstName;
        this.doctorLastname = builder.doctorLastname;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public String getDoctorFirstName() {
        return doctorFirstName;
    }

    public String getDoctorLastname() {
        return doctorLastname;
    }

    public String getSpeciality() { return speciality; }

    public static class Builder {

        private String doctorId, doctorFirstName, doctorLastname, speciality;

        public Builder doctorId( String doctorId) {
            this.doctorId = doctorId;
            return this;
        }

        public Builder doctorFirstName( String doctorFirstName) {
            this.doctorFirstName = doctorFirstName;
            return this;
        }

        public Builder doctorLastname( String doctorLastname) {
            this.doctorLastname = doctorLastname;
            return this;
        }

        public Builder speciality(String speciality){
            this.speciality = speciality;
            return this;
        }


        public Doctor build() {
            return new Doctor(this);
        }

    }

    @Override
    public String toString() {
        return "DoctorService{" +
                " DoctorId='" + doctorId + '\'' +
                ",DoctorFirstName='" + doctorFirstName + '\'' +
                ", DoctorLastName='" + doctorLastname + '\'' +
                ",Speciality=" + speciality +

                '}';
    }


}



