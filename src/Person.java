public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String phoneNumber;

    private String work;

    public Person(String firstName, String lastName, String email, int age, String phoneNumber, String work) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (email.contains("@"))
            this.email = email;
        else
            System.out.println("@ жок кайра текшериниз");

        if (age>0 && age<110){
            this.age = age;
        }else
            System.out.println("Терс сан берууго болбойт");

        if (phoneNumber.contains("+996"))
            this.phoneNumber = phoneNumber;
        else
            System.out.println("Кыргыз номер бериниз");

        this.work = work;
    }

    public void work(){
        System.out.println(firstName + " " + work + "иштейт");
    }

    public void timeTable(int number){
        switch (number){
            case 1 -> System.out.println(firstName + " биринчи куну иштейт");
            case 2 -> System.out.println(firstName + " экинчи куну иштейт");
            case 3 -> System.out.println(firstName + " учунчу куну иштейт");
            case 4 -> System.out.println(firstName + " тортунчу куну иштейт");
            case 5 -> System.out.println(firstName + " бушинчи куну иштейт");
            case 6 -> System.out.println(firstName + " алтынчы куну эс алат");
            case 7 -> System.out.println(firstName + " жетинчи куну эс алат");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "\nfirstName='" + firstName;
    }
}
