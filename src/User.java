import java.util.List;

public class User implements Observor {
    Ride r = new Ride();
    String Username, Password, Email, MobileNumber;
    boolean b=false;

    User(String username, String password, String Mobileno, String Email) {
        this.Username = username;
        this.Password = password;
        this.MobileNumber = Mobileno;
        this.Email = Email;
    }

    public void Login(String username, String password, UserManger m) {
        b = false;
        for (int i = 1; i < m.d.getUsercount(); i++) {
            if (m.d.getUser(i).contains(username) && m.d.getUser(i).contains(password)) {

                b = true;
                break;
            }
        }
        if (b == true) {
            System.out.println("User logged in successfully");
        } else {
            System.out.println("you entered wrong username or password");
        }
    }

    @Override
    public void display(List<Integer> Offers ) {
        for(int i=0;i<Offers.size();i++)
        {
            System.out.println("Driver set an offer:" + Offers.get(i));
        }

    }
}