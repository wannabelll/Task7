import java.util.*;

public class MagazineAgency {
    private String magazine;
    private List<Subscriber> subscribers=new ArrayList<>();

    public void addObserver(Subscriber subscriber){
        this.subscribers.add(subscriber);

    }

    public void removeObserver(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void setMagazine(String magazine){
        this.magazine=magazine;
        for (Subscriber subscriber:this.subscribers){
            subscriber.update(this.magazine);
            System.out.println("The  "+this.magazine+ " magazine has upgraded. Until the end of the week, you can buy the new magazine with a 30% discount.. Hurry up");
        }

    }


}
