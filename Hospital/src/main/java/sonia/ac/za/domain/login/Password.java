package sonia.ac.za.domain.login;



public class Password
{
    private String password;



    protected Password(){}

    private  Password (Builder builder)
    {
        this.password = builder.password;
    }

    public String getPassword()
    {
        return password;
    }

    public static class Builder
    {
        private String password;


        public Builder getPassword(String password){
            this.password = password;
            return this;
        }

        public Password build()
        {
            return new Password(this);
        }
    }
}
