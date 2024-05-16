package Module8_FunctionalProgramming.Part1_Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Person {
    // properties
    private String name;
    private int age;
    private String city;

    // constructor
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // list of person objects
    static List<Person> persons = Arrays.asList(
            new Person("John", 30, "New York"),
            new Person("Jane", 25, "Los Angeles"),
            new Person("Jack", 40, "Chicago"),
            new Person("Jill", 35, "New York"),
            new Person("Joe", 20, "Los Angeles"),
            new Person("Jenny", 45, "Chicago")
    );

    public int getAge() {
        return age;
    }

    // sort the list by age in ascending order with comparator interface
    public static void sortPersonsByAge() {
        persons.sort(Comparator.comparingInt(Person::getAge));
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
