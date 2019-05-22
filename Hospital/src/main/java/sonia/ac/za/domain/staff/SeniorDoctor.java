package sonia.ac.za.domain.staff;

public class SeniorDoctor extends Doctor {

    private String experience;

    public SeniorDoctor() {
    }

    /**public SeniorDoctor(Builder builder) {

        super(doctorId, speciality, doctorFirstName, doctorLastname);

        this.experience = builder.experience;
    }

    public String getExperience() {
        return experience;
    }

    public static class Builder {
        private String experience;

        public Builder experience(String experience) {
            this.experience = experience;
            return this;
        }

        public SeniorDoctor build() { return new SeniorDoctor(this);}

    }**/


}