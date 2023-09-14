package ru.otus.homework16;

import java.util.*;

public class PhoneBook {
    private Map<String, ArrayList<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String name, String phone) {
        if (phoneBook.containsKey(name)) phoneBook.get(name).add(phone);
        else {
            phoneBook.put(name, new ArrayList<String>(Arrays.asList(phone)));
        }
    }

    public void find(String name) {
        System.out.println(name + " Телефон: " + phoneBook.get(name));
    }

    public boolean containsPhoneNumber(String number) {
//
        for (String key : phoneBook.keySet()) {
            if (phoneBook.get(key).contains(number)) return true;
        }
        return false;
    }
}
