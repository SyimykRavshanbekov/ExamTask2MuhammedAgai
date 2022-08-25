public abstract class House {
    private int id;
    private String name;
    private String address;
    private int price;
    private int year;
    Person[] persons = new Person[6];
    private int index = 0;

    public House(int id, String name, String address, int price, int year) {
        this.id = id;
        if (name.contains("r") || name.contains("o") || name.contains("b")
                ||name.contains("m") || name.contains("w") || name.contains("h"))
            this.name = name;
        else
            System.out.println("Уй кабыл алынбайт биздин шарт менен болсун");

        this.address = address;

        if (price>70000)
            this.price = price;
        else
            System.out.println("Баасы туура келбейт");


        if (year > 2015)
            this.year = year;
        else
            System.out.println("Сиздин уй эски");
    }

    public abstract void city();
    public abstract void electricity();

    public void addPerson(Person person){
        persons[index] = person;
        index++;
    }

    public void getInformation(){
        System.out.println("--------Житeли"+name+"----------");
        for (Person i:persons) {
            System.out.println(i.getFirstName());
        }
        city();
        electricity();
    }
}
