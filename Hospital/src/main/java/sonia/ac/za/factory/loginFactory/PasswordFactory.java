package sonia.ac.za.factory.loginFactory;

import sonia.ac.za.domain.login.Password;

public class PasswordFactory
{
    public static Password get(String password){
        return new Password.Builder()
                           .build();
    }
}
