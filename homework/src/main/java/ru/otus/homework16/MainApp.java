package ru.otus.homework16;

public class MainApp {
    public static void main(String[] args) {
        phoneBookRun();
    }

    public static void phoneBookRun() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Геннадий", "123");
        phoneBook.add("Геннадий", "123");
        phoneBook.add("Геннадий", "+7(906)596-56-31");
        phoneBook.add("123", "321");
        phoneBook.add("MichalPal", "1234");
        phoneBook.add("Gena", "12345");
        phoneBook.find("Геннадий");
        System.out.println(phoneBook.containsPhoneNumber("+7(906)596-56-31"));
    }
}
