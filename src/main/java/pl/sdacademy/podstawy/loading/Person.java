package pl.sdacademy.podstawy.loading;

import java.time.LocalDate;

public class Person {
    private final String firstName;
    private final String lastName;
    private LocalDate birthDate;
    private Double height;
    private Double weight;

    public Person(String firstName, String lastName, LocalDate birthDate, double weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
        this.height = height;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = LocalDate.of(2000, 1, 1);
        this.weight = 0.0;
        this.height = 0.0;
    }

    public Person(LocalDate birthDate, double height, double weight) {
        this.firstName = "";
        this.lastName = "";
        this.birthDate = birthDate;
        this.height = height;
        this.weight = weight;
    }
}
