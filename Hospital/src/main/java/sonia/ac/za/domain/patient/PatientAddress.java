package sonia.ac.za.domain.patient;

public class PatientAddress {

    private String residentialAddress, postalAddress;

    public PatientAddress(){}

    private PatientAddress(Builder builder) {
        this.residentialAddress = builder.residentialAddress;
        this.postalAddress = builder.postalAddress;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }

    public String getPostalAddress() { return postalAddress; }

    public static class Builder {

        private String residentialAddress, postalAddress;

        public Builder residentialAddress( String residentialAddress) {
            this.residentialAddress = residentialAddress;
            return this;
        }
        public Builder postalAddress (String postalAddress){
            this.postalAddress = postalAddress;
            return this;
        }

        public PatientAddress build() {
            return new PatientAddress(this);
        }

    }

    @Override
    public String toString() {
        return "PatientAddress{" +
                " residentialAddress='" + residentialAddress + '\'' +
                ", postalAddress='" + postalAddress+
                '}';
    }
}
