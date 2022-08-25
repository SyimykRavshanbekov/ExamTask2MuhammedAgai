public class CrazyHouse extends House{
    public CrazyHouse(int id, String name, String address, int price, int year) {
        super(id, name, address, price, year);
    }

    @Override
    public void city() {
        System.out.println("Location: Bishkek");
    }

    @Override
    public void electricity() {
        System.out.println("40 som toloit");
    }
}
