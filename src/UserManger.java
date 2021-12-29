import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserManger {

    Data d=new Data(new Hashmap());
    void RegisterUser(User u)
    {
        d.adduser(u);
    }
    void RegisterDriver(Driver D)
    {
        d.addDriver(D);
    }
}