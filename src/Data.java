import java.util.ArrayList;

public class Data {
    private Mypersistence strategy;
    public  Data(Mypersistence strategy){
        this.strategy = strategy;
    }
    public void adduser(User u){
        strategy.adduser(u);
    }
    public void addDriver(Driver d){
        strategy.addDriver(d);
    }
    void addRide(User u )
    {
        strategy.addRide(u);
    }
    public ArrayList<String> getRide(int x)
    {
        return strategy.getRide(x);
    }
    public ArrayList<String> getDriver(int x)
    {
        return strategy.getDriver(x);
    }
    public ArrayList<String> getUser(int x)
    {
        return strategy.getUser(x);
    }
    public int getDrivercount()
    {
        return strategy.getDrivercount();
    }
    public int getRidescount()
    {
        return strategy.getRidescount();
    }
    public int getUsercount()
    {
        return strategy.getUsercount();
    }
}
