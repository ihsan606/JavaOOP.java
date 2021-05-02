package Modifier.data.util;


import Modifier.Error.ValidationException;
import Modifier.data.LoginRequest;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws NullPointerException, ValidationException {
        if(loginRequest.username() == null){
            throw new ValidationException("Username is Null");
        }else if(loginRequest.username().isBlank()){
            throw new ValidationException("Username is Blank");
        }else if(loginRequest.password() == null){
            throw new ValidationException("Password is Null");
        }else if(loginRequest.password().isBlank()){
            throw new ValidationException("Password is Blank");
        }
    }
}
