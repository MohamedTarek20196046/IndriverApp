import java.util.ArrayList;
import java.util.List;

public class RideManger {
    DataBase data = new DataBase();
    int RidesCount=1;
    int counter=1;
    List<Integer> keys = new ArrayList<Integer>();
    void AddRide(User u )
    {
        data.Rides.put(RidesCount,new ArrayList<String>());
        data.Rides.get(RidesCount).add(u.Username);
        data.Rides.get(RidesCount).add(u.r.SourceArea);
        data.Rides.get(RidesCount).add(u.r.Destination);
        RidesCount++;
    }
    void checkDriverFavoriteAreas(Driver D) {
        boolean z=false;

        for (int x = counter; x <= RidesCount-1; x++){
            for (int i = 0; i < D.FavArea.size(); i++) {
                if (data.Rides.get(x).contains(D.FavArea.get(i)))
                {
                    System.out.println("you have the following ride request:" +data.Rides.get(x));
                    z=true;
                    keys.add(x);
                    counter++;
                }
            }
        }
        if(z==false)
        {
            System.out.println("unfortunately there are no available rides ");
        }
    }


}