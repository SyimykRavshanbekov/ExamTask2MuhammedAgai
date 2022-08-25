public class StarHouse extends House{
    public StarHouse(int id, String name, String address, int price, int year) {
        super(id, name, address, price, year);
    }

    @Override
    public void city() {
        System.out.println("Location: New York");
    }

    @Override
    public void electricity() {
        System.out.println("100 som toloit");
    }
}
