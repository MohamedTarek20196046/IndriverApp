import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserManger {

    DataBase data = new DataBase();

    int Usercount=1 , DriverCount=1;
    void RegisterUser(User u)
    {
        data.Users.put(Usercount,new ArrayList<String>());
        data.Users.get(Usercount).add(u.Username);
        data.Users.get(Usercount).add(u.Password);
        data.Users.get(Usercount).add(u.MobileNumber);
        data.Users.get(Usercount).add(u.Email);
        Usercount++;
    }
    void RegisterDriver(Driver d)
    {
        data.Drivers.put(DriverCount,new ArrayList<String>());
        data.Drivers.get(DriverCount).add(d.Username);
        data.Drivers.get(DriverCount).add(d.Password);
        data.Drivers.get(DriverCount).add(d.MobileNumber);
        data.Drivers.get(DriverCount).add(d.Email);
        data.Drivers.get(DriverCount).add(d.nationalID);
        data.Drivers.get(DriverCount).add(d.License);
        DriverCount++;
    }
}