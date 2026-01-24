package ex_17_OOPs;

public class LoginPage {
    public LoginPage(String email, String password) {
        this.email = email;
        this.password = password;
    }

    String email;
    String password;

    public LoginPage(String email, String password, String submitButton) {
       this(email,password);                // This is called Constructor chaining where we are calling another constructor with this keyword.
        this.submitButton = submitButton;
    }

    String submitButton;


}
