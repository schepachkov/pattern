package ru.schepachkov.pattern.prototype.model;

/*
 * Implements 'prototype' pattern
 */
public class Person {

    private Integer age;
    private String name;
    private Address address;

    public Person() {
    }

    public Person(Person person) {
        this.age = person.age;
        this.name = person.name;
        this.address = new Address(person.address);
    }

    public Person(Integer age, String name, Address address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
