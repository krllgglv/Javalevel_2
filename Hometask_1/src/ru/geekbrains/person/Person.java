package ru.geekbrains.person;

public abstract class Person {
    protected int age;
    protected String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
