package sonia.ac.za.domain.staff;

public class Nurse {

    private String nurseId, nurseFirstName, nurseLastname;

    public Nurse(){}

    public Nurse(Builder builder) {
        this.nurseId = builder.nurseId;
        this.nurseFirstName = builder.nurseFirstName;
        this.nurseLastname= builder.nurseLastname;
    }

    public String getNurseId() {
        return nurseId;
    }

    public String getNurseFirstName() {
        return nurseFirstName;
    }

    public String nurseLastname() {
        return nurseLastname;
    }



    public static class Builder {

        private String nurseId, nurseFirstName, nurseLastname;

        public Builder nurseId( String nurseId) {
            this.nurseId = nurseId;
            return this;
        }

        public Builder nurseFirstName( String nurseFirstName) {
            this.nurseFirstName = nurseFirstName;
            return this;
        }

        public Builder nurseLastname ( String nurseLastname) {
            this.nurseLastname= nurseLastname;
            return this;
        }


        public Nurse build() {
            return new Nurse(this);
        }

    }

    @Override
    public String toString() {
        return "Nurse{" +
                " NurseId='" + nurseId + '\'' +
                ", NurseFirstName='" + nurseFirstName+ '\'' +
                ", NurseLastName='" + nurseLastname +

                '}';
    }
}
