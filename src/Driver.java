import java.util.ArrayList;
import java.util.List;

public class Driver {
    Ride r=new Ride();
    String Username, Password, Email, MobileNumber ,nationalID , License;
    int Balance;
    List<String> FavArea = new ArrayList<String>();
    PriceNotifier p = new PriceNotifier();

    Driver(String username , String password , String Mobileno , String Email, String nationalid , String license){
        this.Username = username;
        this.Password = password;
        this.MobileNumber = Mobileno;
        this.Email = Email;
        this.nationalID = nationalid;
        this.License = license;
    }
    public void Login(String username, String password , UserManger m)
    {

        boolean x =false;
            for(int i=1;i<m.DriverCount;i++)
            {
                if(m.data.Drivers.get(i).contains(username) && m.data.Drivers.get(i).contains(password)
                && m.data.Drivers.get(i).contains("approved"))
                {
                    x=true;
                }
            }
            if(x)
            {
                System.out.println("Driver logged in successfully");
            }
            else
            {
                System.out.println("you entered wrong username or password or you are not approved");
            }

    }
    public void AddFavoriteArea(String favouritearea)
    {
        FavArea.add(favouritearea);
    }
    public List ListFavAreasRides()
    {
        return FavArea;
    }
    public void AddToBalance(int price)
    {
        Balance += price;
    }

}
