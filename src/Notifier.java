public interface Notifier {
    void registerObserver(Observor o);
    void removeObserver(Observor o);
    void notifyObservers();
}
