package ru.schepachkov.pattern.prototype.model;

/*
* Implements 'prototype' pattern
*/
public class Address {

    private Integer houseNumber;
    private String street;

    public Address(Address address) {
        this.houseNumber = address.houseNumber;
        this.street = address.street;
    }

    public Address() {
    }

    public Address(Integer houseNumber, String street) {
        this.houseNumber = houseNumber;
        this.street = street;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber=" + houseNumber +
                ", street='" + street + '\'' +
                '}';
    }
}
