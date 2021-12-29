import java.util.ArrayList;
import java.util.List;

public class RideManger {
    Data d=new Data(new Hashmap());
    int counter=1;
    List<Integer> keys = new ArrayList<Integer>();
    void AddRide(User u )
    {
        d.addRide(u);
    }
    void checkDriverFavoriteAreas(Driver D) {
        boolean z=false;

        for (int x = counter; x <= d.getRidescount()-1; x++){
            for (int i = 0; i < D.FavArea.size(); i++) {
                if (d.getRide(x).contains(D.FavArea.get(i)))
                {
                    System.out.println("you have the following ride request:" +d.getRide(x));
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