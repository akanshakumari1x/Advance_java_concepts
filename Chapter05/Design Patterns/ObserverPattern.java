public interface Observer {
    void update(double price);
}

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

public class Stock implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private double price;

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
}

public class Investor implements Observer {

    private String name;

    public Investor(String name) {
        this.name = name;
    }

    public void update(double price) {
        System.out.println(name + " notified. New Price: " + price);
    }
}

public class Main {

    public static void main(String[] args) {

        Stock stock = new Stock();

        Observer investor1 = new Investor("Akansha");
        Observer investor2 = new Investor("Rahul");

        stock.addObserver(investor1);
        stock.addObserver(investor2);

        stock.setPrice(5000);
    }
}
//o/p:-
//Akansha notified. New Price: 5000
//Rahul notified. New Price: 5000

