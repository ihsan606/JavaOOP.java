package Modifier.Application;

import Modifier.data.LoginRequest;

public class LoginApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("IHSAN","SECURED");
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("ihsan"));
        System.out.println(new LoginRequest("IHSAN","ihsanr"));
    }
}
