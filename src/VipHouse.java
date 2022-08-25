public class VipHouse extends House{

    public VipHouse(int id, String name, String address, int price, int year) {
        super(id, name, address, price, year);
    }

    @Override
    public void city() {
        System.out.println("location: Osh");
    }

    @Override
    public void electricity() {
        System.out.println("10 som toloit");
    }
}
