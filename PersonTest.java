package personassignment;

public class PersonTest {

    public static void main(String[] args) {

        // Creating the first person
        Person person1 = new Person();
        person1.name = "John";
        person1.age = 20;
        person1.city = "Kigali";
        person1.height = 1.75;
        Person.totalPeople++;

        // Creating the second person
        Person person2 = new Person();
        person2.name = "Alice";
        person2.age = 22;
        person2.city = "Huye";
        person2.height = 1.65;
        Person.totalPeople++;

        // Creating the third person
        Person person3 = new Person();
        person3.name = "Peter";
        person3.age = 25;
        person3.city = "Musanze";
        person3.height = 1.80;
        Person.totalPeople++;

        // Display information for the three people
        System.out.println("=== FIRST THREE PEOPLE ===");

        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();

        // Testing setHeight() method
        System.out.println("=== CHANGING HEIGHTS ===");

        person1.setHeight(1.78);
        person2.setHeight(1.70);

        // Testing haveBirthday() method
        System.out.println("=== BIRTHDAY CELEBRATION ===");

        person1.haveBirthday();

        // Creating five additional people using a for loop
        System.out.println("=== CREATING FIVE MORE PEOPLE ===");

        for (int i = 1; i <= 5; i++) {

            Person person = new Person();

            person.name = "Person" + i;
            person.age = 18 + i;
            person.city = "Kigali";
            person.height = 1.60 + (i * 0.05);

            Person.totalPeople++;

            person.displayInfo();
        }

        // Displaying the total number of people
        System.out.println("=== FINAL TOTAL ===");

        Person.showTotalPeople();

    }

}