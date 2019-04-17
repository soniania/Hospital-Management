package sonia.ac.za.domain.staff;

public class Receptionist {

    private String receptionistId, receptionistFirstName, receptionistLastname;

    public Receptionist(){}

    public Receptionist(Builder builder) {
        this.receptionistId = builder.receptionistId;
        this.receptionistFirstName = builder.receptionistFirstName;
        this.receptionistLastname= builder.receptionistLastname;
    }

    public String getReceptionistId() {
        return receptionistId;
    }

    public String getReceptionistFirstName() {
        return receptionistFirstName;
    }

    public String receptionistLastname() {
        return receptionistLastname;
    }



    public static class Builder {

        private String receptionistId, receptionistFirstName, receptionistLastname;

        public Builder receptionistId( String receptionistId) {
            this.receptionistId = receptionistId;
            return this;
        }

        public Builder receptionistFirstName( String receptionistFirstName) {
            this.receptionistFirstName = receptionistFirstName;
            return this;
        }

        public Builder receptionistLastname ( String receptionistLastname) {
            this.receptionistLastname= receptionistLastname;
            return this;
        }


        public Receptionist build() {
            return new Receptionist(this);
        }

    }

    @Override
    public String toString() {
        return "Receptionist{" +
                " ReceptionistId='" + receptionistId + '\'' +
                ", ReceptionistFirstName='" + receptionistFirstName + '\'' +
                ", ReceptionistLastName='" + receptionistLastname+

                '}';
    }

}
