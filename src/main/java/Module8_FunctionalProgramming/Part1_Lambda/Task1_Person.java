package Module8_FunctionalProgramming.Part1_Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task1_Person {
    // properties
    private String name;
    private int age;
    private String city;

    // constructor
    public Task1_Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // list of person objects
    static List<Task1_Person> persons = Arrays.asList(
            new Task1_Person("John", 30, "New York"),
            new Task1_Person("Jane", 25, "Los Angeles"),
            new Task1_Person("Jack", 40, "Chicago"),
            new Task1_Person("Jill", 35, "New York"),
            new Task1_Person("Joe", 20, "Los Angeles"),
            new Task1_Person("Jenny", 45, "Chicago")
    );

    public int getAge() {
        return age;
    }

    // sort the list by age in ascending order with comparator interface
    public static void sortPersonsByAge() {
        persons.sort(Comparator.comparingInt(Task1_Person::getAge));
        persons.forEach(p -> System.out.println(p.name + ", " + p.age + ", " + p.city));
    }

    // filter by city using lambda expression
    public static void filterPersonsByCity(String city) {
        persons.stream()
                .filter(p -> p.city.equals(city))
                .forEach(p -> System.out.println(p.name + ", " + p.age + ", " + p.city));
    }

    // main method
    public static void main(String[] args) {
        System.out.println("Sorting persons by age:");
        sortPersonsByAge();

        System.out.println("\nSorting persons by city:");
        filterPersonsByCity("New York");
    }
}
