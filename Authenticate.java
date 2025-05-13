import java.util.regex.*;

public class Authenticate {
    public static boolean isValidEmail(String email){
        String emailReg = "^.+@.+\\..+$";
        return email.matches(emailReg);
    }

    public static boolean isValidPassword(String pass){
        String passReg = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@#$%^&+!]).{8,}$";
        return pass.matches(passReg);
    }
    public static void main(String[] args){
        String username = "test@example.com";
        String password = "Pass123@";

        if(isValidEmail(username) && isValidPassword(password)){
            System.out.println("Login Successful: Valid Credentials ");
        } else {
            System.out.println("Login failed: Invalid Credentials");
        }
    }
}
