public class User  implements Observor {
    Ride r = new Ride();
    String Username, Password, Email, MobileNumber;

    User(String username, String password, String Mobileno, String Email) {
        this.Username = username;
        this.Password = password;
        this.MobileNumber = Mobileno;
        this.Email = Email;
    }

    public void Login(String username, String password) {
        if (this.Username.equals(username) && this.Password.equals(password)) {
            System.out.println("User logged in successfully");
        } else {
            System.out.println("you entered wrong username or password");
        }
    }

    @Override
    public void display(int offer) {
        System.out.println("Driver set an offer:" + offer);
    }
}