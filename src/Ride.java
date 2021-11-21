import java.util.ArrayList;
import java.util.List;

public class Ride {
    String SourceArea;
    String Destination;
    String Title;
    String Description;
    String TimeToLeave;
    List<Integer> Offers = new ArrayList<Integer>();
    int Cost;

    public void RequestRide(String sourceArea,String destination)
    {
        this.SourceArea=sourceArea;
        this.Destination=destination;
    }
    public void AnnounceNewRide(String SourceArea,String Destination,String Title,String Description,String TimeToLeave,int Cost)
    {

    }
    public void EndRide()
    {

    }
    public void RateRide()
    {

    }
}