import java.util.ArrayList;
import java.util.List;

public class Ride implements Notifier{
    String SourceArea;
    String Destination;
    String Title;
    String Description;
    String TimeToLeave;
    List<Integer> Offers = new ArrayList<Integer>();
    ArrayList observers = new ArrayList();
    int indx=0;
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



    public void registerObserver(Observor o) {
        observers.add(o);
    }

    public void removeObserver(Observor o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        int i=0;
        Observor observer = (Observor) observers.get(i);
        observer.display( Offers );
        i++;

    }
    public void PriceChanged() {
        notifyObservers();
    }
    public void SetOffer( Integer o)
    {
        Offers.add(o);
        PriceChanged();

    }
}