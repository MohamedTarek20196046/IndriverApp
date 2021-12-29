import java.util.ArrayList;

public interface Mypersistence {
    public void adduser(User u);
    public void addDriver(Driver d);
    public void addRide(User u);
    public int getDrivercount();
    public ArrayList<String> getDriver(int x);
    public ArrayList<String> getRide(int x);
    public ArrayList<String> getUser(int x);
    public int getRidescount();
    public int getUsercount();





}
