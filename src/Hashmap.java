import java.util.ArrayList;
import java.util.HashMap;

public class Hashmap implements Mypersistence{
    private HashMap<Integer, ArrayList<String>> Users = new HashMap<Integer, ArrayList<String>>();
    private HashMap<Integer, ArrayList<String>> Drivers = new HashMap<Integer, ArrayList<String>>();
    private HashMap<Integer, ArrayList<String>> Rides = new HashMap<Integer, ArrayList<String>>();
    private int Usercount=1 , DriverCount=1;
    private int RidesCount=1;
    @Override
    public void adduser(User u)
    {
        Users.put(Usercount,new ArrayList<String>());
        Users.get(Usercount).add(u.Username);
        Users.get(Usercount).add(u.Password);
        Users.get(Usercount).add(u.MobileNumber);
        Users.get(Usercount).add(u.Email);
        Usercount++;
    }

    @Override
    public void addDriver(Driver d) {
        Drivers.put(DriverCount,new ArrayList<String>());
        Drivers.get(DriverCount).add(d.Username);
        Drivers.get(DriverCount).add(d.Password);
        Drivers.get(DriverCount).add(d.MobileNumber);
        Drivers.get(DriverCount).add(d.Email);
        Drivers.get(DriverCount).add(d.nationalID);
        Drivers.get(DriverCount).add(d.License);
        DriverCount++;
    }


    public void addRide(User u )
    {
        Rides.put(RidesCount,new ArrayList<String>());
        Rides.get(RidesCount).add(u.Username);
        Rides.get(RidesCount).add(u.r.SourceArea);
        Rides.get(RidesCount).add(u.r.Destination);
        RidesCount++;
    }
    public ArrayList<String> getDriver(int x)
    {
        return Drivers.get(x);
    }
    public ArrayList<String> getRide(int x)
    {
        return Rides.get(x);
    }
    public ArrayList<String> getUser(int x)
    {
        return Users.get(x);
    }
    public int getDrivercount()
    {
        return DriverCount;
    }
    public int getRidescount()
    {
        return RidesCount;
    }
    public int getUsercount()
    {
        return Usercount;
    }

}
