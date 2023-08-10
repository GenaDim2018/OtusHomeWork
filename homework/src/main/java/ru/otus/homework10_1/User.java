package ru.otus.homework10_1;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Period;

public class User {
    private String lastname;
    private String firstname;
    private String surname;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(("dd.MM.yyyy"));
    private LocalDate birthDate; //dd.mm.yyyy
    private String email;

    public User(String lastname, String firstname, String surname, String birthDate, String email) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.surname = surname;
        this.birthDate = LocalDate.parse(birthDate, formatter);
        this.email = email;
    }

    public void info() {
        System.out.println("ФИО: " + lastname + " " + firstname + " " + surname);
        System.out.println("Год рождения: " + birthDate.getYear());
        System.out.println("e-mail: " + email);
    }
    public int getClientsAge() {
        int clientsAge = Period.between(this.birthDate, LocalDate.now()).getYears();
        return clientsAge;
    }
}
