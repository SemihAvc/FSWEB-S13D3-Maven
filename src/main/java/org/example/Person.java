package org.example;

public class Person {
    //instance variable buraya
    String firstname;
    String lastName;
    int age;
    String[] sport;
    double money;
    boolean married;
//constructor
    public Person(String firstname, String lastName, int age) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstname, String lastName, int age, String[] sport, boolean married, double money) {
        this(firstname, lastName, age);
        this.sport = sport;
        this.married = married;
        this.money = money;
    }

    // metotlar
    public String getFirstname() {
        return this.firstname;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isTeen() {
        return this.age > 12 && this.age < 20;
    }

    public String[] getSport() {
        return this.sport;
    }

    public double getMoney() {
        return this.money;
    }

    public boolean isMarried() {
        return this.married;
    }
}
