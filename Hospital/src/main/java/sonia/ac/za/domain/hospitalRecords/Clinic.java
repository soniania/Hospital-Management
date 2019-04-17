package sonia.ac.za.domain.hospitalRecords;

public class Clinic {

    private String clinicCode, clinicName, c_address;
    private int c_contactNumber;

    private Clinic (){}

    private Clinic(Builder builder) {
        this.clinicCode = builder.clinicCode;
        this.clinicName = builder.clinicName;
        this.c_address = builder.c_address;
        this.c_contactNumber = builder.c_contactNumber;
    }

    public String getClinicCode() {
        return clinicCode;
    }

    public String getClinicName() {
        return clinicName;
    }

    public String getC_address() {
        return c_address;
    }

    public int getC_contactNumber() { return c_contactNumber; }

    public static class Builder {

        private String clinicCode, clinicName, c_address;
        private int c_contactNumber;

        public Builder clinicCode( String clinicCode) {
            this.clinicCode = clinicCode;
            return this;
        }

        public Builder clinicName( String clinicName) {
            this.clinicName = clinicName;
            return this;
        }

        public Builder c_address( String c_address) {
            this.c_address = c_address;
            return this;
        }

        public Builder c_contactNumber( int c_contactNumber){
            this.c_contactNumber = c_contactNumber;
            return this;
        }


        public Clinic build() {
            return new Clinic(this);
        }

    }



}
