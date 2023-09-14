package ru.otus.homework16;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String name, String phone) {
        if (phoneBook.containsKey(name)) {
            List<String> phoneList = new ArrayList<>();
            phoneList.addAll(phoneBook.get(name));
            phoneList.add(phone);
            phoneBook.put(name, phoneList);
        } else phoneBook.put(name, Arrays.asList(phone));
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
