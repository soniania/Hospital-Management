package sonia.ac.za.domain.login;

public class CreateAccount {

    private String userId, userName, userSurname, userDepartment;


    private CreateAccount(){}

    private CreateAccount(Builder builder) {
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.userSurname = builder.userSurname;
        this.userDepartment = builder.userDepartment;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getUserDepartment(){ return userDepartment; }

    public static class Builder {

        private String userId, userName, userSurname, userDepartment;



        public Builder userId( String patientId) {
            this.userId = userId;
            return this;
        }

        public Builder userName( String userName) {
            this.userName = userName;
            return this;
        }

        public Builder userSurname( String userSurname) {
            this.userSurname = userSurname;
            return this;
        }

        public Builder userDepartmen( String userDepartment) {
            this.userDepartment = userDepartment;
            return this;
        }

        public CreateAccount build() {
            return new CreateAccount(this);
        }

    }

    @Override
    public String toString() {
        return "CreateAccount{" +
                " userId='" + userId + '\'' +
                ", userName='" + userName+ '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", userDepartment=" + userDepartment +

                '}';
    }
}
