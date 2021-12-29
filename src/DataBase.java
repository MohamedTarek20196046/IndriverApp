import java.util.ArrayList;
import java.util.HashMap;


public class DataBase implements Mypersistence{

    @Override
    public void adduser(User u) {
        System.out.println("database adduser");
    }

    @Override
    public void addDriver(Driver d) {
        System.out.println("database adddriver");
    }

    @Override
    public void addRide(User u) {
        System.out.println("database addride");
    }

    @Override
    public int getDrivercount() {
        return 0;
    }

    @Override
    public ArrayList<String> getDriver(int x) {
        return null;
    }

    @Override
    public ArrayList<String> getRide(int x) {
        return null;
    }

    @Override
    public ArrayList<String> getUser(int x) {
        return null;
    }

    @Override
    public int getRidescount() {
        return 0;
    }

    @Override
    public int getUsercount() {
        return 0;
    }
}
