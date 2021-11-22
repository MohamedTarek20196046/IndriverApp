import java.util.ArrayList;

public class PriceNotifier implements Notifier {
    int offer;
    ArrayList observers = new ArrayList();

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
        observer.display( offer );
        i++;

    }
    public void PriceChanged() {
        notifyObservers();
    }
    public void SetOffer( Integer o)
    {
        this.offer=o;
        PriceChanged();

    }

}