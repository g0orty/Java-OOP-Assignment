package personassignment;

public class Person {

    // Instance variables
    String name;
    int age;
    String city;
    double height;

    // Static variable
    static int totalPeople = 0;

    // Method 1: Display person information
    public void displayInfo() {
        System.out.println("----- Person Information -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.printf("Height: %.2f meters%n", height);
        System.out.println();
    }

    // Method 2: Change person's height
    public void setHeight(double h) {

        // Local variable
        double oldHeight = height;

        height = h;

        System.out.println(name + "'s height changed from "
                + oldHeight + " meters to " + height + " meters.");
        System.out.println();
    }

    // Method 3: Celebrate birthday
    public void haveBirthday() {
        age++;

        System.out.println("Happy Birthday, " + name
                + "! You are now " + age + " years old.");
        System.out.println();
    }

    // Method 4: Display total people
    public static void showTotalPeople() {
        System.out.println("Total number of people created: " + totalPeople);
    }

}