public class ConcreteSubscriber implements Subscriber{
    private String magazine;
    MagazineAgency magazineAgency= new MagazineAgency();
    @Override
    public void update(Object magazine) {
        magazineAgency.setMagazine((String) magazine);

    }
}
