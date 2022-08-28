package ru.schepachkov.pattern.prototype;

import ru.schepachkov.pattern.prototype.model.Address;
import ru.schepachkov.pattern.prototype.model.Person;

/*
 * Creation pattern
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person(24, "Dmitrii", new Address(2, "Spooner st"));

        Person clone = new Person(person);
        clone.setAge(87);
        clone.getAddress().setStreet("Fork st");

        System.out.println(person);
        System.out.println(clone);
    }
}
