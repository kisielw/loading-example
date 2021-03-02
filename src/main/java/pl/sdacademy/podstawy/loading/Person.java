package pl.sdacademy.podstawy.loading;

import java.time.LocalDate;

public class Person {
    private final String firstName;
    private final String lastName;
    private LocalDate birthDate;
    private Double height;
    private Double weight;

    public static void main(String[] args) {
        Person person = new Person("2010-01-12", 177.0, 90);
    }

    public Person(String firstName, String lastName, LocalDate birthDate, double weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
        this.height = height;
    }

    public Person(String firstName, String lastName) {
        this(firstName,lastName, LocalDate.of(2000,1,1), 0.0, 0.0);
    }

    public Person(LocalDate birthDate, double height, double weight) {
        this("","", birthDate, weight, weight);
    }

    public Person(String birthDate, double height, double weight) {
        this(LocalDate.parse(birthDate), weight, weight);
    }
}
