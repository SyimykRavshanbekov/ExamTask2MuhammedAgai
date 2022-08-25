public class FashTeamHouse extends House{

    public FashTeamHouse(int id, String name, String address, int price, int year) {
        super(id, name, address, price, year);
    }

    @Override
    public void city() {
        System.out.println("Location: Paris");
    }

    @Override
    public void electricity() {
        System.out.println("50 som toloit");
    }
}
