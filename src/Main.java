import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Syimyk", "Ravshanbekov", "@syimyk006", 15, "+996222219743", "programmist");
        Person person2 = new Person("Ali", "Ravshanbekov", "@sgk006", 15, "+996222219743", "programmist");
        Person person3 = new Person("Asan", "Ravshanbekov", "@sfgs006", 15, "+996222219743", "programmist");
        Person person4 = new Person("Uson", "Ravshanbekov", "@ssgsfg006", 15, "+996222219743", "programmist");
        Person person5 = new Person("Adyl", "Ravshanbekov", "@sfgyk006", 15, "+996222219743", "programmist");
        Person person6 = new Person("Bali", "Ravshanbekov", "@sysfdlnsfk006", 15, "+996222219743", "programmist");
        Person person7 = new Person("Kerzbek", "Ravshanbekov", "@syisfsgf06", 15, "+996222219743", "programmist");
        Person person8 = new Person("Argen", "Ravshanbekov", "@syimsfgs06", 15, "+996222219743", "programmist");
        Person person9 = new Person("Bakai", "Ravshanbekov", "@sysgfs6", 15, "+996222219743", "programmist");
        Person person10 = new Person("Samarbek", "Ravshanbekov", "@syisfgsfg6", 15, "+996222219743", "programmist");
        Person person11 = new Person("Nurti", "Ravshanbekov", "@syiadfadf6", 15, "+996222219743", "programmist");
        Person person12 = new Person("Zhanarbek", "Ravshanbekov", "@syifkfhj06", 15, "+996222219743", "programmist");
        Person person13 = new Person("Nurbek", "Ravshanbekov", "@dgjdgjd", 15, "+996222219743", "programmist");
        Person person14 = new Person("Akyl", "Ravshanbekov", "@dhdghd", 15, "+996222219743", "programmist");
        Person person15 = new Person("Nurislam", "Ravshanbekov", "@dghdghgd", 15, "+996222219743", "programmist");
        Person person16 = new Person("Nursultan", "Ravshanbekov", "@syimdghdhdyk006", 15, "+996222219743", "programmist");
        Person person17 = new Person("Oroz", "Ravshanbekov", "@syimyk0dhdgh06", 15, "+996222219743", "programmist");
        Person person18 = new Person("Ulan", "Ravshanbekov", "@syimykdhdgh006", 15, "+996222219743", "programmist");
        Person person19 = new Person("Uluk", "Ravshanbekov", "@syimydghdk006", 15, "+996222219743", "programmist");
        Person person20 = new Person("Aibek", "Ravshanbekov", "@sydghdhimyk006", 15, "+996222219743", "programmist");
        Person person21 = new Person("Azim", "Ravshanbekov", "@syidghdmyk006", 15, "+996222219743", "programmist");
        Person person22 = new Person("Makha", "Ravshanbekov", "@sydhgdimyk006", 15, "+996222219743", "programmist");
        Person person23 = new Person("Aktan", "Ravshanbekov", "@syidghdmyk006", 15, "+996222219743", "programmist");
        Person person24 = new Person("Erzhan", "Ravshanbekov", "@dghdhd", 15, "+996222219743", "programmist");
        Person person25 = new Person("Tami", "Ravshanbekov", "@hdhgd", 15, "+996222219743", "programmist");
        Person person26 = new Person("Aza", "Ravshanbekov", "@ujnhg", 15, "+996222219743", "programmist");
        Person person27 = new Person("Maza", "Ravshanbekov", "@syimyEFAk006", 15, "+996222219743", "programmist");
        Person person28 = new Person("Sasha", "Ravshanbekov", "@syimdgbdgyk006", 15, "+996222219743", "programmist");

        Person[] person = {person1, person2, person3, person4, person5, person6, person7, person8, person9, person10,
                person11, person12, person13, person14, person15, person16, person17, person18, person19, person20, person21,
                person22, person23, person24, person25, person26, person27, person28};

        CrazyHouse crazyHouse = new CrazyHouse(141, "Crazy", "Manasa", 80000, 2019);
        FashTeamHouse fashTeamHouse = new FashTeamHouse(67, "Fosh", "Manasa", 90000, 2019);
        StarHouse starHouse = new StarHouse(123, "Stab", "Manasa", 80000, 2019);
        VipHouse vipHouse = new VipHouse(985, "Viw", "Manasa", 80000, 2019);

        House[] houses = {crazyHouse, fashTeamHouse, starHouse, vipHouse};

        sortingPerson(houses, person);

        System.out.println();
        System.out.println();
        person1.timeTable(3);
    }

    static void sortingPerson(House[] houses, Person[] person){
        Random rd = new Random();
        for (int i = 0, counter = 0; i < person.length; i++) {
            if (i==6){
                i=0;
            }
            int num = rd.nextInt(4);
            if (houses[num].persons[i] == null) {
                houses[num].addPerson(person[counter]);
                counter++;
            }
            if (counter==24){
                break;
            }
        }

        for (House house:houses) {
            house.getInformation();
        }
    }
}