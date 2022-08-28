package ru.schepachkov.pattern.builder.model;

public class Person {

    private Integer age;
    private String name;
    private Double salary;

    public static class Builder {

        private Person person = new Person();


        public Builder setAge(Integer age) {
            person.age = age;
            return this;
        }

        public Builder setName(String name) {
            person.name = name;
            return this;
        }

        public Builder setSalary(Double salary) {
            person.salary = salary;
            return this;
        }

        public Person build() {
            return person;
        }
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
