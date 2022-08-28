package ru.schepachkov.pattern.builder;

import ru.schepachkov.pattern.builder.model.Person;

public class Main {

    public static void main(String[] args) {
        Person person = new Person.Builder()
                .setAge(24)
                .setName("Dmitrii")
                .build();
        System.out.println(person);
    }
}
