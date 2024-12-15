public class Main {
    public static void main(String[] args) {
        System.out.println("My realization of Observer Pattern:  \n\n");

        MagazineAgency observable = new MagazineAgency();
        Subscriber observer1 = new ConcreteSubscriber();
        Subscriber observer2 = new ConcreteSubscriber();
observable.addObserver(observer1);
observable.addObserver(observer2);


observable.setMagazine("BBC");
        observable.removeObserver(observer1);
observable.setMagazine("Times");





    }
}